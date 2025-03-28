public class Produto {

    private String nome;
    private double preco;
    private int quantidadeEmEstoque;


    public Produto(String nome, double preco, int quantidadeEmEstoque) {
        this.nome = nome;
        this.preco = preco;
        this.quantidadeEmEstoque = quantidadeEmEstoque;
    }


    public void adicionarEstoque(int quantidade) {
        if (quantidade > 0) {
            this.quantidadeEmEstoque += quantidade;
            System.out.println("Estoque atualizado: " + quantidade + " unidades adicionadas.");
        } else {
            System.out.println("Quantidade inválida para adicionar ao estoque.");
        }
    }


    public void vender(int quantidade) {
        if (quantidade > 0 && quantidade <= this.quantidadeEmEstoque) {
            this.quantidadeEmEstoque -= quantidade;
            System.out.println("Venda realizada: " + quantidade + " unidades vendidas.");
        } else {
            System.out.println("Não há unidades suficientes em estoque ou quantidade inválida.");
        }
    }

    public void exibirEstoque() {
        System.out.println("Estoque de " + nome + ": " + quantidadeEmEstoque + " unidades.");
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQuantidadeEmEstoque() {
        return quantidadeEmEstoque;
    }

    public void setQuantidadeEmEstoque(int quantidadeEmEstoque) {
        this.quantidadeEmEstoque = quantidadeEmEstoque;
    }
}
