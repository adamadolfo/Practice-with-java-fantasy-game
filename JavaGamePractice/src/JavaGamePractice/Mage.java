package JavaGamePractice;

public class Mage extends Unit implements IEffect {
	private String name;
	private double rarity;
	private double atk;
	private double def;
	private double speed;
	private double strat;
	public String type;
	public String battleEffect;
	public String supportEffect;
	
	public Mage(String type, String name, double rarity, double atk, double def, double speed, double strat, String offenseEffect, String supportEffect) {
		super(type, name, rarity, atk, def, speed, strat, offenseEffect, supportEffect);
	}


	@Override
	public boolean triggerBlessing() {
		if (super.triggerBlessing()) {
			System.out.println(getName() + " is triggering its abillity!");
			
			System.out.println(getName() + " Defense: " + getDef() + " -> " + getDef() * 1.33);
			setDef(getDef() * 1.33);
			System.out.println(getName() + " Strategy: " + getStrat() + " -> " + getStrat() * 1.33);
			setStrat(getAtk() * 1.33);
		}
		
		return super.triggerBlessing();
	}


	@Override
	public void battleEffect() {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void supportEffect(Unit unit) {
		// TODO Auto-generated method stub

	}
	
	


}
