package Lote3_Modularizacao_16_45;
import javax.swing.JOptionPane;

public class Ex37 {
    public static void main(String[] args){
        
        
        int n = 0;
        n = Integer.parseInt(JOptionPane.showInputDialog(null, "Número:"));
        
       Ex37 obj = new Ex37();
       obj.Fibonacci(n);
    }
    
    public static void Fibonacci(int n){
        
        int i, a = 0, b = 1, aux = 0;
        
        for(i=1;i<=n;i++){
            aux = a + b;
	    a = b;
            b = aux;
		
	   System.out.println(aux);	
	} 
    }
}
