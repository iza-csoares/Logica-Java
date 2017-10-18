package Lote1_01_30;
import javax.swing.JOptionPane;

public class Ex13 {
    public static void main(String[] args){
        
        double kg,conversao, quantidade;
        
        kg = Double.parseDouble(JOptionPane.showInputDialog(null, "Kg de alimento: "));
        
        conversao = (kg/1000);
	quantidade = (conversao/50);
        
        JOptionPane.showMessageDialog(null, "O alimento durará: " + quantidade);
    }
}
