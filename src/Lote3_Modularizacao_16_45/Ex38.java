package Lote3_Modularizacao_16_45;
import javax.swing.JOptionPane;
  
public class Ex38 {
   public static void main(String[] args){
      
       int n = 0;
       
       do{
          n = Integer.parseInt(JOptionPane.showInputDialog(null, "Valor:")); 
        }while(n < 0);
       
        Ex38 obj = new Ex38();
        obj.Comparação(n); 
    }
   
   public static void Comparação(int n){
       
       int menor = n;
       int maior = n;  
       
       for(int i = 1; i <= 2; i++){
           
           n = Integer.parseInt(JOptionPane.showInputDialog(null, "Valor:"));
           
           if(n < menor){
               menor = n;
            }
           if(n > maior){
               maior = n;
            }
        }
          
       System.out.println("Menor: " + menor);
       System.out.println("Maior: " + maior);
   }
}

