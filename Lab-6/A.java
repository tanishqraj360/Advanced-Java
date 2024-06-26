import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.HttpServlet;
import jakarta.servlet.HttpServletResponse;
import jakarta.servlet.HttpServletRequest;

public class A extends HttpServlet {
  private static final long serialVersionUID = 1L;

  public A() {
    super();
  }

  protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    response.setContentType("text/html");
    PrintWriter out = response.getWriter();
    String msg = "RD";
    out.println("hello\n" + msg + "\n how are you?");
    out.close();
  }

  protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    doGet(request, response);
  }
}
