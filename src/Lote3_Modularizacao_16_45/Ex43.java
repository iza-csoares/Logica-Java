package Lote3_Modularizacao_16_45;
import javax.swing.JOptionPane;

public class Ex43 {
   public static void main(String[] args){
       
       double ana = 110, maria = 150;
       
       System.out.println(+ Anos(ana, maria) + " anos");
   } 
   
   public static int Anos(double ana, double maria){
       
       int ano = 0;
       
       while(ana <= maria){
        maria += 2;
        ana += 3;
        ano += 1;
       }  
      return ano;
    }
}