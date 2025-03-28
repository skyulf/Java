import java.util.Scanner;

public class SistemaVenda {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Produto produto = new Produto(101, "Camiseta Polo", "M", "Azul", 79.90, 10);

        System.out.println("Cadastro do Produto:");
        produto.exibirProduto();

        System.out.println("\nDigite a quantidade a ser vendida:");
        int quantidadeVenda = scanner.nextInt();


        if (produto.venderProduto(quantidadeVenda)) {
            System.out.println("\nProduto vendido com sucesso!");
            System.out.println("Quantidade em estoque: " + produto.getQuantidadeEstoque());


            System.out.println("\nEscolha a forma de pagamento:");
            System.out.println("1. Pix");
            System.out.println("2. Espécie");
            System.out.println("3. Transferência");
            System.out.println("4. Débito");
            System.out.println("5. Crédito");
            System.out.print("Digite o número da forma de pagamento: ");
            int opcaoPagamento = scanner.nextInt();

            String formaPagamento = "";
            switch (opcaoPagamento) {
                case 1:
                    formaPagamento = "pix";
                    break;
                case 2:
                    formaPagamento = "especie";
                    break;
                case 3:
                    formaPagamento = "transferencia";
                    break;
                case 4:
                    formaPagamento = "debito";
                    break;
                case 5:
                    formaPagamento = "credito";
                    break;
                default:
                    System.out.println("Opção inválida!");
                    return;
            }

            Pagamento pagamento = new Pagamento();
            double valorFinal = pagamento.calcularPagamento(produto.getValor(), formaPagamento);

            System.out.println("\nValor total: R$ " + produto.getValor());
            System.out.println("Valor final após descontos (se houver): R$ " + valorFinal);


            if (formaPagamento.equals("especie")) {
                System.out.print("\nDigite o valor pago: R$ ");
                double valorPago = scanner.nextDouble();
                double troco = pagamento.calcularTroco(valorPago, valorFinal);
                if (troco > 0) {
                    System.out.println("Troco: R$ " + troco);
                } else {
                    System.out.println("Não há troco.");
                }
            }

            if (formaPagamento.equals("credito")) {
                pagamento.calcularParcelamento(valorFinal);
            }
        } else {
            System.out.println("\nEstoque insuficiente para realizar a venda.");
        }

        scanner.close();
    }
}
