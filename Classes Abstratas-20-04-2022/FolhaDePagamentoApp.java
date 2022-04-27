import java.util.Scanner;

public class FolhaDePagamentoApp {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String nome, matricula;
        double salarioSemanal, valorPorVenda, valorDaHora;
        int resp, cont=0, cont2=0, cont3=0, qtdVendas, horas;
        FuncionarioAssalariado[] funcionarios_Assalariados = new FuncionarioAssalariado[10];
        FuncionarioComissionado[] funcionarios_Comissionados = new FuncionarioComissionado[10];
        FuncionarioHora[] funcionarios_Horas = new FuncionarioHora[10];

        do {
            System.out.println("____________________________________________");
            System.out.println("1. Cadastrar funcionario assalariado");
            System.out.println("2. Cadastrar funcionario comissionado");
            System.out.println("3. Cadastrar funcionario hora");
            System.out.println("4. Ver lista de funcionarios assalariados");
            System.out.println("5. Ver lista de funcionarios comissionados");
            System.out.println("6. Ver lista de funcionarios hora");
            System.out.println("7. Sair");

            System.out.print("\nDigite a opcao: ");
            resp = sc.nextInt();
            System.out.println("____________________________________________");

            switch(resp) {
                case 1:
                    System.out.println("Digite o nome:");
                    nome = sc.next();

                    System.out.println("Digite a matricula:");
                    matricula = sc.next();

                    System.out.println("Digite o valor do salario semanal:");
                    salarioSemanal = sc.nextDouble();

                    funcionarios_Assalariados[cont] = new FuncionarioAssalariado(nome, matricula, salarioSemanal);
                    cont++;
                    break;

                case 2:
                    System.out.println("Digite o nome:");
                    nome = sc.next();
                    System.out.println("Digite a matricula:");
                    matricula = sc.next();
                    System.out.println("Digite o valor por venda:");
                    valorPorVenda = sc.nextDouble();
                    System.out.println("Digite a quantidade de vendas feitas:");
                    qtdVendas = sc.nextInt();

                    funcionarios_Comissionados[cont2] = new FuncionarioComissionado(nome, matricula, qtdVendas, valorPorVenda);
                    cont2++;
                    break;

                case 3:
                    System.out.println("Digite o nome:");
                    nome = sc.next();
                    System.out.println("Digite a matricula:");
                    matricula = sc.next();
                    System.out.println("Digite o salario semanal:");
                    salarioSemanal = sc.nextDouble();
                    System.out.println("Digite a quantidade de horas:");
                    horas = sc.nextInt();
                    System.out.println("Digite o valor da hora:");
                    valorDaHora = sc.nextDouble();

                    funcionarios_Horas[cont3] = new FuncionarioHora(nome, matricula, salarioSemanal, horas, valorDaHora);
                    cont3++;
                    break;

                case 4:
                    System.out.println("     Nome    |    Matricula    |    Ganho");
                    for(int i = 0; i < cont; i++) {
                        System.out.println(funcionarios_Assalariados[i]);
                    }
                    break;

                case 5:
                    System.out.println("     Nome    |    Matricula    |    Ganho");
                    for(int i = 0; i < cont2; i++) {
                        System.out.println(funcionarios_Comissionados[i]);
                    }
                    break;
                
                    case 6:
                    System.out.println("     Nome    |    Matricula    |    Ganho");
                    for(int i = 0; i < cont3; i++) {
                        System.out.println(funcionarios_Horas[i]);
                    }
                    break;

                default:
                    break;
            }
        } while(resp != 7);
        
        sc.close();
    }
    
}
