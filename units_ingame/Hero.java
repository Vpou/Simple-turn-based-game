package units_ingame;

public class Hero extends Unit{

	private int currentExp;
	
	public Hero() {
	
		super();
		currentExp = 0;
	}
	
	public Hero(String n, int hp, int atk, int def, int speed, int mp, int magic, int res){
		super(n, hp, atk, def, speed, mp, magic, res);
		
		currentExp = 0;
		
	}
	
	public void setEXP(int a){
		currentExp = a;
	}
	public int getEXP(){
		return currentExp;
	}
	
	@Override
	public void modifier() {
		
		
	}

	
	/*
	 * level up --> base stats +1
	 * 				you can put 3 points anywhere (not more than 1 per level)
	 */
	
}
