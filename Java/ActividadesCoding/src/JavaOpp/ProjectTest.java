package JavaOpp;

import java.util.ArrayList;

public class ProjectTest {

	public static void main(String[] args) {
		Project actividades= new Project();
		actividades.setNombre("Joselyn");
		actividades.setDescripcion("Profesora en educación diferencial");
		ArrayList < Project > nuevoProyecto =  new  ArrayList < Project > ();
		nuevoProyecto.add (actividades);
		nuevoProyecto.add (new Project ("Joselyn","Profesora en educación diferencial" ));
        nuevoProyecto.add ( new Project("Joselyn"));
		for (Project project : nuevoProyecto) {
			System.out.println(project.getNombre()+" "+ project.getDescripcion());
		}
		System.out.println(actividades.elevatorPitch());
	}
}
