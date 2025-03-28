public class Produto {

    private int codigo;
    private String nome;
    private String tamanhoPeso;
    private String cor;
    private double valor;
    private int quantidadeEstoque;


    public Produto(int codigo, String nome, String tamanhoPeso, String cor, double valor, int quantidadeEstoque) {
        this.codigo = codigo;
        this.nome = nome;
        this.tamanhoPeso = tamanhoPeso;
        this.cor = cor;
        this.valor = valor;
        this.quantidadeEstoque = quantidadeEstoque;
    }


    public int getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public String getTamanhoPeso() {
        return tamanhoPeso;
    }

    public String getCor() {
        return cor;
    }

    public double getValor() {
        return valor;
    }

    public int getQuantidadeEstoque() {
        return quantidadeEstoque;
    }

    public void setQuantidadeEstoque(int quantidadeEstoque) {
        this.quantidadeEstoque = quantidadeEstoque;
    }


    public boolean venderProduto(int quantidade) {
        if (quantidade > 0 && quantidade <= quantidadeEstoque) {
            quantidadeEstoque -= quantidade;
            return true;
        } else {
            return false; // Estoque insuficiente
        }
    }


    public void exibirProduto() {
        System.out.println("Código: " + codigo + ", Nome: " + nome + ", Tamanho/Peso: " + tamanhoPeso +
                ", Cor: " + cor + ", Valor: R$ " + valor + ", Estoque: " + quantidadeEstoque);
    }
}
