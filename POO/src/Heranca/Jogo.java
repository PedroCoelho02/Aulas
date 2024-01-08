package Heranca;

public class Jogo {

    public static void main(String[] args) {
        Monstro monstro = new Monstro();
        Heroi heroi = new Heroi();

        monstro.x = 10;
        monstro.y = 10;

        heroi.x = 10;
        heroi.y = 11;

        System.out.println("O monstro tem => " + monstro.vida);
        System.out.println("O hetoi tem => " + heroi.vida);

        monstro.atacar(heroi);
        heroi.atacar(monstro);
        monstro.atacar(heroi);
        heroi.atacar(monstro);

        System.out.println("O monstro tem => " + monstro.vida);
        System.out.println("O heroi tem => " + heroi.vida);
    }

}
