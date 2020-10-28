package com.banking.ibs.dao.serviceImpl;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.banking.ibs.dao.ILoginPageDAO;
import com.banking.ibs.jdbc.DBConnection;

public class LoginPageDAOImpl implements ILoginPageDAO 
{
	private static Logger log = LogManager.getLogger(LoginPageDAOImpl.class);
	
	public HashMap<String, String> getUserCredData() {

		String fetchQry = "select username,password from ibs.credentials";
		Connection conn = null;
		Statement stmt = null;

		HashMap<String, String> cred_map = new HashMap<String, String>();

		try
		{
			conn = DBConnection.getConnection();
			stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(fetchQry);

			while(rs.next())
			{
				String username = rs.getString("username");
				String password = rs.getString("password");

				cred_map.put(username, password);
			}
			log.info("\nUser credential data fetching Successful");
			return cred_map;
		} 
		catch(Exception e)
		{
			log.error("Unable to fetch User credential data");
			log.debug("Error : "+e.getMessage());
			return cred_map;
		}
		finally 
		{
			try 
			{
				stmt.close();
				DBConnection.closeConnection(conn);
			} 
			catch (SQLException e) 
			{
				log.debug("Error : "+ e.getMessage());
			}
		}
	}


}
