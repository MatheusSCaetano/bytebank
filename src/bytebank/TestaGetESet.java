package bytebank;

public class TestaGetESet {
	
public static void main(String[] args) {
	Conta conta = new Conta();
	conta.setNumero(1337);//dentro do set posso realizar validações
	System.out.println(conta.getNumero());
	
	Cliente matheus = new Cliente();
	//conta.titula=paulo
	matheus.setNome("Teste nome");
	
    conta.setTitular(matheus);
    System.out.println("Nome do titular: "+conta.getTitular().getNome());
    conta.getTitular().setNome("Matheus 2");
    conta.getTitular().setProfissao("Programador");
    System.out.println("Nome do titular: "+conta.getTitular().getNome());
    System.out.println("Profissão do titular: "+conta.getTitular().getProfissao());
}

}
