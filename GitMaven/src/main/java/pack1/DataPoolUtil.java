package pack1;

import java.sql.*;
import java.util.*;

import org.openqa.selenium.By;

public class DataPoolUtil {

	public static void main(String[] args) throws Exception
	{
		DataPoolUtil dp=new DataPoolUtil();
		
		  ResultSet rs_getRegistrationData=dp.getExcelData_AppAuthorization("TC01");
		   
			String refkey_xpath=""; 
			  
	           while (rs_getRegistrationData.next()) 
	           {
	        	 refkey_xpath=rs_getRegistrationData.getString("RefKey_Xpath");
	           }
		   
	           System.out.println(refkey_xpath);
	           
	           HashMap hm_xpaths_appauthorization=dp.getExcelData_Xpaths(refkey_xpath);
	           
	         String st=(String)hm_xpaths_appauthorization.get("Autho");
	           
	    System.out.println(st);
	}
	
	 public ResultSet getExcelData_AppLaunch(String testcase) throws Exception
	 {
	   
		 Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
	   
	String myDB = "jdbc:odbc:Driver={Microsoft Excel Driver (*.xls, *.xlsx, *.xlsm, *.xlsb)};DBQ=C:/MAVEN_GIT_REPOSITORY/GitMaven/DataPoolSheet.xlsx;"+ "DriverID=22;READONLY=false";
	     

	   Connection con = DriverManager.getConnection(myDB, "", "");
	   
	   System.out.println(con);
	   
	   
	   Statement stmt = null;
	   ResultSet rs = null;
	  
	   try 
	   {
	     
	     stmt = con.createStatement();
	     System.out.println("STMT"+stmt);
	     String excelQuery = "select * from [AppLaunch$] where TCName=+" +"'"+testcase+"'";
	     rs = stmt.executeQuery(excelQuery);
	     System.out.println("RS is:"+rs);
	
	  
	   } catch (Exception e)
	      {
	     System.err.println(e.getMessage());
	     } 
	   finally
	       {
	     try {
	     //  rs.close();
	     // stmt.close();
	      // con.close();

	     } catch (Exception e) {
	       e.printStackTrace();
	     }
	       }
		return rs;
	  	}	
		 
	 
	 public ResultSet getExcelData_AppSignIn(String testcase) throws Exception
	 {
	   
		 Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
	   
	String myDB = "jdbc:odbc:Driver={Microsoft Excel Driver (*.xls, *.xlsx, *.xlsm, *.xlsb)};DBQ=C:/MAVEN_GIT_REPOSITORY/GitMaven/DataPoolSheet.xlsx;"+ "DriverID=22;READONLY=false";
	     

	   Connection con = DriverManager.getConnection(myDB, "", "");
	   
	   System.out.println(con);
	   
	   
	   Statement stmt = null;
	   ResultSet rs = null;
	  
	   try 
	   {
	     
	     stmt = con.createStatement();
	     System.out.println("STMT"+stmt);
	     String excelQuery = "select * from [AppSignIn$] where TCName=+" +"'"+testcase+"'";
	     rs = stmt.executeQuery(excelQuery);
	
	  
	   } catch (Exception e)
	      {
	     System.err.println(e.getMessage());
	     } 
	   finally
	       {
	     try {
	     //  rs.close();
	     // stmt.close();
	      // con.close();

	     } catch (Exception e) {
	       e.printStackTrace();
	     }
	       }
		return rs;
	  	}	
		 
	 
	 public ResultSet getExcelData_AppLoginIn(String testcase) throws Exception
	 {
	   
		 Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
	   
	String myDB = "jdbc:odbc:Driver={Microsoft Excel Driver (*.xls, *.xlsx, *.xlsm, *.xlsb)};DBQ=C:/MAVEN_GIT_REPOSITORY/GitMaven/DataPoolSheet.xlsx;"+ "DriverID=22;READONLY=false";
	     

	   Connection con = DriverManager.getConnection(myDB, "", "");
	   
	   System.out.println(con);
	   
	   
	   Statement stmt = null;
	   ResultSet rs = null;
	  
	   try 
	   {
	     
	     stmt = con.createStatement();
	     System.out.println("STMT"+stmt);
	     String excelQuery = "select * from [AppLogIn$] where TCName=+" +"'"+testcase+"'";
	     rs = stmt.executeQuery(excelQuery);
	     System.out.println("RS is:"+rs);
	
	  
	   } catch (Exception e)
	      {
	     System.err.println(e.getMessage());
	     } 
	   finally
	       {
	     try {
	     //  rs.close();
	     // stmt.close();
	      // con.close();

	     } catch (Exception e) {
	       e.printStackTrace();
	     }
	       }
		return rs;
	  	}	
		 
	
	 public ResultSet getExcelData_AppAuthorization(String testcase) throws Exception
	 {
	   
		 Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
	   
	String myDB = "jdbc:odbc:Driver={Microsoft Excel Driver (*.xls, *.xlsx, *.xlsm, *.xlsb)};DBQ=C:/MAVEN_GIT_REPOSITORY/GitMaven/DataPoolSheet.xlsx;"+ "DriverID=22;READONLY=false";
	     

	   Connection con = DriverManager.getConnection(myDB, "", "");
	   
	   System.out.println(con);
	   
	   
	   Statement stmt = null;
	   ResultSet rs = null;
	  
	   try 
	   {
	     
	     stmt = con.createStatement();
	     System.out.println("STMT"+stmt);
	     String excelQuery = "select * from [AppAuthorization$] where TCName=+" +"'"+testcase+"'";
	     rs = stmt.executeQuery(excelQuery);
	
	  
	   } catch (Exception e)
	      {
	     System.err.println(e.getMessage());
	     } 
	   finally
	       {
	     try {
	     //  rs.close();
	     // stmt.close();
	      // con.close();

	     } catch (Exception e) {
	       e.printStackTrace();
	     }
	       }
		return rs;
	  	}	
		 
	
	 public ResultSet getExcelData_AppHomePage(String testcase) throws Exception
	 {
	   
		 Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
	   
	String myDB = "jdbc:odbc:Driver={Microsoft Excel Driver (*.xls, *.xlsx, *.xlsm, *.xlsb)};DBQ=C:/MAVEN_GIT_REPOSITORY/GitMaven/DataPoolSheet.xlsx;"+ "DriverID=22;READONLY=false";
	     

	   Connection con = DriverManager.getConnection(myDB, "", "");
	   
	   System.out.println(con);
	   
	   
	   Statement stmt = null;
	   ResultSet rs = null;
	  
	   try 
	   {
	     
	     stmt = con.createStatement();
	     System.out.println("STMT"+stmt);
	     String excelQuery = "select * from [AppHomePage$] where TCName=+" +"'"+testcase+"'";
	     rs = stmt.executeQuery(excelQuery);
	     System.out.println("RS is:"+rs);
	
	  
	   } catch (Exception e)
	      {
	     System.err.println(e.getMessage());
	     } 
	   finally
	       {
	     try {
	     //  rs.close();
	     // stmt.close();
	      // con.close();

	     } catch (Exception e) {
	       e.printStackTrace();
	     }
	       }
		return rs;
	  	}	
		 
	 
	 public HashMap getExcelData_Xpaths(String ref_key) throws Exception
	 {
		   
		 Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
	
		 String myDB = "jdbc:odbc:Driver={Microsoft Excel Driver (*.xls, *.xlsx, *.xlsm, *.xlsb)};DBQ=C:/MAVEN_GIT_REPOSITORY/GitMaven/DataPoolSheet.xlsx;"+ "DriverID=22;READONLY=false";
	
	  
	   Connection con = DriverManager.getConnection(myDB, "", "");
	   
	   System.out.println(con);
	   
	   
	   Statement stmt = null;
	   ResultSet rs = null;
	   ResultSet rs1 = null;
	   
	   HashMap hm=null;
	   
	   try 
	   {
	     
	     stmt = con.createStatement();
	     System.out.println("STMT"+stmt);
	     String excelQuery = "select * from [Xpaths$] where PageName=+" +"'"+ref_key+"'";
	     rs = stmt.executeQuery(excelQuery);
	     System.out.println("RS is:"+rs);
	      
	     int size=0;
	     while (rs.next()) {
	         size++;
	     }
	     System.out.println("SIZE:"+size);
	     
	     
	     hm=new HashMap(size);
	     
	     rs1 = stmt.executeQuery(excelQuery);
	     
	     while(rs1.next())
	     {
	    	 //System.out.println(rs1.getString(3));
	    	 
	    	 hm.put(rs1.getString(2),rs1.getString(3));
	    	 
	     }
	   
	     
	   } catch (Exception e)
	      {
	     System.err.println(e.getMessage());
	     } 
	   finally
	       {
	     try {
	   /*
	   rs.close();
	     rs1.close();
	      stmt.close();
	       con.close();
    */
	     } catch (Exception e) {
	       e.printStackTrace();
	     }
	       }
		return hm;
	  	}	

	 
	 public HashMap getExcelData_Verifications(String ref_key) throws Exception
	 {
		   
		 Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
	
		 String myDB = "jdbc:odbc:Driver={Microsoft Excel Driver (*.xls, *.xlsx, *.xlsm, *.xlsb)};DBQ=C:/MAVEN_GIT_REPOSITORY/GitMaven/DataPoolSheet.xlsx;"+ "DriverID=22;READONLY=false";
	
	  
	   Connection con = DriverManager.getConnection(myDB, "", "");
	   
	   System.out.println(con);
	   
	   
	   Statement stmt = null;
	   ResultSet rs = null;
	   ResultSet rs1 = null;
	   
	   HashMap hm=null;
	   
	   try 
	   {
	     
	     stmt = con.createStatement();
	     System.out.println("STMT"+stmt);
	     String excelQuery = "select * from [Verifications$] where PageName=+" +"'"+ref_key+"'";
	     rs = stmt.executeQuery(excelQuery);
	     System.out.println("RS is:"+rs);
	      
	     int size=0;
	     while (rs.next()) {
	         size++;
	     }
	     System.out.println("SIZE:"+size);
	     
	     
	     hm=new HashMap(size);
	     
	     rs1 = stmt.executeQuery(excelQuery);
	     
	     while(rs1.next())
	     {
	    	 //System.out.println(rs1.getString(3));
	    	 
	    	 hm.put(rs1.getString(2),rs1.getString(3));
	    	 
	     }
	   
	     
	   } catch (Exception e)
	      {
	     System.err.println(e.getMessage());
	     } 
	   finally
	       {
	     try {
	   /*
	   rs.close();
	     rs1.close();
	      stmt.close();
	       con.close();
    */
	     } catch (Exception e) {
	       e.printStackTrace();
	     }
	       }
		return hm;
	  	}	
	 
}
