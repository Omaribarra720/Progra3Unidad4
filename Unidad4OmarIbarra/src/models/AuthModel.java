package models;
import java.sql.*;  

public class AuthModel {

	public AuthModel() {
		
	}

	public void login(String usr, String pwd) {
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			
			try {
				Connection con=DriverManager.getConnection("jdbc:mysql://sql.freedb.tech:3306/freedb_db_unidad4","freedb_master_of_db","wcxCHZ#V%TBR7K%");
				
				Statement stmt=con.createStatement();  
				ResultSet rs=stmt.executeQuery("select * from Usuarios");  
				while(rs.next())
					
					if(usr.equals(rs.getString(2)) && pwd.equals(rs.getString(3))) {
						System.out.println("Datos correctos");
						break;
					}else {
						System.out.println("Datos erroneos");
					}
 
				con.close();  
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}  
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}  
	}
}