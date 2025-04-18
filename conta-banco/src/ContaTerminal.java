import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        //TODO: Conhecer e importar a classe Scanner
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        //Exibir as mensagens para o nosso usuário
        //Obter pela scanner os valores digitados no terminal
        System.out.println("Por favor degite o número da conta:");
        int numeroConta = scanner.nextInt();

        System.out.println("Por favor digite o número da agencia:");
        String agencia = scanner.next();

        System.out.println("Por favor digite seu nome:");
        String nome = scanner.next();

        System.out.println("Digite seu saldo:");
        double saldo = scanner.nextDouble();

        
        System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco.");
        System.out.println("Sua agência é: " + agencia);
        System.out.println("Sua conta: " + numeroConta);
        System.out.println("Seu saldo é " + saldo + ", já esta disponivel para saque:");

        //Exibir a mensagem conta  criada
        System.out.println("Conta criada com sucesso.");

    }
}
