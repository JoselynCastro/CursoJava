package zooActividad;

public class Mammal {
	public int energyLevel;

	public Mammal(int energyLevel) {
		super();
		this.energyLevel = energyLevel;
	}


	public int displayEnergy() {
		System.out.println(energyLevel);
		return energyLevel;
	}
}
