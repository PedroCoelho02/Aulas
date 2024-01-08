package poo.Compra;

import java.util.ArrayList;

public class Compra {
    String cliente;
    ArrayList<Item> itens = new ArrayList<>();
    
    //adiciona no arraylist oor um método
    void adicionarItem(Item item){
        itens.add(item);
        item.compra = this;
    }
    //Adiciona os valores no arraylist
    void adicionarItem(String nome, int quantidade, double preco){
        this.adicionarItem(new Item(nome, quantidade, preco));
    }
    
    double valorTotal(){
        double total = 0;
        
        for (Item item: itens) {
            total += item.quantidade * item.preco;
        }
        return total;
    }
}
