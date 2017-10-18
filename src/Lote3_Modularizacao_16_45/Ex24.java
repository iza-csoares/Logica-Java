package Lote3_Modularizacao_16_45;
import javax.swing.JOptionPane;

public class Ex24 {
    public static void main(String[] args){
        
        int n = 0;
        n = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um valor: "));
        
        Ex24 obj = new Ex24();
        obj.Divisivel(n);
    }
       
    public static void Divisivel(int n){
            
        if(n%2 == 0 && n%3 == 0)
	    System.out.println("O valor é divisível por dois e três");
	   
	else 
            System.out.println("O valor não e divisível por dois e três");    
        }
}
