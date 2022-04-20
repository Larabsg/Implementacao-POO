public class FuncionarioAssalariado extends Funcionario {

    private double salarioSemanal;

    public FuncionarioAssalariado(String nome, String matricula, Double salarioSemanal) {
        super(nome, matricula);
        this.salarioSemanal = salarioSemanal;
    }

    @Override
    public Double ganhos() {
        return null;
    }
    
    public double getSalarioSemanal() {
        return salarioSemanal;
    }

    public void setSalarioSemanal(double salarioSemanal) {
        this.salarioSemanal = salarioSemanal;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.getNome() + " | " + super.getMatricula() + " | " + salarioSemanal;
    }
}
