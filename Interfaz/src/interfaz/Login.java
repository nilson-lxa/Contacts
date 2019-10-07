
package interfaz;
import javax.swing.*;
import java.awt.event.*;

public class Login extends JFrame implements ActionListener{
    
    private JLabel lblUsuario, lblContraseña;
    private JButton btnIngresar, btnSalir;
    private JTextField txtUsuario;
    private JPasswordField pswContraseña;
    
    public Login(){
        this.setLayout(null);
        
        lblUsuario = new JLabel("Usuario: ");
        lblUsuario.setBounds(20, 20 , 150, 25);
        this.add(lblUsuario);
        
        lblContraseña = new JLabel("Contraseña: ");
        lblContraseña.setBounds(20, 60 , 150, 25);
        this.add(lblContraseña);
        
        txtUsuario = new JTextField();
        txtUsuario.setBounds(130, 20, 200, 25);
        this.add(txtUsuario);
        
        pswContraseña = new JPasswordField();
        pswContraseña.setBounds(130, 60, 200, 25);
        this.add(pswContraseña);
        
        btnIngresar = new JButton("Ingresar");
        btnIngresar.setBounds(50, 110, 100, 40);
        this.add(btnIngresar);
        btnIngresar.addActionListener(this);
        
        btnSalir = new JButton("Salir");
        btnSalir.setBounds(200, 110, 100, 40);
        this.add(btnSalir);
        btnSalir.addActionListener(this);
               
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
     if(e.getSource() == btnIngresar){
         char[] arrayC = pswContraseña.getPassword();
         String pass = new String(arrayC);
            if("nilson123".equals(pass)){
                JOptionPane.showMessageDialog(null, "Bienvenido "+ txtUsuario.getText());
            }
            else 
             JOptionPane.showMessageDialog(null, "Contraseña Incorrecta.");
     }
     if(e.getSource() == btnSalir){
             System.exit(0);
     }
    }  
    public static void main(String[] args) {
        Login l1 = new Login();
        l1.setBounds(0, 0, 350, 200);
        l1.setVisible(true);
        l1.setResizable(false);
        l1.setLocationRelativeTo(null);
        
    }

}
