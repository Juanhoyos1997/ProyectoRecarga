import javax.swing.*;

public class datos {
    public static void main(String[] args) {

        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                JFrame frame = new VENTANA();
                frame.setSize(300,300);
                frame.setVisible(true);
            }
        });

        }
}
