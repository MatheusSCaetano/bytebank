package bytebank;

public class TestaBanco {
public static void main(String[] args) {
	Cliente matheus = new Cliente();
	matheus.nome="Matheus Caetano";
	matheus.profissao="Desenvolvedor Full Stack";
	matheus.cpf="111.111.111-11";
	
	Conta contaDoMatheus = new Conta();
	contaDoMatheus.deposita(100);
	
	contaDoMatheus.titular = matheus;
	System.out.println(contaDoMatheus.titular);
	System.out.println(matheus);
	System.out.println(contaDoMatheus.titular.nome);// vou para referencia e pego o atributo
}
}
