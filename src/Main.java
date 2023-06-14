import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        LogIn log = new LogIn();
        log.setSize(500, 300);
        log.setTitle("LOGin");
        log.setVisible(true);
        log.setContentPane(log.JPLog);
        log.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
    }
}
