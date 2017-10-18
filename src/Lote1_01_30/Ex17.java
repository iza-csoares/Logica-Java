package Lote1_01_30;
import javax.swing.JOptionPane;
//BigDecimal

public class Ex17 {
    public static void main(String[] args){
        
        double t, vm, dp, lit;
        
        t = Double.parseDouble(JOptionPane.showInputDialog(null, "Tempo gasto: "));
        vm = Double.parseDouble(JOptionPane.showInputDialog(null, "Velocidade média: "));
        
        dp=(t*vm);
        lit=(dp/12);
        
        JOptionPane.showMessageDialog(null, "Litros de combustível utilizados: " + lit);
    }      
}
