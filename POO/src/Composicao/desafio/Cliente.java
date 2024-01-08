package Composicao.desafio;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
    
    String nome;
    List<Compra> compras = new ArrayList<>();
    
    void addcompra(Compra compra) {
        this.compras.add(compra);
    }
    
    double valorTotal() {
        double totalCompra = 0;
        
        for (Compra compra : compras) {
            totalCompra += compra.valorTotalItens();
        }
        return totalCompra;
    }
}
