package Lote3_Modularizacao_16_45;
import javax.swing.JOptionPane;

public class Ex19 {
    public static void main(String[] args){
        
        double n1 = 0;
        n1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Primeiro valor: "));
        
        double n2 = 0;
        n2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Segundo valor: "));
        
        JOptionPane.showMessageDialog(null, "Maior: " + Maior(n1, n2));
    }
    
    public static double Maior(double n1, double n2){
        
         return Math.max(n1, n2);
    }
}
