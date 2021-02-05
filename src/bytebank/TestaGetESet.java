package bytebank;

public class TestaGetESet {
	
public static void main(String[] args) {
	Conta conta = new Conta();
	conta.setNumero(1337);//dentro do set posso realizar validações
	System.out.println(conta.getNumero());
}

}
