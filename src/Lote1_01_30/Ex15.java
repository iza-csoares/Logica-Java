package Lote1_01_30;
import javax.swing.JOptionPane;

public class Ex15 {
    public static void main(String[] args){
        
        double c1, c2, calculo;
        
        c1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Cateto 1: "));
        c2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Cateto 2: "));
        
        calculo = ((c1 * c1) + (c2 * c2));
       
        JOptionPane.showMessageDialog(null, "Hipotenusa: " + Math.sqrt(calculo));
    }
}