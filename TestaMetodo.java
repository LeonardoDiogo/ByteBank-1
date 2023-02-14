package bytebank;

public class TestaMetodo {

	public static void main(String[] args) {
		Conta conta = new Conta();
		conta.saldo = 100;
		conta.deposita(50);
		System.out.println(conta.saldo);
		
		boolean consegiuRetirar = conta.saca(20);
		System.out.println(conta.saldo);
		System.out.println(consegiuRetirar);
		
		Conta conta2 = new Conta();
		conta2.deposita(1000);
		
		if(conta2.transfere(3000, conta)) {
			System.out.println("Transferencia com sucesso!");
		}else {
			System.out.println("faltou dinheiro!!");
		}
		System.out.println(conta2.saldo);
		System.out.println(conta.saldo);
		
		conta.titular = "leonardo francisco diogo";
		System.out.println(conta.titular);
	}

}
