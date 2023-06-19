package com.jsp.OneToOne.util;

import java.util.Properties;

public class PropertiesUtil {
	public static Properties getConnectionProperties() {
		Properties properties = new Properties();
		properties.setProperty("connection.driver_class", "com.mysql.cj.jdbc.Driver");
		properties.setProperty("hibernate.connection.url", "jdbc:mysql://localhost:3306/hibernate");
		properties.setProperty("hibernate.connection.username", "root");
		properties.setProperty("hibernate.connection.password", "java");
		properties.setProperty("hibernate.dialect", "org.hibernate.dialect.MySQL8Dialect");
		properties.setProperty("hibernate.hbm2ddl.auto", "update");
		// whats hibernate sql queries forming for us
		properties.setProperty("hibernate.show_sql", "true");
//		properties.setProperty("hibernate.cache.use_second_level_cache", "true");
//		properties.setProperty("hibernate.cache.region.factory_class", "");
		return properties;
	}

}
