import java.util.Scanner;

public class SistemaBancario {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ContaBancaria contaCliente = new ContaBancaria();
        ContaBancaria contaDestino = new ContaBancaria();

        int opcao;

        do {
            System.out.println("\n===== MENU =====");
            System.out.println("1. Consultar saldo");
            System.out.println("2. Depositar");
            System.out.println("3. Sacar");
            System.out.println("4. Transferir");
            System.out.println("5. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    contaCliente.consultarSaldo();
                    break;
                case 2:
                    System.out.print("Digite o valor a ser depositado: R$ ");
                    double valorDeposito = scanner.nextDouble();
                    contaCliente.depositar(valorDeposito);
                    break;
                case 3:
                    System.out.print("Digite o valor a ser sacado: R$ ");
                    double valorSaque = scanner.nextDouble();
                    contaCliente.sacar(valorSaque);
                    break;
                case 4:
                    System.out.print("Digite o valor a ser transferido: R$ ");
                    double valorTransferencia = scanner.nextDouble();
                    contaCliente.transferir(contaDestino, valorTransferencia);
                    break;
                case 5:
                    System.out.println("Saindo do sistema...");
                    break;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }
        } while (opcao != 5);

        scanner.close();
    }
}