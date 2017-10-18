package Recursiva;
import javax.swing.JOptionPane;

public class Ex44 {
    public static void main(String[] args){
        
        int base = 0, exp = 0;
        
        do{
            base = Integer.parseInt(JOptionPane.showInputDialog(null, "Base:")); 
        }while(base <= 1);
            exp = Integer.parseInt(JOptionPane.showInputDialog(null, "Expoente:"));
       
            JOptionPane.showMessageDialog(null, "Potência: " + Potência(base, exp));  
    }
    
    public static int Potência(int base, int exp){
        
       if (exp == 0){
           
          return 1;
        }else{
           
           return base * Potência(base, exp - 1);
       }
    }
}


/*                   
      2 * 2 Potencia(3)  
                             = 4   
           4 * 2 Potencia(2)
                                 = 8
               8 * 1 Potencia(1)                
*/
