public class Guerreiro {
    public int danoBasico;
    public String nomeGuerreiro;

    public void setDanoBasico(int danoBasico) {

        this.danoBasico = danoBasico;

    }

    public int getDanobasico() {

        return this.danoBasico;
    }

    public void setNomeGuerreiro(String nomeGuerreiro) {

        this.nomeGuerreiro = nomeGuerreiro;

    }

    public String getnomeGuerreiro() {
        return nomeGuerreiro;
    }
    public Guerreiro(String nome){
        this.nomeGuerreiro = nome;
    }

    public boolean marretada(int ptoForca, int vidaChef ){

       int danoMarretada = ptoForca*this.danoBasico;
       boolean killboss = danoMarretada > vidaChef;
       System.out.println("O dano efetuado pelo guerreiro foi "+ danoMarretada + "!!!");
       return killboss;
    }



}




















