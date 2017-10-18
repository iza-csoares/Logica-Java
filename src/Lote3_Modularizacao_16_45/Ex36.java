package Lote3_Modularizacao_16_45;
import javax.swing.JOptionPane;

public class Ex36 {
    public static void main(String[] args){
        
       int n1 = 0;
       n1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Valor: "));
       JOptionPane.showMessageDialog(null, "Série: " + Série(n1));
    }
    
    public static double Série(int num){
        
        int fat = 1, n, i, y;
        double conta, fatorial, soma = 0;
        
        for(i=1;i<=num;i++){
     
           n = i;
          
           for(y=n; y > 1; y--){
		fat *= y;		
	    }
           
           fatorial = fat;
           conta = (1/fatorial);
           soma += conta;
        }
       soma += 1;
       
       return soma;
    }
}
