package JavaGamePractice;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {


	public static void main(String[] args) {
		//main units
		
		Swordsman aquatter = new Swordsman("Swordsman", "Aquatter", 5, 100, 80, 95, 70, "Downpour Swords", "default");
		
		Dragon myst = new Dragon("Dragon", "Eternal Myst", 5, 95, 85, 90, 80, "Shroud", "Mist Dissapearance");
		
		//support units
		
		Swordsman lifelineBlader = new Swordsman("Swordsan", "Lifeline Blader", 5, 91, 89, 77, 91, "default", "Helping Hilt");
		
		Dragon detailDragon = new Dragon("Dragon", "Detail Dragon", 5, 89, 85, 89, 95, "default", "Ancient Preparations");
		
		
		
		printInstructions();
		ArrayList<Unit> options = new ArrayList<Unit>();
		options.add(detailDragon);
		options.add(lifelineBlader);
		options.add(aquatter);
		options.add(myst);
		for (int i = 0; i < options.size(); i++) {
			System.out.println(options.get(i).toString());
		}
	
//		
//		Scanner scanner = new Scanner(System.in);
//		
//
//			System.out.println("Choose your battle unit");
//			for (int i = 0; i < options.size(); i++) {
//				System.out.println((i + 1) + ": " + options.get(i).getName());
//			}
//			
//			int response = scanner.nextInt();
//			
//			Unit battleUnit = options.get(response - 1);
//			options.remove(response - 1);
//			
//			System.out.println("Choose your support unit");
//			for (int i = 0; i < options.size(); i++) {
//				System.out.println((i + 1) + ": " + options.get(i).getName());
//			}
//			
//			response = scanner.nextInt();
//			
//			Unit supportUnit = options.get(response - 1);
//			options.remove(response - 1);
//			
//
//			
//			Battle battle = new Battle(battleUnit, supportUnit, options.get(0), options.get(1));
//			battle.beginBattle();

		Battle battle = new Battle(aquatter, lifelineBlader, myst, detailDragon);
		battle.beginBattle();

		
		

		
		
	}

	public static void printInstructions() {
		System.out.println("Time to play!\n "
				+ "you will be given units and you must select one for battling and one for support. \n"
				+ "each unit has an effect for the role you give it \n"
				+ "try to win in a series of comparing 4 different stats /n"
				+ "current available units: " );
	
		
	}
	


}
