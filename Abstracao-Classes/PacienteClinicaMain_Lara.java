public class PacienteClinicaMain_Lara {
    public static void main(String args[]) {
        PacienteClinica_Lara paciente1 = new PacienteClinica_Lara();

        paciente1.nome = "Lara";
        paciente1.cpf = 12345678;
        paciente1.nomeMedico = "Dr. Antonio";

        System.out.println("Nome paciente: " + paciente1.nome);
        paciente1.AgendarConsulta();


    }
}
