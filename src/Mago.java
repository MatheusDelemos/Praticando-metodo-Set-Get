//Todo construtor é metodo mas nem todo metodo é um construtor
public class Mago {
    //definindo as irfomaçôes do mago.
    private int danobasico;    //O mago da um dano na forma de variável inteira
    private String nomeMago;  // E o nome do mago é uma string/texto.

    private int vidaMago;

    //Criando um metodo construtor para setar o nome ao criar um novo mago
    public Mago(String nome) {
        this.nomeMago = nome;
    }

    public int fireball(int ptoInteligencia) {
        //Acima o fireball esta e não o mago tem pto inteligencia e a vidaChef
        int danototal = danobasico * ptoInteligencia;
        //acima danototal esta recebendo danobasic multiplicando ponto inteligencia


        System.out.println("Fireball do mago " + this.nomeMago + " infringiu " + danototal + " de dano!!!");
        return danototal;

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


    public void setvidaMago(int vidaMago){
        this.vidaMago = vidaMago;
    }

    public  int getvidaMago(){
        return vidaMago;
    }
}
