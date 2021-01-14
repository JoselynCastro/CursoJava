package Calculo;

public class FittBuzz {

	public void divisible(int x) {
	   if((x%5)==0 && (x%3)==0) {
			System.out.print("FrizzBuzz");
	   }
	   else if((x%5)==0) {
			System.out.print("Buzz");
	   }
		else if((x%3)==0) {
			System.out.print("Frizz");
	   }
		else {
			System.out.println(x);
		}
 }
}