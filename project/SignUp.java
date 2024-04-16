import java.util.*;

class SignUp 
{
    public static String userName=" ",tempUserName=" ";
    private static String password="";
    public static Boolean uflag,pflag,login=false;
    
    public static void getUserName()
    {
        System.out.println("Enter username");
        Scanner s=new Scanner(System.in);
        userName=s.nextLine();
        tempUserName=tempUserName.concat(userName);
    }

    public static void getPassword()
    {
        Boolean b=true;
        System.out.println("Enter password");
        while(b) 
        {  
            Scanner s=new Scanner(System.in);
            password=s.nextLine();
            if(password.length()>=8)
            {
                reGetPassword();
                System.out.println("Signed up successfully");
                b=false;
                login=true;
            }
            else
            {
                System.out.println("Password should be atleast 8 characters enter again");                            
            }
                
        }
       
    }

    public static void reGetPassword()
    {
        Boolean b=true;
        String temp="";
        System.out.println("Re-enter your password");
        while(b) 
        {  
            Scanner s=new Scanner(System.in);
            temp=s.nextLine();
            if(password.trim().equals(temp))
            {
               return;
            }
            else
            {
                System.out.println("Password doesn't match enter again");                            
            }
                
        }
       
    }
    public static void checkUserName()
    {
        String un="";
        System.out.println("Enter username");
        Scanner s=new Scanner(System.in);
        un=s.nextLine();

        if(un.trim().equals(userName.trim()))
        {
            uflag=true;
            login=true;
            tempUserName=tempUserName.concat(userName);
        }
        else
        {
            uflag=false;
            login=false;
            tempUserName="";
        }
    }
    public static void checkPassword()
    {        
        String p="";
        System.out.println("Enter password");
        Scanner s=new Scanner(System.in);
        p=s.nextLine();
        
        if(p.trim().equals(password.trim()))
        {
            pflag=true;
            login=true;
        }
        else
        {
            pflag=false;
            login=false;
            tempUserName="";
        }
    }
}
