public class Filme_Lara {
    public String titulo;
    public String diretor;
    public int AnoLAncamento;
    public String sinopse;
    public String genero;

    public void InfoFilme() {
        System.out.println("______________________________");
        System.out.println("          " + titulo + "         ");
        System.out.println("Diretor: " + diretor);
        System.out.println("Ano de Lancamento: " + AnoLAncamento);
        System.out.println("Genero: " + genero);
        System.out.println("______________________________");
    }
}
