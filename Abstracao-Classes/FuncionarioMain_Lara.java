public class FuncionarioMain_Lara {
    public static void main(String args[]) {
        Funcionario_Lara func1 = new Funcionario_Lara();
        Funcionario_Lara func2 = new Funcionario_Lara();

        func1.nome = "Carol";
        func1.cpf = 12345678;
        func1.departamento = "Informatica";
        func1.funcao = "Estagiaria";
        func1.salario = 800.00;

        func2.nome = "Pedro";
        func2.cpf = 12345678;
        func2.departamento = "Suporte";
        func2.funcao = "Supervidor";
        func2.salario = 1500.00;

        System.out.println(func1);
        func1.Trabalhar();
        System.out.println(func2);
        func2.Trabalhar();
    }
}
