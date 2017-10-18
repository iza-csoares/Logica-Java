package Recursiva;
import javax.swing.JOptionPane;

public class Series_Recursiva {
    public static void main(String[] args){
        
        int opcao = 0, num = 0; 
 
        Series_Recursiva obj = new Series_Recursiva();
        
        do{
            
            opcao = obj.Menu();
            
            switch(opcao){
                
                case 0:
                 // obj.CarregaValor(num); 
                break;
                
                case 1:
                  obj.ExibeSerie1(num);
                break;
                
                case 2:
                  obj.ExibeSerie2(num);
                break;
                
                case 9:
                   System.exit(0);
                break;
                   
                default:
                  JOptionPane.showMessageDialog(null, "Inválido!");
            }
        }while(opcao != 9);
    }
    
    public static int Menu(){
        
        int opcao = 0;
        
        opcao = Integer.parseInt(JOptionPane.showInputDialog(
       // "0 - Novo valor\n" +
        "1 - Serie 1\n" +
        "2 - Serie 2\n" +
        "9 - Sair\n"));
        
        return opcao;
    }
    
    /*public static double CarregaValor(double num){
       
       num = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite: "));
      
      return num;
    }*/
    
    public static void ExibeSerie1(int num){
       int s = 1; 
       
       num = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite: "));
       
       JOptionPane.showMessageDialog(null, "Série: " + Serie1(num,s));
    }
    
    public static double Serie1(double n, double soma){
       
        if(n == 1){
            return soma;
        }else{ 
            return soma/n + Serie1(n-1, soma+1);  
        }
    }
    
    public static void ExibeSerie2(int num){
 
       num = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite: "));
       
       JOptionPane.showMessageDialog(null, "Série: " + Serie2(num,1));
    }
    
    public static int Serie2(int n, int num2){
       
       if(n == num2){
           return FatSerie2(num2);
       }else{
           return FatSerie2(num2) + Serie2(n, num2+1);
       }
    }
   
    public static int FatSerie2(int n){
        
        if(n == 1){
            return 1;
            
        }else{
            return n * FatSerie2(n - 1);                      
        }    
    }
}


/*  
 
    Série 1: 1/n + 2/n-1 + 3/n-2 + n/1

              1/4 + 2/3 + 3/2 + 4/1

    Série 2: n! + (n-1)! + (n-2)! + ... + 1!

              4! + 3! + 2! + 1!

    Série 3: (n = 16)

             1 + 3 + 5 + 7... 
*/