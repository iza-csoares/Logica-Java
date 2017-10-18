package SistemaVotacao;
import java.io.IOException;
import javax.swing.JOptionPane;

public class ClassePrincipal {
    public static void main(String[] args) throws IOException {
        
        Votacao[] votacao = new Votacao[3];     
        int MatrizVotacao[][] = new int [3][2];
        int[] vetor = new int [10];
        Votacao2016 obj = new Votacao2016();
                
        int opcao1 = 0, opcao2 = 0;
        
        do{
        
          opcao1 = obj.MenuPrincipal(opcao1);
                    
          switch(opcao1){
               case 1:
                  votacao = obj.FCadastraVotacao(votacao);
               break;
                    
               case 2:
                  MatrizVotacao = obj.FClassificaSecao(MatrizVotacao, votacao);
                   
               break;
               
               case 3:
                   obj.FGravaVotacao(MatrizVotacao, votacao);
               break;
               
               case 4:
                  
                   do{

                        opcao2 = obj.MenuIndicadores(opcao2);

                        switch(opcao2){

                            case 1:
                                obj.QtdEleitoresSecao(MatrizVotacao, vetor);
                            break;

                            case 2:
                                obj.NumeroSecao(vetor);
                            break;

                            case 3:
                                obj.QtdVotosCandidato();
                            break;

                            case 4:
                                obj.DezMaisVotados();
                            break;

                            case 9:
                                System.exit(0);
                            break;

                            default: JOptionPane.showMessageDialog(null,"Opção inválida");  
                        }
                    }while(opcao2 != 9);
                   
                break;
                
               case 9: 
                   System.exit(0);
               break;
            
               default: JOptionPane.showMessageDialog(null,"Opção inválida");  
            }            
        }while(opcao1 != 9);       
    }
}

