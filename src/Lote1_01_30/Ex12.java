package Lote1_01_30;
import javax.swing.JOptionPane;

public class Ex12 {
    public static void main(String[] args){
        
        int idade;
        
        idade = Integer.parseInt(JOptionPane.showInputDialog(null, "Idade: "));
        
        JOptionPane.showMessageDialog(null, "Idade após 17 anos: " + (idade + 17));  
    }
}
