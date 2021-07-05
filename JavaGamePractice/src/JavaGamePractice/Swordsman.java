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
		this.type = "Swordsman";
		this.name = name;
		this.atk = atk;
		this.def = def;
		this.speed = speed;
		this.strat = strat;
	}
	
	
	@Override
	public boolean triggerAbillity() {
		if (super.triggerAbillity()) {
			System.out.println(this.name + " is triggering its abillity!");
			
			System.out.println(this.name + " Attack: " + this.atk + " -> " + this.atk * 1.33);
			this.atk = this.atk * 1.33;
			System.out.println(this.name + " Speed: " + this.speed + " -> " + this.speed * 1.33);
			this.speed = this.speed * 1.33;
		}
			return super.triggerAbillity();
		}
}


	
 

