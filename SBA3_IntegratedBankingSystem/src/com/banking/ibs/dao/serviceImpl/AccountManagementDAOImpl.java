package com.banking.ibs.dao.serviceImpl;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.banking.ibs.dao.IAccountManagementDAO;
import com.banking.ibs.jdbc.DBConnection;

public class AccountManagementDAOImpl implements IAccountManagementDAO{

	
private static Logger log = LogManager.getLogger(AccountManagementDAOImpl.class);

private String jdbcDriver;
private String jdbcUrl;
private String jdbcUsername;
private String jdbcPassword;


public AccountManagementDAOImpl(String jdbcDriver, String jdbcUrl, String jdbcUsername, String jdbcPassword)
{
	this.jdbcDriver = jdbcDriver;
	this.jdbcUrl = jdbcUrl;
	this.jdbcUsername = jdbcUsername;
	this.jdbcPassword = jdbcPassword;
}

	public HashMap<String, String> getUserCredData() {

		String fetchQry = "select username,password from ibs.account";
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
	

	
	public HashMap<String, String> getUserAcc_Data() {

		String fetchQry = "select ACCOUNT_TYPE_ID,ACCOUNT_TYPE_DESCR,ACCOUNT_HOLDER,ACCOUNT_BALANCE from ibs.account";
		Connection conn = null;
		Statement stmt = null;

		HashMap<String, String> acc_map = new HashMap<String, String>();

		try
		{
			conn = DBConnection.getConnection(jdbcDriver, jdbcUrl, jdbcUsername, jdbcPassword);
			stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(fetchQry);

			while(rs.next())
			{
				String accountNumber = rs.getString("ACCOUNT_TYPE_ID");
				String accountDescription = rs.getString("ACCOUNT_TYPE_DESCR");
				String cutomername = rs.getString("ACCOUNT_HOLDER");
				String accountbalance = rs.getString("ACCOUNT_BALANCE");
				 
				acc_map.put(accountNumber, accountDescription);
			}
			log.info("\nUser account data fetching Successful");
			return acc_map;
		} 
		catch(Exception e)
		{
			log.error("Unable to fetch account  data");
			log.debug("Error : "+e.getMessage());
			return acc_map;
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
	
	public HashMap<String, String> getServiceProvider_data() {

		String fetchQry = "select SERVICE_PROVIDER_ID,SERVICE_PROVIDER_NAME,BILL_AMOUNT,ACCOUNT_ID from ibs.SERVICE_PROVIDER";
		Connection conn = null;
		Statement stmt = null;

		HashMap<String, String> spacc_map = new HashMap<String, String>();

		try
		{
			conn = DBConnection.getConnection(jdbcDriver, jdbcUrl, jdbcUsername, jdbcPassword);
			stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(fetchQry);

			while(rs.next())
			{
				String spaccountNumber = rs.getString("SERVICE_PROVIDER_ID");
				String spaccountname = rs.getString("SERVICE_PROVIDER_NAME");
				String billamount = rs.getString("BILL_AMOUNT");
				String accountnumber = rs.getString("ACCOUNT_ID ");

				spacc_map.put(spaccountNumber, spaccountname);
			}
			log.info("\n service provider account data fetching Successful");
			return spacc_map;
		} 
		catch(Exception e)
		{
			log.error("Unable to fetch sp account  data");
			log.debug("Error : "+e.getMessage());
			return spacc_map;
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
	
	
	public HashMap<String, String> getbenf_data() {

		String fetchQry = "select BENEFICIARY_ACC,BENF_IFSC_CODE,BENEFICIARY_NAME from ibs.BENFICIARY_DETAILS";
		Connection conn = null;
		Statement stmt = null;

		HashMap<String, String> benfacc_map = new HashMap<String, String>();

		try
		{
			conn = DBConnection.getConnection(jdbcDriver, jdbcUrl, jdbcUsername, jdbcPassword);
			stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(fetchQry);

			while(rs.next())
			{
				String benfaccountNumber = rs.getString("BENEFICIARY_ACC");
				String benfIFSC = rs.getString("BENF_IFSC_CODE");
				String benfname = rs.getString("BENEFICIARY_NAME");
				benfacc_map.put(benfaccountNumber, benfIFSC);
			}
			log.info("\n beneficiary  account data fetching Successful");
			return benfacc_map;
		} 
		catch(Exception e)
		{
			log.error("Unable to fetch Beneficiary account  data");
			log.debug("Error : "+e.getMessage());
			return benfacc_map;
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
	
	public HashMap<String, String> getfixedeposit_data() {

		String fetchQry = "select FIXEDDEPOSIT_ACC,ACCOUNT_HOLDER,ROI,TERM,DEPOSITAMT,MATURITYDATE,CUSTOMER_NAME from ibs.FIXED DEPOSIT";
		Connection conn = null;
		Statement stmt = null;

		HashMap<String, String> fdacc_map = new HashMap<String, String>();

		try
		{
			conn = DBConnection.getConnection(jdbcDriver, jdbcUrl, jdbcUsername, jdbcPassword);
			stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(fetchQry);

			while(rs.next())
			{
				String fixeddepoaccountNumber = rs.getString("FIXEDDEPOSIT_ACC");
				String fixeddepositaccholder = rs.getString("ACCOUNT_HOLDER");
				String depositamount = rs.getString("DEPOSITAMT");
				String term = rs.getString("TERM");
				String rateofinterest = rs.getString("ROI");
				String maturitydate = rs.getString("MATURITYDATE");
				String customername = rs.getString("CUSTOMER_NAME");
				fdacc_map.put(fixeddepoaccountNumber, fixeddepositaccholder);
			}
			log.info("\n fixed  account data fetching Successful");
			return fdacc_map;
		} 
		catch(Exception e)
		{
			log.error("Unable to fetch fixed account  data");
			log.debug("Error : "+e.getMessage());
			return fdacc_map;
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
	
	
	
	public HashMap<String, String> getrecurringdeposit_data() {

		String fetchQry = "select RECDEPOSIT_ACC,ACCOUNT_HOLDER,ROI,TERM,MNTHDEPOSITAMT,MATURITYDATE,CUSTOMER_NAME from ibs.RECURRING DEPOSIT";
		Connection conn = null;
		Statement stmt = null;

		HashMap<String, String> rdacc_map = new HashMap<String, String>();

		try
		{
			conn = DBConnection.getConnection(jdbcDriver, jdbcUrl, jdbcUsername, jdbcPassword);
			stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(fetchQry);

			while(rs.next())
			{
				String recdepoaccountNumber = rs.getString("RECDEPOSIT_ACC");
				String recdepositaccholder = rs.getString("ACCOUNT_HOLDER");
				String depositamount = rs.getString("MNTHDEPOSITAMT");
				String term = rs.getString("TERM");
				String rateofinterest = rs.getString("ROI");
				String rdmaturitydate = rs.getString("MATURITYDATE");
				String customername = rs.getString("CUSTOMER_NAME");
				
				rdacc_map.put(recdepoaccountNumber, recdepositaccholder);
			}
			log.info("\n fixed  account data fetching Successful");
			return rdacc_map;
		} 
		catch(Exception e)
		{
			log.error("Unable to fetch fixed account  data");
			log.debug("Error : "+e.getMessage());
			return rdacc_map;
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
	
	
	public HashMap<String, String> gettrasaction_data() {

		String fetchQry = "select TRANSACTION_ID ,ACCOUNT_ID,TRANSACTION_TYPE,TRANSACTION_DATE ,TRANSACTION_AMOUNT ,LOAN_ID ,CREDIT_CARD_ID  from ibs.TRANSACTION";
		Connection conn = null;
		Statement stmt = null;

		HashMap<String, String> txn_map = new HashMap<String, String>();

		try
		{
			conn = DBConnection.getConnection(jdbcDriver, jdbcUrl, jdbcUsername, jdbcPassword);
			stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(fetchQry);

			while(rs.next())
			{
				String txnDetails = rs.getString("TRANSACTION_ID");
				String accountnum = rs.getString("ACCOUNT_ID");
				String transactionType = rs.getString("TRANSACTION_TYPE");
				String txndate = rs.getString("TRANSACTION_DATE");
				String txnamount = rs.getString("TRANSACTION_AMOUNT");
				String loanID = rs.getString("LOAN_ID");
				String creditcardnum = rs.getString("CREDIT_CARD_ID");
				
				txn_map.put(txnDetails, accountnum);
			}
			log.info("\n fixed  account data fetching Successful");
			return txn_map;
		} 
		catch(Exception e)
		{
			log.error("Unable to fetch fixed account  data");
			log.debug("Error : "+e.getMessage());
			return txn_map;
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


