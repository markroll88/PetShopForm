package conexion;

import javax.swing.*;

import dao.DAOClientesImpl;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.util.ArrayList;



public class ClientesFormulario extends javax.swing.JFrame {
    private JPanel table;
    private JTextField textFieldId;
    private JTextField textFieldNombre;
    private JTextField textFieldApellido;
    private JTextField textFieldMascota;
    private JTextField textFieldAlimento;
    private JTextField textFieldEdad;
    private JTextField textFieldFecha;
    private JTextField textFieldEMail;
    private JTextField textFieldTelefono;
    private JTextField textFieldUsuario;
    private JTextField textFieldClave;
    private JRadioButton radioButtonUpgrade;
    private JRadioButton radioButtonDelete;
    private JTable tblData;
    private JScrollBar scrollBar1;
    private JRadioButton radioButtonInsert;

    private JLabel Mascota;
    private JRadioButton radioButtonExit;

    private JMenuBar menuBar;
    private JMenu archivo;
    private JMenuItem salir;

    String column[] = {"Id", "Nombre", "Apellido", "Mascota", "Edad", "Alimento", "Fecha Nac", "Email", "Telefono", "Usuario", "Clave"};


    public ClientesFormulario() {
        super("ThorMillie´s PetShop");

        setContentPane(table);


       menuBar= new JMenuBar();
       archivo= new JMenu();
        salir = new JMenuItem( "Salir");

        menuBar.add(archivo);
       archivo.add(salir);

        setJMenuBar(menuBar);
        //NOSE
        initComponent();
        cargar();
        radioButtonExit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog( null,   "Bienvenidos a Thor Millie's PetShop!");

            }
        });
        radioButtonExit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                System.exit(0);
            }
        } );


                                          }



    private void initComponent() {
    }


    //NOSE


            DefaultTableModel modelo = new DefaultTableModel(column,  0);
            // DAOClientes dao = new DAOClientes() {
            DAOClientesImpl dao = new DAOClientesImpl();
            //  @Override
            //  public boolean insert(Object obj) {
            //      return false;
            //  }

            //   @Override
            //  public boolean delete(Object obj) {
            //      return false;
            //  }

            //   @Override
            //  public boolean upDate(Object obj) {
            //      return false;
            //  }

            //    @Override
            //    public ArrayList<Object[]> consultar() {
            //       return null;
            //     }
            // };

            private void cargar () {
                this.data = dao.consultar();
                modelo.setNumRows(0);
                for (Object[] dato : this.data) {
                    modelo.addRow(dato);
                }
                tblData.setModel(modelo);

            }

            //lo de ocverride no va segun este modelo de yv
            ArrayList<Object[]> data = new ArrayList<>();
            // public formClientes() {
            //   btnInsert.addMouseListener(new MouseAdapter() {
            //     @Override


    private void createUIComponents () {
        // TODO: place custom component creation code here}

        // Create a JList that displays strings from an array      String[] data = {"one", "two", "three", "four"};   JList<String> myList = new JList<String>(data);      // Create a JList that displays the superclasses of JList.class, by   // creating it with a Vector populated with this data      Vector<Class<?>> superClasses = new Vector<Class<?>>();   Class<JList> rootClass = javax.swing.JList.class;   for(Class<?> cls = rootClass; cls != null; cls = cls.getSuperclass()) {       superClasses.addElement(cls);   }   JList<Class<?>> myList = new JList<Class<?>>(superClasses)


    }
    private void initComponents() {
    }


            private void setBtnInsertMouseClicked (MouseEvent e){

                Clientes clie = new Clientes(Integer.parseInt(textFieldId.getText()), textFieldNombre.getText(), textFieldApellido.getText(), textFieldMascota.getText(),
                        (Integer.parseInt(textFieldEdad.getText())), textFieldAlimento.getText(), textFieldFecha.getText(), textFieldEMail.getText(), (Integer.parseInt(textFieldTelefono.getText())),
                        textFieldUsuario.getText(), textFieldClave.getText());

                if (dao.insert(clie)) {
                    JOptionPane.showMessageDialog(this, "Se ha insertado con Exito");
                } else {
                    JOptionPane.showMessageDialog(this, "Error al Insertar");
                }
                cargar();

            }

            private void tblDataMouseClicked (MouseEvent event){
                this.textFieldId.setText(tblData.getValueAt(tblData.getSelectedRow(),  0).toString());
                this.textFieldNombre.setText(tblData.getValueAt(tblData.getSelectedRow(), 1).toString());
                this.textFieldApellido.setText(tblData.getValueAt(tblData.getSelectedRow(), 2).toString());
                this.textFieldMascota.setText(tblData.getValueAt(tblData.getSelectedRow(), 3).toString());
                this.textFieldEdad.setText(tblData.getValueAt(tblData.getSelectedRow(), 4).toString());
                this.textFieldAlimento.setText(tblData.getValueAt(tblData.getSelectedRow(), 5).toString());
                this.textFieldFecha.setText(tblData.getValueAt(tblData.getSelectedRow(), 6).toString());
                this.textFieldEMail.setText(tblData.getValueAt(tblData.getSelectedRow(), 8).toString());
                this.textFieldTelefono.setText(tblData.getValueAt(tblData.getSelectedRow(), 7).toString());
                this.textFieldUsuario.setText(tblData.getValueAt(tblData.getSelectedRow(), 9).toString());
                this.textFieldClave.setText(tblData.getValueAt(tblData.getSelectedRow(), 10).toString());
            }

            private void setBtnUpdateMouseClicked (MouseEvent e){

                Clientes clie = new Clientes(Integer.parseInt(textFieldId.getText()), textFieldNombre.getText(), textFieldApellido.getText(), textFieldMascota.getText(),
                        (Integer.parseInt(textFieldEdad.getText())), textFieldAlimento.getText(), textFieldFecha.getText(), textFieldEMail.getText(), (Integer.parseInt(textFieldTelefono.getText())),
                        textFieldUsuario.getText(), textFieldClave.getText());

                if (dao.upDate(clie)) {
                    JOptionPane.showMessageDialog(this, "Se ha modificado con Exitoso");
                } else {
                    JOptionPane.showMessageDialog(this, "Error al Modificar");
                }
                cargar();

            }

            private void setBtnDeleteMouseClicked (MouseEvent e){

                Clientes clie = new Clientes(Integer.parseInt(textFieldId.getText()), textFieldNombre.getText(), textFieldApellido.getText(), textFieldMascota.getText(),
                        (Integer.parseInt(textFieldEdad.getText())), textFieldAlimento.getText(), textFieldFecha.getText(), textFieldEMail.getText(), (Integer.parseInt(textFieldTelefono.getText())),
                        textFieldUsuario.getText(), textFieldClave.getText());


                if (dao.delete(clie)) {
                    JOptionPane.showMessageDialog(this, "Se ha borrado con Exito");
                } else {
                    JOptionPane.showMessageDialog(this, "Error al Borrar");
                }
                cargar();

            }

        }




