package JavaGamePractice;


public class Main {


	public static void main(String[] args) {
		//main units
		
		Swordsman aquatter = new Swordsman("Swordsman", "Aquatter", 5, 100, 80, 95, 70, "Downpour Swords", "default");
		
		Dragon myst = new Dragon("Dragon", "Eternal Myst", 5, 95, 85, 90, 80, "Shroud", "Mist Dissapearance");
		
		//support units
		
		Swordsman lifelineBlader = new Swordsman("Swordsan", "Lifeline Blader", 5, 91, 89, 77, 91, "default", "Helping Hilt");
		
		Dragon detailDragon = new Dragon("Dragon", "Detail Dragon", 5, 89, 85, 89, 95, "default", "Ancient Preparation");
		
		
		Battle battle = new Battle(aquatter, lifelineBlader, myst, detailDragon);
		battle.beginBattle();

		
		
	}

	


}
