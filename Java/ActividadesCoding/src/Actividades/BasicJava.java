package Actividades;

public final class BasicJava{
	public static void imprime(int num){
		int i=0;
		for(i=1; i<=num; i++) {
		   System.out.println(i);
	 }
   }
   public static void impares(int n) {
	   int i=0;
	   for(i=1; i<=n; i++) {
	     if(i%2!=0) {
	    	 System.out.println(i); 
	     }
	   }
   }
   public static void suma(int sum) {
	   int i=0;
	   int suma=0;
	   for(i=0; i<=sum; i++) {
		   suma=i+suma;
		   System.out.println("Nuevo número:"+i+" Suma:"+suma+"");
	   }
   }
   public static void recorrer(ArrayList <Integer> list) {
	   for(int i = 0; i<=list.length; i++) {
		   System.out.println(list[i]);
	   }
	   
   }
}
