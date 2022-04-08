import java.util.Scanner;

public class ISBN_Main {
    public static void main(String[] args) {
        String var_isbn;

        ISBN num_isbn = new ISBN();

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o numero ISBN: ");
        var_isbn = sc.nextLine();

        num_isbn.setISBN(var_isbn);

        System.out.println("Pais: " + num_isbn.getDig1());
        System.out.println("Editor: " + num_isbn.getDig2());
        System.out.println("Numero titulo: " + num_isbn.getDig3());
        System.out.println("Digito verificador: " + num_isbn.getDig4());
        

        sc.close();
    }
}
