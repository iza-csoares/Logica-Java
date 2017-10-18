package Ordenacao_Vetor;
import javax.swing.JOptionPane;

public class QuickSort_Partição {
    public static void main(String[] args){
        int[] v = new int [10];
        int inicio = 0, fim = 0, opcao = 0;
        
       QuickSort_Partição obj = new QuickSort_Partição();
        
       do{
            
           opcao = obj.Menu();
          
	   switch(opcao){
	        case 1: 
                  obj.Carrega(v);
                break;
                 
                case 2: 
                  obj.Ordena(v, inicio, fim);
                break;
                  
                case 3: 
                  obj.Exibe(v);
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
    
    public static void Carrega(int v[]){
        
       for(int i = 0; i < v.length; i++){	
    	  v[i] = Integer.parseInt(JOptionPane.showInputDialog(null, "Valor: ")); 	
	}  
    }
    
    public static void Ordena(int v[], int inicio, int fim){
        
        int pivo, aux, i, j, meio;
	
	i = inicio;
	j = fim;
	
	meio = (int) ((i + j)/2);
	pivo = v[meio];
	
	do{	
		
          while(v[i] < pivo) i  = i + 1;
          while(v[j] > pivo) j  = j - 1;
	   if(i <= j){
	       aux = v[i];	
	       v[i] = v[j];
	       v[j] = aux;
			
	       i += 1;
	       j -= 1;
	    }
	}while(j > i);
	
	if(inicio < j) Ordena(v, inicio, j);
	if(i < fim) Ordena(v, i, fim);
    }
    
    public static void Exibe(int v[]){
        
        Ordena(v, 0, 9);
        
        for(int i = 0; i < v.length; i++){
           System.out.println(v[i]);
	}
    }
}