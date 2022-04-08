public class Funcionario_Lara {
    public String nome;
    public int cpf;
    public String departamento;
    public String funcao;
    public double salario;

    public String toString() {
        return "\n" + nome + "\n" + cpf + "\n" + departamento + "\n" + funcao + "\n" + salario;
    }

    public void Trabalhar() {
        System.out.println(this.nome + " está trabalhando!");
    }
}
