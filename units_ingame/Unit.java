package units_ingame;

abstract class Unit {
	
	private String name;
	private int hp, atk, def, speed, mp, magic, res, movement, lvl;
	private int[] stats = new int[7];

	public Unit() {
		name = "";
		
	}
	
	public Unit(String n, int hp, int atk, int def, int speed, int mp, int magic, int res){
		
		this.name = n;
		this.hp = hp;
		this.def = def;
		this.speed = speed;
		this.mp = mp;
		this.magic = magic;
		this.res = res;
	
		movement = 1;
		lvl = 1;
		
		intializeStats();
		
	}
	
	public void setHP(int a){
		hp = a;
	}	
	public void setATK(int a){
		atk = a;
	}	
	public void setDEF(int a){
		def = a;
	}	
	public void setSpeed(int a){
		speed = a;
	}
	public void setMP(int a){
		mp = a;
	}	
	public void setMagic(int a){
		magic = a;
	}	
	public void setRES(int a){
		res = a;
	}	
	public void setMovement(int a){
		movement = a;
	}	
	public void setLVL(int a){
		lvl = a;
	}
	public void setName(String a){
		name = a;
	}
	
	public int getHP() {
		return hp;
	}
	public int getAtk() {
		return atk;
	}
	public int getDEF() {
		return def;
	}
	public int getSpeed() {
		return speed;
	}
	public int getMP() {
		return mp;
	}
	public int getMagic() {
		return magic;
	}
	public int getRES() {
		return res;
	}
	public int getMovement() {
		return movement;
	}
	public int getLVL() {
		return lvl;
	}
	public int[] getStats() {
		return stats;
	}
	public String getname() {
		return name;
	}
	
	
	abstract void modifier();
	
	public void intializeStats(){
		
		for (int i = 0; i < stats.length ; i++)
			switch (i) {
			case 0:
				stats[i] = hp;
				break;
			case 1:
				stats[i] = atk;
				break;
			case 2:
				stats[i] = def;
				break;
			case 3:
				stats[i] = speed;
				break;
			case 4:
				stats[i] = mp;
				break;
			case 5:
				stats[i] = magic;
				break;
			case 6:
				stats[i] = res;
				break;
			
			}
		
	}
	
	
}
