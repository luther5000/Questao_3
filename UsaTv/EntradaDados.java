package UsaTv;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class EntradaDados {


    private static Scanner tc = new Scanner (System.in);
    private static String retorna;

//-----------------------------------------------------------------------------------

    //método para o fechamento do Scanner após o fim do programa
    public static void fechaScanner (){tc.close();}

    //-------------------------------------------------------------------------------------------


    public static String entraString (){ return tc.nextLine();}
    public static String entraNum (int max, int min){

        do {
            retorna = tc.nextLine();
            if (verificaNumero(retorna, max, min)) //chamada da função tipo boolean que verifica se o
                // numero inserido eh valido
                return retorna;
        }while (true);
    }


    /*para verificar se o numero inserido é realmente um número utilizamos a tabela ASCCI e a passagem de char para int
    que nos fornece o número da tabela ASCCI que se refere ao caracter. como os número de 0 a 9 são representados
    pelos números de 48 a 57 na tabela ASCCI, qualquer outro valor que seja inserido fará com que a função retorne
    falso*/
    public static boolean verificaNumero(String s, int max, int min){
        for (int i=0; i<s.length(); i++)
            if ((s.charAt(i) < 48) || s.charAt(i) > 57) {
                JOptionPane.showMessageDialog(null, "Insira apenas " +
                        "números", "ERRO", JOptionPane.ERROR_MESSAGE);
                return false;
            }
        //verificação para quer o usuário não insira um valor que não possui operações disponíveis
            if (Integer.parseInt(s) > max || Integer.parseInt(s) < min) {
                JOptionPane.showMessageDialog(null, "Essa opção não existe! " +
                        "Insira uma opção válida", "ERRO", JOptionPane.ERROR_MESSAGE);
                return false;
            }
        return true;
    }

//--------------------------------------------------------------------------------------------------------

    public static String entraNum(){

        //criamos uma repetição cuja condição de saída é inserir um valor numérico válido.
        do {
            retorna = tc.nextLine();
            if (verificaNumero(retorna)) //chamada da função tipo boolean que verifica se o numero inserido eh valido
                return retorna;
        }while (true);
    }

    /*para verificar se o numero inserido é realmente um número utilizamos a tabela ASCCI e a passagem de char para int
    que nos fornece o número da tabela ASCCI que se refere ao caracter. como os número de 0 a 9 são representados
    pelos números de 48 a 57 na tabela ASCCI, qualquer outro valor que seja inserido fará com que a função retorne
    falso*/
    public static boolean verificaNumero (String s){

        for (int i=0; i<s.length(); i++)
            if ((s.charAt(i) < 48) || s.charAt(i) > 57) {
                JOptionPane.showMessageDialog(null, "Insira apenas " +
                        "números", "ERRO", JOptionPane.ERROR_MESSAGE);
                return false;
            }
        if (Integer.parseInt(s) < 1 || Integer.parseInt(s) > 100) {
            JOptionPane.showMessageDialog(null, "O canal inserido não existe! " +
                    "A televisão só possui os canais do 1 ao 100", "ERRO", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        return true;
    }
}
