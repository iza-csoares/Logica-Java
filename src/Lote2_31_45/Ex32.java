package Lote2_31_45;
import javax.swing.JOptionPane;

public class Ex32 {
    public static void main(String[] args){
        
        int i, fat = 1, n;
        
        n = Integer.parseInt(JOptionPane.showInputDialog(null, "Valor: "));
        
        for(i=n; i > 1; i--){
	   fat = (fat * i);		
	}
        
        JOptionPane.showMessageDialog(null, + n + "! = " + fat);
    }
}
