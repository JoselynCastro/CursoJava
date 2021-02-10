package Calculadora;

import java.util.ArrayList;

public class CalculadoraDos{
	private static double resultado;
	ArrayList<Double> numeros= new ArrayList<Double>();
	ArrayList<String> signos= new ArrayList<String>();
	
	
	public void performOperation(double d) {
		numeros.add(d);	
	}
	public void performOperation(String signo) {
		signos.add(signo);
	}
	public void performOperation() {
			for (int i=0; i<numeros.size(); i++) {
					for(int j=0;j<signos.size();j++) {
						System.out.println(signos.get(j));
					    if(signos.get(j)=="*") {
					    	resultado*=numeros.get(i);
					    }
	                    if(signos.get(j)=="/") {
	                    	resultado/= numeros.get(i);
					    }
	                    if(signos.get(j)=="+") {
	                    	resultado+= numeros.get(i);
					    }
	                    if(signos.get(j)=="-") {
	                    	resultado-= numeros.get(i);
			    }         
			}
		}
	}
	
	
	public ArrayList<Double> getNumeros() {
		return numeros;
	}
	public void setNumeros(ArrayList<Double> numeros) {
		this.numeros = numeros;
	}
	public ArrayList<String> getSignos() {
		return signos;
	}
	public void setSignos(ArrayList<String> signos) {
		this.signos = signos;
	}
	public void setResultado(double resultado) {
		this.resultado = resultado;
	}
	public void getResultado() {
		System.out.println(resultado);
	}
	
}
