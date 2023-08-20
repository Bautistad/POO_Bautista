
package Vista;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;


public class VistaJuego extends JFrame{
  
    JPanel panel2;
    JPanel panel3;
    JLabel[][] matriz;
    int[][]mat;
    String Jugador;
    Random Aleatorio;
    
    //List<Integer> next = u.rowsTableAll();
  
    public VistaJuego(){//Dentro del panel habra una ventana llamada registro
              mat = new int [4][5];

        this.setSize(700,700);
        setTitle("Memory");
        setLayout(new BorderLayout());
        setDefaultCloseOperation(EXIT_ON_CLOSE);//sirve para que se cierre el sistema       
        //setBounds(500,200,500,500);
        setLocationRelativeTo(null);//Con esta linea de codigo si o si se va a centrar la pantalla en cualquir computadora - donde uno quiera
        //Colocar un icono en el registro
        ImageIcon image = new ImageIcon("memoria.png");
        setIconImage(image.getImage());
        setResizable(false);
               iniciarComponentes(); 

        
}
    private void iniciarComponentes(){
       colocarPanel();
       colocarTexto();
       colocarBotones();
       BotonJugar();
       NumerosAleatorios();
       
      
       
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
        

        //Matriz Logica
        Aleatorio = new Random();
        //this.NumerosAleatorios();
        
        
 
     }  
       public void colocarTexto(){
           
        //Esto es un Label
        JLabel label = new JLabel("Memory Game",SwingConstants.CENTER);
        //Inscrustamos
        panel3.add(label);
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
       public void colocarBotones(){
       JButton boton = new JButton("");
        boton.setBounds(20,110,100,120);
        panel3.add(boton);
        boton.setEnabled(true);
        boton.setMnemonic('a');
        
 
        JButton boton1 = new JButton("");
        boton1.setBounds(125,110,100,120);
        panel3.add(boton1);
        boton1.setEnabled(true);
        boton1.setMnemonic('a'); 
        
        JButton boton2 = new JButton("");
        boton2.setBounds(230,110,100,120);
        panel3.add(boton2);
        boton2.setEnabled(true);
        boton2.setMnemonic('a');
        
       
           
        JButton boton3 = new JButton("");
        boton3.setBounds(335,110,100,120);
        panel3.add(boton3);
        boton3.setEnabled(true);
        boton3.setMnemonic('a'); 
    
        JButton boton4 = new JButton("");
        boton4.setBounds(20,237,100,120);
        panel3.add(boton4);
        boton4.setEnabled(true);
        boton4.setMnemonic('a');  
       
     
        JButton boton5 = new JButton("");
        boton5.setBounds(125,237,100,120);
        panel3.add(boton5);
        boton5.setEnabled(true);
        boton5.setMnemonic('a');  
         
     
        JButton boton6 = new JButton("");
        boton6.setBounds(230,237,100,120);
        panel3.add(boton6);
        boton6.setEnabled(true);
        boton6.setMnemonic('a');
  
        JButton boton7 = new JButton("");
        boton7.setBounds(335,237,100,120);
        panel3.add(boton7);
        boton7.setEnabled(true);
        boton7.setMnemonic('a'); 
  
        JButton boton8 = new JButton("");
        boton8.setBounds(20,364,100,120);
        panel3.add(boton8);
        boton8.setEnabled(true);
        boton8.setMnemonic('a'); 
        
     
        JButton boton9 = new JButton("");
        boton9.setBounds(125,364,100,120);
        panel3.add(boton9);
        boton9.setEnabled(true);
        boton9.setMnemonic('a');
       
       
        JButton boton10 = new JButton("");
        boton10.setBounds(230,364,100,120);
        panel3.add(boton10);
        boton10.setEnabled(true);
        boton10.setMnemonic('a');
        
         
        JButton boton11 = new JButton("");
        boton11.setBounds(335,364,100,120);
        panel3.add(boton11);
        boton11.setEnabled(true);
        boton11.setMnemonic('a');
        
        JButton boton12 = new JButton("");
        boton12.setBounds(20,491,100,120);
        panel3.add(boton12);
        boton12.setEnabled(true);
        boton12.setMnemonic('a');
         
        
        JButton boton13 = new JButton("");
        boton13.setBounds(125,491,100,120);
        panel3.add(boton13);
        boton13.setEnabled(true);
        boton13.setMnemonic('a');
         
         
        JButton boton14 = new JButton("");
        boton14.setBounds(230,491,100,120);
        panel3.add(boton14);
        boton14.setEnabled(true);
        boton14.setMnemonic('a');
        
        JButton boton15 = new JButton("");
        boton15.setBounds(335,491,100,120);
        panel3.add(boton15);
        boton15.setEnabled(true);
        boton15.setMnemonic('a');
         
        
        JButton boton16 = new JButton("");
        boton16.setBounds(440,110,100,120);
        panel3.add(boton16);
        boton16.setEnabled(true);
        boton16.setMnemonic('a');
        

        JButton boton17 = new JButton("");
        boton17.setBounds(440,237,100,120);
        panel3.add(boton17);
        boton17.setEnabled(true);
        boton17.setMnemonic('a');
   
        JButton boton18 = new JButton("");
        boton18.setBounds(440,364,100,120);
        panel3.add(boton18);
        boton18.setEnabled(true);
        boton18.setMnemonic('a');
    
        JButton boton19 = new JButton("");
        boton19.setBounds(440,491,100,120);
        panel3.add(boton19);
        boton19.setEnabled(true);
        boton19.setMnemonic('a'); 
        
        //Boton Jugar
        
        }  
       public void BotonJugar(){
            //Boton Jugar
        JButton botonJugar = new JButton(" ");
        ImageIcon imagenJugar =new ImageIcon("botonJugar.png");
         
        botonJugar.setBounds(50,50,50,50);
        panel2.add(botonJugar);
        botonJugar.setEnabled(true);
        botonJugar.setMnemonic('a');
        botonJugar.setIcon(imagenJugar);
        botonJugar.addMouseListener(new MouseAdapter(){
            @Override
            public void mousePressed(MouseEvent e){
              System.out.println("Boton Precionado");
            }
        });
        
        } 
       //llenar matriz con numeros aleatorios
       public  void NumerosAleatorios(){
    int numRows = matriz.length; // Obtener la cantidad de filas
    int numCols = matriz[0].length; // Obtener la cantidad de columnas
    
    int acumulador = 0;
    
    for (int i = 0; i < numRows; i++) {
        for (int j = 0; j < numCols; j++) {
            mat[i][j] = 0;
        }
    }
    
    for (int i = 0; i < numRows; i++) {
        for (int j = 0; j < numCols; j++) {
            mat[i][j] = Aleatorio.nextInt(10) + 1;
            do {
                acumulador = 0;
                for (int k = 0; k < numRows; k++) {
                    for (int l = 0; l < numCols; l++) {
                        if (mat[i][j] == mat[k][l]) {
                            acumulador += 1;
                        }
                    }
                }
                if (acumulador == 3) {
                    mat[i][j] = Aleatorio.nextInt(10) + 1;
                }
            } while (acumulador == 3);
        }
    }
    
    // Resto del código para mostrar la matriz en consola
    for (int i = 0; i < numRows; i++) {
        for (int j = 0; j < numCols; j++) {
            System.out.print(mat[i][j] + "%2d");
        }
        System.out.println("");
    }
}
  
       
       }

   

       
        
  
    


       
      
       

      

