package Lote3_Modularizacao_16_45;
import javax.swing.JOptionPane;

public class Ex20 {
    public static void main(String[] args){
        
       int a = 0;
       a = Integer.parseInt(JOptionPane.showInputDialog(null, "Primeiro termo: "));
       
       int b = 0;
       b = Integer.parseInt(JOptionPane.showInputDialog(null, "Segundo termo: "));
       
       int c = 0;
       c = Integer.parseInt(JOptionPane.showInputDialog(null, "Terceiro termo: "));
       
       Ex20 obj = new Ex20();
       obj.Bhaskara(a, b, c);
    }
    
    public static void Bhaskara(int a, int b, int c){
        
       int delta;
       double x1 = 0, x2 = 0, x = 0;
        
       delta = ((b * b) - 4 * a * c);
       
       if(delta == 0){
     
	  x = (- b/(2*a));    
          System.out.println("Raiz: " + x);
        }
       
       if(delta < 0){
     
	  x = delta;
          System.out.println("O resultado do delta é negativo: " + x);
        }
       if(delta > 0){
     
          x1 = ((- b + Math.sqrt(delta))/2*a);
          x2 = ((- b - Math.sqrt(delta))/2*a);    
     
          System.out.println("X1: " + x1);
          System.out.println("X2: " + x2);
        }
    }
}
