package Lote3_Modularizacao_16_45;
import javax.swing.JOptionPane;

public class Ex45 {
   public static void main(String[] args){
       
       double n1 = 0, n2 = 0;
       
       JOptionPane.showMessageDialog(null, "Total: " + Série(n1, n2));
   } 
   
   public static double Série(double num1, double num2){
       
       double i = 0, div = 0, total = 0;
       
       for(i=0;i<4;i++){
           
           num1 += 1;
           num2 = num1 * num1;
           div = (num1 / num2);
  
           if(num1%2 == 0){
  	      total = (total - div);
            }
           else 
              total = (total + div);
        }
     
       return total;
   }
}
