package Lote3_Modularizacao_16_45;
import static Lote3_Modularizacao_16_45.Ex36.Série;
import javax.swing.JOptionPane;

public class Ex41 {
    public static void main(String[] args){
        
        int n = 0;
        
        do{
            n = Integer.parseInt(JOptionPane.showInputDialog(null, "Valor dado: "));
        }while((n < 1) || (n > 6));  
        JOptionPane.showMessageDialog(null, "Dado: " + Dado(n));
    }
    
    public static int Dado(int num){
        
        int dado2, result = 7;
        
        dado2 = (result - num);
         
        return dado2;
    }
}
