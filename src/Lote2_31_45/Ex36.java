package Lote2_31_45;
import javax.swing.JOptionPane;

public class Ex36 {
    public static void main(String[] args){
        
       int n1 = 0, fat = 1, n;
       double i, conta, fatorial, soma = 0;
       
       n1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Valor: "));
       
       for(i=1;i<=n1;i++){
     
           n = (int) i;
          
           while(n>0){
              fat*=n; 
              n--;
           }
          
           fatorial = fat;
           conta = (1/fatorial);
           soma = (soma + conta);
        }
      
        JOptionPane.showMessageDialog(null, "Soma total: " + (soma + 1));
    }
}
