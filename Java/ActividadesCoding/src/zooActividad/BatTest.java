package zooActividad;

public class BatTest {

	public static void main(String[] args) {
		Bat actividades= new Bat(300);
		actividades.attackTown();
		actividades.attackTown();
		actividades.attackTown();
		actividades.eatHumans();
		actividades.eatHumans();
		actividades.fly();
        actividades.fly();
        actividades.displayEnergy();
	}

}
