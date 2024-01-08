package Heranca.desafio;

public class TesteCarro {

    public static void main(String[] args) {
        Carro ferrari = new Ferrari(400);
        Carro gol = new Gol();

        ferrari.acelerar();
        ferrari.acelerar();
        ferrari.acelerar();
        System.out.println(ferrari);
        ferrari.frear();
        ferrari.frear();
        ferrari.frear();
        System.out.println(ferrari);

        gol.acelerar();
        gol.acelerar();
        gol.acelerar();
        System.out.println(gol);
        gol.frear();
        System.out.println(gol);
    }

}
