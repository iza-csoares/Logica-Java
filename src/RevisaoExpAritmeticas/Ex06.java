package RevisaoExpAritmeticas;
import javax.swing.JOptionPane;


public class Ex06 {
    public static void main(String[] args){
        
      double larguraparede = Double.parseDouble(JOptionPane.showInputDialog("Largura da parede: "));    
      double largurazulejo = Double.parseDouble(JOptionPane.showInputDialog("Largura do azulejo: "));
    
      larguraparede *= larguraparede;
      largurazulejo *= largurazulejo;
    
      JOptionPane.showMessageDialog(null, "Quantidade de azulejos: " + (larguraparede/largurazulejo));
    }
}
