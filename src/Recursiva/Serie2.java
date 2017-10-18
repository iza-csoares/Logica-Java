package Recursiva;
import javax.swing.JOptionPane;

public class Serie2 {
   public static void main(String[] args){
       
       double n = 0, s = 1;
     //  do{
           n = Double.parseDouble(JOptionPane.showInputDialog(null, "Valor: "));
     //  }while((n <= 10) && (n >= 20));
 
       JOptionPane.showMessageDialog(null, "Série: " + Serie(n,s));
    }
   
    public static double Serie(double num, double soma){
       
        if(num == 1){
            return soma;
        }else{ 
            return soma/num + Serie(num-1, soma+1);  
        }
    }
}

