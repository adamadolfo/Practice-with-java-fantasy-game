package JavaGamePractice;

public class Effect {
	
	//battle effects
	
	public static void pouringSwords(Unit unit) {
		double newAtk = unit.getAtk() * 2;
		System.out.println("Pouring Swords is activated! \n"
				+ "Storm of swords make of water and lightning rain down boosting boosting attack. \n"
				+ unit.getName() + "'s Attack " + unit.getAtk() + " -> " + newAtk + "!");
		unit.setAtk(newAtk);
	}
	
	
	public static void shroud(Unit unit) {
		double multiplier = 1.10;
		double newAtk = unit.getAtk() * multiplier;
		double newDef = unit.getDef() * multiplier;
		double newSpeed = unit.getSpeed() * multiplier;
		double newStrat = unit.getStrat() * multiplier;
		
		System.out.println("Shroud is activated! \n"
				+ "A thick fog covers the battlefield. " + unit.getName() + "'s senses in the fog sharpen and increase all stats! \n"
				+ unit.getName() + "'s Attack " + unit.getAtk() + " -> " + newAtk + "! \n"
				+ unit.getName() + "'s Defense " + unit.getDef() + " -> " + newDef + "! \n" 
				+ unit.getName() + "'s Speed " + unit.getSpeed() + " -> " + newSpeed + "! \n"
				+ unit.getName() + "'s Strategy" + unit.getStrat() + " -> " + newStrat + "!");
		
		unit.setAtk(newAtk);
		unit.setDef(newDef);
		unit.setSpeed(newSpeed);
		unit.setStrat(newStrat);
	}
	
	// support effects
	
	public static void helpingHilt(Unit unit) {
		System.out.println("Helping Hilt activates! \n"
				+ "Another Chance to gain a blessing!");
				unit.triggerBlessing();
	}
	
	public static void ancientPreparations(Unit unit) {
		System.out.println("Ancient Preparations activates! " +  unit.getName() + "has been given the advice of dragons of past.\n"
				+ "Boost defense and strategy! "
				+ "If supporting a dragon gain a boost to all stats!");
		double multiplier = 1.10;
		if (unit.type == "Dragon") {
			double newAtk = unit.getAtk() * multiplier;
			double newDef = unit.getDef() * multiplier;
			double newSpeed = unit.getSpeed() * multiplier;
			double newStrat = unit.getStrat() * multiplier;
			
			System.out.println( unit.getName() + "'s Attack " + unit.getAtk() + " -> " + newAtk + "! \n"
					+ unit.getName() + "'s Defense " + unit.getDef() + " -> " + newDef + "! \n" 
					+ unit.getName() + "'s Speed " + unit.getSpeed() + " -> " + newSpeed + "! \n"
					+ unit.getName() + "'s Strategy" + unit.getStrat() + " -> " + newStrat + "!");
			
			unit.setAtk(newAtk);
			unit.setDef(newDef);
			unit.setSpeed(newSpeed);
			unit.setStrat(newStrat);
			
		} else {
			double newDef = unit.getDef() * multiplier;
			double newStrat = unit.getStrat() * multiplier;
			
			System.out.println( unit.getName() + "'s Defense " + unit.getDef() + " -> " + newDef + "! \n" 
					+ unit.getName() + "'s Strategy" + unit.getStrat() + " -> " + newStrat + "!");
			
			unit.setDef(newDef);
			unit.setStrat(newStrat);
		}
				
	}
	
	public static void mistDissapearance(Unit supportUnit1, Unit supportUnit2, Unit supportUnit3) {
		System.out.println("Mist Dissapearance is Activated! \n"
				+ "A thick haze forms around the opponents lowering the chance of units triggering their support effects.");
		double chance1 = Math.random() * 100;
		double chance2 = Math.random() * 100;
		double chance3 = Math.random() * 100;
		
		if (chance1 < 50) {
			supportUnit1.setSupportEffect("Negated");
			System.out.println(supportUnit1.getName() + "could not support due to the mist!");
		}
		
		if (chance2 < 50) {
			supportUnit2.setSupportEffect("Negated");
			System.out.println(supportUnit2.getName() + "could not support due to the mist!");
		}
		
		if (chance3 < 50) {
			supportUnit3.setSupportEffect("Negated");
			System.out.println(supportUnit3.getName() + "could not support due to mist!");
		}
		
	}
	
	public static void foolproof() {
		
	}

}
