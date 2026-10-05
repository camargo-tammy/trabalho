public class TestaProduto {
    public static void main(String[] args) {
        Produto p = new Produto("Teclado", 250.0, 10);

        p.adicionarEstoque(5);
        p.removerEstoque(3);

        System.out.println("Produto: " + p.getNome());
        System.out.println("Preço: " + p.getPreco());
        System.out.println("Estoque: " + p.getQuantidadeEstoque());

        p.setPreco(-50.0);
    }
}