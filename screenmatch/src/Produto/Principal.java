package Produto;

public class Principal {
    public static void main(String[] args) {
        Produto products = new Produto();

        products.setPrice(40);
        products.setName("Refrigerante");
        products.ExibirProdutos();
    }
}
