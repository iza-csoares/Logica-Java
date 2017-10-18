package Lote3_Modularizacao_16_45;
import javax.swing.JOptionPane;

public class Ex32 {
    public static void main(String[] args){
       
        int n = 0;
        n = Integer.parseInt(JOptionPane.showInputDialog(null, "Valor: "));
        JOptionPane.showMessageDialog(null, "Fatorial de " + n + ": " + Fatorial(n));  
    }
    
    public static int Fatorial(int num){
        
        int i, fat = 1;
        
        for(i=num; i > 1; i--){
	   fat = (fat * i);		
	}
        
        return fat;
    }
}