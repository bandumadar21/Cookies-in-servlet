import java.io.*;  
import javax.servlet.*;  
import javax.servlet.http.*;  
  
public class RetrieveCookie extends HttpServlet {  
  
public void doGet(HttpServletRequest request, HttpServletResponse response){  
    try{  
  
    response.setContentType("text/html");  
    PrintWriter out = response.getWriter();  
      
    Cookie ck[]=request.getCookies(); 
      out.print("<html>");
   out.print("<head><link rel='stylesheet' href='RetrieveCookie.css'/></head>");
 out.print("<body>");
      out.print("<div>");
       out.print("<span>");
     out.print("Cookie Name and Value Details"+"<br/>");
out.print("----------------------------------------------"+"<br/>");
    for(int i=0;i<ck.length;i++){
        out.print("Cookie Name=" +"<b style='color:#8A2BE2'>"+ck[i].getName()+"</b>" +" ,");  
        out.print("Cookie Value= "+"<b style='color:#8A2BE2'>"+ck[i].getValue()+"</b>"+"<br/>");  
    
    }
out.print("----------------------------------------------"+"<br/>");
ck[0].setValue("Madan");
response.addCookie(ck[0]);
out.print("Cookie Name=" +"<b style='color:#8A2BE2'>"+ck[0].getName()+"</b>" +" ,");  
out.print("Cookie Value= "+"<b style='color:#8A2BE2'>"+ck[0].getValue()+"</b>"+"<br/>");  
  out.print("</span>");
    out.print("</div>");
      out.print("</body>");	
out.print("</html>");
    out.close();  
  
         }catch(Exception e){System.out.println(e);}  
    }  
      
  
}  