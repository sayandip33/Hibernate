package p1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

public class A {
	public static void main(String[] args) {
		try {
		
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/dhruv_db","root","test");
			Statement st = con.createStatement();
			String id="10";
			//st.executeUpdate("insert into table1 values('11', 'dhruv', 'Dhruv@gmail.com')");
			st.executeUpdate("insert into table1 values('"+id+"', 'dhruv', 'Dhruv@gmail.com')");
			con.close();
			System.out.println("update succesfully");
			
			PreparedStatement p = con.prepareStatement("insert into table1 values(?, ?, ?)");
			p.setString(1, "101");
			p.setString(2, "Kuldeep");
			p.setString(3, "kuldeep@gmail.com");
			p.executeUpdate();
			con.close();
			System.out.println("sucesss");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
