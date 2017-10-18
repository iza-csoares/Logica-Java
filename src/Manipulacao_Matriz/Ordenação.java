package Manipulacao_Matriz;
import javax.swing.JOptionPane;

public class Ordenação {
     static String texto = "";
    public static void main(String[] args){
        
        int[][] mt = new int[3][3];  
        int opcao = 0;
        Ordenação obj = new Ordenação();
        
       do{
       while(opcao != 9){
           opcao = Integer.parseInt(JOptionPane.showInputDialog(
        "0 - Reiniciar\n" +
        "1 - Carrega matriz\n" +
        "2 - Ordena matriz\n" +
        "3 - Exibe matriz ordenada\n" +
        "9 - Fim\n"));
                   
	   switch(opcao){
	        case 1: 
                  obj.Carrega(mt);
                break;
                 
                case 2: 
                  obj.Ordena(mt);
                break;
                  
                case 3: 
                  obj.Exibe(mt);
                break;
                  
                case 9: 
                  System.exit(0);  
                break;
                  
                default: JOptionPane.showMessageDialog(null, "Inválido");
            }
        }        
    }while(opcao==0);
        
        
    }
    
    public static int[][] Carrega(int[][] m){
        
       for(int x=0; x < m.length; x++){
	   for(int y=0; y < m.length; y++){
               
              m[x][y] = Integer.parseInt(JOptionPane.showInputDialog("Digite: "));
           }
        }
           
       return m;      
    }
    
    public static void Ordena(int[][] m){
       
       int aux = 0; 
       
       for(int x=0; x < m.length; x++){
	   for(int y=0; y < m.length; y++){
               for(int i=0; i<=2; i++){
	           for(int z=(i+1); z < m.length; z++){
	                 
                       if(m[x][y]>m[i][z]){
                           
                         aux = m[x][y];
	                 m[x][y] = m[i][z];
                         m[i][z] = aux;
                        }
                    }
                }
            } 
        }
    }
           
    public static void Exibe(int[][] m){

       for(int x=0; x < m.length; x++){
	   for(int y=0; y < m.length; y++){
              
            texto += " " + m[x][y];
           }
           texto += "\n";
        }
        System.out.println(texto); 
    }
  
}
