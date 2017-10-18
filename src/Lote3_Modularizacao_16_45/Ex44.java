package Lote3_Modularizacao_16_45;
import javax.swing.JOptionPane;

public class Ex44 {
    public static void main(String[] args){
        
        int base, exp;

        base = Integer.parseInt(JOptionPane.showInputDialog(null, "Base: "));
        exp = Integer.parseInt(JOptionPane.showInputDialog(null, "Expoente: "));
        
        JOptionPane.showMessageDialog(null, "Potência: " + Potência(base, exp));  
    }
    
    public static int Potência(int base, int exp){
        
        return (int) (Math.pow(base, exp));  
    }
}
