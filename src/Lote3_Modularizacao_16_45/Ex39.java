package Lote3_Modularizacao_16_45;
import javax.swing.JOptionPane;

public class Ex39 {
    
    public static void main(String[] args){
        
        int n1 = 1;
        double n2 = 1;
        
       Ex39 obj = new Ex39();
       obj.Peças(n1, n2);   
    }
    
    public static void Peças(int n1, double n2){
       
        for(int i = 1; i < 64; i++){
            n1 += 1;
            n2 *= 2;
         
            System.out.println(n1 + "/" + n2);   
        }
    }
}
