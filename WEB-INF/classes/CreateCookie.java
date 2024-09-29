import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class CreateCookie extends HttpServlet {

  public void doPost(HttpServletRequest request, HttpServletResponse response) {
    try {
      response.setContentType("text/html");
      PrintWriter out = response.getWriter();
      String userName = request.getParameter("user");
      String password = request.getParameter("password");
      Cookie ck = new Cookie("User", userName);
      Cookie ck1 = new Cookie("Password", password);
      response.addCookie(ck);
      response.addCookie(ck1);
     out.print("<html>");
   out.print("<head><link rel='stylesheet' href='CreateCookie.css'/></head>");
 out.print("<body>");
      out.print("<div>");
      out.print("<form action='login-2' >");
out.print("<h3>User Name:="+"<b style='color:#8A2BE2'>" + userName+"</b>"+"</h3>" );
      out.print("<h3>Password:=" +"<b style='color:#8A2BE2'>" + password +"</b>"+"</h3>");
      out.print("<p>Session Created for "+ userName +" "+"and" +" "+password+"</p>");
      out.print("<button>GetSession</button>");
      out.print("</form>");
 out.print("</div>");
out.print("</body>");
out.print("</html>");
       out.close();
    } catch (Exception e) {
      System.out.println(e);
    }
  }
}