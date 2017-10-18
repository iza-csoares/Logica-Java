package Lote1_01_30;
import javax.swing.JOptionPane;

public class Ex22 {
    public static void main(String[] args){
        
        double n1, n2;
        
        n1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Primeiro valor: "));
        n2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Segundo valor: "));
        
        System.out.println("Valores em ordem crescente: ");
        System.out.println(Math.min(n1, n2));
        System.out.println(Math.max(n1, n2));
    }
}
