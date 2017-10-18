package Lote3_Modularizacao_16_45;
import javax.swing.JOptionPane;

public class Ex27 {
    public static void main(String[] args){
               
        int voltas = 0;
        voltas = Integer.parseInt(JOptionPane.showInputDialog(null, "Número de voltas: "));
        
        double circuito = 0;
        circuito = Double.parseDouble(JOptionPane.showInputDialog(null, "Extensão do circuito: "));
        
        double tempo = 0;
        tempo = Double.parseDouble(JOptionPane.showInputDialog(null, "Tempo de duração: "));
        
        JOptionPane.showMessageDialog(null, "Velocidade Média: " + Vm(voltas, circuito, tempo));
    }
    
    public static double Vm(int voltas, double circuito, double tempo){
        double vm = 0;
        
        vm = ((voltas * circuito)/tempo);
        
        return vm;
    }
    
}