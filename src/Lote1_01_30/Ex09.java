package Lote1_01_30;
import javax.swing.JOptionPane;

public class Ex09 {
    public static void main(String[] args){
        
        int n1, n2, soma;
        
        n1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Primeiro valor:"));
        n2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Segundo valor: "));
        
        soma = ((n1 * n1) + (n2 * n2));
        
        JOptionPane.showMessageDialog(null, "Soma dos quadrados dos valores: " + soma);          
    }
}
