package cuentaBanco;

public class BankAccount {
	private String cuenta;
	private double saldoCuentaAhorro;
	private double saldoCuentaCorriente;
	
	private static int numeroDeCuentas=0;
	private static double dineroAlmacenado=0;
	
	private int numeroCuenta() {
		String num="";
		for(int x=0; x<=10; x++) {
			double numero=Math.random() * 10;
			
		}
		System.out.println(num);
	}
	
}
