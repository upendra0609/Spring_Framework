package com.sikku.configs;

import java.util.HashMap;

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
import org.springframework.transaction.annotation.EnableTransactionManagement;

import jakarta.persistence.EntityManagerFactory;

@Configuration
@EnableTransactionManagement
@EnableJpaRepositories(basePackages = "com.sikku.repo.offers", entityManagerFactoryRef = "mySQLEMF", transactionManagerRef = "mySQLTxMgmr")
public class MySqlDSConfig {

	@Bean
	@ConfigurationProperties(prefix = "mongo.data")
	public DataSource createMySQLDataSource() {
		return DataSourceBuilder.create().build();
	}

	@Bean("mySQLEMF")
	public LocalContainerEntityManagerFactoryBean createMySQLEntityManagerFactoryBean(
			EntityManagerFactoryBuilder builder) {
		HashMap<String, Object> props = new HashMap<>();
		props.put("hibernate.dialect", "org.hibernate.dialect.MySQL8Dialect");
		props.put("hibernate.hbm2ddl.auto", "update");
		return builder.dataSource(createMySQLDataSource()).packages("com.sikku.offers").properties(props)
				.build();
	}

	@Bean("mySQLTxMgmr")
	public JpaTransactionManager createMySqlTxMgmr(@Qualifier("mySQLEMF") EntityManagerFactory factory) {
		return new JpaTransactionManager(factory);
	}

}
