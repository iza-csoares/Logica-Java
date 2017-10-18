package Lote4_Vetor_Matriz_01_12;
import javax.swing.JOptionPane;

public class Ex07 {
    public static void main(String[] args){
        
        int[] vtn = new int[10];  
        int opcao = 0, num = 0;
        Ex07 obj = new Ex07();
        
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
                  obj.Busca(num);
                break;
                
                case 4:
                  obj.Pesquisa(vtn, num);
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
        "3 - Valor da busca\n" +
        "4 - Resultado da pesquisa\n" +
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
    
    public static void Busca(int num){
        
        num = Integer.parseInt(JOptionPane.showInputDialog(null, "Valor a ser buscado: "));
    }
    
    public static void Pesquisa(int[] v, int n){

       int inicio = 1, fim = 10, meio = 0;
       boolean dado = false;
	  
       for(int i=0; i < v.length; i++){
	       
           while((inicio<=fim) && !dado){
	       meio = ((inicio+fim)/2);
		
               if(v[meio] == n){
	          dado = true;
                }
               
               if(v[meio]>n){
                   fim = meio - 1;
               }else{
                   inicio = meio + 1;
                }
            }
        }
	  
       if(dado == true){
	   JOptionPane.showMessageDialog(null, "O valor digitado está no vetor!");   
       }else{
	   JOptionPane.showMessageDialog(null, "O valor digitado não está no vetor!");
        }
    }
}

