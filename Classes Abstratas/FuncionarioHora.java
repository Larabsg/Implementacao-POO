public class FuncionarioHora extends FuncionarioAssalariado{

    private int horas;
    private double valorDaHora;

    public FuncionarioHora(String nome, String matricula, Double salarioSemanal, int horas, Double valorDaHora) {
        super(nome, matricula, salarioSemanal);
        this.horas = horas;
        this.valorDaHora = valorDaHora;
    }

    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }

    public double getValorDaHora() {
        return valorDaHora;
    }

    public void setValorDaHora(double valorDaHora) {
        this.valorDaHora = valorDaHora;
    }

    @Override
    public Double ganhos() {
        return null;
    }

    @Override
    public String toString() {
        
        return "Funcionario Comissionado\nNome: " + super.getNome() + "\nMatricula: " + super.getMatricula();
    }
    
}
