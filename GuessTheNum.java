import java.util.*;
public class GuessTheNum
{
	public static void main(String [] args)
	{
		Random rd=new Random();
		Scanner sc=new Scanner(System.in);
		System.out.println("Okk! I am guessing a number beteeen 0 to 100");
		int n=rd.nextInt(101);
		while(true)
		{
			System.out.println("You can write -1 to exit");
			System.out.println("Enter the number");
			int x=sc.nextInt();
			if(x==n)
			{
				System.out.println("Correct number");
				break;
			}
			else if(x==-1)
			{
				System.out.println("The number was:"+n);
				break;
			}
			else if(x>n)
			{
				System.out.println("Greater number");
			}
			else
			{
				System.out.println("Smaller number");
			}
		}
	}	
}