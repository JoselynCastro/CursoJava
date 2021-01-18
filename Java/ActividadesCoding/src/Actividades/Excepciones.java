package Actividades;

import java.util.ArrayList;

public class Excepciones {
	public void excepciones(){
	ArrayList<Object> myList = new ArrayList<Object>();
	myList.add("13");
	myList.add("Hola Mundo");
	myList.add(48);
	myList.add("Adios Mundo");
	for(int i = 0; i < myList.size(); i++) {
	    int castedValue = (int) myList.get(i);
	}
	}
}
