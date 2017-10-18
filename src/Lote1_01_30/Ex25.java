package Lote1_01_30;
import javax.swing.JOptionPane;

public class Ex25 {
    public static void main(String[] args){
        
        /* try{
            
        }catch(Exception e){
            
        }finally{
            
        }*/
        
        int hi, hf, mi, mf, dm, hora, i, total = 0, hora24 = 24, minuto = 0;
       
        hi = Integer.parseInt(JOptionPane.showInputDialog(null, "Hora - Inicio: "));
        
        if(hi > 24){
            JOptionPane.showMessageDialog(null, "Erro");
            System.exit(0);   
        }
        
        mi = Integer.parseInt(JOptionPane.showInputDialog(null, "Minuto - Inicio: "));
        
        if(mi > 59){
            JOptionPane.showMessageDialog(null, "Erro"); 
            System.exit(0);   
        } 
         
        hf = Integer.parseInt(JOptionPane.showInputDialog(null, "Hora - Fim: "));
        
        if(hf > 24){
            JOptionPane.showMessageDialog(null, "Erro");
            System.exit(0);   
        }
        
        mf = Integer.parseInt(JOptionPane.showInputDialog(null, "Minuto - Fim: "));
        
        
        if(mf > 59){
            JOptionPane.showMessageDialog(null, "Erro");
            System.exit(0);  
        }
        
        if(hi == hf && mi == mf){
	    System.out.println("O jogo durou 24 horas!");
	}

	if(hi == hf && mi < mf){
	    dm = (mf - mi);
	    System.out.println("Minutos: " + dm);
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
        
        if(hf > hi){
     	    System.exit(0);    
        }   
    }
}
