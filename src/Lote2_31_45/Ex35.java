package Lote2_31_45;
import javax.swing.JOptionPane;

public class Ex35 {
   public static void main(String[] args){
       
       int i, n1, n2, inicio = 0, fim = 0, somaimpar = 0;
       
       n1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Primeiro valor: "));
       n2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Segundo valor: "));
       
       if(n1>n2){
           inicio = n2;
           fim = n1;
           System.out.println("Maior valor: " + n1);
       }
           
       if(n2>n1){    
           inicio = n1;
           fim = n2;
           System.out.println("Maior valor: " + n2);
        }
       
       for(i = inicio+1; i < fim; i++){
	   if(i%2 == 1)
	     somaimpar+=i; 
       }
       
       System.out.println("Soma dos ímpares: " + somaimpar);
   } 
}
