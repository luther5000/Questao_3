package Tv;
import UsaTv.EntradaDados;
public class Controle {

    public void aumentaCanal (Televisao tv)  {
        tv.canal++;
        System.out.println("Canal alterado com sucesso!");
    }

     public void diminuiCanal (Televisao tv){
        if (tv.canal>1) {
            tv.canal--;
            System.out.println("Canal alterado com sucesso!");
        }
        else
            System.out.println("Já está no menor canal");
    }

    public void pesquisaCanal (Televisao tv){
        System.out.println("Insira os números do novo canal");
        tv.canal = Integer.parseInt(EntradaDados.entraNum());
    }

    public void aumentaVolume (Televisao tv){
        tv.volume++;
        System.out.println("Volume alterado com sucessso!");
    }

    public void diminuiVolume (Televisao tv){
        if (tv.volume>0) {
            tv.volume--;
            System.out.println("Volume alterado com sucessso!");
        }
        else
            System.out.println("Já está no menor volume");
    }

    public void status (Televisao tv){
        System.out.println(tv);
    }

}
