package Lote1_01_30;
import javax.swing.JOptionPane;

public class Ex27 {
    public static void main(String[] args){
        
        double circuito, vm, tempo;
        int voltas;
        
        voltas = Integer.parseInt(JOptionPane.showInputDialog(null, "Número de voltas: "));
        circuito = Double.parseDouble(JOptionPane.showInputDialog(null, "Extensão do circuito: "));
        tempo = Double.parseDouble(JOptionPane.showInputDialog(null, "Tempo de duração: "));
        
        vm = ((voltas * circuito)/tempo);
        
        System.out.println("Velocidade média em km/h: " + vm);
    }
}
