package MavenProject123.project11;


import java.sql.*;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ForJDBC 
{
	static Connection conn=null;
    static Statement st;
    public static String s1="jdbc:ucanaccess://F://emp1.accdb";
    
    @BeforeTest
    public void Setup()
    {
    /*try
		{
			
			
		Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
		
		}catch(ClassNotFoundException cnfe)
		{
			System.out.println("Class not found"+cnfe);
		} */
    	 
    	try
    	{
    		
			conn=DriverManager.getConnection(s1);
			
			st=conn.createStatement();
    	}
    	catch(Exception e)
    	{
    		e.printStackTrace();
    	}
    }
    @Test
    public void runit()
    {
    	try
    	{
    	ResultSet rs=st.executeQuery("select * from emp1");
		while(rs.next())
		{
			System.out.println("Id is :"+rs.getInt("Emp_id")+"\nName is:"+rs.getString("Emp_Name")+"\nSalary is:"+rs.getInt("Emp_salary"));
			System.out.println("------------------------------");
		}
    	}
    	catch(Exception e)
    	{
    		e.printStackTrace();
    	}
    }
    @AfterTest
    public void shutdown() throws Exception
    {
    	if(conn!=null)
    	{
    		conn.close();
    	}
    }
}
