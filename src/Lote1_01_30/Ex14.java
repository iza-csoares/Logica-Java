package Lote1_01_30;
import javax.swing.JOptionPane;

public class Ex14 {
    public static void main(String[] args){
        
        double angulo1, angulo2, angulo3, soma;
        
        angulo1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Ângulo 1: "));
        angulo2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Ângulo 2: "));
        
        soma = angulo1 + angulo2;
        angulo3 = (180 - soma);
        
        JOptionPane.showMessageDialog(null, "Terceiro ângulo: " + angulo3);       
   }
}