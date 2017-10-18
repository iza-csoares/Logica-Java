package Lote2_31_45;
import javax.swing.JOptionPane;

public class Ex38 {
   public static void main(String[] args){
       
       int n, i, maior, menor;
       
       do{
           n = Integer.parseInt(JOptionPane.showInputDialog(null, "Valor:"));
           menor = n;
           maior = n;  
        }while(n < 0);
         
       for(i = 1; i <= 2; i++){
           n = Integer.parseInt(JOptionPane.showInputDialog(null, "Valor:"));
           
           if(n < menor)
               menor = n;
           
           if(n > maior)     
               maior = n; 
        }
          
       System.out.println("Menor: " + menor);
       System.out.println("Maior: " + maior);
    }
}
