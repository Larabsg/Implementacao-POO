package POO_2021_2.Usuario;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.GridLayout;

public class UsuarioMain {
    public static void main(String[] args) {

        JTextField userName = new JTextField(5);
        JTextField userLogin = new JTextField(5);
        JTextField userPass = new JTextField(5);

        JPanel myPanel = new JPanel(new GridLayout(3, 2));

        myPanel.add(new JLabel("Nome:", SwingConstants.LEFT));
        myPanel.add(userName);
        myPanel.add(new JLabel("Login:", SwingConstants.LEFT));
        myPanel.add(userLogin);
        myPanel.add(new JLabel("Senha:", SwingConstants.LEFT));
        myPanel.add(userPass);

        JOptionPane.showConfirmDialog(null, myPanel,
        "LOGIN", JOptionPane.OK_CANCEL_OPTION);

        Usuario user = new Usuario(userName.getText(), userLogin.getText(), userPass.getText());

        if(user.getNome() == null) {
            JOptionPane.showMessageDialog(null, "Nome precisa estar em letras maiusculas!");
        }
        if(user.getLogin() == null) {
            JOptionPane.showMessageDialog(null, "Login precisa estar em letras minusculas!");
        }
        if(user.getSenha() == null) {
            JOptionPane.showMessageDialog(null, "Senha precisa ter ate 16 caracteres!");
        }
        
        
    }
}
