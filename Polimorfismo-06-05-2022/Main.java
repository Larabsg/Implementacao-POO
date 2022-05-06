import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Product[] products = new Product[200];
        int cont=0, qtdProd, i, resp;
        String name, manufactureDate;
        double price, customsFee;


        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos produtos deseja cadastrar? ");
        qtdProd = sc.nextInt();

        for(i = 0; i < qtdProd; i++) {
            System.out.print("O produto eh 1. comum, 2. usado ou 3. importado (1/2/3)? ");
            resp = sc.nextInt();

            if(resp == 1) {
                System.out.print("Digite o nome: ");
                name = sc.next();
                System.out.print("Digite o preço: ");
                price = sc.nextDouble();
                Product p1 = new Product(name, price);
            }
        }


    }
}
