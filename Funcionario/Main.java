import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String primeiro_nome, segundo_nome, primeiro_nome2, segundo_nome2;
        double salario, comissao, salario2;
        int resp, cont=0, cont2=0, qtdVendas;
        Funcionario[] funcionarios = new Funcionario[10];
        FuncionarioComissionado[] funcionarios_Comissionados = new FuncionarioComissionado[10];

        //resp = sc.nextInt();

        do {
            System.out.println("____________________________________________");
            System.out.println("1. Cadastrar funcionario comum");
            System.out.println("2. Cadastrar funcionario comissionado");
            System.out.println("3. Ver lista de funcionarios comuns");
            System.out.println("4. Ver lista de funcionarios comissionados");
            System.out.println("5. Sair");

            System.out.print("\nDigite a opcao: ");
            resp = sc.nextInt();
            System.out.println("____________________________________________");

            switch(resp) {
                case 1:
                    System.out.println("Digite o primeiro nome:");
                    primeiro_nome = sc.next();

                    System.out.println("Digite o segundo nome:");
                    segundo_nome = sc.next();

                    System.out.println("Digite o valor do salario:");
                    salario = sc.nextDouble();

                    funcionarios[cont] = new Funcionario(primeiro_nome, segundo_nome, salario);
                    cont++;
                    break;
                case 2:
                    System.out.println("Digite o primeiro nome:");
                    primeiro_nome2 = sc.next();
                    System.out.println("Digite o segundo nome:");
                    segundo_nome2 = sc.next();
                    System.out.println("Digite o valor do salario:");
                    salario2 = sc.nextDouble();
                    System.out.println("Digite o valor da comissao (%):");
                    comissao = sc.nextDouble();
                    System.out.println("Digite a quantidade de vendas feitas:");
                    qtdVendas = sc.nextInt();

                    funcionarios_Comissionados[cont2] = new FuncionarioComissionado(primeiro_nome2, segundo_nome2, salario2, comissao);
                    cont2++;
                    break;
                case 3:
                    System.out.println("     Nome    |    Salario");
                    for(int i = 0; i < cont; i++) {
                        System.out.println(funcionarios[i]);
                    }
                    break;
                case 4:
                    System.out.println("     Nome    |    Salario + comissao");
                    for(int i = 0; i < cont2; i++) {
                        System.out.println(funcionarios_Comissionados[i]);
                    }
                    break;
                default:
                    break;
            }
        } while(resp != 5);
        
        sc.close();
    }
}
