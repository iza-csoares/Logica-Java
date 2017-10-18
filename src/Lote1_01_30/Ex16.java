package Lote1_01_30;
import javax.swing.JOptionPane;

public class Ex16 {
    public static void main(String[] args){
        
        double ht, vht, pd, salariol = 0, salariob, td;
        int desc;
        
        ht = Double.parseDouble(JOptionPane.showInputDialog(null, "Horas trabalhadas: "));
        vht = Double.parseDouble(JOptionPane.showInputDialog(null, "Valor horas trabalhadas: "));
        pd = Double.parseDouble(JOptionPane.showInputDialog(null, "Percentual de desconto: "));
        desc = Integer.parseInt(JOptionPane.showInputDialog(null, "Descendentes: "));
         
        salariob = (ht * vht);
	td = ((pd/100)*salariob);
	salariol = (salariob - td);  
        
        if(desc == 0){
            System.out.println("Salario liquido é: " + salariol);
        }
        
	if(desc > 0){
	   salariol = (salariol + (desc * 100));
	   System.out.println("Salário liquido é: " + salariol);
        }
    } 
}