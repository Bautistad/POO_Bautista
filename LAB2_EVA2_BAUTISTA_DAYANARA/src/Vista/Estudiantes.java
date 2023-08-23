
package Vista;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;
import javax.swing.table.DefaultTableModel;

public class Estudiantes extends JFrame {
    
    public JPanel panel;
    public Estudiantes(){//Dentro del panel habra una ventana llamada registro
        this.setSize(600,700);
        setTitle("ESTUDIANTES");
        
        setDefaultCloseOperation(EXIT_ON_CLOSE);//sirve para que se cierre el sistema       
        //setBounds(500,200,500,500);
        setLocationRelativeTo(null);//Con esta linea de codigo si o si se va a centrar la pantalla en cualquir computadora - donde uno quiera
        iniciarComponentes(); 
        //Colocar un icono en el registro
        ImageIcon image = new ImageIcon("transparente.png");
        setIconImage(image.getImage());
    
}
    private void iniciarComponentes(){
        colocarPanel();
        colocarEtiquetas();
        ColocarCajaTexto();
        ColocarComboBox();
        ColocarBotones();
        JButton();
        Tabla();
    }
    private void colocarPanel(){
        panel = new JPanel();
        //lE DAMOS UN COLOR AL PANEL 
        panel.setBackground(new Color(123,50,250));//Color lila o solo podria utilizar Color.green
        //Poner el panel sobre la ventana registro
        this.getContentPane().add(panel);//add. agregro panel 
        
    }
     //Metodo en donde se crean etiquetas
    public void colocarEtiquetas(){
        //Esto es un Label
        JLabel label = new JLabel("REGISTRAR ESTUDIANTES",SwingConstants.CENTER);
        //Inscrustamos
        panel.add(label);
        //bloqueamos los diseños para hacer diseños propios
        panel.setLayout(null);//anulamos el diseño del panel que viene por defecto
        label.setBounds(125, 20,280,40);//Cambia el lugar en donde esta el texto
        //Color de fondo de la etiqueta
        label.setForeground(Color.black);//cOLOR DE LA LETRA REGISTRAR ESTUDIANTES
        label.setFont(new Font("Source Serif Pro Semibold",Font.PLAIN, 20));
         //panel.setBackground(Color.ORANGE);
         label.setOpaque(true); //Api de java - Jlabel - y ahi esta todo
         //PONER IMAGEN
         JLabel labelimagen=new JLabel();
         ImageIcon imagen =new ImageIcon("regis.jpg");
         labelimagen.setBounds(18, 20, 100, 50);
         panel.add(labelimagen);
         labelimagen.setIcon(new ImageIcon(imagen.getImage().getScaledInstance(labelimagen.getWidth(),labelimagen.getHeight(), Image.SCALE_SMOOTH))); 
         //Creamos Objeto
         JLabel labell = new JLabel();
         labell.setText("CODIGO");
         //AGREGAMOS LA ETIQUETA AL PANEL
         panel.add(labell);
         //Ubicamos la etiqueta
         labell.setHorizontalAlignment(SwingConstants.LEFT);
         //Cambiar la Fuente
         labell.setForeground(Color.WHITE);
         labell.setFont(new Font("Source Serif Pro Semibold",Font.PLAIN, 15));
         labell.setBounds(30, 90,350,50);
         //Agregar cedula Estudiante
         JLabel label3 = new JLabel();
         label3.setText("CEDULA");
         panel.add(label3);
         label3.setHorizontalAlignment(SwingConstants.LEFT);
         //Cambiar la Fuente
         label3.setForeground(Color.WHITE);
         label3.setFont(new Font("Source Serif Pro Semibold",Font.PLAIN, 15));
         label3.setBounds(30, 130,350,50);
         JLabel label4 = new JLabel();
         label4.setText("APELLIDO");
         panel.add(label4);
         label4.setHorizontalAlignment(SwingConstants.LEFT);
         //Cambiar la Fuente
         label4.setForeground(Color.WHITE);
         label4.setFont(new Font("Source Serif Pro Semibold",Font.PLAIN, 15));
         label4.setBounds(30, 170,350,50);
         JLabel label5 = new JLabel();
         label5.setText("NOMBRE");
         panel.add(label5);
         label5.setHorizontalAlignment(SwingConstants.LEFT);
         //Cambiar la Fuente
         label5.setForeground(Color.WHITE);
         label5.setFont(new Font("Source Serif Pro Semibold",Font.PLAIN, 15));
         label5.setBounds(30, 210,350,50);
         
         JLabel label6 = new JLabel();
         label6.setText("EMAIL");
         panel.add(label6);
         label6.setHorizontalAlignment(SwingConstants.LEFT);
         //Cambiar la Fuente
         label6.setForeground(Color.WHITE);
         label6.setFont(new Font("Source Serif Pro Semibold",Font.PLAIN, 15));
         label6.setBounds(30, 250,350,50);
         
         JLabel label7 = new JLabel();
         label7.setText("TELEFONO");
         panel.add(label7);
         label7.setHorizontalAlignment(SwingConstants.LEFT);
         //Cambiar la Fuente
         label7.setForeground(Color.WHITE);
         label7.setFont(new Font("Source Serif Pro Semibold",Font.PLAIN, 15));
         label7.setBounds(30, 290,350,50);
         
         JLabel label8 = new JLabel();
         label8.setText("DIRECCION");
         panel.add(label8);
         label8.setHorizontalAlignment(SwingConstants.LEFT);
         //Cambiar la Fuente
         label8.setForeground(Color.WHITE);
         label8.setFont(new Font("Source Serif Pro Semibold",Font.PLAIN, 15));
         label8.setBounds(30, 340,350,50);
         
         JLabel label9 = new JLabel();
         label9.setText("MATERIA");
         panel.add(label9);
         label9.setHorizontalAlignment(SwingConstants.LEFT);
         //Cambiar la Fuente
         label9.setForeground(Color.WHITE);
         label9.setFont(new Font("Source Serif Pro Semibold",Font.PLAIN, 15));
         label9.setBounds(30, 380,350,50);
         
         JLabel label10 = new JLabel();
         label10.setText("ESTADO");
         panel.add(label10);
         label10.setHorizontalAlignment(SwingConstants.LEFT);
         //Cambiar la Fuente
         label10.setForeground(Color.WHITE);
         label10.setFont(new Font("Source Serif Pro Semibold",Font.PLAIN, 15));
         label10.setBounds(30, 430,350,50);
         
    }
    public void ColocarCajaTexto(){
    JTextField cajaTexto1 = new JTextField();
    cajaTexto1.setBounds(120,100,200,30);
    panel.add(cajaTexto1);
    cajaTexto1.setText(" ");
    System.out.println("El texto de la caja es: "+cajaTexto1.getText());
    JTextField cajaTexto2 = new JTextField();
    cajaTexto2.setBounds(120,139,200,30);
    panel.add(cajaTexto2);
    cajaTexto2.setText(" ");
    System.out.println("El texto de la caja es: "+cajaTexto2.getText());
    JTextField cajaTexto3 = new JTextField();
    cajaTexto3.setBounds(120,179,200,30);
    panel.add(cajaTexto3);
    cajaTexto3.setText(" ");
    System.out.println("El texto de la caja es: "+cajaTexto3.getText());
    JTextField cajaTexto4 = new JTextField();
    cajaTexto4.setBounds(120,219,200,30);
    panel.add(cajaTexto4);
    cajaTexto4.setText(" ");
    System.out.println("El texto de la caja es: "+cajaTexto4.getText());
     JTextField cajaTexto5 = new JTextField();
    cajaTexto5.setBounds(120,259,200,30);
    panel.add(cajaTexto5);
    cajaTexto5.setText(" ");
    System.out.println("El texto de la caja es: "+cajaTexto5.getText());
    JTextField cajaTexto6 = new JTextField();
    cajaTexto6.setBounds(120,299,200,30);
    panel.add(cajaTexto6);
    cajaTexto6.setText(" ");
    System.out.println("El texto de la caja es: "+cajaTexto6.getText());
    JTextField cajaTexto7 = new JTextField();
    cajaTexto7.setBounds(120,349,200,30);
    panel.add(cajaTexto7);
    cajaTexto7.setText(" ");
    System.out.println("El texto de la caja es: "+cajaTexto7.getText());
    }
     public void ColocarComboBox(){
         String [] materias = {"Calculo","POO","Computacion Digital","EDO","Fisica"};
         JComboBox combo = new JComboBox(materias);
         combo.setBounds(120,389,150,30);
         panel.add(combo);
     }
     public void ColocarBotones(){
        JButton boton = new JButton("GUARDAR");
        boton.setBounds(400,110,110,30);
        panel.add(boton);
        boton.setEnabled(true);
        boton.setMnemonic('a');
        /*JButton boton1 = new JButton("imagen");
        ImageIcon imagen1 =new ImageIcon("guardar.jfif");
        boton1.setBounds(150,310,100,50);
        panel.add(boton1);
        boton1.setEnabled(true);
        boton1.setMnemonic('b');
        boton1.setIcon(new ImageIcon(imagen1.getImage().getScaledInstance(boton1.getWidth(),boton1.getHeight(), Image.SCALE_SMOOTH)));*/
       JButton boton1 = new JButton("ELIMINAR");
       boton1.setBounds(400,170,110,30);
       panel.add(boton1);
       boton1.setEnabled(true);
       boton1.setMnemonic('b'); 
       
       JButton boton2 = new JButton("NUEVO");
       boton2.setBounds(400,230,110,30);
       panel.add(boton2);
       boton2.setEnabled(true);
       boton2.setMnemonic('C'); 
       
       JButton boton3 = new JButton("ACTUALIZAR");
       boton3.setBounds(400,300,110,30);
       panel.add(boton3);
       boton3.setEnabled(true);
       boton3.setMnemonic('d');  
}
     public void JButton(){
         JRadioButton button = new JRadioButton("Activo");
         button.setBounds(120,445,80,30);
          panel.add(button);

         JRadioButton button1 = new JRadioButton("Inactivo");
         button1.setBounds(200,445,80,30);
         panel.add(button1);
          
     }
     public void Tabla(){
        String [] cabecera = {"Codigo", "Cedula", "Apellido", "Nombre", "Email","Tlf","Direccion", "Materia","Estado"};
        String [] datos = {};
        JTable Tabla_Estudiantes = new JTable();
        Tabla_Estudiantes.setBounds(450, 37, 500, 340);
        panel.add(Tabla_Estudiantes);
         
         
         
     }
                   
}

