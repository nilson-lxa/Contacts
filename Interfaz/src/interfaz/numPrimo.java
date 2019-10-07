
package interfaz;
import javax.swing.*;
import java.awt.event.*;
public class numPrimo extends JFrame implements ActionListener{
    
    private JLabel lblcantidad;
    private JTextField txtcantidad;
    private JButton btnAceptar;
    private JTextArea txtResultado;
    private Primo p1 = new Primo();
    public numPrimo(){
        this.setLayout(null);
        
        lblcantidad = new JLabel("Cantidad de numeros: ");
        lblcantidad.setBounds(20, 20, 150, 25);
        this.add(lblcantidad);
        
        txtcantidad = new JTextField();
        txtcantidad.setBounds(200, 20, 100, 25);
        this.add(txtcantidad);
        
        btnAceptar = new JButton("Aceptar");
        btnAceptar.setBounds(75, 75, 150, 50);
        this.add(btnAceptar);
        btnAceptar.addActionListener(this);
        
        txtResultado = new JTextArea();
        txtResultado.setBounds(10, 150, 300, 200);
        this.add(txtResultado);
           
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == btnAceptar){
            int cantElementos = Integer.parseInt(txtcantidad.getText());
            String cad = p1.seriePrimos(cantElementos);
            txtResultado.setText(cad);
        }


    }
    
    public static void main(String[] args) {
        numPrimo p1 = new numPrimo();
        p1.setBounds(0, 0, 325 , 425);
        p1.setVisible(true);
        p1.setResizable(false);
        p1.setLocationRelativeTo(null);
        
    }
    
}
