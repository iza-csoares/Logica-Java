package SistemaAluno;

class Aluno{	 
 
    String pnome, unome;	 	 
    int pontos;		 
   
    Aluno(){	 
       this("" ,"" ,0);	 
    }	 
	 
   Aluno(String pnomealuno, String unomealuno, int pontosaluno){	 
        pnome  = pnomealuno;	 
        unome  = unomealuno;	 
        pontos = pontosaluno;	 
    }	 
}

//Classe com dois métodos abstratos