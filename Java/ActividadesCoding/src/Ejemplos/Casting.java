package Ejemplos;

public class Casting {
	    public static void main(String[] args) {
	        double d = 35.25;
	        double dd = 35.99;
	        
	        //Convirtiendo del valor de double d en un int
	        int i = (int) d;
	        
	        //Convirtiendo del valor de double dd en un int
	        int ii = (int) dd;
	        System.out.println(i);
	        System.out.println(ii);
	    }
}
// Cambio ipo de dato explicito

class Casting {
    public static void main(String[] args) {
        int i = 35;
        float f = i;
        System.out.println("El numero es: " + f);
    }
} // cambio de tipo de dato implicito
