package RevisaoEstCondicional;
import javax.swing.JOptionPane;

public class Ex09 {
   public static void main(String args[]){
	
       int n1 = Integer.parseInt(JOptionPane.showInputDialog("Valor 1: "));
       int n2 = Integer.parseInt(JOptionPane.showInputDialog("Valor 2: "));
       int n3 = Integer.parseInt(JOptionPane.showInputDialog("Valor 3: "));
     
       if(n2==(n1-1) & n3==(n2-1)){
            JOptionPane.showMessageDialog(null, "Os números são consecutivos e estão em ordem decrescente!");
        }else{
           JOptionPane.showMessageDialog(null, "Os números não são consecutivos!");
       }     
    }
}
