class Conta {
        double saldo;
        int agencia;
        int numero;
        String titular;
        
        public void deposita(double valor) {
        	this.saldo = this.saldo + valor;
        }
        
        public boolean saca(double valor) {
        	if(this.saldo >= valor) {
        		this.saldo = this.saldo - valor;
        		return true;
        	} 
        	
        	return false;
        }
        
        public boolean transfere(double valor, Conta numeroDaContaDestino) {
        	if(this.saldo >= valor) {
        		numeroDaContaDestino.saldo = numeroDaContaDestino.saldo + valor;
        		this.saldo = this.saldo - valor;
        		return true;
        	}
        	
        	return false;
        }
}