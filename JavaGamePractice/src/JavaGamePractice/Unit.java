/**
 * 
 */
package JavaGamePractice;

/**
 * @author Adam
 *prototype tp a small game I want to build while practicing java class syntax
 */
public class Unit {
	private String name;
	private double rarity;
	private double atk;
	private double def;
	private double speed;
	private double strat;

	public Unit(String name, double rarity, double atk, double def, double speed, double strat) {
		this.name = name;
		this.rarity = rarity;
		this.atk = atk;
		this.def = def;
		this.speed = speed;
		this.strat = strat;
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
	
	
	public boolean triggerAbillity() {
		double trigger = Math.random() * 100;
		double percentage = (rarity * 10);
		if (trigger < percentage) {
			return true;
		}
		return false;
		
	}
}

