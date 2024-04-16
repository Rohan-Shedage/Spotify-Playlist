import java.util.*;

class Artists 
{
	public static void menu(boolean flag)
	{
		int ar=0;
		ArrayList al=new ArrayList();
		ArrayList al1=new ArrayList();
		ArrayList al2=new ArrayList();
		ArrayList al3=new ArrayList();

		if(flag)
		{			
			//Arjit Singh
			System.out.println("1.Arjit Singh");
			al.add("Gerua");
			al.add("Lutt putt gaya");
			al.add("Tum hi ho");
			al.add("Galti se mistake");
			al.add("Satranga");

			//Neha Kakkar
			System.out.println("2.Neha Kakkar");			
			al1.add("Gali Gali");
			al1.add("London Thumakda");
			al1.add("Badri ki Dulhania");
			al1.add("kala Chashma");
			al1.add("Dilbar");

			//Sonu Nigam
			System.out.println("3.Sonu Nigam");			
			al2.add("No entry");
			al2.add("Kabhi khusi kabhi gham");
			al2.add("Mujhse shaadi karogi");
			al2.add("Bole Chudiyaan");
			al2.add("Apne");

			//Shreya Ghoshal
			System.out.println("4.Shreya Ghoshal");
			al3.add("Teri meri");
			al3.add("Chikni chameli");
			al3.add("Tere liye");
			al3.add("Saathiyaa");
			al3.add("Barso re");
		}

		while(flag)
		{
			System.out.println("Select an option/press 9 to go back/0 to terminate");
		
			Scanner s=new Scanner(System.in);
			ar=s.nextInt();

			switch(ar)
			{
				case 1:
					flag=false;
					playSongs(al);
					break;

				case 2:
					flag=false;
					playSongs(al1);
					break;

				case 3:
					flag=false;
					playSongs(al2);
					break;

				case 4:
					flag=false;
					playSongs(al3);
					break;
				
				case 9:
					flag=false;
					MainMenu.mm(true);
					break;

				case 0:
					flag=false;
					MainMenu.mm(false);
					break;
				
				default:
					System.out.println("Invalid Option");
			}

		}
		//System.out.println(al);

	}

	public static void playSongs(ArrayList al)
	{
		int ind=0,temp=0;
		boolean flag=true;

		System.out.println("Playling "+ al.get(ind));

		while(flag)
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
					flag=false;
					menu(true);
					break;

				case 0:
					flag=false;
					menu(false);
					break;

				default:
					System.out.println("Invalid Option");

			}

		}
	}

}
