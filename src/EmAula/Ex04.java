package EmAula;
import javax.swing.JOptionPane;

public class Ex04 {
    public static void main(String[] args){
        
      int opcao = 0;
        EmAula.Ex04 obj = new EmAula.Ex04();
       
        do{
            
           opcao = obj.Menu();
          
	   switch(opcao){
	        case 1: 
                  obj.Fatorial();
                break;
                 
                case 2: 
                  obj.Série1();
                break;
                
                case 3:
                    obj.Série2();
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
        "1 - Fatorar\n" +
        "2 - Série 1\n" +
        "3 - Série 2\n" +
        "9 - Fim\n\n" +
        "Opção: "));
        
        return opcao;
    }  
    
    public static void Fatorial(){
      
       int fat = 1, n = 0;  
       
       do{ 
       n = Integer.parseInt(JOptionPane.showInputDialog(null, "Valor:"));
       if(n <= 1 || n >= 10){
           JOptionPane.showMessageDialog(null, "Valor inválido!");
       }
       }while(n <= 1 || n >= 10 );
       
	for(int i=(int) n; i > 1; i--){
           fat = (fat * i);		
	}
        
        JOptionPane.showMessageDialog(null, "Fatorial: " + fat);   
    }
    
    public static void Série1(){
       
       double n1 = 0, n2 = 0, div = 0, soma = 0;
       
       int n = 0;
       n = Integer.parseInt(JOptionPane.showInputDialog(null, "Valor:")); 
       n2 = n + 1;
       
       for(int i = 1; i <= n; i++){
          
           n1 += 1;
           n2 -= 1;
           
           div = (n1/n2);
           soma += div;
        }
        
       JOptionPane.showMessageDialog(null, "Total: " + soma);
    }
    
    public static void Série2(){
        
       double fat = 1, n1 = 0, n2 = 0, soma = 0, div = 0;
       int n = 0;
       
       n = Integer.parseInt(JOptionPane.showInputDialog(null, "Valor:")); 
       n1 = n + 1;
              
       for(double i = 1; i <= n; i++){
          
           n1 -= 1;                                                                            
           n2 += 1;
           
           for(double y = n1; y > 1; y--){
		fat *= y;  
	    }  
   
           div = (fat/n2);
           soma += div;           
        }
        
       JOptionPane.showMessageDialog(null, "Total: " + soma);
    }
}
