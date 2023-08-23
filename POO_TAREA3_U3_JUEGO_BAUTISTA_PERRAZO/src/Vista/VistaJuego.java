
package Vista;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Random;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;


public class VistaJuego extends JFrame {
  
    JPanel panel2;
    JPanel panel3;
    JLabel matriz[][];
    JLabel juegoInicio;
    int mat [][];
    int matAuxi [][];
    String Jugador;
    Random aleatorio;
    JPanel panelJuego;
    JLabel fonjuego;
    
  
    public VistaJuego(){//Dentro del panel habra una ventana llamada registro    
        this.setSize(700,700);
        setTitle("Memory");
        setLayout(new BorderLayout());
        setDefaultCloseOperation(EXIT_ON_CLOSE);//sirve para que se cierre el sistema       
        //setBounds(500,200,500,500);
        setLocationRelativeTo(null);//Con esta linea de codigo si o si se va a centrar la pantalla en cualquir computadora - donde uno quiera
        //Colocar un icono en el registro
        ImageIcon image = new ImageIcon("memoria.png");
        setIconImage(image.getImage());
        iniciarComponentes();        
}
    private void iniciarComponentes(){
       colocarPanel();
       colocarTexto();
       BotonJugar();  
       MatrizImagenes();
    }
     private void colocarPanel(){
        
        panel2 = new JPanel();
        panel3 = new JPanel();
        panel2.setBackground(new Color(77, 222, 200));
        panel3.setBackground(new Color(247, 181, 202));
        panel2.setPreferredSize(new Dimension(120,120));
        panel3.setPreferredSize(new Dimension(120,120));
        this.add(panel2,BorderLayout.EAST);
        this.add(panel3,BorderLayout.CENTER);
        
        //Fondo del Juego
        //Con imagn de fondo 
        fonjuego = new JLabel();
        fonjuego.setSize(700,700);
        fonjuego.setIcon(new ImageIcon("descarga.png"));
        fonjuego.setVisible(true);
        panel3.add(fonjuego);
        
        //Panel del Juego
        panelJuego = new JPanel();
        panelJuego.setSize(700,700);
        panelJuego.setLayout(null);
        panelJuego.setVisible(true);
        //Fondo del Panel del juego en donde se va a jugar
        juegoInicio = new JLabel();
        juegoInicio.setSize(700,700);
        juegoInicio.setIcon(new ImageIcon("fondoinicio.png"));
        juegoInicio.setVisible(true);
        panelJuego.add(juegoInicio);
       
        //Matriz de imagenes
        mat = new int [4][5];
        matAuxi = new int [4][5];
        aleatorio = new Random();
        this.NumerosAleatorios();
        NumerosAleatorios();
         
       
        for (int i = 0; i < 4; i++) {
        for (int j = 0; j < 5; j++) {
            System.out.print(mat[i][j] + " ");
        }
        System.out.println(""); 
    }
     }  
       public void colocarTexto(){
           
        //Esto es un Label
        JLabel label = new JLabel("Memory Game",SwingConstants.CENTER);
        //Inscrustamos
        fonjuego.add(label);
        //bloqueamos los diseños para hacer diseños propios
        panel3.setLayout(null);//anulamos el diseño del panel que viene por defecto
        label.setBounds(50, 20,350,40);//Cambia el lugar en donde esta el texto
        //Color de fondo de la etiqueta
        label.setForeground(new Color(230, 95, 120));//cOLOR DE LA LETRA REGISTRAR ESTUDIANTES
        label.setFont(new Font("Cooper Black",Font.PLAIN, 40));
         //panel.setBackground(Color.ORANGE);
        label.setOpaque(true); //Api de java - Jlabel - y ahi esta todo
         
         JLabel labelimagen1=new JLabel();
         ImageIcon imagen1 =new ImageIcon("heladito.png");
         labelimagen1.setBounds(0, 10, 100, 50);
         panel2.add(labelimagen1);
         labelimagen1.setIcon(new ImageIcon(imagen1.getImage().getScaledInstance(labelimagen1.getWidth(),labelimagen1.getHeight(), Image.SCALE_SMOOTH))); 
         
         JLabel labelimagen2=new JLabel();
         ImageIcon imagen2 =new ImageIcon("heladoazul.png");
         labelimagen2.setBounds(0, 10, 100, 50);
         panel2.add(labelimagen2);
         labelimagen2.setIcon(new ImageIcon(imagen2.getImage().getScaledInstance(labelimagen2.getWidth(),labelimagen2.getHeight(), Image.SCALE_SMOOTH)));
         
         JLabel labelimagen3=new JLabel();
         ImageIcon imagen3 =new ImageIcon("cupcake.png");
         labelimagen3.setBounds(0, 10, 100, 50);
         panel2.add(labelimagen3);
         labelimagen3.setIcon(new ImageIcon(imagen3.getImage().getScaledInstance(labelimagen3.getWidth(),labelimagen3.getHeight(), Image.SCALE_SMOOTH))); 
         
         JLabel labelimagen4=new JLabel();
         ImageIcon imagen4 =new ImageIcon("cup.png");
         labelimagen4.setBounds(0, 10, 100, 50);
         panel2.add(labelimagen4);
         labelimagen4.setIcon(new ImageIcon(imagen4.getImage().getScaledInstance(labelimagen4.getWidth(),labelimagen4.getHeight(), Image.SCALE_SMOOTH))); 
         
       }
       
