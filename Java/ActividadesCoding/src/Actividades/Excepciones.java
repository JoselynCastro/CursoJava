package Actividades;

import java.util.ArrayList;

public class Excepciones {
	public void excepciones(ArrayList<Object> myList){
		for(int i = 0; i < myList.size(); i++) {
			try {
				int castedValue = (int) myList.get(i);
				System.out.println(castedValue);
			}
			catch (Exception e) {
				System.out.println("Es un String, no se puede convertir");
				System.out.println("Indice del array: "+i);
				System.out.println("Valor del objeto: "+e);
			};
		};
	};
};
