import java.util.Scanner;

public class Main {
    //Transformar nome dos magos de variavel para uma propriedado dos magos semelhante ao dano basico
    public static void main(String[] args) {
        Boss monstro = new Boss();
        monstro.setVidaBoss(1400);
        monstro.setDanoBoss(650);

        //Definindo um obejo mago arcano e setando um nome para ele
        // Mago arcano = new Mago("jorge");
        //definindo um dano para o mago arcano
        //arcano.setDanobasico(20);

        Mago arcano = createMago();

        Guerreiro furia = createGuerreiro();

        Assassino sombra = createAssassino();



        if (sombra.getVidaAssassino()> 0){
            int vidaA = sombra.getVidaAssassino() - monstro.danoBoss;
            sombra.setVidaAssassino(vidaA);
            System.out.println("A vida restante do assassino é: " + vidaA);

        }
        else {
            System.out.println("O assassino morreu");

        }

       if (furia.getVidaGuerreiro()> 0){
           int vidaG = furia.getVidaGuerreiro() - monstro.danoBoss;
           furia.setVidaGuerreiro(vidaG);
           System.out.println("A vida restante do guerreiro é: " + vidaG);

       }
       else { System.out.println("O guerreiro morreu");

       }

        if (arcano.getvidaMago() > 0) {
            int vidaM = arcano.getvidaMago() - monstro.danoBoss;
            arcano.setvidaMago(vidaM);
            System.out.println("A vida restante do mago é: " + vidaM);

        } else {
            System.out.println("O mago morreu");
        }

        if (monstro.getVidaBoss() > 0) {
            int vida = monstro.vidaBoss - arcano.fireball(30);
            monstro.setVidaBoss(vida);
            System.out.println("A vida restante do Boss é: " + vida + " !!");
        } else {
            System.out.println("O Boss foi de berço hehe ");

        }

        if (monstro.getVidaBoss() > 0) {
            int vida = monstro.vidaBoss - furia.marretada(25);
            monstro.setVidaBoss(vida);
            System.out.println("A vida restante do Boss é: " + vida + " !!");
        } else {
            System.out.println("O Boss foi de berço hehe ");

        }
        if (monstro.getVidaBoss() > 0) {
            int vida = monstro.vidaBoss - sombra.esfaquear(35);
            monstro.setVidaBoss(vida);
            System.out.println("A vida restante do Boss é: " + vida + " !!");
        } else {

            System.out.println("O Boss foi de berço hehe ");

        }
        if (monstro.getVidaBoss() <= 0) {

            System.out.println("O boss morreu bem morto mesmo ");

        } else {
        }
    }

    private static Mago createMago() {
        //Usando Scanner para buscar dados do teclado
        Scanner teclado = new Scanner(System.in);
        // Pedindo para o usuario Nome do mago com po print E criando uma variável nome e recebendo o obejeto teclado
        System.out.println("Digite um nome para seu Mago: ");
        String nome = teclado.nextLine();

        System.out.println("Digite o dano basico para seu Mago: ");
        int dano = teclado.nextInt();
        // Criando um novo mago e setando seu nome
        Mago arcano = new Mago(nome);
        //Setando o dano do mago
        arcano.setDanobasico(dano);
        //definindo a vida do mago
        arcano.setvidaMago(1000);
        int vida = arcano.getvidaMago();
        //retornando o mago arcano
        System.out.println("A vida do " + nome + " é " + vida);
        return arcano;
    }

    private static Guerreiro createGuerreiro() {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite o nome de seu Guerreiro: ");
        String nome = teclado.nextLine();

        System.out.println("Digite o dano basico para seu Guerreiro: ");
        int dano = teclado.nextInt();

        Guerreiro furia = new Guerreiro(nome);
        furia.setDanoBasico(dano);

        furia.setVidaGuerreiro(1000);
        int vida = furia.getVidaGuerreiro();

        System.out.println("A vida do " + nome + " é " + vida);
        return furia;

    }

    // criando o metodo para criação do assassino e usando o scanner para pegar dados do teclado
    private static Assassino createAssassino() {
        Scanner teclado = new Scanner(System.in);
        //criando uma função string para coletar o nome do teclado
        System.out.println("Digite o nome do seu Assassino: ");
        String nome = teclado.nextLine();
        //criando uma função para coletar o dano basico do teclado
        System.out.println("Digite o dano basico para seu Assassino");
        int dano = teclado.nextInt();
        // Setando o nome e o dano e a subclasse do assassino
        Assassino sombra = new Assassino(nome);
        sombra.setDanobasico(dano);
        //setando a vida do assassino
        sombra.setVidaAssassino(1000);
        int vida = sombra.getVidaAssassino();

        System.out.println("A vida do " + nome + " é " + vida);

        //retornando o assassino sombra
        return sombra;

    }


}