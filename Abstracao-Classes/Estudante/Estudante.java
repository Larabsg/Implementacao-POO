import java.sql.Date;

public class Estudante {

    private String numero;
    private String nome;
    private Date dataNascimento;
    private int pontosTarifarios;

    Estudante() {
        this.numero = "Desconhecido";
        this.nome = "Desconhecido";
        this.pontosTarifarios = 20;
        this.dataNascimento = 1-01-1995;
    }

    Estudante(String numero, String nome, Date dataNascimento, int pontosTarifarios) {
        
    }
}
