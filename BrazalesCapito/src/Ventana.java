import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ventana {
    private JPanel Principal;
    private JTabbedPane tabbedPane1;
    private JTextArea txtImpresionInfo;
    private JButton btnActualizar;
    private JTextField txtFieldID;
    private JTextField txtFieldNombre;
    private JComboBox cboGenero;
    private JComboBox cboDeporte;
    private JTextField txtFieldRendimiento;
    private JTextField txtFieldEdad;
    private JButton btnAnadir;
    private JComboBox cboDeportePagBusqueda;
    private JButton btnBuscar;
    private JTextArea textArea1;

    Lista auxlista=new Lista();

    public Ventana() {
        txtImpresionInfo.setText(auxlista.listaelementos());
        btnAnadir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int numero= auxlista.definirID();
                txtFieldID.setText(Integer.toString(numero));
                String nombre=txtFieldNombre.getText();
                String genero=cboGenero.getSelectedItem().toString();
                String deporte=cboDeporte.getSelectedItem().toString();
                int rendimiento=Integer.parseInt(txtFieldRendimiento.getText());
                int edad=Integer.parseInt(txtFieldEdad.getText());
                if(edad<0){
                    JOptionPane.showMessageDialog(null,"Edad incorrecta");
                    return;
                }
                Jugadores a=new Jugadores(numero,nombre,genero,deporte,rendimiento,edad);
                JOptionPane.showMessageDialog(null,"Se añadio nuevo jugador");
                auxlista.agregarelementos(a);

            }
        });
        btnActualizar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtImpresionInfo.setText("");
                txtImpresionInfo.setText(auxlista.listaelementos());
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Ventana");
        frame.setContentPane(new Ventana().Principal);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
