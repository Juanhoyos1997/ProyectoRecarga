import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VENTANA extends JFrame {
    private JPanel panel1;
    private JButton ingresarButton;
    private JButton salirButton;
    private JLabel labelUsuario;
    private JButton PSEButton;
    private JButton PUNTOFISICOButton;
    private JMenuBar menuBar;
    private JMenu archivo;
    private JMenuItem salir;

        public VENTANA(){
            super("RECARGAR");

            setContentPane(panel1);

            menuBar= new JMenuBar();
            archivo=new JMenu("Archivo");
            salir=new JMenuItem("Salir");
            menuBar.add(archivo);
            archivo.add(salir);

            setJMenuBar(menuBar);

            ingresarButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e){
                    JOptionPane.showMessageDialog(null,"SU RECARGA FUE UN EXITO" );

                }

            });
            salirButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    dispose();
                    System.exit(0);
                }
            });


            PSEButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {

                    String numeroCuenta="";
                    String numeroIden="";
                    String  banco="";
                    String valorRecar="";

                    numeroCuenta=JOptionPane.showInputDialog(null,"INGRESE NUMERO DE CUENTA: ");
                    numeroIden=JOptionPane.showInputDialog(null," INGRESE NUMERO DE CC: ");
                    banco= JOptionPane.showInputDialog(null,"ENTIDAD BANCARIA: ");
                    valorRecar= JOptionPane.showInputDialog(null,"VALOR RECARGA: ");

                    JOptionPane.showMessageDialog(null," NUMERO DE CEDULA "+numeroIden+"\n Numero De CUENTA "+numeroCuenta+"\n VALOR RECARGA "+valorRecar);

                    JOptionPane.showMessageDialog(null,"PRESIONE ACEPTAR PARA CONFIRMAR ");


                    Recarga recarga =new Recarga(valorRecar, banco, numeroIden, numeroCuenta);





                }
            });
            PUNTOFISICOButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    int vRecarga=0;
                    int numeroIden=0;



                    vRecarga=Integer.parseInt(JOptionPane.showInputDialog(null, "VALOR DE LA RECARGA "));



                    numeroIden=Integer.parseInt(JOptionPane.showInputDialog(null,"NUMERO DE IDENTIFICACION"));

                    JOptionPane.showMessageDialog(null," NUMERO DE CEDULA "+numeroIden+"\n VALOR DE RECARGA "+vRecarga);

                    JOptionPane.showMessageDialog(null,"PRESIONE ACEPTAR PARA CONFIRMAR ");


                    }



            });
        }


    }



