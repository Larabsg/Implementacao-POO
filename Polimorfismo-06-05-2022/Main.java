import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Product[] products = new Product[200];
        int cont=0, qtdProd, i, resp;
        String name, manufactureDate;
        double price, customsFee;
        CadastrarProdutos vetor = new CadastrarProdutos();


        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos produtos deseja cadastrar? ");
        qtdProd = sc.nextInt();

        for(i = 0; i < qtdProd; i++) {
            System.out.println("\nProduct #" + (i+1) + " data:");
            System.out.print("O produto eh 1. comum, 2. usado ou 3. importado (1/2/3)? ");
            resp = sc.nextInt();

            if(resp == 1) {
                System.out.print("Digite o nome: ");
                name = sc.next();
                System.out.print("Digite o preço: ");
                price = sc.nextDouble();
                Product p1 = new Product(name, price);
                vetor.add(p1);
            }
            else if(resp == 2) {
                System.out.print("Digite o nome: ");
                name = sc.next();
                System.out.print("Digite o preço: ");
                price = sc.nextDouble();
                System.out.print("Digite a data: ");
                manufactureDate = sc.next();
                UsedProduct p2 = new UsedProduct(name, price, manufactureDate);
                vetor.add(p2);
            }
            else if(resp == 3) {
                System.out.print("Digite o nome: ");
                name = sc.next();
                System.out.print("Digite o preço: ");
                price = sc.nextDouble();
                System.out.print("Digite o Custom Fee: ");
                customsFee = sc.nextDouble();
                ImportedProduct p3 = new ImportedProduct(name, price, customsFee);
                vetor.add(p3);
            }
        }

        System.out.println("\nPRICE TAGS:");
        for(Product el: vetor.getProducts()) {
            if(el != null) {
                System.out.println(el.priceTag());
            }
        }

        System.out.println("\n");


    }
}
