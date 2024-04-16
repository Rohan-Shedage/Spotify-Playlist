import java.util.*;

class play1
{
	public static ArrayList al=new ArrayList();
	public static int sr=2;
	public static String plname="";
	public static boolean mainflag;
	public static ArrayList editArrList=new ArrayList();

	public static void createPlaylist(Boolean b)
	{
		al.clear();
		int opt=0;
		plname="";
		while(b)
		{
			System.out.println("Press 1 to add song,2 to remove song,3 to save playlist");
			Scanner s=new Scanner(System.in);
			opt=s.nextInt();

			switch(opt)
			{
				case 1:	
					al.addAll(addSong());
					break;
					
				case 2:						
					al.removeAll(removeSong(al));
					break;

				case 3:
					plname=playName();
					b=false;
					sr++;
					System.out.println("PlayList "+plname+" created");
					mainflag=true;
					MainMenu.mm(true);
					break;		
					
				default:
					System.out.println("Invalid option");
			}
		}
	}
	public static ArrayList addSong()
	{
		ArrayList al=new ArrayList();
		String songName="";
		Scanner s=new Scanner(System.in);

		boolean b1=true;

		System.out.println("Enter song name to add in the playlist");
		while(b1) 
		{
			songName=s.nextLine();
			if(songName.trim()=="")
			{
				break;
			}
			else
			{
				al.add(songName);
			}
		}
		return al;
	}
	public static ArrayList removeSong(ArrayList al)
	{
		ArrayList al1=new ArrayList();
		String songName="";
		Scanner s=new Scanner(System.in);

		boolean b1=true;

		System.out.println("Enter song name to remove from the playlist");
		while(b1) 
		{
			songName=s.nextLine();
			if(songName.trim()=="")
			{
				break;
			}
			else
			{
				al.remove(songName);
			}
		}
		return al1;
	}
	public static void editAddSong()
	{
		String songName="";
		Scanner s=new Scanner(System.in);

		boolean b1=true;

		System.out.println("Enter song name to add in the playlist");
		while(b1) 
		{
			songName=s.nextLine();
			if(songName.trim()=="")
			{
				break;
			}
			else
			{
				editArrList.add(songName);
			}
		}

	}
	public static void editRemoveSong()
	{
		String songName="";
		Scanner s=new Scanner(System.in);

		boolean b1=true;

		System.out.println("Enter song name to remove from the playlist");
		while(b1) 
		{
			songName=s.nextLine();
			if(songName.trim()=="")
			{
				break;
			}
			else
			{
				editArrList.remove(songName);
			}
		}
	}
	public static String playName()
	{
		String plName="";
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a name for the playlist");
		plName=s.nextLine();
				
		return plName;
	}

	public static void playPlayList(ArrayList[]alarr)
	{
		int temp=0,ind=0;
		Boolean b=true;
		ArrayList al=new ArrayList(alarr[MainMenu.ind]);
		if(al.size()!=0)
		{
			System.out.println("Playling "+ al.get(ind));
		}
		else
		{
			System.out.println("Playlist empty");
			MainMenu.mm(true);
		}
		mainflag=false;
		
		while(b)
		{
			System.out.println("Press 1 to play next song,2 to play previous song,9 to go back,0 to terminate");

			Scanner s=new Scanner(System.in);
			temp=s.nextInt();

			switch(temp)
			{
				case 1:
					if(ind!=al.size()-1)
						ind++;
					else
						ind=0;

					System.out.println("Playling "+ al.get(ind));
					break;

				case 2:
					if(ind!=0)
						ind--;
					else
						ind=al.size()-1;

					System.out.println("Playling "+ al.get(ind));
					break;

				case 9:
					b=false;
					MainMenu.mm(true);
					break;

				case 0:
					b=false;
					MainMenu.mm(false);
					break;

				default:
					System.out.println("Invalid Option");

			}	
		}
	}

	public static void editPlaylist(Boolean b)
	{
		int opt=0;
		while(b)
		{
			System.out.println("Press 1 to add song,2 to remove song,3 to save playlist");
			Scanner s=new Scanner(System.in);
			opt=s.nextInt();

			switch(opt)
			{
				case 1:	
					editAddSong();
					break;
					
				case 2:						
					editRemoveSong();
					break;

				case 3:
					b=false;
					System.out.println("PlayList saved");
					MainMenu.mm(true);
					break;		
					
				default:
					System.out.println("Invalid option");
			}
		}
	}

}

