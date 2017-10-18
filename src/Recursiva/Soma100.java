package Recursiva;
import javax.swing.JOptionPane;

public class Soma100 {
    public static void main(String[] args) {
        
        Soma100 classe = new Soma100();
        JOptionPane.showMessageDialog(null, classe.Soma100(100));
        
    }
    
    public int Soma100(int num){
        
        int soma = 0;
        
        if(num == 1){
            return 1;
        }else{
            return soma = num + Soma100(num - 1);
        }
    }
}
