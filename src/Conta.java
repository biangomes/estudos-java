
public class Conta {
	
	private double saldo;
	private int agencia;
	private int numero;
	private Cliente titular;
	private static int total = 0;
	
	
	// Criando um construtor
	public Conta(int agencia, int numero) {
		Conta.total++;
		System.out.println("O total de contas é: " + Conta.total + "\n##########");
		this.agencia = agencia;
		this.numero = numero;
		this.saldo = 100.0;
		System.out.println("ID " + Conta.total + "\nNúmero: " + this.numero + "\nAgência: " + this.agencia + "\n##########");
	}
	
	public void deposita(double valor) {
		this.saldo += valor;
	}
	
	public boolean saca(double valor) {
		if(this.saldo >= valor) {
			this.saldo -= valor;
			return true;
		}
		else {
			this.saldo -= valor;
			System.out.println("Está no cheque especial.");
			System.out.println("R$ " + this.saldo);
			return false;
		}
	}
	
	public boolean transfere(double valor, Conta destino) {
		if(this.saca(valor)) {
			destino.deposita(valor);
			System.out.println("Saldo total R$ " + this.saldo);
			return true;
		}
		else {
			System.out.println("Valor indisponível. - R$ " + this.saldo);
			return false;
		}
	}
	
	// Getters
	public double getSaldo() {
		return this.saldo;
	}
	
	public int getAgencia() {
		return this.agencia;
	}
	
	public int getNumero() {
		return this.numero;
	}
	
	public Cliente getTitular() {
		return this.titular;
	}
	
	
	// Setters
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public void setAgencia(int agencia) {
		if(this.agencia<=0) {
			System.out.println("Não pode agencia menor ou igual a zero.");
		} else {
			this.agencia = agencia;
		}
	}
	
	public void setNumero(int numero) {
		if(this.numero<=0) {
			System.out.println("Não pode número menor ou igual a zero.");
		} else {
			this.numero = numero;
		}
	}
	
	public void setTitular(Cliente titular) {
		this.titular = titular;
	}

}
