package Calculadora;

public class CalculadoraTest {
	public static void main(String[] args) {
		Calculadora act= new Calculadora();
		
		act.setNum1(10.5);
		act.setSigno("+");
		act.setNum2(5.2);
		act.performOperation();
		act.getResultado();
		
		CalculadoraDos act2=new CalculadoraDos();
		act2.performOperation(10.5);
		act2.performOperation("+");
		act2.performOperation(5.2);
		act2.performOperation("*");
		act2.performOperation(10);
		act2.performOperation("=");
		act2.performOperation();
		System.out.println(act2.numeros);
		System.out.println(act2.signos);
		act2.getResultado();
	}
}
