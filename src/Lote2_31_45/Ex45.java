package Lote2_31_45;
import javax.swing.JOptionPane;

public class Ex45 {
   public static void main(String[] args){
       
       int n1 = 0;
       double n2 = 0, i = 0, div = 0, conta = 0, total = 0;
       
       for(i=0;i<4;i++){
           
           n1 = (n1 + 1);
           n2 = n1 * n1;
           div = (n1 / n2);
  
           if(n1%2 == 0){
  	      total = (total - div);
            }
           else 
              total = (total + div);
        }
     
       JOptionPane.showMessageDialog(null, "Total: " + total);  
   } 
}
