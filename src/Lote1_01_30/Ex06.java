package Lote1_01_30;
import javax.swing.JOptionPane;

public class Ex06 {
  public static void main (String[] args){
      
      double n1, n2, aux;
      
      n1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Primeiro valor: "));
      n2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Segundo valor:"));
      
      aux = n2;
      n2 = n1;
      n1 = aux;
      
      JOptionPane.showMessageDialog(null, "Valor atual do primeiro número é: " + n1);
      JOptionPane.showMessageDialog(null, "Valor atual do segundo número é: " + n2); 
    }  
}
