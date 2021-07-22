package JavaGamePractice;

public class Mage extends Unit {
	private String name;
	private double rarity;
	private double atk;
	private double def;
	private double speed;
	private double strat;
	public String type;
	
	public Mage(String name, double rarity, double atk, double def, double speed, double strat) {
		super(name, rarity, atk, def, speed, strat);
	}


	@Override
	public boolean triggerAbillity() {
		if (super.triggerAbillity()) {
			System.out.println(getName() + " is triggering its abillity!");
			
			System.out.println(getName() + " Defense: " + getDef() + " -> " + getDef() * 1.33);
			setDef(getDef() * 1.33);
			System.out.println(getName() + " Strategy: " + getStrat() + " -> " + getStrat() * 1.33);
			setStrat(getAtk() * 1.33);
		}
		
		return super.triggerAbillity();
	}


}
