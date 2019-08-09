package cs472.mum;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.*;


public class CalcServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Set response content type
        response.setContentType("text/html");

        PrintWriter out = response.getWriter();
        String title = "W3D3 Assignment";
        String docType =
                "<!doctype html public \"-//w3c//dtd html 4.0 " + "transitional//en\">\n";

        out.println(docType +
                "<html>\n" +
                "<head><title>" + title + "</title></head>\n" +
                "<body bgcolor = \"#f0f0f0\">\n" +
                " <form method=post action='resultServlet'>" +
                "  <input type='number' name='number1'> " +
                "   + " +
               //+ request.getParameter("first_number") + "\n" +
                "  <input type='number' name='number2'>" +
                "  <input type='number' name='result1'></br>" +
                "  <input type='number' name='number3'> " +
                "   * " +
                //+ request.getParameter("first_number") + "\n" +
                "  <input type='number' name='number4'>" +
                "  <input type='number' name='result2'></br>" +
                "<input type=submit value='submit' >"+
                //+ request.getParameter("second_number") + "\n" +
                "</form>" +
                "</body>" +
                "</html>"
        );
    }
}
