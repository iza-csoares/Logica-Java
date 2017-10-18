package Lote4_Vetor_Matriz_01_12;
import javax.swing.JOptionPane;

public class Ex03 {
   public static void main(String[] args){
       
       int[] vtn1 = new int[3];
       int[] vtn2 = new int[3];
       int[] vtn3 = new int[6];
       int opcao = 0;
       Ex03 obj = new Ex03();
       
       do{
            
           opcao = obj.Menu();
          
	   switch(opcao){
	        case 1: 
                  obj.CarregaVetor1(vtn1);
                  obj.Menu();
                break;
                 
                case 2: 
                  obj.CarregaVetor2(vtn2);
                break;
                  
                case 3: 
                  obj.CarregaVetor3(vtn1, vtn2, vtn3);
                break;
                
                case 4:
                   obj.ExibeVetor3(vtn3);
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
        "1 - Carrega vetor 1\n" +
        "2 - Carrega vetor 2\n" +
        "3 - Carrega vetor 3\n" +
        "4 - Mostra vetor 3\n" +
        "9 - Fim\n\n" +
        "Opção: "));
        
        return opcao;
    }
   
   public static void CarregaVetor1(int [] v1){
     
       for(int i=0; i < v1.length; i++){
	  v1[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite: "));
        }
    }
   
    public static void CarregaVetor2(int[] v2){

        for(int i=0; i < v2.length; i++){
	  v2[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite: "));
        } 
    }
    
     public static void CarregaVetor3(int[] v1, int[] v2, int[] v3){
      
       for(int i=0; i<=2; i++){
           v3[i] = v1[i];
           v3[i+3] = v2[i];
       }   
    }
     
    public static void ExibeVetor3(int[] v3){
         
       for(int i=0; i < v3.length; i++){
           System.out.println(v3[i]);   
        }     
    }
}
