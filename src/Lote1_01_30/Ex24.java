package Lote1_01_30;
import javax.swing.JOptionPane;

public class Ex24 {
    public static void main(String[] args){
        
        int n;
        
        n = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um valor: "));
        
        if(n%2 == 0 && n%3 == 0)
	    System.out.println("O valor é divisível por dois e três");
	   
	else 
            System.out.println("O valor não é divisível por dois e três");      
    }
}
