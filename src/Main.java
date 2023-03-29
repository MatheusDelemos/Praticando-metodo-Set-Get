import java.util.Scanner;

public class Main {
    //Transformar nome dos magos de variavel para uma propriedado dos magos semelhante ao dano basico
    public static void main(String[] args) {
        int vidaChef = 350;
        //Definindo um obejo mago arcano e setando um nome para ele
        // Mago arcano = new Mago("jorge");
        //definindo um dano para o mago arcano
        //arcano.setDanobasico(20);

        Mago arcano = createMago();

        Guerreiro furia = createGuerreiro();

        Assassino sombra = createAssassino();



        if (furia.marretada(10, vidaChef)) {
            System.out.println("O boss foi de arrasta pra cima ");

        } else {
            System.out.println("O boss sobreviveu !");
        }

        if (arcano.fireball(10, vidaChef)) {
            System.out.println("O boss foi de comes e bebes");

        } else {
            System.out.println("O boss continua de pé ");
        }
        if (sombra.esfaquear(15, vidaChef)) {
            System.out.println("O boss foi de Americanas");

        } else {
            System.out.println("O boss continua de pé ");

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
        //retornando o mago arcano
        return arcano;
    }

    private static Guerreiro createGuerreiro() {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite o nome de seu Guerreiro: ");
        String nome = teclado.nextLine();

        System.out.println("Digite o dano basico para seu Guerreiro: ");
        int dano  = teclado.nextInt();

        Guerreiro furia= new Guerreiro(nome);
        furia.setDanoBasico(dano);

        return furia;

    }
    // criando o metodo para criação do assassino e usando o scanner para pegar dados do teclado
private static Assassino createAssassino(){
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
        //retornando o assassino sombra
        return sombra;

}

}