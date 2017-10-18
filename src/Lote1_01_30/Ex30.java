package Lote1_01_30;
import javax.swing.JOptionPane;

public class Ex30 {
    public static void main(String[] args){
        
        int dn, mn, an, da, ma = 0, aa, ano = 0, dia = 0, i, y, mes = ma;
        
        dn = Integer.parseInt(JOptionPane.showInputDialog(null, "Dia de nascimento: "));
        mn = Integer.parseInt(JOptionPane.showInputDialog(null, "Mês de nascimento: "));
        an = Integer.parseInt(JOptionPane.showInputDialog(null, "Ano de nascimento: "));
        da = Integer.parseInt(JOptionPane.showInputDialog(null, "Dia atual: "));
        ma = Integer.parseInt(JOptionPane.showInputDialog(null, "Mês atual: "));
        aa = Integer.parseInt(JOptionPane.showInputDialog(null, "Ano atual: "));
        
        if((mn == 2) && (dn == 29)){
	    dn = (28);
	}
	
	for(y = ma; y <= mn; y++){
    	    mes = (mes + 1);	
        }
        
	for(i=an; i<=aa; i++){
       
	   if(i%400==0 || i%100!=0){
      	
      	        dia = (dia + 1); 
		mes = (mn - ma);
	        mes = (12 - mes); 	
            } 
	   if((ma == 2) && (da == 29)){
	        mes = 0;   	
	    }
	}   		
        
        if(ma < mn){
            ano = (aa - an);
            ano = (ano - 1);
        }    	
        
	if((mn < ma) && (da < dn)){
	    mes = 0;
	    ano = (aa - an);
	}
        
        if(ma == mn){
            ano = (aa - an);	
	}
        
    	if((dn == da) || (mn == ma)){
    	    dia = 0;
    	}
        
        if((dn == da) && (mn < ma)){
            mes = (ma - mn);
            ano = (aa - an);
	}
        
        if((dn < da) && (mn == ma)){
	    mes = 0;
	    ano = (aa - an);
	} 
        
	if((dn < da) && (mn < ma)){
            dia = (da - dn);
            mes = (ma - mn);
            ano = (aa - an);    
        }
        
	if(da > dn){
	    dia = (da - dn);
	}
        
	if(dn > da){
	    dia = (dn - da);
        }
        
	if((dn > da) && (mn < ma)){
	    dia = (dn + 1);
	}
        
	if ((dn == da) && (mn == ma) && (an == aa)){
	    System.out.println("A data de nascimento e a mesma atual.");
	    ano = 0;
	    mes = 0;
	    dia = 0;
	} 
        
      System.out.println("Ano: " + ano);	
      System.out.println("Mes: " + mes);
      System.out.println("Dia: " + dia);  
        
    }
}
