package Calculadora;


public class Calculadora{
	
	private double num1;
	private double num2;
	private String signo;
	private double resultado;
	
	
	public void performOperation() {
		if(getSigno()=="+") {
			resultado=getNum1()+getNum2();
		}
		if(getSigno()=="-") {
			resultado=getNum1()-getNum2();
		}
	}
	public void getResultado() {
		System.out.println(resultado);
	}
	public double getNum1() {
		return num1;
	}
	public void setNum1(double num1) {
		this.num1 = num1;
	}
	public double getNum2() {
		return num2;
	}
	public void setNum2(double num2) {
		this.num2 = num2;
	}
	public String getSigno() {
		return signo;
	}
	public void setSigno(String signo) {
		this.signo = signo;
	}
	public void setResultado(double resultado) {
		this.resultado = resultado;
	}	
	
}
