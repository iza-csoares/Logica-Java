package Lote1_01_30;
import javax.swing.JOptionPane;

public class Ex18 {
    public static void main(String[] args){
        
      double n1, n2;
      
      n1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Primeiro valor: "));
      n2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Segundo valor: "));
      
       if(n1>n2)
          System.out.println("Diferença do maior pelo menor é: " + (n1 - n2));
         
          else
            System.out.println("Diferença do maior pelo menor é: " + (n2 - n1));     
                  
       if(n1==n2) 
            System.out.println("Os números são iguais!");
        
    }
}
