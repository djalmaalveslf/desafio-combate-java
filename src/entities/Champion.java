package entities;

public class Champion {
	private String name;
	private int life;
	private int attack;
	private int armor;
	
	public Champion(String name, int life, int attack, int armor) {
		this.name = name;
		this.life = life;
		this.attack = attack;
		this.armor = armor;
	}
	
	public String getName() {
		return name;
	}

	public int getLife() {
		return life;
	}

	public int getAttack() {
		return attack;
	}

	public int getArmor() {
		return armor;
	}

	public void takeDamege(Champion other) {
		if(other.getAttack() > (this.getLife() + this.getArmor())) {
			this.life = 0;
		}else if(other.getAttack() < this.getArmor()) {
			this.life--;
		}else {
			this.life -= (other.getAttack() - this.getArmor());
		}
	}
	
	public String status() {
		if(this.getLife() == 0) {
			return this.getName()+": "+this.getLife()+" de vida (morreu)";
		}else {
			return this.getName()+": "+this.getLife()+" de vida";
		}
	}
}