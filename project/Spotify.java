import java.util.*;

class Spotify 
{
	public static void main(String[] args) 
	{
		System.out.print("SPOTIFY                     ");
		System.out.print(SignUp.tempUserName.trim());
		System.out.println();
		loginPage(true);
	}
	public static void loginPage(boolean flag)
	{
		int lo_si=0;
		if(flag)
		{
			System.out.println("1.SignUp");
			System.out.println("2.LogIn");
			if(SignUp.login)
			{
				System.out.println("3.Log Out");
				System.out.println("4.Main menu");
			}
		}
		
		while(flag)
		{
			System.out.println("Select an option or press 0 to terminate");
			
			Scanner s=new Scanner(System.in);
			lo_si=s.nextInt();

			switch(lo_si)
			{
				case 1:
					SignUp.getUserName();
					SignUp.getPassword();
					//SignUp.regetPassword();
					MainMenu.mm(true);
					flag=false;
					break;

				case 2:
					flag=false;
					Boolean b=true;
					while(b)
					{
						SignUp.checkUserName();
						SignUp.checkPassword();
						if(!SignUp.uflag || !SignUp.pflag)
						{
							System.out.println("UserName or Password doesn't match");
						}
						else
						{
							System.out.println("Logged in successfully");
							b=false;
						}
					}
					MainMenu.mm(true);
					break;

				case 3:
					String[]args=new String[1];
					SignUp.login=false;
					SignUp.tempUserName=" ";
					System.out.println("Logged out successfully");
					main(args);
					flag=false;
					break;
				
				case 4:
					flag=false;
					MainMenu.mm(true);
					break;

				case 0:
					return;

				default:
					System.out.println("Invalid Option");
			}

		}
	}

}
