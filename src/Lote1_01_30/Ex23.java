package Lote1_01_30;
import javax.swing.JOptionPane;

public class Ex23 {
    public static void main(String[] args){
        
        int n1, n2, n3, n4;
        
        n1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Primeiro valor: "));
        n2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Segundo valor: "));
        n3 = Integer.parseInt(JOptionPane.showInputDialog(null, "Terceiro valor: "));
        n4 = Integer.parseInt(JOptionPane.showInputDialog(null, "Quarto valor: "));
        
        if(n4 < n1 && n4 < n2 && n4 < n3){
    	 System.out.println("Ordem: " + n4 + n1 + n2 + n3);
	}
        
	if(n4 > n1 && n4 < n2 && n4 < n3){
    	 System.out.println("Ordem: " + n1 + n4 + n2 + n3);
	}
        
	if(n4 < n3 && n4 > n1 && n4 > n2){
         System.out.println("Ordem: " + n1 + n2 + n4 + n3);
	}
        
	if(n1 > n2 && n1 < n3 && n1 < n4){
    	 System.out.println("Ordem: " + n2 + n1 + n3 + n4);
	}
        
	if(n1 > n4 && n1 > n3 && n1 > n2){
    	 System.out.println("Ordem: " + n2 + n3 + n4 + n1);
	}
        
	if(n1 > n3 && n1 > n2 && n1 < n4){
    	 System.out.println("Ordem: " + n2 + n3 + n1 + n4);
	}
    }  
}
