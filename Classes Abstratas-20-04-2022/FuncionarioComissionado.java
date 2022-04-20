public class FuncionarioComissionado extends Funcionario {
    
    
    private int quantidadeVendas;
    private double valorPorVenda;

    public FuncionarioComissionado(String nome, String matricula, int quantidadeVendas, Double valorPorVenda) {
            super(nome, matricula);
            this.quantidadeVendas = quantidadeVendas;
            this.valorPorVenda = valorPorVenda;
        }

    @Override
    public Double ganhos() {
        return null;
    }

    public int getQuantidadeVendas() {
        return quantidadeVendas;
    }

    public double getValorPorVenda() {
        return valorPorVenda;
    }

    public void setQuantidadeVendas(int quantidadeVendas) {
        this.quantidadeVendas = quantidadeVendas;
    }

    public void setValorPorVenda(double valorPorVenda) {
        this.valorPorVenda = valorPorVenda;
    }

    @Override
    public String toString() {

        return "Funcionario Comissionado\nNome: " + super.getNome() + "\nMatricula: " + super.getMatricula();
    }
    
    
}
