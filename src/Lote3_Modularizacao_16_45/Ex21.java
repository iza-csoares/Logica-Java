package Lote3_Modularizacao_16_45;
import javax.swing.JOptionPane;

public class Ex21 {
    public static void main(String[] args){
        
        double n1 = 0;
        n1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Primeira nota: "));
        
        double n2 = 0;
        n2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Segunda nota: "));
        
        double n3 = 0;
        n3 = Double.parseDouble(JOptionPane.showInputDialog(null, "Terceira nota: "));
        
        double n4 = 0;
        n4 = Double.parseDouble(JOptionPane.showInputDialog(null, "Quarta nota: "));
       
        Ex21 obj = new Ex21();
	obj.Media(n1, n2, n3, n4); 
    }
    
    public static void Media(double n1, double n2, double n3, double n4){
        double media = 0;
        
        media = ((n1 + n2 + n3 + n4)/4);
        
        if(media >= 6.0)
    	System.out.println("Aprovado");
	
        if(media >= 3.0 && media < 6.0)
    	System.out.println("Exame");
	
	if(media < 3.0)
        System.out.println("Retido");  
    }
}

