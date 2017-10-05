package example22;
import java.util.Scanner;

/*   
    Author: Chan In Kou
    Purpose: The Display show a program that simulates picking a card from a deck of 52 cards.
*/
public class Example22 
{ 
    public static void main(String[] args) 
	{
		//Create a Scanner
		Scanner in = new Scanner(System.in);
		
	    //Declare variables
		String rankNumber, suitKind;
		suitKind = "";
		rankNumber = "";
        
		//generate a random card
	    int randomInt = 1 + (int)(Math.random() * ((13-1) + 1));
		int suit = 1 + (int)(Math.random() * ((4-1) + 1));
		
		//Your program should display the suit Clubs, Diamonds, Hearts, Spades
		switch(suit)
		{
			case 1:
			 suitKind = "Clubs";
			 break;
			case 2:
			 suitKind = "Diamonds"; 
			 break;
			case 3:
			 suitKind = "Hearts";
			case 4:
			 suitKind = "Spades";
			 break;
		}
        
		//Your program should display the rank Ace, 2, 3, 4, 5, 6, 7, 8, 9, 10, Jack, Queen, King
		switch(randomInt)
		{
			case 1:
			 rankNumber = "Ace";
			 break;
			case 2:
			 rankNumber = "2"; 
			 break;
			case 3:
			 rankNumber = "3";
			case 4:
			 rankNumber = "4";
			 break;
			case 5:
			 rankNumber = "5"; 
			 break;
			case 6:
			 rankNumber = "6";
			case 7:
			 rankNumber = "7";
			 break;
			case 8:
			 rankNumber = "8"; 
			 break;
			case 9:
			 rankNumber = "9";
			case 10:
			 rankNumber = "10";
			 break;
			case 11:
			 rankNumber = "Jack"; 
			 break;
			case 12:
			 rankNumber = "Queen";
			case 13:
			 rankNumber = "King";
			 break;
		}
		
		//Display the random results
		System.out.println("The card you picked is " + rankNumber + " of " + suitKind);	
	} 
}