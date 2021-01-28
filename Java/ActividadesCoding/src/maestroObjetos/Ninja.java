package maestroObjetos;

public class Ninja extends Human {
	
	public Ninja(int strength, int stealth, int intelligence, int health) {
		super(strength, 10, intelligence, health);
		// TODO Auto-generated constructor stub
	}
    public void steal(Human robado) {
    	this.setHealth(robado.getHealth()-this.getStealth());
    }
    public void runAway() {
    	this.setHealth(getHealth()-10);
    }
}
