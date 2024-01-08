package Composicao.desafio;

public class CompraFinal {

    public static void main(String[] args) {
        
        Cliente cliente = new Cliente();
        Compra compras = new Compra();

        cliente.nome = "Pedro";

        compras.addItens("Caneta", 2.25, 5);
        compras.addItens("Borracha", 3.25, 3);
        
        cliente.addcompra(compras);

        System.out.println("Valor total de compra: " + cliente.valorTotal());

    }

}
