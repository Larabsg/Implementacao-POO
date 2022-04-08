class ContaBancaria_Lara {
    public String tipoDeConta;
    public int agencia;
    public int numeroDaConta;
    public String nomeCliente;
    public long cpfCliente;
    public double saldo;
    public double saidas[] = new double[10000];

    public double verSaldo() {
        return saldo;
    }

    public double Pagar(double pagamento) {
        System.out.println("Pagamento realizado com sucesso");
        saidas[0] = pagamento;
        saldo = saldo - pagamento;
        return saldo;
    }

    public double Transferir(double valor) {
        System.out.println("Transferência realizada com sucesso!");
        saidas[1] = valor;
        saldo = saldo - valor;
        return saldo;
    }
 
    public void verExtrato() {
        for(int i = 0; i <=10000; i++) {
            System.out.println(saidas[i]);
        }
    }
}
