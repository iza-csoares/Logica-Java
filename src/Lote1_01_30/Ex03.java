package Lote1_01_30;
import javax.swing.JOptionPane;

public class Ex03 {
    public static void main(String[] args){
        
       double b, h;
       
       b = Double.parseDouble(JOptionPane.showInputDialog(null, "Base:"));
       h = Double.parseDouble(JOptionPane.showInputDialog(null, "Altura:"));
       
       JOptionPane.showMessageDialog(null, "Área do triângulo é: " + (b*h));
    }
}
