import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class EMP extends HttpServlet {
  private static final long serialVersionUID = 1L;

  protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    response.setContentType("text/html");
    PrintWriter out = response.getWriter();
    Cookie c = new Cookie("EMPID", "AN123");
    response.addCookie(c);
    Cookie c1[] = request.getCookies();
    for (int i = 0; i < c1.length; i++) {
      String name = c1[i].getName();
      String value = c1[i].getValue();
      out.println("Name = " + name);
      out.println("Value = " + value);
    }
  }

  protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    doGet(request, response);
  }
}
