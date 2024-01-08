package poo.Carro;

import poo.Carro.Carro;

public class CarroTeste {
        
    public static void main(String[] args) {
        
        Carro c1 = new Carro();
        c1.ligar();
        System.out.println(c1.estaLigado());
        System.out.println(c1.motor.giros());
        
        c1.acelar();
        c1.acelar();
        c1.acelar();
        c1.acelar();
        System.out.println(c1.motor.giros());
        
        c1.frear();
        c1.frear();
        c1.frear();
        c1.frear();
        c1.frear();
        c1.frear();
        System.out.println(c1.motor.giros());
        
    }
    
}
