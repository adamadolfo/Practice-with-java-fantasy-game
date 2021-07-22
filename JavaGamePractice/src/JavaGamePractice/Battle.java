package JavaGamePractice;

import java.util.ArrayList;
import java.util.Random;

public class Battle {
	private Unit player1;
	private Unit player2;
	
	private int player1Wins;
	private int player2Wins;
	private int numberOfBattles;
	private ArrayList<String> outcomes;
	
	public Battle(Unit player1, Unit player2) {
		this.player1 = player1;
		this.player2 = player2;
		this.player1Wins = 0;
		this.player2Wins = 0;
		this.numberOfBattles = 0;
		outcomes = new ArrayList<String>();
		outcomes.add("Attack Battle");
		outcomes.add("Defense Battle");
		outcomes.add("Speed Battle");
		outcomes.add("Strategy Battle");
		outcomes.add("Attack + Defense Battle");
		outcomes.add("Attack + Speed Battle");
		outcomes.add("Attack + Strategy Battle");
		outcomes.add("Defense + Speed Battle");
		outcomes.add("Defense + Strategy Battle");
		outcomes.add("Speed + Strategy Battle");
		outcomes.add("Total Showdown");
	}

	
	private void winTrackHelper(double stat1, double stat2) {
		if (stat1 > stat2) {
			player1Wins += 1;
			System.err.println(player1.getName() + " with " + stat1 + " beat " + player2.getName() + " with " + stat2 + ".");
		} else {
			player2Wins += 1;
			System.err.println(player2.getName() + " with " + stat2 + " beat " + player1.getName() + " with " + stat1 + ".");
			}
	}
	
	private String selectBattleTypeHelper() {
	
	        Random rand = new Random();
	        String battle = outcomes.get(rand.nextInt(outcomes.size()));
	        outcomes.remove(battle);
	        return battle;
	    
	}
	
	
	
	public void beginBattle() {
		
		System.out.println("Battle beginning!");
		player1.triggerAbillity();
		player2.triggerAbillity();
		
		while (true) {
			
			if (player1Wins == 3) {
				System.out.println("*********************************************");
				System.out.println("The winner is " + player1.getName() + " !");
				break;
			}
			
			if (player2Wins == 3) {
				System.out.println("*********************************************");
				System.out.println("The winner is " + player2.getName()+ "!");
				break;
			}
			
			numberOfBattles++;
			System.out.println("*********************************************");
			System.out.println("Battle number " + numberOfBattles);
			String battle = selectBattleTypeHelper();
			

				
			if (battle == "Attack Battle") {
				double stat1 = player1.getAtk();
				double stat2 = player2.getAtk();
				System.out.println("Attack Battle");
				winTrackHelper(stat1, stat2);
			}
			
			if (battle == "Defense Battle") {
				double stat1 = player1.getDef();
				double stat2 = player2.getDef();
				System.out.println("Defense Battle");
				winTrackHelper(stat1, stat2);
			}
			
			if (battle == "Speed Battle") {
				double stat1 = player1.getSpeed();
				double stat2 = player2.getSpeed();
				System.out.println("Speed Battle");
				winTrackHelper(stat1, stat2);
			}
			
			if (battle == "Strategy Battle") {
				double stat1 = player1.getStrat();
				double stat2 = player2.getStrat();
				System.out.println("Strategy Battle");
				winTrackHelper(stat1, stat2);
			}
			
			if (battle == "Attack + Defense Battle") {
				double stat1 = player1.getAtk() + player1.getDef();
				double stat2 = player2.getAtk() + player2.getDef();
				System.out.println("Attack + Defense Battle");
				winTrackHelper(stat1, stat2);
			}
			
			if (battle == "Attack + Speed Battle") {
				double stat1 = player1.getAtk() + player1.getSpeed();
				double stat2 = player2.getAtk() + player2.getSpeed();
				System.out.println("Attack + Speed Battle");
				winTrackHelper(stat1, stat2);
			}
			
			if (battle == "Attack + Strategy Battle") {
				double stat1 = player1.getAtk() + player1.getStrat();
				double stat2 = player2.getAtk() + player2.getStrat();
				System.out.println("Attack + Strategy Battle");
				winTrackHelper(stat1, stat2);
			}
			
			if (battle == "Defense + Speed Battle") {
				double stat1 = player1.getDef() + player1.getSpeed();
				double stat2 = player2.getDef() + player2.getSpeed();
				System.out.println("Defense + Speed Battle");
				winTrackHelper(stat1, stat2);
			}
			
			if (battle == "Defense + Strategy Battle") {
				double stat1 = player1.getDef() + player1.getStrat();
				double stat2 = player2.getDef() + player2.getStrat();
				System.out.println("Defense + Strategy Battle");
				winTrackHelper(stat1, stat2);
			}
			
			if (battle == "Speed + Strategy Battle") {
				double stat1 = player1.getSpeed() + player1.getStrat();
				double stat2 = player2.getSpeed() + player2.getStrat();
				System.out.println("Speed + Strategy Battle");
				winTrackHelper(stat1, stat2);
			}
			
			if (battle == "Total Showdown") {
				double stat1 = player1.getAtk() + player1.getDef() + player1.getSpeed() + player1.getStrat();
				double stat2 = player2.getAtk() + player2.getDef() + player2.getSpeed() + player2.getStrat();
				System.out.println("Total Showdown");
				winTrackHelper(stat1, stat2);
			}
			
			
		}
	}
			
}