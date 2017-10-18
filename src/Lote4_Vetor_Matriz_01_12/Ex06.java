package Lote4_Vetor_Matriz_01_12;
import javax.swing.JOptionPane;

public class Ex06 {
    public static void main(String[] args){
        
        int[] vtn = new int[10];  
        int opcao = 0;
        Ex06 obj = new Ex06();
        
       while(opcao != 9){
           opcao = Integer.parseInt(JOptionPane.showInputDialog(
        "1 - Carrega vetor\n" +
        "2 - Ordena vetor\n" +
        "3 - Exibe vetor ordenado\n" +
        "9 - Fim\n"));
                   
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
                  
                default: JOptionPane.showMessageDialog(null, "Inválido");
            }
        }        
    }
       
    public static int[] Carrega(int[] v){
        
        int i;
       
       for(i=0; i < v.length; i++){
	  v[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite: "));
        }
       return v;
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
