package Aleatorios;
import javax.swing.JOptionPane;

public class Fatorial2 {
    public static void main(String[] args){
        
        int n = 0;
        n = Integer.parseInt(JOptionPane.showInputDialog(null, "Valor:")); 
        JOptionPane.showMessageDialog(null, + n + "!: " + Fatorial(n));
    }
    
    public static int Fatorial(int num){
       
       int fat = 1;
        
       while(num>0){
           fat*=num; 
              num--;
       }
        
       return fat; 
    }
}
