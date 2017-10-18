package RevisaoEstRepeticao;
import javax.swing.JOptionPane;

public class Ex02 {
    public static void main(String[] args){
     
      Metodos obj = new Metodos();
    
      int opcao = 0, n1 = 0, n2 = 0;
    
       do{
    
          opcao = Metodos.Menu(opcao);
      
          switch(opcao){
               case 1:    
                  obj.Sequencia1();
               break;
          
               case 2:
                  obj.Sequencia2();
               break;
          
               case 3:
                  obj.Sequencia3(n1, n2);
               break;
          
               case 4:
                  obj.Sequencia4(n1, n2);
               break;
          
               case 5:
                  obj.Sequencia5();
               break;
          
               case 6:
                  obj.Sequencia6(n1);
               break;
          
               case 7:
                  obj.Sequencia7();
               break;
          
               case 8:
                 obj.Sequencia8(n1);
               break;
          
               case 9:
                  System.exit(0);
               break;
      
               default: JOptionPane.showMessageDialog(null, "Opção inválida");
            }
        }while(opcao != 9);  
    }
}
