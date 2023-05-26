package Tv;

public class Televisao {

//--------------------------------------------------------------

    protected int canal = 1;
    protected int volume = 0;
    public Controle controle = new Controle(); //minha ideia foi que cada televisão possui um controle, e esse controle
    //é usado para alterar os campos da televisão

//----------------------------------------------------------------


    public String toString(){
        return ("Canal atual: " + canal + "\nVolume atual: " + volume + "\n");
    }
}
