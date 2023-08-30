package com.service;

import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.http.Part;

public class ImageService {

	public void saveFromJsp(String name, String email, String phoneNo, String date, Part imagePart) {
		try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/experiment", "root", "test");

            String sql = "INSERT INTO fileHandling (name, email, phoneNo, date, image) VALUES (?, ?, ?, ?,?)";
            PreparedStatement statement = conn.prepareStatement(sql);
            statement.setString(1, name);
            statement.setString(2, email);
            statement.setString(3, phoneNo);
            statement.setString(4, date);
            InputStream is = imagePart.getInputStream();
            statement.setBinaryStream(5, is, (int) imagePart.getSize());

            int rowsInserted = statement.executeUpdate();
        
        } catch (Exception e) {
            e.printStackTrace();
        }
	}
	
}
