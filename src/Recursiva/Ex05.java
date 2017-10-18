package Recursiva;
import javax.swing.JOptionPane;

public class Ex05 {
    public static void main(String[] args) {
        
        int opcao = 0;
        double n = 0;
        Ex05 obj = new Ex05();
        
        do{
            
           opcao = obj.Menu();
          
	   switch(opcao){
	        case 1: 
                  obj.Valor(n);
                break;
                 
                case 2: 
                  obj.CalculoSoma(n);
                break;
                  
                case 3: 
                  obj.Serie1(n);
                break;
                
             //   case 4:
               //   obj.Serie2(n);
                //break;
                
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
        "1 - Carrega valor\n" +
        "2 - Cálculo soma\n" +
        "3 - Série 1\n" +
        "4 - Série 2\n" +
        "9 - Fim\n\n" +
        "Opção: "));
        
        return opcao;
    }    
    
    public static void Valor(double n){
        
       do{
           n = Double.parseDouble(JOptionPane.showInputDialog(null, "Valor: "));
       }while((n <= 10) && (n >= 20));

    }
        
    public int CalculoSoma(double num){
        
        int soma = 0;
        
        if(num == 1)
            return 1;
        else
            return soma += CalculoSoma(soma + 2);
          
    }
    
    public double Serie1(double num){
        double soma = 0;
        double i = 0;
        
        if(num == 1)
            return 1;
        else 
            return soma += ((num - 1) / Serie1(i + 1));
    }
    
   // public double Serie2(double num){
  //     
  //  }
}