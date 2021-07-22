package JavaGamePractice;

import java.util.Scanner;

public class Main {


	public static void main(String[] args) {
		Swordsman mySwordsman = new Swordsman("swordsman", 5, 100, 80, 95, 70);
		Dragon myDragon = new Dragon("dragon", 5, 95, 85, 90, 80);
		
		Battle firstBattle = new Battle(mySwordsman, myDragon);
		firstBattle.beginBattle();
	}

	


}
