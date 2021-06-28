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
	private String type;
	private double rarity;
	private double atk;
	private double def;
	private double speed;
	private double strat;

	public Unit(String name, String type, double rarity, double atk, double def, double speed, double strat) {
		this.name = name;
		this.type = type;
		this.rarity = rarity;
		this.atk = atk;
		this.def = def;
		this.speed = speed;
		this.strat = strat;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setType(String type) {
		this.type = type;
	}
	
	public String getType() {
		return type;
	}
	
	public void setRarity(double rarity) {
		this.rarity = rarity;
	}
	
	public double getRarity() {
		return rarity;
	}
	
	public void setAtk(double atk) {
		this.atk = atk;
	}
	
	public double getAtk() {
		return atk;
	}
	
	public void setDef(double def) {
		this.def = def;
	}
	
	public double getDef() {
		return def;
	}
	
	public void setSpeed(double speed) {
		this.speed = speed;
	}
	
	public double getSpeed() {
		return speed;
	}
	
	public void setStrat(double strat) {
		this.strat = strat;
	}
	
	public double getStrat() {
		return strat;
	}
	
//	public double baseStatMultiplier (double stat) {
//		return stat * 1.5;
//	}
	
	public boolean triggerAbillity() {
		double trigger = Math.random() * 100;
		double percentage = (rarity * 10);
		if (trigger < percentage) {
			System.out.println(this.name + " is triggering its abillity!");
			if (type == "Swordsman") {
				System.out.println(this.name + " Attack: " + this.atk + " -> " + this.atk * 1.33);
				this.atk = this.atk * 1.33;
				System.out.println(this.name + " Speed: " + this.speed + " -> " + this.speed * 1.33);
				this.speed = this.speed * 1.33;
			}
			if (type == "Dragon") {
				System.out.println(this.name + " Attack: " + this.atk + " -> " + this.atk * 1.25);
				this.atk = this.atk * 1.25;
				System.out.println(this.name + " Defense: " + this.def + " -> " + this.def * 1.25);
				this.def = this.def * 1.25;
				System.out.println(this.name + " Speed: " + this.strat + " -> " + this.strat * 1.25);
				this.strat = this.strat * 1.25;
			}
			if (type == "Mage") {
				this.def = this.def * 1.25;
				this.strat = this.strat * 1.5;
			}
			 return true;
		}
		
		return false;
		
	}
	
	
}
