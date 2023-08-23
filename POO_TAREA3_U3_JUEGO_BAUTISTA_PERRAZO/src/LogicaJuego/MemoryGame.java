
package LogicaJuego;

import javax.swing.JButton;


public class MemoryGame {
    //Atributos 
    private int numBoton;
    private JButton btn;
    private int valueMatch;
    
    public MemoryGame() {
    }
     public MemoryGame(int numBoton, JButton btn, int valueMatch) {
        this.numBoton = numBoton;
        this.btn = btn;
        this.valueMatch = valueMatch;
    }

    public int getNumberBtn() {
        return numBoton;
    }

    public void setNumberBtn(int numBoton) {
        this.numBoton = numBoton;
    }

    public JButton getBtn() {
        return btn;
    }

    public void setBtn(JButton btn) {
        this.btn = btn;
    }

    public int getValueMatch() {
        return valueMatch;
    }

    public void setValueMatch(int valueMatch) {
        this.valueMatch = valueMatch;
    }

    @Override
    public String toString() {
        return "Match{" + "numberBtn=" + numBoton + ", btn=" + btn + ", valueMatch=" + valueMatch + '}';
    }
    
}

    

