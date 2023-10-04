package com.auca.service;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/login")
public class UserLogin extends HttpServlet {

    public void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        String username = req.getParameter("name");
        String password = req.getParameter("password");

        if ("Buturo Eric".equals(username) && "1245".equals(password)) {

            try {
                HttpSession session = req.getSession(true);
                session.setAttribute("name", username);
                res.sendRedirect("Admission.html");
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            
            res.sendRedirect("forgot_passsword.html");
        }
    }
}
