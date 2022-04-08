import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.GridLayout;

public class AppCalculadora {
  public static void main(String args[]) {

    Calculadora calc1 = new Calculadora();
    
    JTextField xField = new JTextField(5);
    JTextField yField = new JTextField(5);

    JPanel myPanel = new JPanel(new GridLayout(0, 1, 2, 2));
    myPanel.add(new JLabel("Digite os valores", SwingConstants.CENTER));

    myPanel.add(new JLabel("Operando 1:", SwingConstants.LEFT));
    myPanel.add(xField);
    myPanel.add(new JLabel("Operando 2:", SwingConstants.LEFT));
    myPanel.add(yField);

    JOptionPane.showMessageDialog(null, "Bem-vindo à nossa aplicação!", "CALCULADORA", JOptionPane.INFORMATION_MESSAGE);

    int result = JOptionPane.showConfirmDialog(null, myPanel,
        "CALCULADORA", JOptionPane.OK_CANCEL_OPTION);


        int op  = Integer.parseInt(JOptionPane.showInputDialog("Digite qual opção desejada:  \n 1 - Somar \n 2 - Subtrair \n 3 - Multiplicar \n 4 - Dividir")); 
    
        if (result == JOptionPane.OK_OPTION) {
            if(op == 1) {
              calc1.somar(Double.valueOf(xField.getText()), Double.valueOf(yField.getText()));
              JOptionPane.showMessageDialog(null, "Resultado de " + xField.getText() + " + " + yField.getText() + " = " + Double.toString(calc1.resultado), "CALCULADORA", JOptionPane.INFORMATION_MESSAGE);
          } else if(op == 2) {
              calc1.subtrair(Double.valueOf(xField.getText()), Double.valueOf(yField.getText()));
              JOptionPane.showMessageDialog(null,"Resultado de " + xField.getText() + " - " + yField.getText() + " = " + Double.toString(calc1.resultado), "CALCULADORA", JOptionPane.INFORMATION_MESSAGE);
          } else if(op == 3) {
              calc1.multiplicar(Double.valueOf(xField.getText()), Double.valueOf(yField.getText()));
              JOptionPane.showMessageDialog(null,"Resultado de " + xField.getText() + " * " + yField.getText() + " = " + Double.toString(calc1.resultado), "CALCULADORA", JOptionPane.INFORMATION_MESSAGE);
          } else if(op == 4) {
              calc1.dividir(Double.valueOf(xField.getText()), Double.valueOf(yField.getText()));
              JOptionPane.showMessageDialog(null, "Resultado de " + xField.getText() + " / " + yField.getText() + " = " + Double.toString(calc1.resultado), "CALCULADORA", JOptionPane.INFORMATION_MESSAGE);
          }
    }

  }
}