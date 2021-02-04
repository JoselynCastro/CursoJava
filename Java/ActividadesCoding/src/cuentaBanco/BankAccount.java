package cuentaBanco;

public class BankAccount {
	private String numCuenta;
	private double saldoCuentaAhorro;
	private double saldoCuentaCorriente;
	
	static int numeroDeCuentas=0;
	private static double dineroAlmacenado=0;
	
	public String numeroCuenta() {
		numCuenta="";
		for(int i =0; i<10;i++) {
			int n=(int) (Math.random()*10);
			numCuenta=numCuenta+ String.valueOf(n);
		}
		return numCuenta;
	}
	
	public BankAccount(String numCuenta, double saldoCuentaAhorro, double saldoCuentaCorriente) {
		numeroCuenta();
		this.numCuenta = numCuenta;
		this.saldoCuentaAhorro = saldoCuentaAhorro;
		this.saldoCuentaCorriente = saldoCuentaCorriente;
		numeroDeCuentas++;
	}

	public void depositoCuentaAhorro(double cantidad) {
    		saldoCuentaAhorro+=(BankAccount.getDineroAlmacenado()+cantidad);
    		System.out.println("Saldo actual:"+saldoCuentaAhorro);
	}
	public void depositoCuentaCorriente(double cantidad) {
		saldoCuentaCorriente+=(BankAccount.getDineroAlmacenado()+cantidad);
		System.out.println("Saldo actual:"+saldoCuentaCorriente);
	}
	
	public void giroCuentaAhorro(double cantidad) {
		System.out.println("Acabas de girar:"+ cantidad +" de tu cuenta "+getNumCuenta() );
			if(BankAccount.getDineroAlmacenado() > cantidad) {
    			saldoCuentaAhorro-=(BankAccount.getDineroAlmacenado()-cantidad);
    			System.out.println("Acabas de girar:"+ cantidad +"de tu cuenta"+ getNumCuenta());
    		}
			else{
    			System.out.println("No tiene saldo suficiente en tu cuenta "+ getNumCuenta());
    		}
	}
	public void giroCuentaCorriente(double cantidad) {
		if(BankAccount.getDineroAlmacenado() > cantidad) {
			saldoCuentaCorriente-=(BankAccount.getDineroAlmacenado()- cantidad);
			System.out.println("Acabas de girar:"+ cantidad +"de tu cuenta"+getNumCuenta() );
		}
		if(BankAccount.getDineroAlmacenado()  < cantidad) {
			System.out.println("No tiene saldo suficiente en tu cuenta "+ getNumCuenta());
		}
    }

	public void saldoCuentaCorriente() {
			System.out.println("Tu saldo en cuenta corriente es "+ saldoCuentaCorriente);
	}
	public void saldoCuentaAhorro() {
			System.out.println("Tu saldo en cuenta de ahorro es "+ saldoCuentaAhorro);
	}

	public String getNumCuenta() {
		return numCuenta;
	}

	public void setNumCuenta(String numCuenta) {
		this.numCuenta = numCuenta;
	}

	public double getSaldoCuentaAhorro() {
		return saldoCuentaAhorro;
	}

	public void setSaldoCuentaAhorro(double saldoCuentaAhorro) {
		this.saldoCuentaAhorro = saldoCuentaAhorro;
	}

	public double getSaldoCuentaCorriente() {
		return saldoCuentaCorriente;
	}

	public void setSaldoCuentaCorriente(double saldoCuentaCorriente) {
		this.saldoCuentaCorriente = saldoCuentaCorriente;
	}

	public static int getNumeroDeCuentas() {
		return numeroDeCuentas;
	}

	public static void setNumeroDeCuentas(int numeroDeCuentas) {
		BankAccount.numeroDeCuentas = numeroDeCuentas;
	}

	public static  double getDineroAlmacenado() {
		return dineroAlmacenado;
	}

	public static void setDineroAlmacenado(double dineroAlmacenado) {
		BankAccount.dineroAlmacenado = dineroAlmacenado;
	}
	
}
