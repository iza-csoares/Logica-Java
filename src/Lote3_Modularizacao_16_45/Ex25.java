package Lote3_Modularizacao_16_45;
import javax.swing.JOptionPane;

public class Ex25 {
    public static void main(String[] args){
        
        int hi = 0;
        hi = Integer.parseInt(JOptionPane.showInputDialog(null, "Hora - Inicio: "));
        
        int mi = 0;
        mi = Integer.parseInt(JOptionPane.showInputDialog(null, "Minuto - Inicio: "));
        
        int hf = 0;
        hf = Integer.parseInt(JOptionPane.showInputDialog(null, "Hora - Fim: "));
        
        int mf = 0;
        mf = Integer.parseInt(JOptionPane.showInputDialog(null, "Minuto - Fim: "));
        
        Ex25 obj = new Ex25();
        obj.Duração(hi, mi, hf, mf);
        
    }
    
    public static void Duração(int hi, int mi, int hf, int mf){
        int dm, hora, i, total = 0, hora24 = 24, minuto = 0;
        
        if(hi == hf && mi == mf){
	    System.out.println("O jogo durou um dia!");
	}

	if(hi == hf && mi < mf){
	    dm = (mf - mi);
	    System.out.println("Minutos: " + dm);
	}

	if(hf > hi){
     	    System.out.println("Não permitido!");
        }

	if(hi > hf){
	    if(mi==mf){
	       for(i=hf; i<hi; i++){ 
		    total = total + 1;
	  	    hora24 = hora24 - total;  	
   	        }
   	    System.out.println("Durou " + hora24 + " horas");
	    }
		
	    if(mi<mf){
	       for(i=hf; i<hi; i++){
		    total = total + 1;
	  	    hora24 = hora24 - total; 
		    minuto = mf - mi;
   	        }
   	    System.out.println("Durou " + hora24 + " horas e " + minuto + " minutos");
	    }	
        }         
    }
}