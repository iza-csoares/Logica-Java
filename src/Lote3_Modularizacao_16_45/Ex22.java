package Lote3_Modularizacao_16_45;
import javax.swing.JOptionPane;

public class Ex22 {
    public static void main(String[] args){
        
        double n1 = 0;
        n1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Primeiro valor: "));
        
        double n2 = 0;
        n2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Segundo valor: "));
        
        Ex22 obj = new Ex22();
        obj.Crescente(n1, n2);
    }
    
    public static void Crescente(double n1, double n2){
        
        System.out.println("Valores em ordem crescente: ");
        System.out.println(Math.min(n1, n2));
        System.out.println(Math.max(n1, n2));
    }
}
