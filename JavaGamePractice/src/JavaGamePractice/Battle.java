package JavaGamePractice;

public class Battle {
	private Unit player1;
	private Unit player2;
	
	private int player1Wins;
	private int player2Wins;
	
	public Battle(Unit player1, Unit player2) {
		this.player1 = player1;
		this.player2 = player2;
		this.player1Wins = 0;
		this.player2Wins = 0;
	}

	
	public void winTrackHelper(double stat1, double stat2) {
		if (stat1 > stat2) {
			player1Wins += 1;
			System.err.println(player1.getName() + " with " + stat1 + " beat " + player2.getName() + " with " + stat2 + ".");
		} else {
			player2Wins += 1;
			System.err.println(player2.getName() + " with " + stat2 + " beat " + player1.getName() + " with " + stat1 + ".");
		}
	}
	
	
	
	public void beginBattle() {
		
		
		while (true) {
			
			double trigger = Math.random() * 100;
			
			if (player1Wins == 3) {
				System.out.println("The winner is " + player1.getName() + " !");
				break;
			}
			
			if (player2Wins == 3) {
				System.out.println("The winner is " + player2.getName()+ "!");
				break;
			}
			
			player1.triggerAbillity();
			player2.triggerAbillity();
			
				
			if (trigger < 10) {
				double stat1 = player1.getAtk();
				double stat2 = player2.getAtk();
				System.out.println("Attack Battle");
				winTrackHelper(stat1, stat2);
			}
			
			if (trigger > 9 && trigger < 20) {
				double stat1 = player1.getDef();
				double stat2 = player2.getDef();
				System.out.println("Defense Battle");
				winTrackHelper(stat1, stat2);
			}
			
			if (trigger > 19 && trigger < 30) {
				double stat1 = player1.getSpeed();
				double stat2 = player2.getSpeed();
				System.out.println("Speed Battle");
				winTrackHelper(stat1, stat2);
			}
			
			if (trigger > 29 && trigger < 40) {
				double stat1 = player1.getStrat();
				double stat2 = player2.getStrat();
				System.out.println("Strategy Battle");
				winTrackHelper(stat1, stat2);
			}
			
			if (trigger > 39 && trigger < 50) {
				double stat1 = player1.getAtk() + player1.getDef();
				double stat2 = player2.getAtk() + player2.getDef();
				System.out.println("Attack + Defense Battle");
				winTrackHelper(stat1, stat2);
			}
			
			if (trigger > 49 && trigger < 60) {
				double stat1 = player1.getAtk() + player1.getSpeed();
				double stat2 = player2.getAtk() + player2.getSpeed();
				System.out.println("Attack + Speed Battle");
				winTrackHelper(stat1, stat2);
			}
			
			if (trigger > 59 && trigger < 70) {
				double stat1 = player1.getAtk() + player1.getStrat();
				double stat2 = player2.getAtk() + player2.getStrat();
				System.out.println("Attack + Strategy Battle");
				winTrackHelper(stat1, stat2);
			}
			
			if (trigger > 69 && trigger < 80) {
				double stat1 = player1.getDef() + player1.getSpeed();
				double stat2 = player2.getDef() + player2.getSpeed();
				System.out.println("Defense + Speed Battle");
				winTrackHelper(stat1, stat2);
			}
			
			if (trigger > 79 && trigger < 90) {
				double stat1 = player1.getDef() + player1.getStrat();
				double stat2 = player2.getDef() + player2.getStrat();
				System.out.println("Defense + Strategy Battle");
				winTrackHelper(stat1, stat2);
			}
			
			if (trigger > 89 && trigger < 100) {
				double stat1 = player1.getSpeed() + player1.getStrat();
				double stat2 = player2.getSpeed() + player2.getStrat();
				System.out.println("Speed + Strategy Battle");
				winTrackHelper(stat1, stat2);
			}
			
			if (trigger == 100) {
				double stat1 = player1.getAtk() + player1.getDef() + player1.getSpeed() + player1.getStrat();
				double stat2 = player2.getAtk() + player2.getDef() + player2.getSpeed() + player2.getStrat();
				System.out.println("Total Showdown");
				winTrackHelper(stat1, stat2);
			}
			
			
		}
	}
			
}