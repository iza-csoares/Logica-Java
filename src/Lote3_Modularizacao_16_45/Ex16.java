package Lote3_Modularizacao_16_45;
import javax.swing.JOptionPane;

public class Ex16 {
    public static void main(String[] args){
                        
        double ht = 0;
	ht = Double.parseDouble(JOptionPane.showInputDialog(null, "Horas trabalhadas: "));

        double vht = 0;
	vht = Double.parseDouble(JOptionPane.showInputDialog(null, "Valor horas trabalhadas: "));

        double pd = 0;
	pd = Double.parseDouble(JOptionPane.showInputDialog(null, "Percentual de desconto: "));

        int desc = 0;
	desc = Integer.parseInt(JOptionPane.showInputDialog(null, "Descendentes: ")); 
          
	SalarioLiquido(ht, vht, pd, desc);  
    }
        
    public static void SalarioLiquido (double ht, double vht, double pd, double desc){
        double salariob = 0, salariol = 0, td = 0;
      
        salariob = (ht * vht);
	td = ((pd/100)*salariob);
	salariol = (salariob - td);  
        
        if(desc == 0){
            System.out.println("Salário líquido é: " + salariol);
        }
        
	if(desc > 0){
	   salariol = (salariol + (desc * 100));
	   System.out.println("Salário líquido é: " + salariol);
        }
    }
}
