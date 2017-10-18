package Lote1_01_30;
import javax.swing.JOptionPane;

public class Ex21 {
    public static void main(String[] args){
        
        double n1, n2, n3, n4, media;
        
        n1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Primeira nota: "));
        n2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Segunda nota: "));
        n3 = Double.parseDouble(JOptionPane.showInputDialog(null, "Terceira nota: "));
        n4 = Double.parseDouble(JOptionPane.showInputDialog(null, "Quarta nota: "));
        
        media = ((n1 + n2 + n3 + n4)/4);
        
        if(media >= 6.0)
    	System.out.println("Aprovado");
	
        if(media >= 3.0 && media < 6.0)
    	System.out.println("Exame");
	
	if(media < 3.0)
        System.out.println("Retido");
    }
}
