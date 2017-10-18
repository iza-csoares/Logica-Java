package SistemaVotacao;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JOptionPane;

public class Votacao2016 {

    public Votacao[] FCadastraVotacao(Votacao[] votacao) {
        
        int i;

        for (i = 0; i < 3; i++) {
            votacao[i] = new Votacao();
        }

        for (i = 0; i < 3; i++) {
            votacao[i].nsecao = /*Integer.parseInt(JOptionPane.showInputDialog("Secao"));*/(int) (Math.random() * 10 + 1);
            votacao[i].ncandidato = Integer.parseInt(JOptionPane.showInputDialog("Candidato:")); //(int) (Math.random() * 300 + 1);
        }

        return votacao;
    }

    public int[][] FClassificaSecao(int[][] MatrizVotacao, Votacao[] votacao) {

        int aux1 = 0, aux2 = 0, x, j, y = 0;

        for (x = 0; x < MatrizVotacao.length; x++) {
            for (y = 0; y < MatrizVotacao[x].length; y++) {
               
                MatrizVotacao[x][0] = votacao[x].nsecao;
                MatrizVotacao[x][1] = votacao[x].ncandidato;
            }
        }

        for (x = 0; x < (MatrizVotacao.length - 1); x++) {
            for (j = x + 1; j < MatrizVotacao[x].length; j++) {

                if (MatrizVotacao[x][0] > MatrizVotacao[j][0]) {

                    aux1 = MatrizVotacao[x][0];
                    aux2 = MatrizVotacao[x][1];

                    MatrizVotacao[x][0] = MatrizVotacao[j][0];
                    MatrizVotacao[x][1] = MatrizVotacao[j][1];

                    MatrizVotacao[j][0] = aux1;
                    MatrizVotacao[j][1] = aux2;
                }
            }
        }

        JOptionPane.showMessageDialog(null, "Dados Classificados!");
        return MatrizVotacao;
    }

    public int[][] FGravaVotacao(int[][] MatrizVotacao, Votacao[] votacao) throws IOException {

        String fileName = "ArquivoVotacao.txt";
        BufferedWriter writer = new BufferedWriter(new FileWriter(fileName));
        
        for(int i = 0; i < MatrizVotacao.length; i++) {

            writer.write(Integer.toString(MatrizVotacao[i][0]));
            writer.newLine();

            writer.write(Integer.toString(MatrizVotacao[i][1]));
            writer.newLine();
        }
        writer.close();

        JOptionPane.showMessageDialog(null, "Gravação realizada com sucesso!");

        return MatrizVotacao;
    }

   
    public void QtdEleitoresSecao(int[][] MatrizVotacao, int[] vetor) {
                
        for (int x = 0; x < MatrizVotacao.length; x++) {
            vetor[(MatrizVotacao[x][0])-1]++;
        }
        
        System.out.println(
        "1 – Quantidade Eleitores por Seção \n\n"
        + "Seçao " + 1 + " = " + vetor[0] + " votos"
        + "\nSeçao " + 2 + " = " + vetor[1] + " votos"
        + "\nSeçao " + 3 + " = " + vetor[2] + " votos"
        + "\nSeçao " + 4 + " = " + vetor[3] + " votos"
        + "\nSeçao " + 5 + " = " + vetor[4] + " votos"
        + "\nSeçao " + 6 + " = " + vetor[5] + " votos"
        + "\nSeçao " + 7 + " = " + vetor[6] + " votos"
        + "\nSeçao " + 8 + " = " + vetor[7] + " votos"
        + "\nSeçao " + 9 + " = " + vetor[8] + " votos"
        + "\nSeçao " + 10 + " = " + vetor[9] + " votos");
        
    }
     
    public void NumeroSecao(int[] vetor) {
       
       int[][] MatrizSecao = new int[2][10];
        
       for(int x = 0; x < MatrizSecao.length; x++){
          for(int y = 0; y < MatrizSecao[x].length; y++){
              if(x==0){
                  MatrizSecao[0][y] += 1;
              }
            }
       }
       
       for(int x = 0; x < MatrizSecao.length; x++){
          for(int y = 0; y < MatrizSecao.length; y++){
             System.out.println(MatrizSecao[x][y]);  
          }
       }
       
      /* for(int i = 0; i < vetor.length-1; i++){
          for(int j = (i+1); j < vetor.length; j++){
              
               if(vetor[i] > vetor[j]){
                  
                  int aux = vetor[i];
                  vetor[i] = vetor[j];
                  vetor[j] = aux;
                }
            }
        }
    
           System.out.println(
           "2 – Seção com Maior e Menor número de Eleitores \n\n"
           + "Maior:" + "Seção " + "10" + " = " + vetor[10] + " votos"
           + "Menor:" + "Seção " + "1" + " = " + vetor[1] + "votos");*/
          
    }

    public void QtdVotosCandidato() {

    }

    public void DezMaisVotados() {

    }
    
    public int MenuPrincipal(int opcao1){
               
        return Integer.parseInt(JOptionPane.showInputDialog(
        "1 – Carregar Seção/Número Candidato\n" +  	
        "2 – Classificar por Seção\n" +      		
        "3 – Gravar Registros\n" +                                	
        "4 – Mostrar Indicadores\n" +                                  
        "9 – Finalizar")); 
    }
  
    public int MenuIndicadores(int opcao2){
                
        return Integer.parseInt(JOptionPane.showInputDialog(
        "1 – Quantidade Eleitores por Seção\n" +
        "2 – Seção com Maior e Menor número de Eleitores\n" +
        "3 – Quantidade de votos por candidato\n" +
        "4 – 10 primeiros colocadas (nro, cand. e qtd votos)\n" +
        "9 – Finaliza consulta\n\n"));
    }
}