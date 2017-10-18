package Lote2_31_45;
import javax.swing.JOptionPane;

public class Ex34 {
   public static void main(String[] args){
      
       int n = 0, i;
       
       n = Integer.parseInt(JOptionPane.showInputDialog(null, "Número de 1 a 10: "));
       
       for(i=1;i<=10;i++){
           
	   System.out.println(n *i); 
       }	
   } 
}
