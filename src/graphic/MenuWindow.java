package graphic;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class MenuWindow {
    private JMenuBar menuBar;
    private JMenu menuSistema;
    private JMenuItem itemSistemaUsuario;

    private JMenu menuCadastro;
    private JMenuItem itemCadastroAluno;
    private JMenuItem itemCadastroModalidade;

    private JMenu menuFinanceiro, menuUtilitario;

    private JFrame framePrincipal;

    public MenuWindow() {
        menuBar = new JMenuBar();

        menuSistema = new JMenu("Sistema");
        itemSistemaUsuario = new JMenuItem("Usuário");
        menuSistema.add(itemSistemaUsuario);

        menuCadastro = new JMenu("Cadastro");
        itemCadastroAluno = new JMenuItem("Aluno");
        itemCadastroModalidade = new JMenuItem("Modalidade");
        menuCadastro.add(itemCadastroAluno);
        menuCadastro.add(itemCadastroModalidade);

        menuBar.add(menuSistema);
        menuBar.add(menuCadastro);

        framePrincipal = new JFrame("Nome do Sistema");
        framePrincipal.setSize(500, 500);
        framePrincipal.setJMenuBar(menuBar);
        framePrincipal.setVisible(true);
    }

    public static void main(String args[]) {
        new MenuWindow();
    }
}
