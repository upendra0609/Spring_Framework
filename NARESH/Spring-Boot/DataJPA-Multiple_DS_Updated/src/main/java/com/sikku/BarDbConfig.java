package com.sikku;

import java.util.HashMap;
import java.util.Map;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.boot.orm.jpa.EntityManagerFactoryBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import jakarta.persistence.EntityManagerFactory;

@Configuration
@EnableTransactionManagement
@EnableJpaRepositories(
  entityManagerFactoryRef = "barEntityManagerFactory",
  transactionManagerRef = "barTransactionManager",
  basePackages = { "com.sikku.bar.repo" }
)
public class BarDbConfig {
 
  @Bean(name = "barDataSource")
  @ConfigurationProperties(prefix = "bar.datasource")
  public DataSource dataSource() {
    return DataSourceBuilder.create().build();
  }
  
  @Bean(name = "barEntityManagerFactory")
  public LocalContainerEntityManagerFactoryBean 
  barEntityManagerFactory(
    EntityManagerFactoryBuilder builder,
    @Qualifier("barDataSource") DataSource dataSource
  ) {
	  Map<String, Object> map = new HashMap<>();
	  map.put("hibernate.dialect", "org.hibernate.dialect.MySQLDialect");
	  map.put("hibernate.hbm2ddl.auto", "update");
    return
      builder
        .dataSource(dataSource)
        .packages("com.sikku.bar.domain")
        .properties(map)
        .persistenceUnit("bar")
        .build();
  }
  @Bean(name = "barTransactionManager")
  public PlatformTransactionManager barTransactionManager(
    @Qualifier("barEntityManagerFactory") EntityManagerFactory
    barEntityManagerFactory
  ) {
    return new JpaTransactionManager(barEntityManagerFactory);
  }
}