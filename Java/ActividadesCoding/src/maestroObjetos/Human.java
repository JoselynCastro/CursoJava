package maestroObjetos;

public class Human {
	private int strength=3;
	private int stealth=3;
	private int intelligence=3;
	private int health=100;
	
	public Human(int strength, int stealth, int intelligence, int health) {
		super();
		this.strength = strength;
		this.stealth = stealth;
		this.intelligence = intelligence;
		this.health = health;
	}

	public void attackHuman(Human atacador) {
		this.setHealth( this.getHealth() -	atacador.getStrength());
	}

	private int getStrength() {
		return strength;
	}

	private void setStrength(int strength) {
		this.strength = strength;
	}

	protected int getStealth() {
		return stealth;
	}

	private void setStealth(int stealth) {
		this.stealth = stealth;
	}

	private int getIntelligence() {
		return intelligence;
	}

	private void setIntelligence(int intelligence) {
		this.intelligence = intelligence;
	}

	protected int getHealth() {
		return health;
	}

	public void setHealth(int health) {
		this.health = health;
	}
}