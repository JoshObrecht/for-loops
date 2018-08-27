import java.util.Scanner;
public class forLoops
	{

		public static void main(String[] args)
			{
				doChallengeOne();
				doChallengeTwo();
				doChallengeThree();
				doChallengeFour();
				doChallengeFive();
			}
		public static void doChallengeOne()
		{
			for(int i=1; i<=5; i++)
				{
					System.out.println(i);
				}
		}
		public static void doChallengeTwo()
		{
			for(int i=2; i<=10; i=i+2)
				{
					System.out.println(i+") I love Mullen!");
				}
		}
		public static void doChallengeThree()
		{
			for(int i=1; i<=5; i++)
				{
					System.out.print(i);
					
				}
		}
		public static void doChallengeFour()
		{
			for(int i=10; i>=1; i--)
				{
					System.out.println(i);
				}
			System.out.println("Lift off!");
		}
		public static void doChallengeFive()
		{
			int counter=0;
			for(int i=0; i<=100; i=i+5)
				{
					counter=counter+i;
				}
			System.out.println(counter);
		}
		public static void doChallengeSix()
		{
			Scanner userInput= new Scanner(System.in);
			System.out.println("");
		}
		

	}
