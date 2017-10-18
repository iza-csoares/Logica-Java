package Lote2_31_45;
import javax.swing.JOptionPane;

public class Ex43 {
   public static void main(String[] args){
       
       double ana = 110, maria = 150;
       int ano = 0;
       
       while(ana <= maria){
        maria = (maria + 2);
        ana = (ana + 3);
        ano = (ano + 1);
       }
       
       System.out.println("\n" + ano); 
   } 
}
