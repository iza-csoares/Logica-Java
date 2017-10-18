package Lote3_Modularizacao_16_45;
import javax.swing.JOptionPane;

public class Ex17 {
    public static void main(String[] args){
        
        double t = 0;
        t = Double.parseDouble(JOptionPane.showInputDialog(null, "Tempo gasto: "));
        
        double vm = 0;
        vm = Double.parseDouble(JOptionPane.showInputDialog(null, "Velocidade média: "));
         
	Litro(t, vm);  
    }
    
    public static void Litro(double t, double vm){
        double dp, lit;
        
        dp=(t*vm);
        lit=(dp/12);
        
        System.out.println("Litros de combustível utilizados: " + lit);
    }
}
