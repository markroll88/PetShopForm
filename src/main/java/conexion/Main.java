package conexion;





import javax.swing.*;


public class Main {

    public static void main(String[] args) {

        Database connection = new Database();
        connection.establecerConexion();

      // CreateTabla connection1 = new CreateTabla();
     //  connection.establecerConexion();



        SwingUtilities.invokeLater(new Runnable(){
            @Override
                    public void run(){
            JFrame frame = new ClientesFormulario();
                frame.setSize(600, 600);
                frame.setVisible(true);
            }
        });



      // java.awt.EventQueue.invokeLater(new Runnable() {
       //     public void run() {
        //       new formClientes().setVisible(true);
       //  }

      // });


    }}