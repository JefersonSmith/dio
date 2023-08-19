import java.util.Scanner;

public class ContaTerminal {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Olá, digite o número da sua conta: ");
		int conta = scanner.nextInt();
		
		System.out.println("Digite o número da sua agência: ");
		String agencia = scanner.next();
		
		System.out.println("por favor, digite o seu nome: ");
		String nome = scanner.next();
		
		System.out.println("Quanto você deseja depositar na sua conta: ");
		double saldo = scanner.nextDouble();
		
		System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + " conta "
				+ conta + " e seu saldo " + saldo + " já está disponível para saque!");
	}

}
