package Actividades;

public class TestBasicJava {

	public static void main(String[] args) {
		BasicJava ejercicios= new BasicJava();
		ejercicios.imprime(255);
		
		ejercicios.impares(255);
		
		ejercicios.suma(255);
		
		int[] x= {1,3,5,7,9,13};
		ejercicios.recorrer(x);
		
		int[] a= {-3,5,7};
		System.out.println(ejercicios.maximo(a));
		
		int [] z= {2,10,3};
		System.out.println(ejercicios.promedio(z));
		
		System.out.println(ejercicios.arrImp(255));
		
//		int[ ]f= {1,3,5,7};
//		int m=3;
//		System.out.println(ejercicios.mayores(f,m));
		
		int[ ]s= {1,5,10,-2};
    	System.out.println(ejercicios.potencia(s));
    	
    	System.out.println(ejercicios.chao(s));
    	
    	System.out.println(ejercicios.mmp(s));
    	
    	int[]r= {1,5,10,7,-2};
    	System.out.println(ejercicios.cambio(r));
	}
}
