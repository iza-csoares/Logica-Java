package EmAula;
import javax.swing.JOptionPane;
//import java.util.Scanner;

public class Teste {
    static String texto = "";
    public static void main(String args[]){
        
        int opcao = 0, base = 0, exp = 0;
        int mt[][] = new int[5][5];
        Teste obj = new Teste();
       
       while(opcao != 9){
           opcao = Integer.parseInt(JOptionPane.showInputDialog(
        "1 - Carrega matriz\n" +
        "2 - Mostra potência\n" +
        "3 - Classifica matriz\n" +
        "9 - Fim\n"));
                   
	   switch(opcao){
                case 1: 
                  obj.CarregaMatriz(mt);
                break;
                  
                case 2: 
                  obj.ExibePotencia(base, exp);
                break;
                  
                case 3: 
                  obj.ClassificaMatriz(mt);
                break;
                
                case 9:
                  System.exit(0);  
                break;
                  
                default: JOptionPane.showMessageDialog(null, "Inválido");
            }
        }   
    }
    
    public static void CarregaMatriz(int[][] mt){
       
       int valor = 1, soma = 0;

        for(int x = 0; x < mt.length; x++){
            for(int y = 0; y < mt[x].length; y++){
                if(y<=(4-x)){
                // mt[x][y] = (int)(Math.random()); 
                   mt[x][y] = Integer.parseInt(JOptionPane.showInputDialog("Digite: "));
               
                }
            }
        }

            for(int x = 0; x < mt.length; x++){
               for (int y = 0; y < mt.length; y++) {
                   texto += " " + mt[x][y];
               }
               texto += "\n";
           }
        System.out.println(texto);
        texto = "";
      
    }
    
    public static void ExibePotencia(int base, int exp){
                    
        JOptionPane.showMessageDialog(null, "Potência: " + Potência(2, 3)); 
    }    
    
    public static int Potência(int base, int exp){
        
       if (exp == 0){
           
          return 1;
        }else{
           
           return base * Potência(base, exp - 1);
       }
    }
        
        
    public static void ClassificaMatriz(int[][] mt){
        
       for(int x=0; x < mt.length; x++){
	   for(int y=0; y < mt.length; y++){
            texto += " " + mt[x][y];
           }
           texto += "\n";
        }
        System.out.println(texto);
    }
}