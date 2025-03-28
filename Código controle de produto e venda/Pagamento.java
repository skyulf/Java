public class Pagamento {

    public double calcularPagamento(double valorProduto, String formaPagamento) {
        double valorFinal = valorProduto;

        switch (formaPagamento.toLowerCase()) {
            case "pix":
            case "especie":
            case "transferencia":
            case "debito":
                valorFinal = valorProduto * 0.95;  // 5% de desconto
                break;
            case "credito":
                // No crédito, o valor final não muda (parcelamento sem juros)
                break;
            default:
                System.out.println("Forma de pagamento inválida!");
        }

        return valorFinal;
    }


    public double calcularTroco(double valorPago, double valorProduto) {
        if (valorPago > valorProduto) {
            return valorPago - valorProduto;
        } else {
            return 0;
        }
    }


    public void calcularParcelamento(double valorProduto) {
        double parcela = valorProduto / 3;
        System.out.println("Pagamento em 3x de R$ " + String.format("%.2f", parcela) + " sem juros.");
    }
}
