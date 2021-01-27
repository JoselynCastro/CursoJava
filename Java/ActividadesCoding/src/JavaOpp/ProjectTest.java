package JavaOpp;

public class ProjectTest {

	public static void main(String[] args) {
		Project actividades= new Project();
		actividades.setNombre("Joselyn");
		actividades.setDescripcion("Profesora en educación diferencial");
		System.out.println(actividades.elevatorPitch());
		System.out.println(actividades.getNombre());
		System.out.println(actividades.getDescripcion());
	}
}
