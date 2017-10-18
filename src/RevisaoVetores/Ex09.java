package RevisaoVetores;
import javax.swing.JOptionPane;

public class Ex09 {
    public static void main(String[] args){
        
        String vetornome[] = new String[5];
        double vetornota1[] = new double[2];
        double vetornota2[] = new double[2];
        double vetormedia[] = new double[5];
        
       for(int i = 0; i < vetornome.length; i++){
            
           vetornome[i] = JOptionPane.showInputDialog("Nome: ");
             
           for(int x = 0; x < vetornota1.length; x++){
               vetornota1[x] = Double.parseDouble(JOptionPane.showInputDialog("Nota primeiro semestre: "));
            } 
           
           for(int y = 0; y < vetornota2.length; y++){
               vetornota2[y] = Double.parseDouble(JOptionPane.showInputDialog("Nota segundo semestre: "));
            } 
        }
       
        for(int z = 0; z < vetormedia.length; z++){
           for(int x = 0; x <= vetornota1[z]; x++){
               for(int y = 0; y <= vetornota2[x]; y++){
                   vetormedia[z] = ((vetornota1[x]/2) + (vetornota2[y]/2)); 
                }
            }
        }        
    
        for(int i = 0; i < vetornome.length; i++){
           for(int z = 0; z < vetormedia.length; z++){
               if(vetormedia[z] >=6){
                  System.out.println("Aprovado!");
               }else{
                  System.out.println("Reprovado");
               }
               System.out.println("Nome aluno: " + vetornome[i] + "Média: " + vetormedia[z]);
           }
        }
    
    }    
}
