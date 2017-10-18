package RevisaoEstCondicional;
import javax.swing.JOptionPane;

public class Ex13 {
    public static void main(String[] args){
    
       String nome1 = JOptionPane.showInputDialog("Nome 1:");
       String nome2 = JOptionPane.showInputDialog("Nome 2:");
    
       if(nome1.equals(nome2)){
          System.out.println("Os nomes são iguais!");    
       }else if(nome1.compareTo(nome2)>0){
          String aux = nome1;
          nome1 = nome2;
          nome2 = aux;
          System.out.println("Nomes em ordem alfabética: " + nome1 + " e " + nome2);  
        }
    }
}
