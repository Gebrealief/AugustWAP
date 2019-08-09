package cs472.mum.edu;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.*;

public class calculatorServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        int  number1 = Integer.parseInt(request.getParameter("number1"));
        int number2 = Integer.parseInt(request.getParameter("number2"));
        int  number3 = Integer.parseInt(request.getParameter("number3"));
        int number4 = Integer.parseInt(request.getParameter("number4"));

        int result1=number1+number2;
        int result2=number3*number4;

        response.setContentType("text/html");
        String title = "W3D3 Assignment";
        String docType =
                "<!doctype html public \"-//w3c//dtd html 4.0 " + "transitional//en\">\n";
        out.println(docType +
                "<html>\n" +
                "<head><title>" + title + "</title></head>\n" +
                "<body bgcolor = \"#f0f0f0\">\n" +
                " <form method=post action='calculator2'>" +
                "  <input type='number' name='number1'> " +
                "   + " +
                "  <input type='number' name='number2'> = " +
                "  <input type='number' name='result1' value=" + result1 +"></br>" +
                "  <input type='number' name='number3' > " +
                "   * " +
                "  <input type='number' name='number4'> = " +
                "  <input type='number' name='result2' value=" + result2 + "></br>" +
                "<input type=submit value='submit' > " +
                "</form>" +
                "</body>" +
                "</html>"
        );

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
                " <form method=post action='calculator2'>" +
                "  <input type='number' name='number1'> " +
                "   + " +
                "  <input type='number' name='number2'> = " +
                "  <input type='number' name='result1'></br>" +
                "  <input type='number' name='number3'> " +
                "   * " +
                "  <input type='number' name='number4'> = " +
                "  <input type='number' name='result2'></br>" +
                "<input type=submit value='submit' > " +
                "</form>" +
                "</body>" +
                "</html>"
        );

    }
}
