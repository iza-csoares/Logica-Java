package Lote3_Modularizacao_16_45;
import javax.swing.JOptionPane;

public class Ex23 {
    public static void main(String[] args){
        
        int n1 = 0;        
        n1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Primeiro valor: "));
        
        int n2 = 0; 
        n2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Segundo valor: "));
        
        int n3 = 0;
        n3 = Integer.parseInt(JOptionPane.showInputDialog(null, "Terceiro valor: "));
        
        int n4 = 0;
        n4 = Integer.parseInt(JOptionPane.showInputDialog(null, "Quarto valor: "));
        
        Ex23 obj = new Ex23();
        obj.Ordem(n1, n2, n3, n4);
    }  
    
    public static void Ordem(int n1, int n2, int n3, int n4){
        
        if(n1 > n2 & n1 < n3){
    	System.out.println("Ordem: " +  n2 + n1 + n3 + n4);
        }
	
        if(n1 > n3 & n1 < n4){
    	System.out.println("Ordem: " + n2 + n3 + n1 + n4);
        }
	
        if(n4 > n2 & n4 < n3){
    	System.out.println("Ordem: " + n1 + n2 + n4 + n3);
        }
        
        if(n4 < n1 & n3 > n4){
    	System.out.println("Ordem: " + n4 + n3 + n1 + n2);
        }
    }
}
