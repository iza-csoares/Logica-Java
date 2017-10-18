package Lote1_01_30;
import javax.swing.JOptionPane;

public class Ex05 {
    public static void main(String[] args){
        
       int a, b, c, delta;
       double x1 = 0, x2 = 0, x = 0;
       
       a = Integer.parseInt(JOptionPane.showInputDialog(null, "Primeiro termo: "));
       b = Integer.parseInt(JOptionPane.showInputDialog(null, "Segundo termo: "));
       c = Integer.parseInt(JOptionPane.showInputDialog(null, "Terceiro termo: "));
       
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
