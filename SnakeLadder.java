import java.util.Scanner;

public class SnakeLadder {

	public static void main(String[] args) {
System.out.println("Welcome to Snake Ladder Simulator");
int position=0;
int dice=0;
int player=0;
int choice;
int result=0;
int WIN_POSITION=100;
int START_POSITION=0;
int playerposition=0;
for(int count=0;count<10000;count++)
{		dice=(int)((Math.random()*6)+1);
		System.out.println(dice);
		choice=(int)(Math.random()*3+1);
		switch(choice)
		{
		case 1: position=position;
			   	System.out.println("No play : "  +position);
			   	break;
		case 2: if((position+dice)<=WIN_POSITION)
				{
				position=position+dice;
				System.out.println("Ladder current position : " +position);
				}
				break;
		case 3:
				if((position-dice)< START_POSITION)
				{
				position=START_POSITION;
				System.out.println("If Snake is negative :" +position);
				}
				else
				{
				position=position-dice;
				System.out.println("If Snake comes on current postion :" +position);
				}
				break;
		}
		System.out.println("position :"+position);
		
}
		playerposition=playerposition +position;
		System.out.println("*****************************************************");
		if(playerposition == WIN_POSITION )
		{
			System.out.println("winner of SnakeLadder :"+playerposition);
		}
	}
}



