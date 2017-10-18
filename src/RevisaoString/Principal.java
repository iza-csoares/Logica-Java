package RevisaoString;
import javax.swing.JOptionPane;

public class Principal {
    public static void main(String args[]){
      
        Palavra palavra1 = new Palavra();
        Palavra palavra2 = new Palavra();       
        
        String p1 = JOptionPane.showInputDialog("Palavra 1: ");
        String p2 = JOptionPane.showInputDialog("Palavra 1: ");
        
        System.out.println("Primeira letra da palavra 1: "+palavra1.primeiraLetra(p1));
        System.out.println("Quantas letras tem a palavra 1: "+palavra1.quantasLetras(p1));
       // System.out.println("Quantas letras tem a palavra 1: "+palavra1.ultimaLetra(p1));
    
       if(p1.compareTo(p2)>0){
          String aux = p1;
          p1 = p2;
          p2 = aux;
        }
        System.out.println("Primeiro "+p1.toLowerCase()+" Segundo "+p2.toLowerCase());      

        String v[]={"casa","abacaxi","banana","anel", "janela", "macaco"};
        palavra1.bubbleSort(v);
    }   
}


