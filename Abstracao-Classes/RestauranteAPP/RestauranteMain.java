package POO_2021_2.RestauranteAPP;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.GridLayout;

public class RestauranteMain {
    public static void main(String args[]) {
        Restaurante mesa = new Restaurante();

        JTextField ref_Field = new JTextField(5);
        JTextField sobremesa_Field = new JTextField(5);
        JTextField refri2_Field = new JTextField(5);
        JTextField refri600_Field = new JTextField(5);
        JTextField refriLata_Field = new JTextField(5);
        JTextField cerveja_Field = new JTextField(5);

        JPanel myPanel = new JPanel(new GridLayout(0, 1, 2, 2));
        myPanel.add(new JLabel("Digite a quantidade para opção desejada", SwingConstants.CENTER));

        myPanel.add(new JLabel("Refeição (kg):", SwingConstants.LEFT));
        myPanel.add(ref_Field);
        myPanel.add(new JLabel("Sobremesa:", SwingConstants.LEFT));
        myPanel.add(sobremesa_Field);
        myPanel.add(new JLabel("Refrigerante 2 litros:", SwingConstants.LEFT));
        myPanel.add(refri2_Field);
        myPanel.add(new JLabel("Refrigerante 600ml:", SwingConstants.LEFT));
        myPanel.add(refri600_Field);
        myPanel.add(new JLabel("Refrigerante lata:", SwingConstants.LEFT));
        myPanel.add(refriLata_Field);
        myPanel.add(new JLabel("Cerveja:", SwingConstants.LEFT));
        myPanel.add(cerveja_Field);

        JOptionPane.showConfirmDialog(null, myPanel,
        "RESTAURANTE", JOptionPane.OK_CANCEL_OPTION);

        int resp = JOptionPane.showConfirmDialog(null, "Deseja gerar a conta?", "Conta", JOptionPane.YES_NO_OPTION);

        if(resp == JOptionPane.YES_OPTION) {
            Double conta = mesa.gerarConta(
                Integer.valueOf(ref_Field.getText()), 
                Integer.valueOf(sobremesa_Field.getText()), 
                Integer.valueOf(refri2_Field.getText()), 
                Integer.valueOf(refri600_Field.getText()), 
                Integer.valueOf(refriLata_Field.getText()), 
                Integer.valueOf(cerveja_Field.getText())
                );
                JOptionPane.showMessageDialog(null, "Conta: " + conta, "Conta", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "Obrigada!", "Conta", JOptionPane.INFORMATION_MESSAGE);
        }

    }


}
