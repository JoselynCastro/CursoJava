package zooActividad;

public class Bat extends Mammal {

	public Bat(int energyLevel) {
		super(energyLevel);
		// TODO Auto-generated constructor stub
	}
	public void fly() {
		 System.out.println("Chillido");
		 this.energyLevel=this.energyLevel-50;
	 }
	 public void eatHumans() {
		 System.out.println("Bueno, no importa");
		 energyLevel=energyLevel+25;
	 }
	 public void attackTown() {
		 System.out.println("Sonido de fuego");
		 energyLevel=energyLevel-100;
	 }
}
