package jdbcdem;
import java.sql.*;

public class vsfam {
	public static void main(String[]args) throws SQLException{
		String url="jdbc:mysql://localhost:3306/lijo";
		String user="root";
		String pass="Lijo-2001";
		String query="select*from vsfamily";
		Connection con=DriverManager.getConnection(url, user, pass);
		Statement st=con.createStatement();
		ResultSet rs=st.executeQuery(query);
		while (rs.next())
			System.out.println(rs.getInt(1)+"   "+rs.getString(2)+"   "+rs.getInt(3));
		
		con.close();
	}}

