package Lote3_Modularizacao_16_45;
import javax.swing.JOptionPane;

public class Ex31 {
    public static void main(String[] args){
       
       int quad = 0, i = 0;
       
       Ex31 obj = new Ex31();
       obj.Quadrado(quad, i);
           
    }
    
    public static void Quadrado(int quad, int i){
               
        for(i = 10; i<=150; i++){
            quad = i;
	    quad = (quad * quad); 
       
            System.out.println(quad);
        }
    }
}
