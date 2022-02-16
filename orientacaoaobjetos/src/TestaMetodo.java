
public class TestaMetodo {
	public static void main(String[] args) {
		
		Conta contaBeatriz = new Conta();
		
		// Invocar o metodo
		contaBeatriz.saldo = 100;
		System.out.println("Saldo atual R$" + contaBeatriz.saldo);
		contaBeatriz.deposita(61);
		System.out.println("Agora possui R$" + contaBeatriz.saldo);
		
		Conta contaThomas = new Conta();
		contaThomas.saldo = 0;
		contaBeatriz.transfere(100, contaThomas);
		
		System.out.println("Saldo origem R$" + contaBeatriz.saldo);
		System.out.println("Saldo destino R$" + contaThomas.saldo);
	}
}
