// We Have To Add sqljdbc4.jar To The Project

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class SQL_Server 
{
public static void main(String args[])throws Exception
{	
Connection con=DriverManager.getConnection("jdbc:sqlserver://localhost:1433;user=sa;password=abcd;database=s17");

Statement st=con.createStatement();

ResultSet rs=st.executeQuery("select * from emp");

while(rs.next()) // It Returns True/False
{
System.out.println(rs.getString(1)+"\t"+rs.getString(2));
}
rs.close();
st.close();
con.close();

}
}