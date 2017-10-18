package Lote3_Modularizacao_16_45;
import javax.swing.JOptionPane;

public class Ex40 {   
    public static void main(String[] args){
        
        int n1, n2, i;
        
        n1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Primeiro valor: "));
        n2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Segundo valor: "));
        
        for(i = n1+1; i<n2; i++){
	       if(verifnum(i))
		    System.out.println(i);
		 
         }
    }      
    public static boolean verifnum (int num){
        int i, div = 0;
	
        for (i = 1; i <= num; i++){
            if (num % i == 0)
		div++;	
	}
	    if(div == 2)
	    return true;
	    else 
	    return false;
    }
}
