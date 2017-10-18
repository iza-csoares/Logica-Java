package Lote2_31_45;
import javax.swing.JOptionPane;

public class Ex37 {
    public static void main(String[] args){
        
        int i, n, a = 0, b = 1, aux = 0;
        
        n = Integer.parseInt(JOptionPane.showInputDialog(null, "Número:"));
        
        for(i=1;i<=n;i++){
            aux = a + b;
	    a = b;
            b = aux;
		
	   System.out.println(aux);	
	}  
    }
}