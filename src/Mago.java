//Todo construtor é metodo mas nem todo metodo é um construtor
public class Mago {
    //definindo as irfomaçôes do mago.
    private int danobasico;    //O mago da um dano na forma de variável inteira
    private String nomeMago;  // E o nome do mago é uma string/texto.

    //Criando um metodo construtor para setar o nome ao criar um novo mago
    public Mago(String nome) {
        this.nomeMago = nome;
    }

    public boolean fireball(int ptoInteligencia, int vidaChef) {
        //Acima o fireball esta e não o mago tem pto inteligencia e a vidaChef
        int danototal = danobasico * ptoInteligencia;
        //acima danototal esta recebendo danobasic multiplicando ponto inteligencia
        boolean hitkill = vidaChef < (danobasico * ptoInteligencia);
        //boolean aqui serve csetar um true no hitkill que é a vida do chef e o dano vezes pt inteligencia
        System.out.println("Fireball do mago " +this.nomeMago+ " infringiu " + danototal + " de dano!!!");
        return hitkill;
        //retornando o hitkill
    }

    //Aqui setamos o dano basico  da classe mago
    public void setDanobasico(int danobasico) {
        this.danobasico = danobasico;
    }

    public int getDanobasico() {
        return this.danobasico;
    }
//Aqui setaremos o nome do mago

    public void setNomeMago(String nomeMago) {
        this.nomeMago = nomeMago;
    }

    public String getNomeMago() {
        return this.nomeMago;
    }
}
