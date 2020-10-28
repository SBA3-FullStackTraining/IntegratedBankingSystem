package com.banking.ibs.jdbc;

import java.io.FileInputStream;
import java.nio.file.Paths;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.core.lookup.MainMapLookup;


public class DBConnection 
{
	private static Logger log = LogManager.getLogger(DBConnection.class);
	public static Connection con;
	static String db_props_path = "database.properties";
	static Properties db_props = new Properties();

	
	synchronized public static Connection getConnection()
	{
		try 
		{	
			//db_props.load(new FileInputStream(db_props_path));
			String driver = "com.mysql.jdbc.Driver";	//db_props.getProperty("db.driver");
			String url = "jdbc:mysql://localhost:3306";	//db_props.getProperty("db.url");
			String user = "root";	//db_props.getProperty("db.user");
			String pass = "tiger";	//db_props.getProperty("db.password");

			Class.forName(driver);

			con = DriverManager.getConnection(url,user,pass);
			log.info("Connection Established............");
		}
		catch (Exception e) 
		{
			log.info("Unable to establish the connection !!");
			log.error("Error : "+e.getMessage());
		}
		return con;
	}


	public static boolean closeConnection(Connection connection)
	{
		try 
		{
			connection.close();
			log.info("Closed the established DB connection !!");
			return true;
		} 
		catch (SQLException e) 
		{
			log.error("Unable to close the established DB connection !!");
			return false;
		}
	}

}

