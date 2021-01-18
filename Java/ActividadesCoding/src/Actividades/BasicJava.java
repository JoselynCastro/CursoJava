package Actividades;
import java.util.ArrayList;

public final class BasicJava{
	public void imprime(int num){
		int i=0;
		for(i=1; i<=num; i++) {
		   System.out.println(i);
	 }
   }
   public void impares(int n) {
	   int i=0;
	   for(i=1; i<=n; i++) {
	     if(i%2!=0) {
	    	 System.out.println(i); 
	     }
	   }
   }
   public void suma(int sum) {
	   int i=0;
	   int suma=0;
	   for(i=0; i<=sum; i++) {
		   suma=i+suma;
		   System.out.println("Nuevo número:"+i+" Suma:"+suma+"");
	   }
   }
   public void recorrer(int [] x) {
	   for(int i = 0; i<x.length; i++) {
		   System.out.println(x[i]);
	   }
	   
   }
   public int maximo(int [] a) {
	   int maximo=a[0];
	   for(int i = 0; i<a.length; i++) {
		   maximo=Math.max(maximo, a[i]);
	   }
	   return maximo;
   }

   public int promedio(int [] z) {
	   int prom=0;
	   for(int i = 0; i<z.length; i++) {
		   prom=z[i]+prom;
	   }
	   return(prom/z.length);
   }

   
   public ArrayList<Integer> arrImp(int b) {
	   ArrayList<Integer> myArray = new ArrayList<Integer>();
	   for(int i = 0; i<b; i++) {
		   if(i%2!=0) {
			  myArray.add(i); 
		   }
	   }
	   return myArray;
   }
   
   public int mayores(int []f, int m) {
	   int cont=0;
	   for(int i = 0; i<f.length; i++) {
		   if(f[i]>m) {
		   cont= cont+1;
	     }
	   }
	   return cont;
   }
  
   public ArrayList<Integer> potencia(int []s) {
	   ArrayList<Integer> array = new ArrayList<Integer>();
	   for(int i = 0; i<s.length; i++) {
		   int temp = i;
		   i= (int) Math.pow(s[i],2);
		   array.add(i);
		   i=temp;
	   }
	   return array;
   }
   
   public ArrayList<Integer> chao(int []s) {
	   ArrayList<Integer> array = new ArrayList<Integer>();
	   for(int i = 0; i<s.length; i++) {
		   if(s[i]<0) {
		       array.add(0);
	       }
		   else {
			   array.add(s[i]);
		   }
	   }
	   return array;
   }
   
   public ArrayList<Integer> mmp(int []s) {
	   ArrayList<Integer> array = new ArrayList<Integer>();
	   int max=0;
	   int min= s[0];
	   int suma=0;
	   for(int i = 0; i<s.length; i++) {
		   suma=suma+s[i];
		   if(s[i]>max) {
		       max=s[i];
	       }
		   if(s[i]<min){
			   min=s[i];
		   }
	   }
	   array.add(max);
	   array.add(min);
	   array.add(suma/s.length);
	   return array;
   }
   
   public ArrayList<Integer> cambio(int []r) {
	   ArrayList<Integer> array = new ArrayList<Integer>();
	   var temp=0;
	   for(int i = 0; i<r.length; i++) {
		   if(i==0) {
		       r[i]=temp;
	       }
		   else {
			   array.add(r[i]);
		   }
	   }
	   array.add(temp);
	   return array;
   }
   
}
