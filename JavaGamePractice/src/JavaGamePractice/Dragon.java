package JavaGamePractice;

public class Dragon extends Unit implements IEffect{
	private String name;
	private double rarity;
	private double atk;
	private double def;
	private double speed;
	private double strat;
	public String type;
	public String battleEffect;
	public String supportEffect;
	
	public Dragon(String type, String name, double rarity, double atk, double def, double speed, double strat, String battleEffect, String supportEffect) {
		super(type, name, rarity, atk, def, speed, strat, battleEffect, supportEffect);

	}
	
	
	@Override
	public boolean triggerBlessing() {
		if (super.triggerBlessing()) {
			System.out.println(getName() + " recieves the Blessing of Dragon!");
			System.out.println(getName() + " Attack: " + getAtk() + " -> " + getAtk() * 1.25);
			setAtk(getAtk() * 1.25);
			System.out.println(getName() + " Defense: " + getDef() + " -> " + getDef() * 1.25);
			setSpeed(getDef() * 1.25);
			System.out.println(getName() + " Speed: " + getSpeed() + " -> " + getSpeed() * 1.25);
			setSpeed(getSpeed() * 1.25);
		}
		
		return super.triggerBlessing();
	
	}


	@Override
	public void battleEffect() {
		// TODO Auto-generated method stub
		super.battleEffect();
	}


	@Override
	public void supportEffect(Unit unit) {
		// TODO Auto-generated method stub
		super.supportEffect(unit);
	}
	
	


}
