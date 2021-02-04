package cuentaBanco;

public class TestBankAccount {

	public static void main(String[] args) {
	    BankAccount actividad1 = new BankAccount(null, 0, 0);
	    BankAccount actividad2 = new BankAccount(null, 0, 0);
	    BankAccount actividad3 = new BankAccount(null, 0, 0);
	    BankAccount actividad4 = new BankAccount(null, 0, 0);
	    System.out.println("Cuentas creadas:"+BankAccount.numeroDeCuentas);
	    System.out.println("Numero cuenta 1:"+actividad1.numeroCuenta());
	    System.out.println("Numero cuenta 3:"+actividad3.numeroCuenta());
	    System.out.println("Numero cuenta 2:"+actividad2.numeroCuenta());
		actividad1.depositoCuentaAhorro(100000);
		actividad1.depositoCuentaAhorro(100000);
		actividad2.depositoCuentaAhorro(200000);
		actividad4.depositoCuentaCorriente(100000);
		actividad1.giroCuentaAhorro(100000);
		actividad1.saldoCuentaAhorro();
		actividad4.saldoCuentaCorriente();
		actividad4.giroCuentaAhorro(150000);
	}

}
