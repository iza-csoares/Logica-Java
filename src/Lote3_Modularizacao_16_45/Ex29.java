package Lote3_Modularizacao_16_45;

import javax.swing.JOptionPane;

public class Ex29 {
   public static void main(String[] args){
     
       int codigo = 0;
       codigo = Integer.parseInt(JOptionPane.showInputDialog(null, "\n1 - Poupanca \n2 - Renda fixa"));
      
       double valor = 0;
       valor = Double.parseDouble(JOptionPane.showInputDialog(null, "Valor: "));
       
       Ex29 obj = new Ex29();
       obj.Banco(codigo, valor);
    } 
   
    public static void Banco(int codigo, double valor){
        
        double pfinal, rfinal, aumento = 0;
        
        if(codigo==1){
           aumento = ((valor/100)*3);
	   pfinal = (valor + aumento);
	   System.out.println("O valor da poupança após 30 dias será R$: " + pfinal);
        }
        
        if(codigo==2){
	   aumento = ((valor/100)*5);
	   rfinal = (valor + aumento);
	   System.out.println("O valor da renda fixa após 30 dias será R$: " + rfinal);
        }
    }
}
