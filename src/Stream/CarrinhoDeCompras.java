package Stream;

import Collection.ArrayList;

public class CarrinhoDeCompras {
    //atributi

    List<item> itemList;

    //construcutor
    publuc CarrinhoDeCompras(){
        this.itemList = new ArrayList();
    }

    public double calcularValorTotal(){
        if(itemList.isEmpty()){
            throw new RuntimeException("A lista está vázia");
        }

        return itemList.stream()
        .mapToDouble(item-> item.getPreco() * item.getQuant())
        .sum();
    }


}
