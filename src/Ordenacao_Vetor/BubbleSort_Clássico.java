package Ordenacao_Vetor;
import javax.swing.JOptionPane;

public class BubbleSort_Clássico {
    public static void main(String[] args){
        
        int[] vtn = new int[10];  
        int opcao = 0;
        BubbleSort_Clássico obj = new BubbleSort_Clássico();
        
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
                  obj.Exibe(vtn);
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
        "2 - Ordena vetor\n" +
        "3 - Exibe vetor ordenado\n" +
        "9 - Fim\n\n" +
        "Opção: "));
        
        return opcao;
    }
    
    public static void Carrega(int[] v){
        
        int i;
       
       for(i=0; i < v.length; i++){
	  v[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite: "));
        }
    }
    
    public static void Ordena(int[] v){
       
       int aux = 0; 

       for(int i=0; i<=8; i++){
	   for(int y=(i+1); y < v.length; y++){
	        
               if(v[i]>v[y]){
                   aux = v[i];
	           v[i] = v[y];
                   v[y] = aux;
               }
           }
        }
    } 
    
    public static void Exibe(int[] v){

       for(int i=0; i < v.length; i++){
	  
          System.out.println(v[i]);
        }
    }
}
