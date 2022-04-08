package POO_2021_2.RestauranteAPP;

class Restaurante {
    double refeicao;
    double sobremesa;
    double refri2;
    double refri600;
    double refriLata;
    double cerveja;

    public Restaurante() {
        // atribuindo o preço da unidade das opções
        this.refeicao = 50.0; // 1kg = R$ 50,00...
        this.sobremesa = 5.0;
        this.refri2 = 7.0;
        this.refri600 = 5.0;
        this.refriLata = 3.0;
        this.cerveja = 2.50;
    }

    public double gerarConta(int qtd_kilo, int qtd_sobremesa, int qtd_refri2, int qtd_refri600, int qtd_refriLata, int qtd_cerveja) {
        double conta;

        conta = (qtd_kilo * this.refeicao) + 
        (qtd_sobremesa * this.sobremesa) + 
        (qtd_refri2 * this.refri2) + 
        (qtd_refri600 * this.refri600) + 
        (qtd_refriLata * this.refriLata) + 
        (qtd_cerveja * this.cerveja);

        return conta;
    }
}
