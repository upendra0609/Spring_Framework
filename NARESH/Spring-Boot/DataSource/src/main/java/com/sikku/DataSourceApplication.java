package com.sikku;

import java.beans.PropertyVetoException;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.core.env.Environment;

import com.mchange.v2.c3p0.ComboPooledDataSource;

@SpringBootApplication
public class DataSourceApplication {
	
	@Autowired
	private Environment env;

	@Bean("c3p0ds")
	DataSource getDS() throws PropertyVetoException {
		ComboPooledDataSource ds  = new ComboPooledDataSource();
		ds.setDriverClass(env.getProperty("ds.driver"));
		ds.setJdbcUrl(env.getProperty("ds.url"));
		ds.setUser(env.getProperty("ds.user"));
		ds.setPassword(env.getProperty("ds.password"));
		ds.setMinPoolSize(10);
		ds.setMaxConnectionAge(20);
		return ds;	
	}

	public static void main(String[] args) throws SQLException {
		ConfigurableApplicationContext context = SpringApplication.run(DataSourceApplication.class, args);
		Dao bean = context.getBean("dao", Dao.class);
		context.close();
	}

}
