package JavaGamePractice;

public class Swordsman extends Unit implements IEffect {
	private String name;
	private double rarity;
	private double atk;
	private double def;
	private double speed;
	private double strat;
	public String type;
	public String battleEffect;
	public String supportEffect;
	
	public Swordsman(String type, String name, double rarity, double atk, double def, double speed, double strat, String battleEffect, String supportEffect) {
		super(type, name, rarity, atk, def, speed, strat, battleEffect, supportEffect);
	}
	
	


	@Override
	public boolean triggerBlessing() {
		if (super.triggerBlessing()) {
			System.out.println(getName() + " recieves the Swordsman Blessing!");
			
			System.out.println(getName() + " Attack: " + getAtk() + " -> " + getAtk() * 1.33);
			setAtk(getAtk() * 1.33);
			System.out.println(getName() + " Speed: " + getSpeed() + " -> " + getSpeed() * 1.33);
			setSpeed(getSpeed() * 1.33);
		}
		
		return super.triggerBlessing();
	}




	@Override
	public void battleEffect() {
		super.battleEffect();
	}




	@Override
	public void supportEffect(Unit unit) {
		// TODO Auto-generated method stub
		
	}
	

}


	
 

