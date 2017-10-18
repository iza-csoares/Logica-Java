package RevisaoVetores;
import javax.swing.JOptionPane;

public class Ex04 {
   public static void main(String[] args){
            
       double vetor[] = new double [11];
       
       for(int i = 0; i < vetor.length; i++){
          vetor[i] = Double.parseDouble(JOptionPane.showInputDialog("Valor: "));
        }
            
       for(int i = 0; i < vetor.length-1; i++){
           for(int y = i+1; y < vetor.length; y++){
          
               if(vetor[i] > vetor[y]){
               double aux = vetor[i];
               vetor[i] = vetor[y];
               vetor[y] = aux;
            }
          }
       }
       System.out.println("Maior valor: " + vetor[10] + "\nMenor valor: " + vetor[0]);     
    }
}
