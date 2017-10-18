package SistemaTransito;
import java.io.IOException;
import javax.swing.JOptionPane;

public class ClassePrincipal {
    public static void main (String args [ ]) throws IOException {
        
        Estatistica[] estatistica = new Estatistica[3];
        
        Estatistica2015 obj = new Estatistica2015();
        
        int opcao = 0;
        
        while (opcao!=9){
     
          opcao = Integer.parseInt(JOptionPane.showInputDialog(
            "1 - Cadastro Estatística\n" +
            "2 - Consulta por tipo de veículo\n" + 
            "3 - Consulta por quantidade de acidentes\n" +
            "4 - Consulta todas as cidades\n" +
            "5 - Consulta maior/menor e média de acidentes\n" +
            "9 - Finaliza"));
          
          switch(opcao){
                case 1: 
                   estatistica = obj.FCadastraEstatistica(estatistica);
                break;
            
                case 2: 
                   obj.FTipo(estatistica); 
                  //JOptionPane.showMessageDialog(null, obj.FTipo((Integer.parseInt(JOptionPane.showInputDialog("Digite o tipo: "))), estatistica));
                break;
                
                case 3:
                   obj.PQTacidentes(estatistica); 
                break;
                
                case 4:
                   obj.PConsultaAcidentes(estatistica);
                break;
                
                case 5:
                   obj.Consultas(estatistica);
                break;
            
                case 9: 
                   System.exit(0);
                break;
            
                default: JOptionPane.showMessageDialog(null,"Opção inválida");
            }   
        }  
    } 
}
