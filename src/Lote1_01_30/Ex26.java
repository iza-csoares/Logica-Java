package Lote1_01_30;
import javax.swing.JOptionPane;

public class Ex26 {
    public static void main(String[] args){
        
        int n1, n2;
        
        n1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Primeiro valor: "));
        n2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Segundo valor: "));
        
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
