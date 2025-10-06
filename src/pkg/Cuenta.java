package pkg;

public class Cuenta {
	
	String numero;
	String titular;
	double saldo;

	public Cuenta(String numero, String titular, double saldo) {
		super();
		this.numero = numero;
		this.titular = titular;
		this.saldo = saldo;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public Cuenta(int i) {
		saldo = i;
	}

	public void ingresar(int i) {
		saldo = 500;
	}

	public void retirar(int i) {
		saldo = -500;
	}

}
