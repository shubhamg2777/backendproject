package com.jsp.springproject.config;


import java.util.Properties;

import javax.sql.DataSource;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@EnableWebMvc
@Configuration
@ComponentScan("com.jsp.springproject")
public class AppConfiguration {
	@Bean
	public ModelMapper getModelMapper() {

		return new ModelMapper();
	}

	@Bean
	public LocalSessionFactoryBean getSessionFactory() {
		// implementation class of session factory in localsessionfactorybean
		LocalSessionFactoryBean sessionFactoryBean = new LocalSessionFactoryBean();
		// set data source :- we are giving the refrence of se data source conncetion
		sessionFactoryBean.setDataSource(getDataSource());
		sessionFactoryBean.setPackagesToScan("com.jsp.springproject.entity");
		sessionFactoryBean.setHibernateProperties(getConnectionProperties());
		return sessionFactoryBean;
	}

	// bean in drivermanagerdatasource method create object and returning Object
	// in drivermanagerdatasource we can establish conncetion
	@Bean
	public DataSource getDataSource() {
		DriverManagerDataSource datasource = new DriverManagerDataSource();
		datasource.setDriverClassName("com.mysql.cj.jdbc.Driver");
		datasource.setUrl("jdbc:mysql://localhost:3306/hibernate");
		datasource.setUsername("root");
		datasource.setPassword("java");
		return datasource;
	}

	public static Properties getConnectionProperties() {
		Properties properties = new Properties();
		// properties.setProperty("hibernate.dialect",
		// "org.hibernate.dialect.MySQL8Dialect");
		properties.setProperty("hibernate.hbm2ddl.auto", "update");
		properties.setProperty("hibernate.show_sql", "true");
		return properties;
	}
}