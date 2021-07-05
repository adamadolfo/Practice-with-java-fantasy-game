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
			System.out.println(getName() + " Attack: " + this.atk + " -> " + this.atk * 1.25);
			this.atk = this.atk * 1.25;
			System.out.println(getName() + " Defense: " + this.def + " -> " + this.def * 1.25);
			this.def = this.def * 1.25;
			System.out.println(getName() + " Speed: " + this.strat + " -> " + this.strat * 1.25);
			this.strat = this.strat * 1.25;
		}
			return super.triggerAbillity();
	}


}
