
public class TesteReferencias {
	public static void main(String[] args) {
		Conta primeiraConta = new Conta();
		primeiraConta.saldo = 300;
		
		System.out.println("saldo da primeira: " + primeiraConta.saldo);
		
		Conta segundaConta = primeiraConta;
		System.out.println("saldo da segunda conta: " + segundaConta.saldo);
		
		segundaConta.saldo += 100;
		System.out.println("saldo da segunda conta ap�s o acr�scimo: " + segundaConta.saldo);
		System.out.println("saldo da primeira conta ap�s o acr�scimo: " + primeiraConta.saldo);
		
		
		// Ver se a primeiraConta == segundaConta
		if(primeiraConta == segundaConta) {
			System.out.println("sao a mesma conta");
		} else {
			System.out.println("contas diferentes");
		}
	}
}
