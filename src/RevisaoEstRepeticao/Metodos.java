package RevisaoEstRepeticao;
import javax.swing.JOptionPane;

public class Metodos {
   
    public static int Menu(int opcao){
    
       return Integer.parseInt(JOptionPane.showInputDialog(
       "1 – Números de 1 a 100\n" +
       "2 – Números de 100 a 1\n" +
       "3 – Intervalo crescente definido pelo usuário\n" +
       "4 – Intervalo decrescente definido pelo usuário\n" +
       "5 – Números múltiplos de 3\n" +
       "6 – Números múltiplos de N\n" +
       "7 – Sequencia de Fibonacci\n" +
       "8 – Sequencia de Fibonacci (Com valor definido)\n" +
       "9 - Sair"));
    }
    
    public void Sequencia1(){
    
       for(int i = 1; i <= 100; i++){
          System.out.println(i);
       }  
    }
    
    public void Sequencia2(){
    
       for(int i = 100; i >= 1; i--){
          System.out.println(i);
       }  
    }
    
    public void Sequencia3(int n1, int n2){    
        
        do{
        n1 = Integer.parseInt(JOptionPane.showInputDialog("Valor 1: "));
        n2 = Integer.parseInt(JOptionPane.showInputDialog("Valor 2: "));
        }while(n1 > n2);
        
        for(int i = n1; i <= n2; i++){
          System.out.println(i);
        }  
    }
    
    public void Sequencia4(int n1, int n2){    
        
        do{
        n1 = Integer.parseInt(JOptionPane.showInputDialog("Valor 1: "));
        n2 = Integer.parseInt(JOptionPane.showInputDialog("Valor 2: "));
        }while(n1 < n2);
        
        for(int i = n1; i >= n2; i--){
          System.out.println(i);
        }  
    }
    
    public void Sequencia5(){    
                
        for(int i = 3; i <= 99; i+=3){
          System.out.println(i);
        }  
    }
    
    public void Sequencia6(int n1){
    
       n1 = Integer.parseInt(JOptionPane.showInputDialog("Valor: ")); 
        
       for(int i = n1; i <=100; i++){
          
           System.out.println(n1*i);
        }    
    }
    
    public void Sequencia7(){
    
      int a = 0, b = 1, aux = 0;
      
      for(int i = 1; i <= 10; i++){
           aux = a + b;
           a = b;
           b = aux;
           
          System.out.println(aux); 
        }    
    }
    
    public void Sequencia8(int n1){
    
      int a = 0, b = 1, aux = 0;
      
      n1 = Integer.parseInt(JOptionPane.showInputDialog("Valor: "));
      
      for(int i = 1; i <= n1; i++){
           aux = a + b;
           a = b;
           b = aux;
           
          System.out.println(aux); 
        }   
    }   
}
