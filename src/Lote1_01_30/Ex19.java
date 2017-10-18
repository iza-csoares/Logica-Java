package Lote1_01_30;
import javax.swing.JOptionPane;

public class Ex19 {
    public static void main(String[] args){
        
        double n1, n2;
        
        n1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Primeiro valor: "));
        n2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Segundo valor: "));
        
        System.out.println("O maior valor é: " + Math.max(n1, n2));  
    }
}
