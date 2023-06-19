package com.jsp.restaurant.util;

import java.util.Properties;

public class PropertiesUtil {
public static Properties getConnectionProperties() {
Properties properties = new Properties();
properties.setProperty("connection.driver_class", "com.mysql.cj.jdbc.Driver");
properties.setProperty("hibernate.connection.url", "jdbc:mysql://localhost:3306/hibernate");
properties.setProperty("hibernate.connection.username", "root");
properties.setProperty("hibernate.connection.password", "java");
properties.setProperty("hibernate.dialect","org.hibernate.dialect.MySQL8Dialect");
// whats hibernate sql queries forming for us 
properties.setProperty("hibernate.show_sql","true");
// for cache 2 line used 
properties.setProperty("hibernate.cache.use_second_level_cache","true");
properties.setProperty("hibernate.cache.region.factory_class","org.hibernate.cache.ehcache.internal.EhcacheRegionFactory");
return properties;
}
}