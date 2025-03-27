import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        // Capturar a entrada do usuário pelo terminal
        Scanner scanner = new Scanner(System.in);

        // Solicita e armazena os dados da conta bancária
        System.out.print("Por favor, digite o número da conta: ");
        int accountNumber = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Por favor, digite o número da agência: ");
        String bankBranch = scanner.nextLine();

        System.out.print("Por favor, digite o nome do Cliente: ");
        String customerName = scanner.nextLine();

        System.out.print("Por favor, digite o saldo inicial: ");
        double balance = scanner.nextDouble();

        // Exibe a mensagem formatada corretamente
        System.out.println("\nOlá " + customerName + ", obrigado por criar uma conta em nosso banco.");
        System.out.println("Sua agência é " + bankBranch + ", conta " + accountNumber + " e seu saldo " + balance + " já está disponível para saque.");

        scanner.close();
    }
}