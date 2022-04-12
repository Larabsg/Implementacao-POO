public class FuncionarioComissionado extends Funcionario{

    private double comissao;
    private int qtdVendas;

    public FuncionarioComissionado(String primeiro_nome, String segundo_nome, double salario, double comissao) {
        super(primeiro_nome, segundo_nome, salario);
        this.comissao = comissao;
    }

    @Override
    public String toString() {
        return super.getPrimeiro_nome() + " " + super.getSegundo_nome() + " | " + super.getSalario();
    }

    public double getComissao() {
        return comissao;
    }

    public void setComissao(double comissao) {
        this.comissao = comissao;
    }

    public int getQtdVendas() {
        return qtdVendas;
    }

    public void setQtdVendas(int qtdVendas) {
        this.qtdVendas = qtdVendas;
    }

    public double calculaComissao(int qtdVendas) {
        return comissao*qtdVendas;
    }

    public double salarioComissionado(int qtdVendas) {
        return super.getSalario()*calculaComissao(qtdVendas);
    }
    
}
