public class Guerreiro {
    public int vidaGuerreiro;
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


    public Guerreiro(String nome) {
        this.nomeGuerreiro = nome;
    }

    public void setVidaGuerreiro(int vidaGuerreiro) {
        this.vidaGuerreiro = vidaGuerreiro;
    }

    public int getVidaGuerreiro() {
        return vidaGuerreiro;
    }

    public int marretada(int ptoForca) {

        int danoMarretada = ptoForca * this.danoBasico;

        System.out.println("O dano efetuado pelo guerreiro " + this.nomeGuerreiro + " foi " + danoMarretada + "!!!");
        return danoMarretada;
    }


}




















