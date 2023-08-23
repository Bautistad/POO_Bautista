
package lab2_saulaaldo;

import Vista.Registro;
import vista.Horario;
import vista.Profesor;


public class Lab2_SaulaAldo {


    public static void main(String[] args) {
        Registro registro = new Registro();
        registro.setVisible(true);
        
        Profesor profesor = new Profesor();
        profesor.setVisible(true);
        
        Horario horario = new Horario();
        horario.setVisible(true);
    }
    
}
