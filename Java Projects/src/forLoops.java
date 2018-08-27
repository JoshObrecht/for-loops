import java.util.Scanner;
public class forLoops
	{

		public static void main(String[] args)
			{
//				doChallengeOne();
//				doChallengeTwo();
//				doChallengeThree();
//				doChallengeFour();
//				doChallengeFive();
//				doChallengeSix();
				doChallengeSeven();
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
			System.out.println("I will add up all numbers bewteen the bounds of your choice.");
			System.out.println("First, give me a lower bound.");
			int lowerBound=userInput.nextInt();
			System.out.println("Next, give me an upper bound.");
			int upperBound=userInput.nextInt();
			int finalNumber=0;
			
			for(;lowerBound<=upperBound; lowerBound++)
				{
					finalNumber=lowerBound+finalNumber;
				}
			System.out.println(finalNumber);
			
		}
		public static void doChallengeSeven()
		{
			Scanner userInput= new Scanner(System.in);
			System.out.println("I will add up all numbers bewteen the bounds of your choice but ONLY if they are divisible by three.");
			System.out.println("First, give me a lower bound.");
			int lowerBound=userInput.nextInt();
			System.out.println("Next, give me an upper bound.");
			int upperBound=userInput.nextInt();
			int finalNumber=0;
			
			for(;lowerBound<=upperBound; lowerBound++)
				{
					if(lowerBound%3==0)
						{
					finalNumber=lowerBound+finalNumber;
						}
				}
			System.out.println(finalNumber);
		}
		

	}
