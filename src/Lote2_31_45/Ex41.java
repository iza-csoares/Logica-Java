package Lote2_31_45;
import javax.swing.JOptionPane;

public class Ex41 {
    public static void main(String[] args){
        
        int dado1, dado2, result = 7;
        
        do{
            dado1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Valor dado: "));
        }while((dado1 < 1) || (dado1 > 6));  
        
        dado2 = (result - dado1);
         
        JOptionPane.showMessageDialog(null, "Segundo dado: " + dado2);
    }
}
