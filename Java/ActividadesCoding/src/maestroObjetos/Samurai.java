package maestroObjetos;

public class Samurai extends Human{
	public Samurai(int strength, int stealth, int intelligence, int health) {
		super(strength, stealth, intelligence, 200);
		// TODO Auto-generated constructor stub
	}
    public void deathBlow(Human moribundo) {
    	moribundo.setHealth(moribundo.getHealth());
    }
    public void meditate() {
    	this.setHealth(getHealth()+getHealth()/2);
    }
    public void howMany() {// numero actual?
    	
    }
}
