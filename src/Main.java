import java.util.Scanner;

public class Main {
    //Transformar nome dos magos de variavel para uma propriedado dos magos semelhante ao dano basico
    public static void main(String[] args) {
        int vidaChef = 260;
        //Definindo um obejo mago arcano e setando um nome para ele
        Mago arcano = new Mago("jorge");
        //definindo um dano para o mago arcano
        arcano.setDanobasico(20);

        System.out.println("O dano do " + arcano.getNomeMago() + " é " + arcano.getDanobasico());


        Guerreiro furia = new Guerreiro("Miguel");
        furia.setDanoBasico(30);


        if(furia.marretada(10,vidaChef)){
            System.out.println("O boss foi de arrasta pra cima ");

        }else{
            System.out.println("O boss sobreviveu !");
        }

        if(arcano.fireball(10,vidaChef)){
            System.out.println("O boss foi de comes e bebes");

        }else {
            System.out.println("O boss continua de pé ");
        }

    }

}