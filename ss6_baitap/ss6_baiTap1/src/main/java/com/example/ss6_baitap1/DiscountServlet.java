package com.example.ss6_baitap1;

import java.io.*;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "helloServlet", value = "/hello-servlet")
public class DiscountServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String title = request.getParameter("title");
        String price = request.getParameter("price");
        String percent = request.getParameter("percent");
        String result = null;
        if (title.length() == 0 || price.length() == 0 || percent.length() == 0) {
            result = "Nhap cho dang hoang vao ban eiiiii!";
        } else {
            float priceP = Float.parseFloat(price);
            float percentP = Float.parseFloat(percent);
            float amount = (float) (priceP * percentP * 0.01);
            float newPrice = priceP - amount;
            result = String.valueOf(newPrice);
        }
        PrintWriter writer = response.getWriter();
        writer.println("<html>");
        writer.println("<h2>Title: " + title + "</h2>");
        writer.println("<h3>Discount Price: " + result + "VND</h3>");
        writer.println("</html>");

    }
}