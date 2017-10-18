package RevisaoExpAritmeticas;

import javax.swing.JOptionPane;

public class Ex05 {
    public static void main(String[] args){
        
      double raio = Double.parseDouble(JOptionPane.showInputDialog("Raio da circunferência: "));
      
      JOptionPane.showMessageDialog(null, "Área: " + ((3.14) * (Math.pow(raio, 2))));
      JOptionPane.showMessageDialog(null, "Perímetro: " + (2*3.14*raio));
    }
}
