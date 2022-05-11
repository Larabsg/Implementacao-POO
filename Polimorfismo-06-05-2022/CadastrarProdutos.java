import java.util.Scanner;

public class CadastrarProdutos {

    private Product[] products = new Product[200];
    private int index = 0;

    public void add(Product p) {
        products[index] = p;
        index++;
    }

    public Product[] getProducts() {
        return products;
    }
    
}
