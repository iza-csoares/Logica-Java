package Lote1_01_30;
import javax.swing.JOptionPane;

public class Ex07 {
    public static void main(String[] args){
        
        double c, l, a;
        
        c = Double.parseDouble(JOptionPane.showInputDialog(null, "Comprimento: "));
        l = Double.parseDouble(JOptionPane.showInputDialog(null, "Largura: "));
        a = Double.parseDouble(JOptionPane.showInputDialog(null, "Altura: "));
        
        JOptionPane.showMessageDialog(null, "O volume do paralelepípedo é: " + (c*l*a)); 
    }
}
