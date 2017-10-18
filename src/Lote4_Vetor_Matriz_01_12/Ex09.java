package Lote4_Vetor_Matriz_01_12;
import javax.swing.JOptionPane;

public class Ex09 {
   static String texto = "";
   static int i = 0;
    public static void main(String[] args){
        
      int mt[][] = new int[4][4];
      
        int opcao = 0;
        Ex09 obj = new Ex09();
        
       do{
            
           opcao = obj.Menu();
          
	   switch(opcao){
	        case 1: 
                  obj.Carrega(mt);
                break;
                 
                case 2: 
                  obj.Exibe(mt);
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
        "1 - Carrega matriz\n" +
        "2 - Exibe matriz\n" +
        "9 - Fim\n\n" +
        "Opção: "));
        
        return opcao;
    }
    
    public static void Carrega(int[][] mt){
        
        for(int x=0; x < mt.length; x++){
	   for(int y=0; y < mt.length; y++){
	       if(x==y){
	          mt[x][y] = Calculo(x, y);
               }else{
                  mt[x][y] = (int)(Math.random() * 1); 
               }
           } 
        }
    }
    
    public static int Calculo(int x, int y){
        
       int calc = 0;

       calc = (int) (Math.pow(4, i));
       i++;
        
       return calc; 
    }
    
    public static void Exibe(int[][] mt){
        
        for(int x=0; x < mt.length; x++){
	   for(int y=0; y < mt.length; y++){
	       
               texto += " " + mt[x][y];
           }
           texto += "\n";
        }
        System.out.println(texto);
    }
}