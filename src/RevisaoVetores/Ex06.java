package RevisaoVetores;

import javax.swing.JOptionPane;

public class Ex06 {
    public static void main(String[] args){
        
       double vetor1[] = new double[10];   
       double vetor2[] = new double[10];  
       double vetor3[] = new double[10];     
      
       for(int x = 0; x < vetor1.length; x++){
          vetor1[x] = Double.parseDouble(JOptionPane.showInputDialog("Valor vetor 1: "));
        }  
       
       for(int y = 0; y < vetor2.length; y++){
          vetor2[y] = Double.parseDouble(JOptionPane.showInputDialog("Valor vetor 2: "));
        }
       
       for(int i = 0; i < vetor3.length; i++){ 
          for(int x = 0; x <= vetor1[i]; x++){
              for(int y = 0; y <= vetor2[x]; y++){ 
                  vetor3[i] = vetor1[x] + vetor2[y];
                }    
            } 
        }
       
       for(int i = 0; i < vetor3.length; i++){
          System.out.println(vetor3[i]);
        }
    }
}
