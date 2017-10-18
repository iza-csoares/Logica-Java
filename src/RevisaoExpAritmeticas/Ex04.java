package RevisaoExpAritmeticas;
import javax.swing.JOptionPane;

public class Ex04 {
    public static void main(String[] args){
    
      double largura = Double.parseDouble(JOptionPane.showInputDialog("Largura: "));
      double altura = Double.parseDouble(JOptionPane.showInputDialog("Altura: "));   
    
      JOptionPane.showMessageDialog(null, "Área do retângulo: " + (largura*altura));
      JOptionPane.showMessageDialog(null, "Perímetro do retângulo: " + ((largura*2)+(altura*2)));
    }
}
