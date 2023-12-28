package jdbcdem;
import java.sql.*;
public class jdbcall {
	private static Connection con;
	private static PreparedStatement pst;
	
public static void main(String[]args)throws SQLException
	{
	String url="jdbc:mysql://localhost:3306/lijo";
	String user="root";
	String pass="Lijo-2001";
	 con=DriverManager.getConnection(url, user, pass);
	 con.setAutoCommit(true);

	
//	create();
	insert();
	//pst();
	}
public static void create() throws SQLException 
{

	String query="create table vsy(id int primary key auto_increment,name varchar(50))";
	Statement st=con.createStatement();
	int row=st.executeUpdate(query);
	System.out.println("created table");
}
public static void insert() throws SQLException 
	{
	String query="insert into vsy (name)values('lijo')";
	Statement st=con.createStatement();
	int rows=st.executeUpdate(query);
	System.out.println("inserted into table");
	}
public static void pst()throws SQLException
{
	
	String nll="insert into vsfamily (name)values(?)";
	String name="guru";
	pst=con.prepareStatement(nll);
	pst.setString(1,name);
	int rows=pst.executeUpdate();
}


}
