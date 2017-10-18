package Lote2_31_45;
import static java.lang.Math.pow;
import javax.swing.JOptionPane;

public class Ex44 {
    public static void main(String[] args){
        
        int base, exp;

        base = Integer.parseInt(JOptionPane.showInputDialog(null, "Base: "));
        exp = Integer.parseInt(JOptionPane.showInputDialog(null, "Expoente: "));
        
        JOptionPane.showMessageDialog(null, "Resultado: " + pow(base, exp));    
    }
}
