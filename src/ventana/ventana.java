
package ventana;


import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class ventana extends JFrame{

   
    public  JPanel panel;
            
    public ventana(){
        this.setSize(500, 500);// establecemos el tamaño de la ventana
             setTitle("Menu del juego");
             setLocation(100, 200);//establecemos la posicion de la ventana
             setBounds(100, 200, 500, 500);
             setLocationRelativeTo(null);//establecemos la ventana en el centro
             setResizable(false);
             this.getContentPane().setBackground(Color.red);
             
             setDefaultCloseOperation(EXIT_ON_CLOSE);
   
             iniciarcomponentes();
             colocarEtiquetas();
             colocarbotones();
}
private void iniciarcomponentes(){
   
    panel= new JPanel();//creacion de un panel
      
    panel.setBackground(Color.orange);// establecemos el color del panel
    panel.setLayout(null);//desactivando el diseño
    this.getContentPane().add(panel);//agrgamos el panel a la ventana
    
    
   
   
           
    }

    private void colocarEtiquetas(){
        JLabel etiqueta = new JLabel(); //creamos una etiqueta
    etiqueta.setText("        nombre del juego      ");//ESTABLECEMOS EL TEXTO EN LA ETIQUETA
    etiqueta.setBounds(10, 10, 450, 50);
    etiqueta.setForeground(Color.YELLOW);//establecemos el color de la letra
    etiqueta.setOpaque(true);//establecemos pintar el fondo de la etiqueta
    etiqueta.setBackground(Color.RED);// establecemos el color de la etiqueta
    etiqueta.setFont(new Font("chiller",Font.PLAIN,50));
    panel.add(etiqueta);//agragamos la etiqueta al panel
           
    }
    private void colocarbotones(){
        //BOTON 1
        JButton boton1 = new JButton("nuevo juego");
        boton1.setBounds(100, 100, 300, 100);
        boton1.setForeground(Color.BLUE);
        boton1.setFont(new Font("chiller", Font.PLAIN,30 ));
        panel.add(boton1);
        
        //BOTON 2
        
        JButton boton2 = new JButton("creditos");
        boton2.setBounds(100, 200, 300, 100);
        boton2.setForeground(Color.BLUE);
        boton2.setFont(new Font("chiller", Font.PLAIN,30 ));
        panel.add(boton2);
        
        //boton 3
         JButton boton3 = new JButton("salir");
        boton3.setBounds(100, 300, 300, 100);
        boton3.setForeground(Color.BLUE);
        boton3.setFont(new Font("chiller", Font.PLAIN,30 ));
        panel.add(boton3);
        
    }
    }

