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
		this.type = "Mage";
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
			this.def = this.def * 1.25;
			this.strat = this.strat * 1.5;
		}
			return super.triggerAbillity();
	}


}
