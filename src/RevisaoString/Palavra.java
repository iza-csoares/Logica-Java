package RevisaoString;

public class Palavra {
      
    public char primeiraLetra(String p){
      return p.charAt(0);
    }
   
    public int quantasLetras(String p){
       return p.length();
    }
    
    public char ultimaLetra(String p){
       return p.charAt(-1);
    }
    
    public void bubbleSort (String vet[]){
       boolean flag=false;
      
       for (int i=0; i < vet.length; i++){
           for (int j=i+1; j < vet.length; j++){
              if(vet[i].compareTo(vet[j])>0){
                 String aux = vet[i];
                 vet[i] = vet[j];
                 vet[j] = aux;
                 flag=true;
              }
            }
          
           if (!flag)
              break;
       
       }
       
       for (int i=0; i < vet.length; i++){
           System.out.println(vet[i]);
       }
       
   }
}
