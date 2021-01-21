package Actividades;

import java.util.ArrayList;

public class ExcepcionesTest {
	public static void main(String[] args) {
		Excepciones actividades= new Excepciones();
		ArrayList<Object> myList = new ArrayList<Object>();
		myList.add("13");
		myList.add("Hola Mundo");
		myList.add(48);
		myList.add("Adios Mundo");
		actividades.excepciones(myList);
	}
}
