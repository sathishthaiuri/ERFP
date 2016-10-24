package com.dnb.app.config;

import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Enumeration;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MySqlDriverListener implements ServletContextListener {

	private final Logger log = LoggerFactory.getLogger(MySqlDriverListener.class);
	/**
	 * Registers the Oracle JDBC driver
	 */
	@Override
	public void contextInitialized(ServletContextEvent servletContextEvent) {
	}

	/**
	 * Deregisters JDBC driver
	 * 
	 * Prevents Tomcat 7 from complaining about memory leaks.
	 */
	@Override
	public void contextDestroyed(ServletContextEvent servletContextEvent) {

		System.out.println("Destroying Context...");

		try {
			System.out.println("Calling MySQL AbandonedConnectionCleanupThread shutdown");
			com.mysql.jdbc.AbandonedConnectionCleanupThread.shutdown();

		} catch (InterruptedException e) {
			System.out.println("Error calling MySQL AbandonedConnectionCleanupThread shutdown {}" + e);
		}

		ClassLoader cl = Thread.currentThread().getContextClassLoader();

		Enumeration<Driver> drivers = DriverManager.getDrivers();
		while (drivers.hasMoreElements()) {
			Driver driver = drivers.nextElement();

			if (driver.getClass().getClassLoader() == cl) {

				try {
					System.out.println("Deregistering JDBC driver {} " + driver);
					DriverManager.deregisterDriver(driver);

				} catch (SQLException ex) {
					System.out.println("Error deregistering JDBC driver {}" + driver + "" + ex);
				}

			} else {
				System.out.println(
						"Not deregistering JDBC driver {} as it does not belong to this webapp's ClassLoader" + driver);
			}
		}
	}

}
