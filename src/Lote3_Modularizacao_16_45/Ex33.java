package Lote3_Modularizacao_16_45;
import javax.swing.JOptionPane;

public class Ex33 {
    public static void main(String[] args){
        
        int n = 0;
        n = Integer.parseInt(JOptionPane.showInputDialog(null, "Valor: "));
        JOptionPane.showMessageDialog(null, "Série: " + Série(n)); 
        
    }
    
    public static double Série(int num){
        
        double i, conta, soma = 0;
        
        for(i = 1; i <= num; i++){
	   conta = (1/i);
	   soma = (soma + conta);
        }
        return soma;
    }
}
