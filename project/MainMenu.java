import java.util.*;

class MainMenu 
{
	public static String[] playlistname=new String[10];
	public static int temp,temp1;
	public static ArrayList[]al=new ArrayList[10];
	public static int count,ind;
	public static boolean editFlag=false;

	public static void mm(boolean flag)
	{
		if(editFlag)
		{
			al[ind].addAll(play1.editArrList);
		}
		ind=0;
		editFlag=false;
		play1.editArrList.clear();
		int ar_pl=0;
		int srNo=play1.sr;
		Boolean mf=play1.mainflag;
		
		if(srNo>2 && mf)
		{
			playlistname[temp]=play1.plname;
			temp++;
		}
				
		if(srNo>2 && mf)
		{
			al[count]=play1.al;
			count++;
		}
		
		if(flag)
		{
			System.out.println("1.Artists");
			System.out.println("2.Create a playList");
			if(srNo>2)
			{
				for(int i=1;i<=srNo-2;i++)
				{
					temp1=2+i;
					System.out.println(temp1+"."+playlistname[i-1]);
				}
			}
		}

		while(flag)
		{
			System.out.println("Select an option/press 9 to go back/0 to terminate");
			
			Scanner s=new Scanner(System.in);
			ar_pl=s.nextInt();

			if(ar_pl==1)
			{
				flag=false;
				Artists.menu(true);
				break;
			}
			else if(ar_pl==2)
			{
				flag=false;
				play1.createPlaylist(true);
				break;
			}
			else if(ar_pl>2 && ar_pl!=9)
			{
				ind=0;
				ind=ar_pl-3;
				flag=false;
				optionPlayList(al,true);
				break;
			}
			else if(ar_pl==9)
			{
				String[]args=new String[1];
				flag=false;
				Spotify.main(args);				
				break;
			}
			else if(ar_pl==0)
			{				
				flag=false;
				Spotify.loginPage(false);
				break;
			}
			else
			{
				System.out.println("Invalid Option");
			}

		}
	}
	
	public static void optionPlayList(ArrayList[] al,Boolean b)
	{
		
		int opt=0;

		if(b)
		{
			System.out.println("1.Play playlist");
			System.out.println("2.Edit playlist");
		
		}

		while(b)
		{
			System.out.println("Select an option/9 to go back/0 to terminate");
			Scanner s=new Scanner(System.in);
			opt=s.nextInt();
			
			switch (opt) 
			{
				case 1:
					b=false;
					play1.playPlayList(al);
					break;
				
				case 2:
					b=false;
					editFlag=true;
					play1.editPlaylist(true);
					break;

				case 9:
					b=false;
					mm(true);
					break;

				case 0:
					b=false;
					mm(false);
					break;

				default:
				System.out.println("Invalid Option");
			}
		}

	}
}
