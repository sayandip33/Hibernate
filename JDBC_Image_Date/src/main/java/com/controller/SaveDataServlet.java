package com.controller;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

import com.service.ImageService;
@MultipartConfig
@WebServlet("/SaveDataServlet")
public class SaveDataServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String name = request.getParameter("name");
        String email = request.getParameter("email");
        String phoneNo = request.getParameter("phoneNo");
        String date = request.getParameter("date");
        Part imagePart = request.getPart("file");
        ImageService i=new ImageService();
        i.saveFromJsp(name,email,phoneNo,date,imagePart);
        
        System.out.println("save Succeffully...");
        RequestDispatcher rd = request.getRequestDispatcher("form.jsp");
        request.setAttribute("msg", "Record is saved");
        rd.forward(request, response);
       
        
        
    }
}
