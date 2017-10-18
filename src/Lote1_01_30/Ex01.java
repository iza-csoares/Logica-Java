package Lote1_01_30;
import javax.swing.JOptionPane;

public class Ex01 {
    public static void main (String[] args){
        
        double l;
	
	l = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o valor do lado:"));

   JOptionPane.showMessageDialog(null, "A área é: " + (l*l));
        
    }
    
}