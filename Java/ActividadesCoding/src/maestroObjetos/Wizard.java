package maestroObjetos;

public class Wizard extends Human {

	public Wizard(int strength, int stealth, int intelligence, int health) {
		super(strength, stealth, 8, 50);
		// TODO Auto-generated constructor stub
	}
    public Wizard() {
		// TODO Auto-generated constructor stub
	}
	public void heal(Human sanado) {
    	sanado.setHealth(this.getIntelligence()+sanado.getHealth());
    }
    public void fireBall(Human enfermo) {
    	enfermo.setHealth(this.getIntelligence()-enfermo.getHealth()*3);
    }
}
