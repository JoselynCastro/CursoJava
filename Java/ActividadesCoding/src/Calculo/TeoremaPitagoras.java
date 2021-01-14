package Calculo;

public class TeoremaPitagoras {

	public double calcularHipotenusa(int catetoA, int catetoB) {
		double hipotenusa = Math.sqrt(Math.pow(catetoA,2)+Math.pow(catetoB,2));
		return hipotenusa;
	}
}