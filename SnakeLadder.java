import java.util.Scanner;

public class SnakeLadder {
public static void main(String[] args) {
System.out.println("Welcome to Snake Ladder Simulator");
int position1=0;
int dice1=0;
int player=0;
int choice;
int result=0;
int WIN_POSITION=100;
int START_POSITION=0;
int playerposition1=0;
int counter=0;
while(position1!=100)
{		
	dice1=(int)((Math.random()*6)+1);
	counter++;
	System.out.println("Dice Number :"+dice1);
	choice=(int)(Math.random()*3+1);
		switch(choice)
		{
			case 1: 	position1=position1;
						System.out.println("No play : " +position1);
						
				   	break;
				   	
			case 2: if((position1+dice1)<=WIN_POSITION )
					{
						position1=position1+dice1;
						System.out.println("Ladder current  position1 : " +position1);
					break;
					}
			case 3:
					if((position1-dice1)< START_POSITION )
					{
						position1=START_POSITION;
					
						System.out.println("If Snake is negative :" +position1);
					}
					else
					{
						position1=position1-dice1;
						System.out.println("If Snake comes on current postion :" +position1);
					}
					break;
					
			}
			System.out.println("position1 of Player1 :"+position1);	
	}
System.out.println("counter is:"+counter);
playerposition1=playerposition1 +position1;
System.out.println("*****************************************************");
		if((playerposition1 == 100))
		{
			System.out.println(" WINNER is Player1");
		}

	}

}



