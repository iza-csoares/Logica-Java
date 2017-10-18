package RevisaoExpAritmeticas;
import javax.swing.JOptionPane;

public class Ex03 {
    public static void main(String[] args){
    
      int n1 = Integer.parseInt(JOptionPane.showInputDialog("Primeiro valor:"));   
      int n2 = Integer.parseInt(JOptionPane.showInputDialog("Primeiro valor:")); 
        
      JOptionPane.showMessageDialog(null, "Multiplicação dos valores: " + (n1*n2));   
    
    }
}
