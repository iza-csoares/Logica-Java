package Lote3_Modularizacao_16_45;
import javax.swing.JOptionPane;

public class Ex26 {
    public static void main(String[] args){
        
        int n1 = 0;
        n1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Primeiro valor: "));
        
        int n2 = 0;
        n2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Segundo valor: "));
        
        Ex26 obj = new Ex26();
        obj.Divisível(n1, n2);
        
    }
    
    public static void Divisível(int n1, int n2){
        
        if(n1>n2){
           if (n1%n2==0){
		System.out.println("O maior valor e divisível pelo menor.");
		System.out.println("Maior: " + n1);
		System.out.println("Menor: " + n2);
           }
        }		
	if(n2>n1){
           if (n2%n1==0){
		System.out.println("O maior valor e divisível pelo menor.");
		System.out.println("Maior: " + n2);
		System.out.println("Menor: " + n1);
           }
        }
        
	if(n2%n1!=0 && n1%n2!=0){
	    System.out.println("O maior valor não e divisível pelo menor.");
        }         
    }
}

