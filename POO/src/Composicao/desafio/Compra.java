package Composicao.desafio;

import java.util.ArrayList;
import java.util.List;

public class Compra {

    List<Item> itens = new ArrayList<>();

    void addItens(Produto p, int quantidadeItem) {
        this.itens.add(new Item(p, quantidadeItem));
    }
    void addItens(String nome, double preco, int quantidadeItem) {
        this.itens.add(new Item(new Produto(nome, preco), quantidadeItem));
    }

    double valorTotalItens() {
        double total = 0;
        for (Item item : itens) {
            total += item.quantidadeItem * item.produto.preco;
        }
        return total;
    }

}
