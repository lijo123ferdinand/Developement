package jdbcdem;

import java.sql.*;


public class jdbctest {
    public static void main(String[] args) throws SQLException {
        String url = "jdbc:mysql://localhost:3306/lijo";
        String user = "root";
        String password = "Lijo-2001";
        String query = "SELECT * FROM gpas";
        Connection con=DriverManager.getConnection(url, user, password);
        Statement st=con.createStatement();
        ResultSet rs=st.executeQuery(query);
        while (rs.next()) {
            System.out.println(rs.getInt(1) + " " + rs.getString(2));
        }

        rs.close();
        st.close();
        con.close();
       
    }
}
