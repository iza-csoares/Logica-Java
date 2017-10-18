package Lote3_Modularizacao_16_45;
import static Lote3_Modularizacao_16_45.Ex33.Série;
import javax.swing.JOptionPane;

public class Ex34 {
   public static void main(String[] args){
      
       int n = 0;
       n = Integer.parseInt(JOptionPane.showInputDialog(null, "Número de 1 a 10: "));
        
       Ex34 obj = new Ex34();
       obj.Tabuada(n);
   } 
   
   public static void Tabuada(int n){
             
       for(int i=1;i<=10;i++){
           
	   System.out.println(n * i);  
        }
   }
}
