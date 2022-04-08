public class LivroMain_Lara {
    public static void main(String args[]) {
        LIvro_Lara livro = new LIvro_Lara();

        livro.titulo = "Senhor dos aneis";
        livro.autor = "Tony Stark";

        System.out.println("Titulo: " + livro.titulo);
        System.out.println("Autor: " + livro.autor);

        livro.Vender();
    }
}
