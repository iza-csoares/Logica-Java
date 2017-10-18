package Lote4_Vetor_Matriz_01_12;
import javax.swing.JOptionPane;

public class Ex12 {
    public static void main(String[] args){
       
       String texto = "";
       int mt[][] = new int[8][8];
       int v[] = new int[7];
        
       for(int x=0; x < mt.length; x++){
	   for(int y=0; y < mt[x].length; y++){
	      //mt[x][y] = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite: ")) - 1;
              
              mt[x][y] = (int)(Math.random() * 7+1)-1;
              v[mt[x][y]]++;
            }
       }
       
        for(int x=0; x < mt.length; x++){
	   for(int y=0; y < mt[x].length; y++){
               texto += " " + mt[x][y];
           }
           texto += "\n";
        }
        System.out.println(texto);
       
       for(int x=0; x < v.length; x++){
	   
           System.out.print("\n("+x+"): " + v[x]);
           /*System.out.print("\n(1): " + v[1]);
           System.out.print("\n(2): " + v[2]);
	   System.out.print("\n(3): " + v[3]);
	   System.out.print("\n(4): " + v[4]);
	   System.out.print("\n(5): " + v[5]);
	   System.out.print("\n(6): " + v[6]);
           System.out.println();*/
        }
       System.out.println();
    }
}