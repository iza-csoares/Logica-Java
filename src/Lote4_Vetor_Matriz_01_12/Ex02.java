package Lote4_Vetor_Matriz_01_12;
import javax.swing.JOptionPane;

public class Ex02 {
    public static void main(String[] args){
        int[] vtn = new int[5];
        int opcao = 0;
        Ex02 obj = new Ex02();
       
        do{
            
           opcao = obj.Menu();
          
	   switch(opcao){
	        case 1: 
                  obj.Carrega(vtn);
                break;
                 
                case 2: 
                  obj.Ordena(vtn);
                break;
                  
                case 3: 
                  obj.Media(vtn);
                break;
                  
                case 9: 
                  System.exit(0);  
                break;
                  
                default: 
                  JOptionPane.showMessageDialog(null, "Inválido");
            }
        }while(opcao != 0); 
    }
    
    public static int Menu(){
        int opcao = 0;
        opcao = Integer.parseInt(JOptionPane.showInputDialog("Menu\n" +
        "1 - Carrega vetor\n" +
        "2 - Exibe valor (maior e menor)\n" +
        "3 - Média dos valores\n" +
        "9 - Fim\n\n" +
        "Opção: "));
        
        return opcao;
    }
    
    public static int[] Carrega(int[] v){
      
       int i;
       
       for(i=0; i < v.length; i++){
	  v[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite: "));
        }
       return v;
    }
    
    public static void Ordena(int[] v){
       
       int i, y, aux; 

       for(i=0; i<=3; i++){
	   for(y=(i+1); y < v.length; y++){
	        
               if(v[i]>v[y]){
                   aux = v[i];
	           v[i] = v[y];
                   v[y] = aux;
               }
           }
        }
        JOptionPane.showMessageDialog(null,"Maior valor: " + v[4] +
        "\nMenor valor: " + v[0]);
    }
    
    public static void Media(int[] v){
       
       int i, media = 0, soma = 0;

       for(i=1; i < v.length; i++){
	   media = media + 1; 
           soma = soma + v[i];
        }
       
        media = soma/media;
        
        JOptionPane.showMessageDialog(null,"Média: " + media);
    }
}
