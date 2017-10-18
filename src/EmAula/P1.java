package EmAula;
import javax.swing.JOptionPane;
//import java.util.Scanner;

public class P1 {
    static String texto = "";
    public static void main(String args[]){
        
        int opcao = 0, base = 0, exp = 0;
        int mt[][] = new int[5][5];
        int vt[] = new int[25];
        P1 obj = new P1();
       
       do{
       while(opcao != 9){
           opcao = Integer.parseInt(JOptionPane.showInputDialog(
        "1 - Início\n" +
        "2 - Carrega matriz\n" +
        "3 - Mostra potência\n" +
        "4 - Classifica matriz\n" +
        "9 - Fim\n"));
                   
	   switch(opcao){
               
                case 1: 
                  
                break;
                  
                case 2: 
                  obj.CarregaMatriz(mt);
                break;
                  
                case 3: 
                  obj.ExibePotencia(base, exp);
                break;
                
                case 4:
                  obj.ClassificaMatriz(mt, vt); 
                break;
                
                case 9:
                  System.exit(0);  
                break;
                  
                default: JOptionPane.showMessageDialog(null, "Inválido");
            }
        }   
       }while(opcao==1); 
    }
    
    public static void CarregaMatriz(int[][] mt){
       
       int valor = 1, soma = 0;

        for(int x = 0; x < mt.length; x++){
            for(int y = 0; y < mt[x].length; y++){
                if(y != (5-x-1)){
                 mt[x][y] = (int)(Math.random()); 
                //   mt[x][y] = Integer.parseInt(JOptionPane.showInputDialog("Digite: "));
                }else{
                   if(x==0 && y==4){
                       mt[x][y] = 1;  
                    }else{
                       mt[x][y] = valor += 2;
                   }
                } 
                if(mt[x][y]%2==0 && mt[x][y]%3==0){
                    soma += mt[x][y];
                }
            }
        }        
        System.out.println("Soma:" + soma);
        
         for (int x = 0; x < mt.length; x++) {
            for (int y = 0; y < mt[x].length; y++) {

                texto += " " + mt[x][y];
            }
            texto += "\n";
        }
        System.out.println(texto);
        texto = "";
       
    }
    
    public static void ClassificaMatriz(int[][] mt, int[]vt){
              
       for(int x=0; x < mt.length; x++){
	   for(int y=0; y < mt.length; y++){
               for(int i=0; i < vt.length; i++){
                  vt[i] = mt[x][y];
               }
            }
        }
       
       for(int i=0; i <= 23; i++){
           for(int j=(i+1); j < vt.length; j++){
                 
                 if(vt[i]>vt[j]){
                    int aux = vt[i]; 
                    vt[i] = vt[j];
                    vt[j] = aux;
                 }
           }
       }
       
       for(int x=0; x < mt.length; x++){
	   for(int y=0; y < mt.length; y++){
               for(int i=0; i < vt.length; i++){
                   mt[x][y] = vt[i];
                }
            }
        }
        
        for (int x = 0; x < mt.length; x++) {
            for (int y = 0; y < mt[x].length; y++) {

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
}