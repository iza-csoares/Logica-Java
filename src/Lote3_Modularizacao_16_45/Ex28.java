package Lote3_Modularizacao_16_45;
import javax.swing.JOptionPane;

public class Ex28 {
    public static void main(String[] args){
        
      double valoratual = 0;
      valoratual = Double.parseDouble(JOptionPane.showInputDialog(null, "Valor: "));
     
      double mm = 0;
      mm = Double.parseDouble(JOptionPane.showInputDialog(null, "Média mensal: "));
     
       Ex28 obj = new Ex28();
       obj.Preço(valoratual, mm);
        
    }
    
    public static void Preço(double valoratual, double mm){
        
        double pn = 0, aumento = 0, diminuicao = 0;  
         
        if(mm < 500 && valoratual < 30){
            aumento = ((valoratual/100)*10);
            pn = (valoratual + aumento);
	    System.out.println("Novo preço: R$" + pn);		
        }
       
        if(mm >= 500 && mm < 1000 && valoratual >= 30 && valoratual < 80){
            aumento = ((valoratual/100)*15);
	    pn = (valoratual + aumento);	
	    System.out.println("Novo preço: R$" + pn);	
        }
       
        if(mm >= 1000 && valoratual >= 80){
    	    diminuicao = ((valoratual/100)*5);
    	    pn = (valoratual - diminuicao);
            System.out.println("Novo preço: R$" + pn);
        }	         
    }
}
