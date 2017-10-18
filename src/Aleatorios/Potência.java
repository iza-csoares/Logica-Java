package Aleatorios;
import javax.swing.JOptionPane;

public class Potência {
    public static void main(String[] args){
        
        int base = 0, exp = 0;
        
        do{
            base = Integer.parseInt(JOptionPane.showInputDialog(null, "Base:")); 
        }while(base <= 1);
            exp = Integer.parseInt(JOptionPane.showInputDialog(null, "Expoente:"));
       
            JOptionPane.showMessageDialog(null, "Potência: " + Potência(base, exp));  
    }
    
    public static int Potência(int base, int exp){
        
        int i, aux;
        
        aux = base;
        base = 1;
        
        for(i=1; i <= exp; i++){
	       base = base * aux;
        }
        
        if(exp == 0)
           return 1;
           else
           return base;
    }
}
