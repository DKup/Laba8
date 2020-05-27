package servlet; 

import java.io.IOException; 
import java.io.PrintWriter; 
import java.util.Calendar;

import javax.servlet.ServletException; 
import javax.servlet.http.HttpServletRequest; 
import javax.servlet.http.HttpServletResponse; 
import entity.ChatMessage;
import entity.ChatUser;


public class MessageListServlet extends ChatServlet {
	
	private static final long serialVersionUID = 1L;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse
			response) throws ServletException, IOException {
			response.setCharacterEncoding("utf8");
     PrintWriter pw = response.getWriter();
   pw.println("<html><head><meta http-equiv='Content-Type' " +
    "content='text/html; charset=utf-8'/><meta http-equiv='refresh' " +
    		"content='10'></head>"); 
    pw.println("<body>"); 

    for (int i=0; i<=messages.size()-1; i++) {
    	ChatMessage aMessage = messages.get(i);
        String thisUser = ((String) request.getSession().getAttribute("name"));
        if( aMessage.getChek(aMessage.getMessage()))
        {
        if (messages.get(i).getMessage().startsWith("@" + thisUser)||aMessage.getAuthor().getName()==thisUser)
         pw.println("<div><strong>" + aMessage.getAuthor().getName() + "</strong>: " + aMessage.getMessage() + "</div>");
        else continue;}

else
    	pw.println("<div><strong>" + aMessage.getAuthor().getName() + "</strong>: " + aMessage.getMessage() + "</div>");

    }
    
    pw.println("</body></html>"); 
  } 
}