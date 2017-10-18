package RevisaoVetores;

import javax.swing.JOptionPane;

public class Ex02 {
    public static void main(String[] args){
    
       int vetor[] = new int[9]; 
        
       for(int i = 0; i < vetor.length; i++){
          vetor[i] = Integer.parseInt(JOptionPane.showInputDialog("Valor: "));
        }
    
       for(int i = 8; i >=0; i--){
       
          System.out.println(i);
        }    
    }
}
