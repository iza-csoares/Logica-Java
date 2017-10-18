package SistemaTransito;

import java.io.*;
import javax.swing.*;

public class Estatistica2015 {

    public Estatistica[] FCadastraEstatistica(Estatistica[] estatistica) throws IOException {

        String fileName = "ArquivoEstatistica.txt";
        BufferedWriter writer = new BufferedWriter(new FileWriter(fileName));

        int i;
        
        for (i = 0; i < 3; i++) {
            estatistica[i] = new Estatistica();
        }

        for(i = 0; i < 3; i++){

            estatistica[i].ccidade = Integer.parseInt(JOptionPane.showInputDialog("Entre com o código da cidade:"));
            writer.write(Integer.toString(estatistica[i].ccidade));
            writer.newLine();

            estatistica[i].ncidade = JOptionPane.showInputDialog("Entre com o nome da cidade:");
            writer.write(estatistica[i].ncidade);
            writer.newLine();

            estatistica[i].qacidentes = Integer.parseInt(JOptionPane.showInputDialog("Entre com a quantidade de acidentes:"));
            writer.write(Integer.toString(estatistica[i].qacidentes));
            writer.newLine();

            estatistica[i].tveiculo = Integer.parseInt(JOptionPane.showInputDialog("Entre com o tipo do veículo:"));
            writer.write(Integer.toString(estatistica[i].tveiculo));
            writer.newLine();
            
        }

        JOptionPane.showMessageDialog(null, "Gravação feita com sucesso!");
        writer.close();

        return estatistica;
    }

    public void FTipo(Estatistica[] estatistica) throws IOException {
       
        String fileName = "ArquivoEstatistica.txt";
        BufferedReader reader = new BufferedReader(new FileReader(fileName));
        
        int i = 0, j = 0, retorno = 0, tipo = 0;

        tipo = Integer.parseInt(JOptionPane.showInputDialog("Veículo: "));
        
        for (i = 0; i < 3; i++) {
            estatistica[i] = new Estatistica();
        }

        for (i = 0; i < 3; i++) {

            estatistica[i].ccidade = Integer.parseInt(reader.readLine());
            estatistica[i].ncidade = reader.readLine();
            estatistica[i].qacidentes = Integer.parseInt(reader.readLine());
            estatistica[i].tveiculo = Integer.parseInt(reader.readLine());
            j++;
        }

        for (i = 0; i < j; i++) {
            if (estatistica[i].tveiculo == tipo) {
                retorno++;
            }
        }

        JOptionPane.showMessageDialog(null, retorno);
    }

    public void PQTacidentes(Estatistica[] estatistica) throws IOException {

        String fileName = "ArquivoEstatistica.txt";
        BufferedReader reader = new BufferedReader(new FileReader(fileName));

        int i;
        
        for (i = 0; i < 3; i++) {
            estatistica[i] = new Estatistica();
        }

        for (i = 0; i < 3; i++) {

            estatistica[i].ccidade = Integer.parseInt(reader.readLine());
            estatistica[i].ncidade = reader.readLine();
            estatistica[i].qacidentes = Integer.parseInt(reader.readLine());
            estatistica[i].tveiculo = Integer.parseInt(reader.readLine());
        }

        for (i = 0; i < 3; i++) {
            if ((estatistica[i].qacidentes > 100) && (estatistica[i].qacidentes < 500)) {

                System.out.println("\nCódigo Cidade: " + estatistica[i].ccidade + " " + "Nome Cidade: " + estatistica[i].ncidade + " " + " Quantidade acidentes: " + estatistica[i].qacidentes + " " + "Tipo de Veículo: " + estatistica[i].tveiculo + " ");
            }
        }
    }

    public void PConsultaAcidentes(Estatistica[] estatistica) throws IOException {

        String fileName = "ArquivoEstatistica.txt";
        BufferedReader reader = new BufferedReader(new FileReader(fileName));

        int i;
        
        for (i = 0; i < 3; i++) {
            estatistica[i] = new Estatistica();
        }

        for (i = 0; i < 3; i++) {

            estatistica[i].ccidade = Integer.parseInt(reader.readLine());
            estatistica[i].ncidade = reader.readLine();
            estatistica[i].qacidentes = Integer.parseInt(reader.readLine());
            estatistica[i].tveiculo = Integer.parseInt(reader.readLine());
        }

        for (i = 0; i < 3; i++) {
            System.out.println("Código Cidade: " + estatistica[i].ccidade + " " + "Nome Cidade: " + estatistica[i].ncidade + " " + " Quantidade acidentes: " + estatistica[i].qacidentes + " ");
        }

        reader.close();
    }

    public void Consultas(Estatistica[] estatistica) throws IOException {
        
        String fileName = "ArquivoEstatistica.txt";
        BufferedReader reader = new BufferedReader(new FileReader(fileName));
        
        int v[] = new int[3];
        int i, j, aux = 0;
        double media = 0, total = 0;
        
        for (i = 0; i < 3; i++) {
            estatistica[i] = new Estatistica();
        }
 
        for (i = 0; i < 3; i++) {
 
            estatistica[i].ccidade = Integer.parseInt(reader.readLine());
            estatistica[i].ncidade = reader.readLine();
            estatistica[i].qacidentes = Integer.parseInt(reader.readLine());
            estatistica[i].tveiculo = Integer.parseInt(reader.readLine());
             
            total += estatistica[i].qacidentes; 
        }
        
        media = (total / 3);
          
        for(j = 0; j < v.length; j++){
       
            v[j] =  estatistica[j].qacidentes;  //vetor recebe os numeros de acidentes
        }
     
        for(j=0; j < (v.length-1); j++){
	   for(int y=(j+1); y < v.length; y++){
	        
               if(v[j]>v[y]){
                   aux = v[j];                  //vetor ordena os numeros de acidentes
	           v[j] = v[y];
                   v[y] = aux;
               }
           }
        }
        
        System.out.println("Maior número de acidentes: " + v[2]);
        System.out.println("Menor número de acidentes: " + v[0]);
      
        System.out.println("\nCidades com quantidade de acidentes acima da média " + "(" + media + ")");
        for (i = 0; i < 3; i++) {
            if (estatistica[i].qacidentes > media) {
                System.out.println("Cidade: " + estatistica[i].ncidade + " " + "- Número de acidentes: " + estatistica[i].qacidentes);
            }
        }
    }
}
