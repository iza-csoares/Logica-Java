package EmAula;
import javax.swing.JOptionPane;

public class Ex03 {
    public static void main(String[] args){
        
        int b = 0;
        b = Integer.parseInt(JOptionPane.showInputDialog(null, "Base do triângulo: "));
        
        int h = 0;
        h = Integer.parseInt(JOptionPane.showInputDialog(null, "Altura do triângulo: "));
        
        JOptionPane.showMessageDialog(null, "A área é: " + Area(b,h));
    }
    
    public static int Area(int x, int y){
        
        int area = 0;
        
        area = (x*y)/2;
        
        return area;
    }
}
