package graphic;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class LoginWindow extends JFrame{
    private JLabel lblUsuario;
    private JTextField txfUsuario;
    private JPasswordField txfSenha;
    private JComboBox<String> cbxPerfil;
    private JCheckBox chkHabilitado;
    private JButton btnSalvar;
    private JTextArea txaObservacao;
    private JScrollPane scrollObservacao;

    public LoginWindow() {
        setSize(500,300);
        setTitle("Login no Sistema");
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        //getContentPane().setBackground(COLOR BLUE);

        lblUsuario = new JLabel("Usuario: ");
        lblUsuario.setBounds(20,20,100,25);
        getContentPane().add(lblUsuario);

        txfUsuario = new JTextField();
        txfUsuario.setBounds(125,20,300,25);
        getContentPane().add(txfUsuario);
    }

    public static void main(String[] args) {
        new LoginWindow().setVisible(true);
    }
}