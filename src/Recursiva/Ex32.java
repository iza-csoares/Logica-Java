package Recursiva;
import javax.swing.JOptionPane;

public class Ex32 {
    public static void main(String[] args){
       
        int n = 0;
        n = Integer.parseInt(JOptionPane.showInputDialog(null, "Valor: "));
        JOptionPane.showMessageDialog(null, + n + "! = " + Fatorial(n));  
    }
    
    public static int Fatorial(int n){
        
        if(n == 1 || n == 0){
            return 1;
        }else{
            return n * Fatorial(n - 1);
        }
    }
}


/*                   (24) * 5 = 120
      5 * Fatorial(4)  
                          (6) * 4 = 24
           4 * Fatorial(3)
                              (2) * 3 = 6  
               3 * Fatorial(2)
                                  1 * 2 = 2
                   2 * Fatorial(1)
*/

