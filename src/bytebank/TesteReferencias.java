package bytebank;

public class TesteReferencias {
	public static void main(String[] args) {
		Conta c1 = new Conta();
		c1.saldo=300;
		
		System.out.println("Saldo da primeira conta: "+c1.saldo);
		
		Conta c2 = c1;//os duas contas se referenciam para o mesmo objeto na memoria
		
		System.out.println("Saldo da primeira conta: "+c2.saldo);
		
		c2.saldo+=100;
		System.out.println("Saldo da primeira conta: "+c1.saldo);
		System.out.println("Saldo da primeira conta: "+c2.saldo);
		
		if(c1==c2) {
			System.out.println("São a mesma referencia!");
		}
		
		System.out.println("Referência:"+ c1);
		System.out.println("Referência:"+ c2);
	}
}
