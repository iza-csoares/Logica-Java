package RevisaoVetores;
import javax.swing.JOptionPane;

public class Ex03 {
    public static void main(String[] args){
       
       double soma = 0; 
       double vetor[] = new double[10];
        
       for(int i = 0; i < vetor.length; i++){
          vetor[i] = Double.parseDouble(JOptionPane.showInputDialog("Valor: "));
          soma += vetor[i];
        }    
               
       JOptionPane.showMessageDialog(null, "Média dos valores: " + (soma/vetor.length));  
    }
}
