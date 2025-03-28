public class ContaBancaria {
    private double saldo;


    public ContaBancaria() {
        saldo = 0;
    }


    public void consultarSaldo() {
        System.out.println("Saldo atual: R$ " + saldo);
    }


    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("Depósito de R$ " + valor + " realizado com sucesso.");
        } else {
            System.out.println("Valor de depósito inválido.");
        }
    }


    public void sacar(double valor) {
        if (saldo <= 0) {
            System.out.println("Não é possível sacar. Seu saldo está zerado.");
        } else if (valor > saldo) {
            System.out.println("Saldo insuficiente para realizar o saque.");
        } else {
            saldo -= valor;
            System.out.println("Saque de R$ " + valor + " realizado com sucesso.");
        }
    }

   
    public void transferir(ContaBancaria contaDestino, double valor) {
        if (saldo <= 0) {
            System.out.println("Não é possível transferir. Seu saldo está zerado.");
        } else if (valor > saldo) {
            System.out.println("Saldo insuficiente para realizar a transferência.");
        } else {
            saldo -= valor;
            contaDestino.depositar(valor);
            System.out.println("Transferência de R$ " + valor + " realizada com sucesso.");
        }
    }
}