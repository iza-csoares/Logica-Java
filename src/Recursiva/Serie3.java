package Recursiva;
import javax.swing.JOptionPane;

public class Serie3 {
   public static void main(String[] args){
       
       int n1 = 0;
     //  do{
           n1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Valor: "));
     //  }while((n <= 10) && (n >= 20));
     
       JOptionPane.showMessageDialog(null, "Série: " + Serie(n1, 1));
    }
   
    public static int Serie(int num1, int num2){
       
       if(num1 == num2){
           return Fat(num2);
       }else{
          
           return Fat(num2) + Serie(num1, num2+1);
       }
    }
   
    public static int Fat(int num1){
        
        if(num1 == 1){
            return 1;
            
        }else{
            return num1 * Fat(num1 - 1);                      
        }    
    }
}

