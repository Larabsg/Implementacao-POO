import java.sql.Date;

public class Livro {
    private String titulo;
    private String autor;
    private String editora;
    private String cidade;
    private Date data_pub;
    private double preco;

    ISBN isbnNum = new ISBN();

    setBookISBN(String var_isbn) {
        isbnNum.setISBN(var_isbn);
    }

    public String getAutor() {
        return autor;
    }

    getBookISBN() {
        
    }

    printDetails() {
        System.out.println("Titulo do livro: ");
        System.out.println("Autor do livro: ");
        System.out.println("Editor: ");
        System.out.println("ISBN: ");
    }
}
