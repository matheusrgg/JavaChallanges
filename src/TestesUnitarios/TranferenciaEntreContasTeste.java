package org.example;

public class TransferenciaEntreContas {
    public void transfere(Conta contaoOrigem, Conta contadestino, int valor){
        if(valor <= 0 ){
            throw new IllegalArgumentException("valor deve ser maior que zero");
        }
    }
}
