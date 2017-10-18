package RevisaoExpAritmeticas;

import javax.swing.JOptionPane;

public class Ex07 {
    public static void main(String[] args){
        
       double raiobase = Double.parseDouble(JOptionPane.showInputDialog("Raio da base: "));    
       double alturacilindro = Double.parseDouble(JOptionPane.showInputDialog("Altura cilindro: "));
       
       JOptionPane.showMessageDialog(null, "Volume do cilindro: " + ((alturacilindro*3.14)*(Math.pow(raiobase,2))));
    }
}
