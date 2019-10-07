
package interfaz;
import javax.swing.*;
import java.awt.event.*;

public class Formulario extends JFrame implements ActionListener{//Deriva los metodos y atributos de JFrame
    
    private JLabel lbl1;
    private JLabel lbl2;
    private JButton btn1;
    
    public Formulario(){//Se realiza el diseño de los componentes de la interfaz
        setLayout(null);//Indica al programa que haremos uso de coordenadas(solo observe la operacion).
        
        lbl1 = new JLabel("Interfaz Gráfica");
        lbl1.setBounds(10, 20, 300, 30);
        this.add(lbl1);
        
        lbl2 = new JLabel("Versión 1.0");
        lbl2.setBounds(10, 100, 100, 30);
        this.add(lbl2);
        
        btn1 = new JButton("Cerrar");
        btn1.setBounds(300, 250, 100, 30);
        this.add(btn1);
        btn1.addActionListener(this);
   
    }
   
    public void actionPerformed(ActionEvent e){
        if(e.getSource() == btn1){//GetSource=recupera el evento guardado en memoria.
            System.exit(0);
        }
    }
    
    public static void main(String[] args) {
        Formulario f1= new Formulario();//Inicializando la interfaz
        f1.setBounds(0, 0, 450 , 350);//El tamaño de ancho y largo de la interfaz
        f1.setVisible(true);//Para que la ventana sea visible
        f1.setLocationRelativeTo(null);//Hace que la ventana aparesca al centro de la pantalla.
        f1.setResizable(false);//El usuario no puede modificar el tamaño de la interfaz.
        
    }
}
