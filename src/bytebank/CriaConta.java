package bytebank;

public class CriaConta {
	public static void main(String[] args) {
		Conta c1= new Conta();
		c1.saldo=200;
		Conta c2 = new Conta();
		c2.saldo=300;
		
		System.out.print("A conta 1 possui R$: "+c1.saldo+"\nA conta 2 possui R$: "+c2.saldo);
	
	}
}
