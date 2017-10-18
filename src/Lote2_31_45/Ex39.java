package Lote2_31_45;
import javax.swing.JOptionPane;

public class Ex39 {
    
    public static void main(String[] args){
        
        int n1 = 1, i;
        double n2 = 1;
        
        for(i = 1; i < 64; i++){
            n1 = (n1 + 1);
            n2 = (n2 * 2);
         
            System.out.println(n1 + "/" + n2);   
        }
    }
}