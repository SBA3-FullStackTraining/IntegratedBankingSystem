package com.banking.ibs.dao.serviceImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
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
import com.banking.ibs.dto.Customer;

public class LoginPageDAOImpl implements ILoginPageDAO 
{
	private static Logger log = LogManager.getLogger(LoginPageDAOImpl.class);

	private String jdbcDriver;
	private String jdbcUrl;
	private String jdbcUsername;
	private String jdbcPassword;
	
	
	public LoginPageDAOImpl(String jdbcDriver, String jdbcUrl, String jdbcUsername, String jdbcPassword)
	{
		this.jdbcDriver = jdbcDriver;
		this.jdbcUrl = jdbcUrl;
		this.jdbcUsername = jdbcUsername;
		this.jdbcPassword = jdbcPassword;
	}
	
	public HashMap<String, String> getUserCredData(String userType) 
	{

		String fetchQry = "";
		if(userType.toLowerCase().contains("admin"))
		{
			fetchQry = "select userid,password from ibs.admincred";
		}
		else
		{
			fetchQry = "select userid,password from ibs.customercred";
		}
		Connection conn = null;
		Statement stmt = null;

		HashMap<String, String> cred_map = new HashMap<String, String>();

		try
		{
			conn = DBConnection.getConnection(jdbcDriver, jdbcUrl, jdbcUsername, jdbcPassword);
			stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(fetchQry);

			while(rs.next())
			{
				cred_map.put(rs.getString("userid"), rs.getString("password"));
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
		
		
	public Customer getUserInfo(String userType, String UserID) 
	{
			String fetchQry = "";
			if(userType.toLowerCase().contains("admin"))
			{
				fetchQry = "select * from ibs.admin where admin_id='"+UserID+"'";
			}
			else
			{
				fetchQry = "select * from ibs.customer where customer_id='"+UserID+"'";
			}
			Connection conn = null;
			Statement stmt = null;
			Customer customer = null;

			try
			{
				conn = DBConnection.getConnection(jdbcDriver, jdbcUrl, jdbcUsername, jdbcPassword);
				stmt = conn.createStatement();
				ResultSet rs = stmt.executeQuery(fetchQry);
				System.out.println("rr");
				while(rs.next())
				{
					System.out.println(rs.getString("ACCOUNT_ID"));
					customer = new Customer(rs.getString("CUSTOMER_ID"), rs.getString("ACCOUNT_ID"), rs.getString("CUSTOMER_FIRSTNAME"), 
							rs.getString("CUSTOMER_LASTNAME"), rs.getString("MOBILE"), rs.getString("EMAIL"), rs.getString("DOB"), 
							rs.getString("CITY"), rs.getString("STATE"), rs.getString("COUNTRY"), rs.getString("ZIPCODE"), rs.getString("CUSTOMER_ADDRESS"), rs.getString("ID_SELECTED"), rs.getString("ID_NUMBER"));
				
				}
				
				log.info("\nUser credential data fetching Successful");
				return customer;
			} 
			catch(Exception e)
			{
				log.error("Unable to fetch User Info data");
				log.debug("Error : "+e.getMessage());
				return customer;
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

	

	public boolean changePassword(String userType, String UserID, String newPassword) 
	{
		String updateQry = "";
		if(userType.toLowerCase().contains("admin"))
		{
			updateQry = "update ibs.customercred set password = '"+newPassword+"' where userid = '"+UserID+"';";
		}
		else
		{
			updateQry = "update ibs.admincred set password = '"+newPassword+"' where userid = '"+UserID+"';";
		}
		Connection conn = null;
		Statement stmt = null;

		try
		{
			conn = DBConnection.getConnection(jdbcDriver, jdbcUrl, jdbcUsername, jdbcPassword);
			stmt = conn.createStatement();
			int recUpdt = stmt.executeUpdate(updateQry);
			System.out.println("\nNumber of records updated are "+recUpdt);
			System.out.println("\n*********Update Successful**********");
			log.info("\nUser credential data fetching Successful");
			return recUpdt==1;
		} 
		catch(Exception e)
		{
			log.error("Unable to fetch User Info data");
			log.debug("Error : "+e.getMessage());
			return false;
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


	public boolean addNewRegisteredCustomer(Customer customer)
	{
		
		Connection conn = null;
		PreparedStatement pst = null;

		String query = "INSERT INTO ibs.customerregtemp VALUES(?,?,?,?,?,?,?,?,?,?,?,?)";
			
		try
		{
			conn = DBConnection.getConnection(jdbcDriver, jdbcUrl, jdbcUsername, jdbcPassword);
			pst = conn.prepareStatement(query);
			
			pst.setString(1,customer.getFirstName());
			pst.setString(2,customer.getLastName());
			pst.setString(3,customer.getPhoneNumber());
			pst.setString(4,customer.getEmail());
			pst.setString(5,customer.getDateOfBirth());
			pst.setString(6,customer.getCity());
			pst.setString(7,customer.getState());
			pst.setString(8,customer.getCountry());
			pst.setString(9,customer.getPincode());
			pst.setString(10,customer.getFullAddress());
			pst.setString(11,customer.getGivenID());
			pst.setString(12,customer.getIDNumber());
			
			int recUpdated = pst.executeUpdate();
			
			System.out.println("\nNumber of records added are "+recUpdated);
			System.out.println("\n*********Record added Successfully**********");
			log.info("\nRecord adding Successful");
			return recUpdated==1;
		} 
		catch(Exception e)
		{
			log.error("Unable to fetch User Info data");
			log.debug("Error : "+e.getMessage());
			return false;
		}
		finally 
		{
			try 
			{
				pst.close();
				DBConnection.closeConnection(conn);
			} 
			catch (SQLException e) 
			{
				log.debug("Error : "+ e.getMessage());
			}
		}
	}

}
