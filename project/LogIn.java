import java.util.*;

class LogIn 
{
    public static String userName;
    public static String password;

    public static String getUserName()
    {
        System.out.println("Enter username");
        Scanner s=new Scanner(System.in);
        userName=s.nextLine();
        
        return userName;
    }

    public static String getPassword()
    {
        Boolean b=true;
        System.out.println("Enter password");
       
        Scanner s=new Scanner(System.in);
        password=s.nextLine();
        
        return password;
       
    } 
}
