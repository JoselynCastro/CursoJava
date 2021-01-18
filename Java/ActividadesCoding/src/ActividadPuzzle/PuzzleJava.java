package ActividadPuzzle;

import java.util.ArrayList;
import java.util.Collections;


public class PuzzleJava {
	public ArrayList<Integer> mayores(int []a, int m) {
		   ArrayList<Integer> array = new ArrayList<Integer>();
		   for(int i = 0; i<a.length; i++) {
			   if(a[i]>m) {
			   array.add(a[i]);
		     }
		   }
     	   return array;
	   }
	
	public ArrayList<String> nombres(String []b) {
		  ArrayList<String> array = new ArrayList<String>();
		  for(int i=0; i<b.length; i++) {
		   System.out.println(b[i]);
		   if(b[i].length()>5) {
			   array.add(b[i]);
		   }
	   }
		  return array;
   }
   
	public void alfabeto (ArrayList<String> abecedario) {
		   Collections.shuffle(abecedario);
		   System.out.println(abecedario.get(abecedario.size()-1)); 
		   if(abecedario.get(0)=="A" || abecedario.get(0)=="E" || abecedario.get(0)=="I" || abecedario.get(0)=="O" || abecedario.get(0)=="U") {
			   System.out.println("Esta es una vocal");
		   }
		   else {
			   System.out.println(abecedario.get(0)); 
	      }
	}
	public void aleatorio(int max, int min, int cant) {
		ArrayList<Integer> array = new ArrayList<Integer>();
		for (int i = 0; i < cant; i++) {
			int Num = (int)(Math.random() * (max-min))+min; 
		    array.add(Num);
		    }
            System.out.println(array);
	}
	public void ordenado(int max, int min, int cant) {
		ArrayList<Integer> array = new ArrayList<Integer>();
		for (int i = 0; i < cant; i++) {
			int Num = (int)(Math.random() * (max-min))+min; 
		    array.add(Num);
		    }
		    array.sort(null);
            System.out.println(array);
	}
	public String cadena(int ext) {
		   String result= "";
		   String letras= "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		   for ( var i = 0; i <= ext; i++ ) {
		      result += letras.charAt((int) Math.floor(Math.random() * 25-0));
		   }
		   return result;
	}
	public ArrayList<String> arrayCadena(int ext, int cuant) {
		   ArrayList<String> array = new ArrayList<String>();
		   String result= "";
		   String letras= "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		   for ( var i = 0; i <= cuant; i++ ) {
			   for (int j = 0; j < ext; j++) {
			   result += letras.charAt((int) Math.floor(Math.random() * 25-0));
			}
			   array.add(result);
			   result="";
		   }
		   return array;
	}
}
