package Lote3_Modularizacao_16_45;
import javax.swing.JOptionPane;

public class Ex42 {
    public static void main(String[] args){
        
        double n1 = 1, n2 = 1; 
        
        JOptionPane.showMessageDialog(null, "Total: " + Série(n1, n2));
    }
    
    public static double Série(double num1, double num2){
        double div, soma = 0;
        
        for(int i = 1; i < 3; i++){
			
           num1 += 1;		  
           num2 += 2;
			
           div = (num1/num2);
           soma += div;	
	}
        return soma;
    }
}
