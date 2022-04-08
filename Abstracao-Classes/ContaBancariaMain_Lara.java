public class ContaBancariaMain_Lara {
    public static void main(String args[]) {
        ContaBancaria_Lara conta1 = new ContaBancaria_Lara();
        ContaBancaria_Lara conta2 = new ContaBancaria_Lara();

        conta1.saldo = 300.50;
        conta2.saldo = 1050.34;

        System.out.println("Saldo conta 1: " + conta1.verSaldo());
        System.out.println("Saldo conta 2: " + conta2.verSaldo());

        conta1.Pagar(150.00);
        conta2.Pagar(34.50);

        System.out.println("Saldo conta 1: " + conta1.verSaldo());
        System.out.println("Saldo conta 2: " + conta2.verSaldo());

        conta1.Transferir(50.00);
        conta2.Transferir(20.00);

        System.out.println("Saldo conta 1: " + conta1.verSaldo());
        System.out.println("Saldo conta 2: " + conta2.verSaldo());
    }
}
