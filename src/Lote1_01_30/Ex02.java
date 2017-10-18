package Lote1_01_30;
import javax.swing.JOptionPane;

public class Ex02 {
    public static void main(String[] args){
        
        double salario, salariof, aumento;
       	
	salario = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o valor do lado:"));
	
	aumento = (salario/100)*15;
        salariof = (aumento + salario);
	
        JOptionPane.showMessageDialog(null, "O valor do novo salario é: " + salariof);  
    }
}
