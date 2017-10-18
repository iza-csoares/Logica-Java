package Lote1_01_30;
import javax.swing.JOptionPane;

public class Ex08 {
    public static void main(String[] args){
        
        double deposito, aumento, mes;
        
        deposito = Double.parseDouble(JOptionPane.showInputDialog(null, "Valor a ser depositado: "));
        
        aumento = (deposito/100)*1.3;
	mes = (aumento + deposito);
        
        JOptionPane.showMessageDialog(null, "Após um mês de aplicação o valor será:" + mes);    
    }
}
