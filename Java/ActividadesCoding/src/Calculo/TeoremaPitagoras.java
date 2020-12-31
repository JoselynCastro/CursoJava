package Calculo;

public class TeoremaPitagoras {
	public static void main (String[] args) {
		System.out.print(calcularHipotenusa(3,4));
	
	}
	public static double calcularHipotenusa(int catetoA, int catetoB) {
		double hipotenusa = Math.sqrt(Math.pow(catetoA,2)+Math.pow(catetoB,2));
		return hipotenusa;
	}
}