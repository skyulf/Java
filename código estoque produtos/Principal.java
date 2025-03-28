public class Principal {
    public static void main(String[] args) {

        Produto produto = new Produto("Camiseta", 49.99, 100);

        produto.exibirEstoque();

        produto.adicionarEstoque(50);

        produto.exibirEstoque();

        produto.vender(30);

        produto.exibirEstoque();

        produto.vender(150);
    }
}
