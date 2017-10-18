package Lote4_Vetor_Matriz_01_12;

public class Ex10 {
    static String texto = "";
    public static void main(String[] args){
        
        int mt[][] = new int[2][9];
        int casa = 0, valor = 1, soma = 0;
        
        for(int x=0; x<=1; x++){
	   for(int y=0; y<=8; y++){
	                             
                if(x==0){
      
                   mt[x][y] = casa += 1;
                   soma = soma + casa;
                   
                   if(y==8){
                      mt[x][y] = soma-9;
                    }
                }
                  
               if(x==1){
                
                   if(y==0){  
                       mt[x][y] = valor *= 1;  
                   }else{
                   
                       mt[x][y] = valor *= 2;   
                    }
                }
               
               if((x==1) && (y==8)){
                   mt[x][y] = valor - 1;
               }
           } 
        }
        
        for(int x=0; x<=1; x++){
	   for(int y=0; y<=8; y++){
	       
               texto += " " + mt[x][y];
           }
           texto += "\n";
        }
        System.out.println(texto); 
    }
}
