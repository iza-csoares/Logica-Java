package Lote4_Vetor_Matriz_01_12;
import javax.swing.JOptionPane;

public class Ex04 {
    static  double media = 0;
    static  double[] vtn = new double[10]; 
    
    public static void main(String[] args){
          
        int opcao = 0;
        double soma = 0;
        Ex04 obj = new Ex04();
        
        do{
            
           opcao = obj.Menu();
          
	   switch(opcao){
	        case 1: 
                  obj.Carrega(soma, vtn);
                break;
                 
                case 2: 
                  JOptionPane.showMessageDialog(null, obj.Média(vtn, soma));
                break;
                  
                case 3: 
                  obj.Quantidade(vtn, media);
                break;
                
                case 4:
                   obj.Posição(vtn, media);
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
        "2 - Média do grupo\n" +
        "3 - Quantidade de notas acima do grupo\n" +
        "4 - Posições dos valores abaixo da média do grupo\n" +
        "9 - Fim\n\n" +
        "Opção: "));
        
        return opcao;
    }
   
   public static double[] Carrega(double soma, double v[]){
               
       for(int i=0; i < v.length; i++){
	  v[i] = Double.parseDouble(JOptionPane.showInputDialog("Digite: "));
        }
       
       return v;
    }
   
   public static double Média(double[] v, double soma){
         
       for(int i=0; i < v.length; i++){
          soma = (soma + v[i]);
        }       
      
       media = (soma/10.0);
       
      // JOptionPane.showMessageDialog(null, "Média: " + media);
      return media;
    }
   
   public static void Quantidade(double[] v, double media){
       
       int notas = 0;
	
       for(int i=0; i < v.length; i++){
	   if(v[i] > media){
	       notas++;
           }
        }
       JOptionPane.showMessageDialog(null, "Notas: " + notas);
   }
   
   public static void Posição(double []v, double media){
       
       for(int i=0; i < v.length; i++){
	   if(v[i] < media){
	     System.out.println("v["+i+"] = "+ v[i]);
            }
        }
   } 
}
