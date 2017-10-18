package Lote4_Vetor_Matriz_01_12;
import javax.swing.JOptionPane;

public class Ex01 {
    public static void main(String[] args){
       
       int[] vtn = new int[10];
       int i = 0;
       
        for(i=0; i < vtn.length; i++){
           vtn[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite: ")); 
        }
        
        Ex01 obj = new Ex01();
	obj.Vetor(vtn); 
    }
   
    public static void Vetor(int[] vtn){
        
       int i = 0, media = 0, impar = 0, soma = 0, total = 0;
	
       for(i=0; i < vtn.length; i++){
           if(vtn[i]>5 && vtn[i]<10){  
	       soma = (soma + (vtn[i]));
               total = (total + 1);
            }
            
           if(vtn[i]%2==1){
	       impar = (impar + (vtn[i]));
            }
       }
       
        media = (soma/total);
	   
	System.out.println("Média: " + media);
        System.out.println("Soma de ímpares: " + impar);       
    }
}