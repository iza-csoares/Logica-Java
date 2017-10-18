package Aleatorios;
import javax.swing.JOptionPane;

public class Fatorial1 {
    public static void main(String[] args){
        
        int n = 0;
        n = Integer.parseInt(JOptionPane.showInputDialog(null, "Valor:")); 
        JOptionPane.showMessageDialog(null, + n + "!: " + Fatorial(n));
    }
    
    public static int Fatorial(int num){
        
        int i, fat = 1;
	
	for(i=num; i > 1; i--){
		fat *= i;		
	}
	return fat;  
    }
}
