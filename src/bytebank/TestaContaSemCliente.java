package bytebank;

public class TestaContaSemCliente {
public static void main(String[] args) {
	Conta contaExemplo = new Conta();
	contaExemplo.titular = new Cliente();//criando um atributo referencia diretamente
	contaExemplo.titular.nome="Teste Exemplo";
	System.out.println(contaExemplo.titular.nome);
}
}
