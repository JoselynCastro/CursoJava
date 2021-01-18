package ActividadPuzzle;

import java.util.ArrayList;

public class TestPuzzle {

	public static void main(String[] args) {
		PuzzleJava actividades= new PuzzleJava();
		int[ ]a= {3,5,1,2,7,9,8,13,25,32};
        int m=10;
        System.out.println(actividades.mayores(a,m));
        
        String[] b= {"Nancy","Jinichi","Fujibayashi","Momochi","Ishikawa"};
        System.out.println(actividades.nombres(b)); 
        
        ArrayList<String> abc= new ArrayList<String>();
        char[] abecedario =new char[26];
		for ( int i=0; i<26; i++) {
			char letra = (char) ('A' + i );
			abecedario[i]=letra;
			String letraString = Character.toString(letra);
			abc.add(letraString);
		}
        actividades.alfabeto(abc);
        
        int max=100;
        int min=55;
        int cant=10;
        actividades.aleatorio(max,min,cant);
        actividades.ordenado(max, min, cant);
        
        int ext=5;
        int cuant=10;
        System.out.println(actividades.cadena(ext));
        System.out.println(actividades.arrayCadena(ext,cuant));
	}
	
}