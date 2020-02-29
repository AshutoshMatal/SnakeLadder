import java.util.Scanner;

public class SnakeLadder {

	public static void main(String[] args) {
		System.out.println("Welcome to Snake Ladder Simulator");
		int position=0;
		int dice;
		int player=0;
		int choice;
		int WIN_POSITION=100;
		int START_POSITION=0;
		dice=(int)((Math.random()*6)+1);
		Scanner sc=new Scanner(System.in);
		System.out.println(dice);
		choice=(int)(Math.random()*3+1);
		switch(choice)
		{
		case 1: System.out.println("No play");
			   	position=position;
			   	System.out.println(position);
			   	break;
		case 2: System.out.println("Ladder");
				if((position+dice)< WIN_POSITION)
				{
				position=position+dice;
				System.out.println(position);
				}
				break;
		case 3:System.out.println("Snake");
				if((position+dice)< START_POSITION)
				{
				position=START_POSITION;
				}
				else
				{
				position=position-dice;
				}
				System.out.println(START_POSITION);
				break;
		
		}
		
	
		}
	}



