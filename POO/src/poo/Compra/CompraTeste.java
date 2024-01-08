package poo.Compra;

public class CompraTeste {

    public static void main(String[] args) {
        Compra c1 = new Compra();
        c1.cliente = "Pedro";
        
        //Adiciona valores em uma ArrayList através de um metodo
        c1.adicionarItem("Caneta", 20, 7.45); 
        c1.adicionarItem("Borracha", 12, 3.85);
        c1.adicionarItem("Caderno", 3, 18.45);
        
        System.out.println(c1.itens.size());
        System.out.printf("%.2f", c1.valorTotal());
        
        //Navegação biderecional NÃO RECOMENDADO
        c1.itens.get(0).compra.itens.get(1).compra.valorTotal();
    }
    
}
