package Lote2_31_45;
import javax.swing.JOptionPane;

public class Ex33 {
    public static void main(String[] args){
        
        int n = 0;
        double i, conta, soma = 0;
        
        n = Integer.parseInt(JOptionPane.showInputDialog(null, "Valor: "));
        
       for(i = 1; i <= n; i++){
	   conta = (1/i);
	   soma = (soma + conta);
        }
       JOptionPane.showMessageDialog(null, "Total" + soma);
    }
}
