import java.util.Scanner;

class Guesser
{
	int guessnum;
	public int guessNumber()
	{
		Scanner sc = new Scanner(System .in);
		System.out.println("Guess the number:");
		guessnum=sc.nextInt();
		return guessnum;
	}
}
class player
{
	int pguessnum;
	public int pguessNumber()
	{
		Scanner sc = new Scanner(System .in);
		System.out.println("Player Guess the number:");
		pguessnum=sc.nextInt();
		return pguessnum;
	}
}
class Umpire
{
	int numfromguesser;
	int numfromp1;
	int numfromp2;
	int numfromp3;
	void collectNumfromguesser()
	{
		Guesser g=new Guesser();
		numfromguesser=g.guessNumber();
		
		
		
	}
	void collectNumfromPlayer()
	{
		player p1 = new player();
		player p2 = new player();
		player p3 = new player();
		
		numfromp1=p1.pguessNumber();
		numfromp2=p2.pguessNumber();
		numfromp3=p3.pguessNumber();
				
	}
	void Compare()
	{
		if(numfromguesser==numfromp1)
		{
			if(numfromguesser==numfromp2 && numfromguesser==numfromp3)
			{
				System.out.println("game tie all players guessed correctly");
			}
			else if (numfromguesser==numfromp2)
			{
				System.out.println("player 1 and player2 won the game");
			}
			else if (numfromguesser==numfromp3)
			{
				System.out.println("player 1 and player 3 won the game");
			}
			else
			{
			System.out.println("player 1 won the game");
			}
		}
		else if(numfromguesser==numfromp2)
		{ 
			if (numfromguesser==numfromp3)
			{
				System.out.println("player 2 and player 3 has won the game");
			}
			else 
			{
			System.out.println("player 2 won the game");
			}+
	
		}
		else if (numfromguesser==numfromp3)
		{
			System.out.println("player 3 won the game");
		}
		else
		{
			System.out.println("Game lost try again");
		}
	}
}



public class Game {

	public static void main(String[] args) {
		Umpire u =new Umpire();
		u.collectNumfromguesser();
		u.collectNumfromPlayer();
		u.Compare();
	}

}
