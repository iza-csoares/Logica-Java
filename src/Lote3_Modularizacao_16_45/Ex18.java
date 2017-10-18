package Lote3_Modularizacao_16_45;
import javax.swing.JOptionPane;

public class Ex18 {
    public static void main(String[] args){
        
        double n1 = 0; 
        n1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Primeiro valor: "));
        
        double n2 = 0;
        n2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Segundo valor: "));
        
        Ex18 obj = new Ex18();
	obj.Diferenca(n1, n2);  
    }
    
    public static void Diferenca(double n1, double n2){
                
        if(n1>n2){
           System.out.println("Diferença do maior pelo menor é: " + (n1 - n2));
        }
        
        if(n2>n1){
           System.out.println("Diferença do maior pelo menor é: " + (n2 - n1));     
        }
    
        if(n1==n2){ 
           System.out.println("Os números são iguais!");
        }
    }
}
