package Aleatorios;

import javax.swing.JOptionPane;

public class DissecandoMatrizes {

    static String texto = "";
    static int i = 0;

    public static void main(String[] args) {

        int mt[][] = new int[5][5];
        int opcao = 0;
        DissecandoMatrizes obj = new DissecandoMatrizes();

        while (opcao != 9) {
            opcao = Integer.parseInt(JOptionPane.showInputDialog(
                    "1 - Diagonal Principal\n"
                    + "2 - Superior Diagonal Principal\n"
                    + "3 - Inferior Diagonal Principal\n"
                    + "4 - Diagonal Secundária\n"
                    + "5 - Superior Diagonal Secundária\n"
                    + "6 - Inferior Diagonal Secundária\n"
                    + "9 - Fim"));

            switch (opcao) {
                case 1:
                    obj.DiagonalPrincipal(mt);
                    break;

                case 2:
                    obj.SuperiorDiagonalPrincipal(mt);
                    break;

                case 3:
                    obj.InferiorDiagonalPrincipal(mt);
                    break;

                case 4:
                    obj.DiagonalSecundaria(mt);
                    break;

                case 5:
                    obj.SuperiorDiagonalSecundaria(mt);
                    break;

                case 6:
                    obj.InferiorDiagonalSecundaria(mt);
                    break;

                case 9:
                    System.exit(0);
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Inválido");
            }
        }
    }

    public static void DiagonalPrincipal(int[][] mt) {

        for (int x = 0; x < mt.length; x++) {
            for (int y = 0; y < mt[x].length; y++) {
                mt[x][y] = 0;
            }
        }

        for(int x = 0; x < mt.length; x++) {
            for(int y = x; y <= x; y++) {
                // mt[x][y] = 1;
                mt[x][y] = Calculo(x, y);

            }
        }

        for(int x = 0; x < mt.length; x++) {
            for(int y = 0; y < mt[x].length; y++) {
                // System.out.println("M["+x+"]["+y+"] = "+mt[x][y]);
                texto += " " + mt[x][y];
            }
            texto += "\n";
        }
        System.out.println(texto);
        texto = "";
    }

    public static void DiagonalSecundaria(int[][] mt) {

        int valor = 1;

        for(int x = 0; x < mt.length; x++){
            for(int y = 0; y < mt[x].length; y++){
                if(y != (5-x-1)){
                    mt[x][y] = (int)(Math.random()); 
                }else{
                   if(x==0 && y==4){
                       mt[x][y] = 1;  
                    }else{
                       mt[x][y] = valor += 2;
                   }
                } 
            }
        }

        for (int x = 0; x < mt.length; x++) {
            for (int y = 0; y < mt[x].length; y++) {

                texto += " " + mt[x][y];
            }
            texto += "\n";
        }
        System.out.println(texto);
        texto = "";
    }

    public static void SuperiorDiagonalPrincipal(int[][] mt) {

        for (int x = 0; x < mt.length; x++) {
            for (int y = 0; y < mt[x].length; y++) {
                mt[x][y] = 0;
            }
        }

        for (int x = 0; x <= 4; x++) {
            for (int y = (x + 1); y <= 4; y++) {
                mt[x][y] = 1;
            }
        }
        for (int x = 0; x < mt.length; x++) {
            for (int y = 0; y < mt[x].length; y++) {

                texto += " " + mt[x][y];
            }
            texto += "\n";
        }
        System.out.println(texto);
        texto = "";
    }

    public static void InferiorDiagonalPrincipal(int[][] mt) {

        for (int x = 0; x < mt.length; x++) {
            for (int y = 0; y < mt[x].length; y++) {
                mt[x][y] = 0;
            }
        }

        for (int x = 1; x <= 4; x++) {
            for (int y = 0; y <= (x - 1); y++) {
                mt[x][y] = 1;
            }
        }
        for (int x = 0; x < mt.length; x++) {
            for (int y = 0; y < mt[x].length; y++) {

                texto += " " + mt[x][y];
            }
            texto += "\n";
        }
        System.out.println(texto);
        texto = "";
    }

    public static void SuperiorDiagonalSecundaria(int[][] mt) {

        for (int x = 0; x < mt.length; x++) {
            for (int y = 0; y < mt[x].length; y++) {
                mt[x][y] = 0;
            }
        }

        for (int x = 0; x <= 4; x++) {
            for (int y = 0; y <= (4 - x - 1); y++) {
                mt[x][y] = 1;
            }
        }
        for (int x = 0; x < mt.length; x++) {
            for (int y = 0; y < mt[x].length; y++) {

                texto += " " + mt[x][y];
            }
            texto += "\n";
        }
        System.out.println(texto);
        texto = "";
    }

    public static void InferiorDiagonalSecundaria(int[][] mt) {

        for (int x = 0; x < mt.length; x++) {
            for (int y = 0; y < mt[x].length; y++) {

                mt[x][y] = 0;
            }
        }

        for (int x = 0; x <= 4; x++) {
            for (int y = (4 - x + 1); y <= 4; y++) {
                mt[x][y] = 1;

            }
        }
        for (int x = 0; x < mt.length; x++) {
            for (int y = 0; y < mt[x].length; y++) {

                texto += " " + mt[x][y];
            }
            texto += "\n";
        }
        System.out.println(texto);
        texto = "";
    }

    public static int Calculo(int x, int y) {

        int calc = 0;

        calc = (int) (Math.pow(4, i));
        i++;

        return calc;
    }
}
