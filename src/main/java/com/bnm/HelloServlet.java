package com.bnmit;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class HelloServlet extends HttpServlet {
    public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
        res.setContentType("text/html");
        PrintWriter out = res.getWriter();
        out.println("<h1>Deployment Successful!</h1>");
        out.println("<h2>GitHub → Jenkins → Docker → Tomcat</h2>");
    }
}