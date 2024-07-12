//Your Mission is to find the treasure.
import java.util.*;
public class Game {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("*******************************************************************************\r\n"
				+ "          |                   |                  |                     |\r\n"
				+ " _________|________________.=\"\"_;=.______________|_____________________|_______\r\n"
				+ "|                   |  ,-\"_,=\"\"     `\"=.|                  |\r\n"
				+ "|___________________|__\"=._o`\"-._        `\"=.______________|___________________\r\n"
				+ "          |                `\"=._o`\"=._      _`\"=._                     |\r\n"
				+ " _________|_____________________:=._o \"=._.\"_.-=\"'\"=.__________________|_______\r\n"
				+ "|                   |    __.--\" , ; `\"=._o.\" ,-\"\"\"-._ \".   |\r\n"
				+ "|___________________|_._\"  ,. .` ` `` ,  `\"-._\"-._   \". '__|___________________\r\n"
				+ "          |           |o`\"=._` , \"` `; .\". ,  \"-._\"-._; ;              |\r\n"
				+ " _________|___________| ;`-.o`\"=._; .\" ` '`.\"\\` . \"-._ /_______________|_______\r\n"
				+ "|                   | |o;    `\"-.o`\"=._``  '` \" ,__.--o;   |\r\n"
				+ "|___________________|_| ;     (#) `-.o `\"=.`_.--\"_o.-; ;___|___________________\r\n"
				+ "____/______/______/___|o;._    \"      `\".o|o_.--\"    ;o;____/______/______/____\r\n"
				+ "/______/______/______/_\"=._o--._        ; | ;        ; ;/______/______/______/_\r\n"
				+ "____/______/______/______/__\"=._o--._   ;o|o;     _._;o;____/______/______/____\r\n"
				+ "/______/______/______/______/____\"=._o._; | ;_.--\"o.--\"_/______/______/______/_\r\n"
				+ "____/______/______/______/______/_____\"=.o|o_.--\"\"___/______/______/______/____\r\n"
				+ "/______/______/______/______/______/______/______/______/______/______/[TomekK]\r\n"
				+ "******************************************************************************");
		System.out.println("Welcome to treasure Island. \nYour Mission is to find the treasure.");
		System.out.println("Where you want to go? left or right ?");
		String a = sc.nextLine();
		if (a.equals("right")) {
			System.out.println("Fall into a hole. ---Game Over");
		} else {
			System.out.println(
					"Ok Then there is a river on your way so would you like to go 'swim' or 'wait' for a boat? : ");
			String b = sc.nextLine();
			if (b.equals("swim")) {
				System.out.println("Attack by trout.-------Game Over");
			} else {
				System.out.println("\"Which door You want to choose? blue or red or yellow : \"");
				String c = sc.nextLine();
				if (c.equals("blue")) {
					System.out.println("Eaten by beasts.-----Game Over");
				} else if (c.equals("red")) {
					System.out.println("Burned by fire.-----Game Over");
				} else if (c.equals("yellow")) {
					System.out.println("Congratulation--\n You find the Treasure -----");
				} else {
					System.out.println("Game Over------------\n Try Next Time--------");
				}
			}
		}
	}
}

