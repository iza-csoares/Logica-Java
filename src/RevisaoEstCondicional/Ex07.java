package RevisaoEstCondicional;
import javax.swing.JOptionPane;

public class Ex07 {
   public static void main(String[] args){
       
       double n1 = Double.parseDouble(JOptionPane.showInputDialog("Valor 1: "));
       double n2 = Double.parseDouble(JOptionPane.showInputDialog("Valor 2: "));
       double n3 = Double.parseDouble(JOptionPane.showInputDialog("Valor 3: "));
       double n4 = Double.parseDouble(JOptionPane.showInputDialog("Valor 4: "));
       
       if(n1 == n2){
         JOptionPane.showMessageDialog(null, "Há números repetidos!");
       }else if(n1 == n3){
         JOptionPane.showMessageDialog(null, "Há números repetidos!"); 
       }else if(n1 == n4){
         JOptionPane.showMessageDialog(null, "Há números repetidos!");   
       }else if(n2 == n3){
         JOptionPane.showMessageDialog(null, "Há números repetidos!"); 
       }else if(n2 == n4){
         JOptionPane.showMessageDialog(null, "Há números repetidos!");   
       }else if(n3 == n4){
         JOptionPane.showMessageDialog(null, "Há números repetidos!"); 
       }
   }
}
