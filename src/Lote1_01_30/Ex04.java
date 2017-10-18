package Lote1_01_30;
import javax.swing.JOptionPane;

public class Ex04 {
    public static void main(String[] args){
        
        double c;
        
        c = Double.parseDouble(JOptionPane.showInputDialog(null, "Temperatura em graus centigrados: "));
        
        JOptionPane.showMessageDialog(null, "Temperatura convertida em fahrenheit: " + ((9*c+160)/5));
    }
}
