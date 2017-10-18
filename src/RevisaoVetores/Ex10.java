package RevisaoVetores;
import javax.swing.JOptionPane;

public class Ex10 {
   public static void main(String[] args){
    
      int vetor[] = new int[10];
             
      for(int i = 0; i < vetor.length; i++){
          
          do{
           vetor[i] = Integer.parseInt(JOptionPane.showInputDialog("Valor: "));
            
           if(!(vetor[i] % 2 == 0)){
              JOptionPane.showMessageDialog(null, "Valor ímpar, favor digitar novamente!");
            }
          
          }while(!(vetor[i] % 2 == 0));
        } 
      
        for(int i = 0; i < vetor.length; i++){
            System.out.println(vetor[i]);
        }          
    }
}
