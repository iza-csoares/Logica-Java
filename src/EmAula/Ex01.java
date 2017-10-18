package EmAula;
import javax.swing.JOptionPane;

public class Ex01 {
    public static void main(String[] args){
        
        int n1 = 0;
        n1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Primeiro valor: "));
        int n2 = 0;
        n2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Segundo valor: "));
        
        System.out.println("Soma dos valores: " + (n1 + n2));
    }
}
