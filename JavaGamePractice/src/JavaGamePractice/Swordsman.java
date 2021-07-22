package JavaGamePractice;

public class Swordsman extends Unit {
	private String name;
	private double rarity;
	private double atk;
	private double def;
	private double speed;
	private double strat;
	public String type;
	
	public Swordsman(String name, double rarity, double atk, double def, double speed, double strat) {
		super(name, rarity, atk, def, speed, strat);
	}
	
	


	@Override
	public boolean triggerAbillity() {
		if (super.triggerAbillity()) {
			System.out.println(getName() + " is triggering its abillity!");
			
			System.out.println(getName() + " Attack: " + getAtk() + " -> " + getAtk() * 1.33);
			setAtk(getAtk() * 1.33);
			System.out.println(getName() + " Speed: " + getSpeed() + " -> " + getSpeed() * 1.33);
			setSpeed(getSpeed() * 1.33);
		}
		
		return super.triggerAbillity();
	}
}


	
 

