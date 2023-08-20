/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LogicaJuego;
import Vista.VistaJuego;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JOptionPane;


public class JuegoMemoryGame {
     /*private List<MemoryGame> match = new ArrayList<>();
    private List<MemoryGame> ok = new ArrayList<>();

    //METODO DONDE SE CARGAR NUMEROS RAMDON EN FILA
    public static List<Integer> rowsTable() {
        List<Integer> list = new ArrayList<>();
        Random r = new Random();
       while (list.size() < 4) {
        int value = r.nextInt(5) + 1; // Genera valores de 1 a 5
        if (!list.contains(value)) {
            list.add(value);
        }
    }
    return list;
    }
     //METODO PARA INGRESAR LAS DOS FILAS
    public static List<Integer> rowsTableAll() {
        List<Integer> all = new ArrayList<>();
        all.addAll(rowsTable());
        all.addAll(rowsTable());
        all.addAll(rowsTable());
        all.addAll(rowsTable());
        
        return all;
    }
    //METODO PARA PINTAR LAS IMAGENES
    public void paintImage(JButton boton, int value) {
        try {
            boton.setIcon(new ImageIcon(getClass().getResource("/ilustraciones/0" + value + ".png")));
            boton.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            boton.setVerticalAlignment(javax.swing.SwingConstants.CENTER);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    //METODO QUE INICIALIZA LAS IMAGENES EN ?
    public void imgStart() {
       
        paintImage(VistaJuego.boton,17);
        paintImage(VistaJuego.boton1, 17);
        paintImage(VistaJuego.boton2, 17);
        paintImage(VistaJuego.boton3, 17);
        paintImage(VistaJuego.boton4, 17);
        paintImage(VistaJuego.boton5, 17);
        paintImage(VistaJuego.boton6, 17);
        paintImage(VistaJuego.boton7, 17);
        paintImage(VistaJuego.boton8, 17);
        paintImage(VistaJuego.boton9, 17);
        paintImage(VistaJuego.boton10, 17);
        paintImage(VistaJuego.boton11, 17);
        paintImage(VistaJuego.boton12, 17);
        paintImage(VistaJuego.boton13, 17);
        paintImage(VistaJuego.boton14, 17);
        paintImage(VistaJuego.boton15, 17);
        paintImage(VistaJuego.boton16, 17);
        
        
    }    
    //METODO PARA CUANDO LOS DOS VALORES SEAN IGUALES 
    public void paintMatch() {
        System.out.println(getMatch().size());
        if (getMatch().size() == 1) {
            paintImage(getMatch().get(0).getBtn(), getMatch().get(0).getValueMatch());
        } else if(getMatch().size() == 2) {
            paintImage(getMatch().get(1).getBtn(), getMatch().get(1).getValueMatch());
        }

    }
    
    //METODO DONDE LAS IMAGENES YA HICIERON MATCH
    public void imgStartMatch() {
        if (ok.size() == 16) {
            JOptionPane.showMessageDialog(null, "Win Player");

            for (int i = 0; i < ok.size(); i++) {
                paintImage(ok.get(i).getBtn(), ok.get(i).getValueMatch());
                ok.get(i).getBtn().setEnabled(true);
            }
            ok.clear();
            imgStart();
        }
        for (int i = 0; i < ok.size(); i++) {
            System.out.println(ok.get(i).getNumberBtn() + "_" + ok.get(i).getValueMatch());
            paintImage(ok.get(i).getBtn(), ok.get(i).getValueMatch());
            ok.get(i).getBtn().setEnabled(false);
        }
    }

    //METODO QUE CONTROLA LA EJECUCION
    public void reset() {
        imgStart();
        imgStartMatch();
    }

    //METODO DE MATCH
    public void match() {
        if (getMatch().size() == 2) {
            if (getMatch().get(0).getNumberBtn() != 0 && getMatch().get(1).getNumberBtn() != 0) {

                if (getMatch().get(0).getValueMatch() == getMatch().get(1).getValueMatch()) {
                    ok.add(getMatch().get(0));
                    ok.add(getMatch().get(1));
                    getMatch().clear();
                    reset();
                } else {                    
                    Runnable mx = new Runnable() {
                        @Override
                        public void run() {
                            getMatch().clear();
                            reset();
                        }
                    };
                    setTimeout(mx, 2000);
                }
            }
        }
    }

    public void setTimeout(Runnable runnable, int delay) {
        new Thread(() -> {
            try {
                Thread.sleep(delay);
                runnable.run();
            } catch (Exception e) {
                System.err.println(e);
            }
        }).start();
    }

    public List<MemoryGame> getMatch() {
        return match;
    }

    public void setMatch(List<MemoryGame> match) {
        this.match = match;
    }*/

}


