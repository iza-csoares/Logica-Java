package SistemaTransito;

class Estatistica{
    
    String ncidade;
    int ccidade, qacidentes, tveiculo; 
     
    Estatistica(){
        this(0, "", 0, 0);
    }
    
    Estatistica(int codcidade, String nomecidade, int qtdacidentes, int tipoveiculo){	 
        ccidade  = codcidade;
        ncidade  = nomecidade;		
        qacidentes = qtdacidentes;
        tveiculo = tipoveiculo;
    }                                                                             
}


