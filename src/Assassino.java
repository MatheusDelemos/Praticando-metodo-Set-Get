public class Assassino {
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

    public boolean esfaquear(int ptoDeztresa, int vidachef) {
        int danoEsfaquear = ptoDeztresa * this.danobasico;
        boolean killboss = vidachef < danoEsfaquear;
        System.out.println("O dano causado pelo Assassino foi " + danoEsfaquear + " !!");
        return killboss;
    }

}
