
import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
       Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

       System.out.println("Por favor, digite o numero da conta!");
       int numero = scanner.nextInt();

       System.out.println("Por favor, digite o numero da Agência!");
       String agencia = scanner.next();
       scanner.nextLine();

       System.out.println("Por favor, informe seu nome:");
       String nomeCliente = scanner.nextLine();

       System.err.println("Por favor, informe o saldo:");
       Double saldo = scanner.nextDouble();

       System.err.println("Olá," + nomeCliente + " obrigado por criar uma conta em nosso banco, sua agência é "+ agencia +", conta "+ numero +" e seu saldo "+ saldo +" já está disponível para saque");

    }
}
