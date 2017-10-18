package Lote4_Vetor_Matriz_01_12;

public class Ex11 {
    public static void main(String[] args){
       
       String texto = "";
       int mt[][] = new int[8][8];
       
       for(int z=1; z<=4; z++){
	   for(int x=(z-1); x<(9-z); x++){
	       for(int y=(z-1); y<(9-z); y++){
                    mt[x][y]=z;
                }   
            }
        }
         
        for(int x=0; x < mt.length; x++){
	   for(int y=0; y < mt.length; y++){
	       
               texto += " " + mt[x][y];
           }
           texto += "\n";
        }
        System.out.println(texto);
    }
}

