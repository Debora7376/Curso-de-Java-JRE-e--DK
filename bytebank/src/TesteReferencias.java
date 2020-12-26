
public class TesteReferencias {

	public static void main(String[] args) {
		Conta primeiraConta = new Conta();
		primeiraConta.saldo = 300;
		
		System.out.println("saldo da primeira: " + primeiraConta.saldo);
		
		Conta segundaConta = primeiraConta;

		System.out.println("saldo da segunda: " + segundaConta.saldo);
		
		segundaConta.saldo += 100;
		System.out.println("saldo da segunda: " + segundaConta.saldo);
		
		System.out.println(primeiraConta);
		
		if (primeiraConta == segundaConta) {
			System.out.println("é a mesma");
		}
		System.out.println(primeiraConta);
		System.out.println(segundaConta);
	}

}
