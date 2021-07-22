package JavaGamePractice;

public class Dragon extends Unit {
	private String name;
	private double rarity;
	private double atk;
	private double def;
	private double speed;
	private double strat;
	public String type;
	
	public Dragon(String name, double rarity, double atk, double def, double speed, double strat) {
		super(name, rarity, atk, def, speed, strat);
		this.type = "Dragon";
		this.name = name;
		this.atk = atk;
		this.def = def;
		this.speed = speed;
		this.strat = strat;
	}
	
	
	@Override
	public boolean triggerAbillity() {
		if (super.triggerAbillity()) {
			System.out.println(getName() + " is triggering its abillity!");
			
			System.out.println(getName() + " Attack: " + getAtk() + " -> " + getAtk() * 1.25);
			setAtk(getAtk() * 1.25);
			System.out.println(getName() + " Defense: " + getDef() + " -> " + getDef() * 1.25);
			setSpeed(getDef() * 1.25);
			System.out.println(getName() + " Speed: " + getSpeed() + " -> " + getSpeed() * 1.25);
			setSpeed(getSpeed() * 1.25);
		}
		
		return super.triggerAbillity();
	
	}


}
