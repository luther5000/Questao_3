package UsaTv;
import Tv.*;

public class Main {
    public static void main(String[] args) {
        Televisao tv = new Televisao();
        System.out.print("BEM VINDO A TV INTERARIVA!!");
        String verifica;

        do {
            System.out.println("\nO que deseja fazer? \n1. Mudar canal \n2. Mudar Volume \n" +
                    "3. Exibir status atual \n4. Desligar televisão");
            verifica = EntradaDados.entraNum(4, 1);
            switch (verifica) {
                case "1":{
                    System.out.println("\nDeseja: \n1. Ir ao próximo canal \n2. Voltar ao canal anterior \n3. Inserir" +
                            " canal que deseja ir \n4. Voltar a seleção anterior");
                    verifica = EntradaDados.entraNum(4, 1);
                    switch (verifica) {
                        case "1":
                            tv.controle.aumentaCanal(tv);
                            System.out.print("Pressione enter para continuar");
                            verifica = EntradaDados.entraString();
                            break;

                        case "2":
                            tv.controle.diminuiCanal(tv);
                            System.out.print("Pressione enter para continuar");
                            verifica = EntradaDados.entraString();
                            break;

                        case "3":
                            tv.controle.pesquisaCanal(tv);
                            System.out.print("Pressione enter para continuar");
                            verifica = EntradaDados.entraString();
                            break;

                        case "4":
                            break;
                    }
                    break;
                }
                case "2": {
                    System.out.println("\nDeseja: \n1. Aumentar volume \n2. Diminuir volume \n3. Voltar a seleção " +
                            "anterior");
                    verifica = EntradaDados.entraNum(3, 1);
                    switch (verifica) {
                        case "1": tv.controle.aumentaVolume(tv);
                            System.out.print("Pressione enter para continuar");
                            verifica = EntradaDados.entraString();
                        break;

                        case "2": tv.controle.diminuiVolume(tv);
                            System.out.print("Pressione enter para continuar");
                            verifica = EntradaDados.entraString();
                        break;

                        case "3": break;
                    }
                    break;
                }
                case "3": {
                    tv.controle.status(tv);
                    System.out.print("Pressione enter para continuar");
                    verifica = EntradaDados.entraString();
                    break;
                }

                case "4":
                    EntradaDados.fechaScanner();
                    System.exit(0);
            }
        }while (true);
    }
}
