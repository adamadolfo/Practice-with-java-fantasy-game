/**
 * 
 */
package JavaGamePractice;

/**
 * @author Adam
 *prototype tp a small game I want to build while practicing java class syntax
 */
public class Unit implements IEffect {
	private String name;
	private double rarity;
	private double atk;
	private double def;
	private double speed;
	private double strat;
	public String battleEffect;
	public String supportEffect;
	public String type;

	public Unit(String type, String name, double rarity, double atk, double def, double speed, double strat, String battleEffect, String supportEffect) {
		this.name = name;
		this.rarity = rarity;
		this.atk = atk;
		this.def = def;
		this.speed = speed;
		this.strat = strat;
		this.battleEffect = battleEffect;
		this.supportEffect = supportEffect;
		this.type = type;
	}

	
	public String getName() {
		return name;
	}
	
	
	public double getRarity() {
		return rarity;
	}
	
	
	public double getAtk() {
		return atk;
	}
	
	
	public double getDef() {
		return def;
	}
	
	
	public double getSpeed() {
		return speed;
	}
	
	
	public double getStrat() {
		return strat;
	}
	
	public void setDef(double def) {
		this.def = def;
	}
	
	
	public void setSpeed(double speed) {
		this.speed = speed;
	}
	
	
	public void setStrat(double strat) {
		this.strat = strat;
	}
	public void setAtk(double atk) {
		this.atk = atk;
	}
	
	
	public boolean triggerBlessing() {
		double trigger = Math.random() * 100;
		double percentage = (rarity * 10);
		if (trigger < percentage) {
			return true;
		}
		return false;
		
	}


	public void setBattleEffect(String battleEffect) {
		this.battleEffect = battleEffect;
	}


	public void setSupportEffect(String supportEffect) {
		this.supportEffect = supportEffect;
	}


	public String getBattleEffect() {
		return battleEffect;
	}


	public String getSupportEffect() {
		return supportEffect;
	}


	@Override
	public void battleEffect() {
		// TODO Auto-generated method stub
		switch (this.battleEffect) {
			case "Downpour Swords": Effect.pouringSwords(this);
			break;
			case "Shroud": Effect.shroud(this); 
		}
	}


	@Override
	public void supportEffect(Unit unit) {
		// TODO Auto-generated method stub
		switch (this.supportEffect) {
		case "Helping Hilt": Effect.helpingHilt(unit);
		break;
		case "Ancient Preparations": Effect.ancientPreparations(unit); 
		}
		
	}


	@Override
	public String toString() {
		return "Unit [name=" + name + ", rarity=" + rarity + ", atk=" + atk + ", def=" + def + ", speed=" + speed
				+ ", strat=" + strat + ", type=" + type + "]";
	}
	
	



}

