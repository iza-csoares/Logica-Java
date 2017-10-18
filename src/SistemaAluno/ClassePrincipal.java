package SistemaAluno;
import java.io.IOException;
import javax.swing.JOptionPane;

public class ClassePrincipal {
    public static void main (String arg [ ]) throws IOException {
        
        Aluno[] aluno = new Aluno[3];	
     
      ClasseMetodos m = new ClasseMetodos(); 
        
        int opcao = 0;
           
        while (opcao!=9){
     
          opcao = Integer.parseInt(JOptionPane.showInputDialog(
            "1 - Gravar Aluno\n" + 
            "2 - Ler Aluno \n" + 
            "9 - Finaliza"));
          
          switch(opcao){
                case 1: 
                    aluno = m.GravaAluno(aluno);
                break;
            
                case 2: 
                    m.LerAluno (aluno);
                break;
            
                case 9: 
                    System.exit(0);
                break;
            
                default: JOptionPane.showMessageDialog(null,"Opção inválida");
            }   
        }  
    } 
}
