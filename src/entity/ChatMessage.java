package entity;
import java.util.regex.Matcher;
public class ChatMessage { 

  private String message;
    private String user;

  private ChatUser author; 

  private long timestamp;  

public ChatMessage(String message, ChatUser author, long timestamp) { 
    super(); 
    this.message = message; 
    this.author = author; 
    this.timestamp = timestamp; 
  }
    public ChatMessage(String message, ChatUser author, long timestamp, String user) {
        super();
        this.message = message;
        this.author = author;
        this.timestamp = timestamp;
        this.user =user;
    }

    public String getMessage() {
    return message; 
  } 
   
  public void setMessage(String message) { 
	    this.message = message; 
	  }
	  public ChatUser getAuthor() {
            return author; 
          }
          public boolean getChek (String message)
      {int mark =message.indexOf("@");
      if(mark!=-1)
      return true;
      else return false;}
   public String findName(String message)
   {String[] name= message.split("\\ ");
   return name[1];

   }
  public void setAuthor(ChatUser author) { 
    this.author = author; 
  } 
   
  public long getTimestamp() { 
	    return timestamp; 
	  }

	  public void setUser(String user){this.user=user;}
   
  public void setTimestamp(long timestamp) { 
    this.timestamp = timestamp; 
    }  
  }  
