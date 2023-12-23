package com.sikku.configs;

import java.util.HashMap;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.boot.orm.jpa.EntityManagerFactoryBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import jakarta.persistence.EntityManagerFactory;

@Configuration
@EnableTransactionManagement
@EnableJpaRepositories(basePackages = "com.sikku.repo.product", entityManagerFactoryRef = "oracleEMF", transactionManagerRef = "oraTxMgmr")
public class OracleDSConfig {

	@Bean
	@ConfigurationProperties(prefix = "oracle.datasource")
	@Primary
	public DataSource createOracleDataSource() {
		return DataSourceBuilder.create().build();
	}

	@Bean("oracleEMF")
	@Primary
	public LocalContainerEntityManagerFactoryBean createOracleEntityManagerFactoryBean(
			EntityManagerFactoryBuilder builder) {
		HashMap<String, Object> props = new HashMap<>();
//		props.put("hibernate.dialect", "org.hibernate.dialect.Oracle11gDialect");
		props.put("hibernate.hbm2ddl.auto", "update");
		return builder.dataSource(createOracleDataSource()).packages("com.sikku.product").properties(props)
				.build();
	}

	@Bean("oraTxMgmr")
	@Primary
	public JpaTransactionManager createOraTxMgmr(@Qualifier("oracleEMF") EntityManagerFactory factory) {
		return new JpaTransactionManager(factory);
	}

}
