package maestroObjetos;

public class Samurai extends Human{
	private static int numeroTotal=0;
	public Samurai(int strength, int stealth, int intelligence, int health) {
		super(strength, stealth, intelligence, 200);
		numeroTotal++;
	}
    public void deathBlow(Human moribundo) {
    	moribundo.setHealth(moribundo.getHealth());
    }
    public void meditate() {
    	this.setHealth(getHealth()+getHealth()/2);
    }
    public int howMany() {
    	return (numeroTotal);
    }
}
