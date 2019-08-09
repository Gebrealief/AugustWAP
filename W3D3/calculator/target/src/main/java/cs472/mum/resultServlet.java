package cs472.mum;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "resultServlet")
public class resultServlet extends HttpServlet {
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
                number1 + "+" + number2 + "=" + result1 +  "</br>" +
                number3 + "*" + number4 + "=" + result2 +
                "</body>" +
                "</html>"
        );

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
