import java.util.Scanner;

public class SnakeLadder {
public static void main(String[] args) {
System.out.println("Welcome to Snake Ladder Simulator");
int position1=0;
int position2=0;
int dice1=0;
int dice2=0;
int player=0;
int choice;
int result=0;
int WIN_POSITION=100;
int START_POSITION=0;
int playerposition1=0;
int playerposition2=0;
int counter=0;
while(position1!=100 && position2!=100)
{		
	dice1=(int)((Math.random()*6)+1);
	dice2=(int)((Math.random()*6)+1);
	counter++;
	System.out.println(dice1);
	System.out.println(dice2);
	choice=(int)(Math.random()*3+1);
		switch(choice)
		{
			case 1: 	position1=position1;
						position2=position2;
						System.out.println("No play : " +position1);
						System.out.println("No play : " +position2);
				   	break;
				   	
			case 2: if((position1+dice1)<=WIN_POSITION &&(position2+dice2)<=WIN_POSITION)
					{
						position1=position1+dice1;
						position2=position2+dice2;
						System.out.println("Ladder current  position1 : " +position1+" position2: "+position2);
					break;
					}
			case 3:
					if((position1-dice1)< START_POSITION && (position2-dice2)< START_POSITION)
					{
						position1=START_POSITION;
						position2=START_POSITION;
						System.out.println("If Snake is negative :" +position1+" "+position2);
					}
					else
					{
						position1=position1-dice1;
						position2=position2-dice2;
						System.out.println("If Snake comes on current postion :" +position1+" "+position2);
					}
					break;
					
			}
			System.out.println("position1 of Player1 :"+position1);	
			System.out.println("position2 of Player2 :"+position2);
	}
System.out.println("counter:"+counter);
playerposition1=playerposition1 +position1;
playerposition2=playerposition2 +position2;
System.out.println("*****************************************************");
		if((playerposition1 == 100))
		{
			System.out.println(" WINNER is Player1");	
		}
		else
		{
			System.out.println(" WINNER is Player2 ");
		}

	}

}
