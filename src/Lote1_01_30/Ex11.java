package Lote1_01_30;
import javax.swing.JOptionPane;

public class Ex11 {
    public static void main(String[] args){
        
        double r, c;
        
        r = Double.parseDouble(JOptionPane.showInputDialog(null, "Raio: "));
        
        c = (6.28 * r);
        
        JOptionPane.showMessageDialog(null, "Circunferência: " + c);
    }
}
