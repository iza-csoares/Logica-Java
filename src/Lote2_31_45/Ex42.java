package Lote2_31_45;
import javax.swing.JOptionPane;

public class Ex42 {
    public static void main(String[] args){
        
        double n1 = 1, n2 = 1, div, soma = 0;
        int i;
        
        for(i = 1; i < 3; i++){
			
           n1 = (n1 + 1);		  
           n2 = (n2 + 2);
			
           div = (n1/n2);
           soma = (soma + div);
	}
        JOptionPane.showMessageDialog(null, "Total: " + soma);
    }
}
