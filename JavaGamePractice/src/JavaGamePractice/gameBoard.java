package JavaGamePractice;

public class gameBoard {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Unit swordSaint = new Unit();
		
		swordSaint.setName("Sword Saint");
		swordSaint.setType("Swordsman");
		swordSaint.setRarity(5);
		swordSaint.setAtk(100);
		swordSaint.setDef(80);
		swordSaint.setSpeed(95);
		swordSaint.setStrat(75);
		
		Unit boboTheDragon = new Unit();
		boboTheDragon.setName("Bobo");
		boboTheDragon.setType("Dragon");
		boboTheDragon.setRarity(5);
		boboTheDragon.setAtk(90);
		boboTheDragon.setDef(95);
		boboTheDragon.setSpeed(80);
		boboTheDragon.setStrat(85);
		
		
		swordSaint.triggerAbillity();
		boboTheDragon.triggerAbillity();
		
		int player1Wins = 0;
	    int player2Wins = 0;
		
		while (true) {
			if (player1Wins == 3) {
				System.out.println("The winner is The Sword Saint!");
				break;
			}
			
			if (player2Wins == 3) {
				System.out.println("The winner is Bobo The Dragon!");
				break;
			}
			String results = winCondition();
			
			if (results == "Attack") {
				double player1 = swordSaint.getAtk();
				double player2 = boboTheDragon.getAtk();
				System.out.println("Attack Battle");
				
				if (player1 > player2) {
					player1Wins += 1;
					System.out.println("The Sword Saint with " + player1 + " beat Bobo The Dragon with " + player2 + ".");
				} else {
					player2Wins += 1;
					System.out.println("Bobo The Dragon with " + player2 + " beat The Sword Saint with " + player1 + ".");
				}
			}
			
			if (results == "Defense") {
				double player1 = swordSaint.getDef();
				double player2 = boboTheDragon.getDef();
				System.out.println("Defense Battle");
				
				if (player1 > player2) {
					System.out.println("The Sword Saint with " + player1 + " beat Bobo The Dragon with " + player2 + ".");
					player1Wins += 1;
				} else {
					System.out.println("Bobo The Dragon with " + player2 + " beat The Sword Saint with " + player1 + ".");
					player2Wins += 1;
				}
			}
			
			if (results == "Speed") {
				double player1 = swordSaint.getSpeed();
				double player2 = boboTheDragon.getSpeed();
				System.out.println("Speed Battle");
				
				if (player1 > player2) {
					System.out.println("The Sword Saint with " + player1 + " beat Bobo The Dragon with " + player2 + ".");
					player1Wins += 1;
				} else {
					System.out.println("Bobo The Dragon with " + player2 + " beat The Sword Saint with " + player1 + ".");
					player2Wins += 1;
				}
			}
			
			if (results == "Strategy") {
				double player1 = swordSaint.getStrat();
				double player2 = boboTheDragon.getStrat();
				System.out.println("Strategy Battle");
				
				if (player1 > player2) {
					System.out.println("The Sword Saint with " + player1 + " beat Bobo The Dragon with " + player2 + ".");
					player1Wins += 1;
				} else {
					System.out.println("Bobo The Dragon with " + player2 + " beat The Sword Saint with " + player1 + ".");
					player2Wins += 1;
				}
			}
			
		}
		
			
		}
	
	  public static String winCondition() {
		  int trigger = (int) (Math.random() * 100) ;
		  if (trigger < 25) {
			  return "Attack";
		  }
		  
		  if (trigger > 24 && trigger < 50) {
			  return "Defense";
		  }
		  
		  if (trigger > 51 && trigger < 75) {
			  return "Speed";
		  }
		  
		  if (trigger > 74) {
			  return "Strategy";
		  }
		  
		  return "Error";
	}
	  
	

}
