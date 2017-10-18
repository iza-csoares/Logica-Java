package Lote1_01_30;
import javax.swing.JOptionPane;

public class Ex28 {
    public static void main(String[] args){
        
    double valoratual, mm, pn = 0, aumento = 0, diminuicao = 0;   
        
     valoratual = Double.parseDouble(JOptionPane.showInputDialog(null, "Valor: "));
     mm = Double.parseDouble(JOptionPane.showInputDialog(null, "Média mensal: "));
     
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
