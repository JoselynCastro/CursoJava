package maestroObjetos;

public class Gorilla extends Mammal {

	 public Gorilla(int energyLevel) {
		super(energyLevel);
		// TODO Auto-generated constructor stub
	}
	public void throwSomething(int arroja) {
		 System.out.println("El gorila ha lanzado un objeto");
		 this.energyLevel=this.energyLevel-5*arroja;
	 }
	 public void eatBananas(int comida) {
		 System.out.println("Saci� mi hambre");
		 energyLevel=energyLevel+10*comida;
	 }
	 public void climb(int escalada) {
		 System.out.println("He trepado un �rbol");
		 energyLevel=energyLevel-10*escalada;
	 }
	 
}
