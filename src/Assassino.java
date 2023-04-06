public class Assassino {
    public int vidaAssassino;
    public String nomeAssassino;
    public int danobasico;

    public void setDanobasico(int danobasico) {
        this.danobasico = danobasico;
    }

    public int getDanobasico() {
        return danobasico;
    }

    public void setNomeAssassino(String nomeAssassino) {
        this.nomeAssassino = nomeAssassino;
    }

    public String getNomeAssassino() {
        return nomeAssassino;
    }


    public Assassino(String nome) {
        this.nomeAssassino = nome;

    }
 public void setVidaAssassino(int vidaAssassino){
        this.vidaAssassino = vidaAssassino;
 }

 public  int getVidaAssassino(){
        return vidaAssassino;
 }



    public int esfaquear(int ptoDeztresa) {
        int danoEsfaquear = ptoDeztresa * this.danobasico;

        System.out.println("O dano causado pelo Assassino foi " + danoEsfaquear + " !!");
        return danoEsfaquear;
    }

}
