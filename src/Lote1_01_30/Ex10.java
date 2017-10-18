package Lote1_01_30;
import javax.swing.JOptionPane;

public class Ex10 {
    public static void main(String[] args){
        
        int n1, n2;
        
        n1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Primeiro valor: "));
        n2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Segundo valor:"));
        
        JOptionPane.showMessageDialog(null, "Diferença: " + (n1 - n2));
    }
}