       public void MatrizImagenes(){
         matriz = new JLabel[4][5];
           for (int i = 0; i<4;i++) {
               for (int j = 0; j<5;j++){
                   matriz[i][j]= new JLabel();
                   matriz [i][j].setBounds(170+(j*512),170+(i*512),512,512);
                   
                   try {
            matriz[i][j].setIcon(new ImageIcon("Iconosprogra/" + mat[i][j] + ".png"));
        } catch (Exception e) {
            System.out.println("Error al cargar la imagen: " + e.getMessage());
        }
        matriz[i][j].setVisible(true);
        panelJuego.setVisible(true);
        panelJuego.add(matriz[i][j]);
                   
               }
           }  
       }
 
       public void BotonJugar(){
            //Boton Jugar
        JButton botonJugar = new JButton(" ");
        ImageIcon imagenJugar =new ImageIcon("botonJugar.png");
         
        botonJugar.setBounds(150,100,90,86);
        panel3.add(botonJugar);
        botonJugar.setEnabled(true);
        botonJugar.setMnemonic('a');
        botonJugar.setIcon(imagenJugar);
        
        botonJugar.addMouseListener(new MouseAdapter(){
            @Override
            public void mousePressed(MouseEvent e){
              System.out.println("Boton Precionado");
              panel3.setVisible(false);
              panelJuego.setBackground(new Color(77, 222, 200));
              panel3.add(panelJuego);
              panelJuego.setVisible(true);
              
            }
        });
        
        }
       //llenar matriz con numeros aleatorios
    public  void NumerosAleatorios(){
 
    int acumulador = 0;
    for (int i = 0; i < 4; i++) {
        for (int j = 0; j < 5; j++) {
            mat[i][j] = 0;
            matAuxi[i][j]=0;      
        }
    }
    for (int i = 0; i < 4; i++) {
        for (int j = 0; j < 5; j++) {
            mat[i][j] = aleatorio.nextInt(10) + 1;
            do {
                acumulador = 0;
                for (int k = 0; k < 4; k++) {
                    for (int l = 0; l < 5; l++) {
                        if (mat[i][j] == mat[k][l]) {
                            acumulador += 1;
                        }
                    }
                }
                if (acumulador == 3) {
                    mat[i][j] = aleatorio.nextInt(10) + 1;
                }
            } while (acumulador == 3);
        }
    }  
}

}

   

       
        
  
    


       
      
       

      

