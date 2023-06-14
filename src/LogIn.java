import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LogIn extends JFrame {
    public JPanel JPLog;
    private JTextField txtUser;
    private JTextField txtPass;
    private JButton btnLog;
    private JButton btnCancel;

    private String user = "admin";
    private String pass = "admin";
public LogIn() {
    btnLog.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            if (txtUser.getText().equals(user) && txtPass.getText().equals(pass)){
                JOptionPane.showMessageDialog(null, "Login efetuado com sucesso !");
            }else {
                JOptionPane.showMessageDialog(null, "Senha ou usuários incorretos.");
            }
        }
    });
    btnCancel.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {

            public void actionPerformed(ActionEvent e) {
                txtUser.setText("");
                txtPass.setText("");
            }
        }
    });
}
}
