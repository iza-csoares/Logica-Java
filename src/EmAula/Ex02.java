package EmAula;
import javax.swing.JOptionPane;

public class Ex02 {
   public static void main(String[] args){
       
       int idade = 0;
       idade = Integer.parseInt(JOptionPane.showInputDialog(null, "Idade: "));
       
       if(idade >= 18){
           
           JOptionPane.showMessageDialog(null, "Maior de idade!");
        }
   } 
}
