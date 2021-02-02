package bytebank;

public class TestaMetodo {
public static void main(String[] args) {
	 Conta conta = new Conta();
	 conta.saldo=100;
	 conta.deposita(50);
	 System.out.println("Saldo: "+conta.saldo);
	 
	 boolean deucerto = conta.saca(20);//posso instanciar sem a variavel para receber o retorno
	 System.out.println(conta.saldo);
	 System.out.println(deucerto);
	 
	 Conta contaDestinatario = new Conta();
	 contaDestinatario.deposita(1000);
	 boolean sucessotranfer = contaDestinatario.transfere(5000, conta);
	 if(sucessotranfer) {
		 System.out.println("Tranferencia realizada com sucesso!");
	 }else {
		 System.out.println("Você não possui dinheiro suficiente!");
	 }
	 System.out.println("Conta do destatario despois de transferir 300 reais: "+contaDestinatario.saldo);
	 System.out.println("Conta que recebeu os 300 reais: "+conta.saldo);
}
}
