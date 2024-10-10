# Diferença entre `List<Integer>` e `int[]` em Java

Em Java, há diferenças importantes entre o uso de `List<Integer>` e `int[]`. Aqui vamos entender melhor quando usar cada um e em que situações eles são mais adequados.

## 1. `List<Integer>`

A `List<Integer>` é parte da **Collections Framework** do Java e representa uma lista de objetos `Integer`. Essa estrutura oferece flexibilidade para adicionar, remover e manipular elementos de forma dinâmica.

### Quando usar?
Use `List<Integer>` quando você precisar de uma coleção que possa **crescer** ou **diminuir dinamicamente** e que ofereça métodos convenientes para manipulação de dados.

### Exemplo: Lista dinâmica com operações de adição e remoção

```java
import java.util.*;

public class ListExample {
    public static void main(String[] args) {
        // Criando uma lista de inteiros
        List<Integer> numbers = new ArrayList<>(); // `ArrayList` permite adição/remoção
        
        // Adicionando números à lista
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        System.out.println("Lista inicial: " + numbers); // Imprime: [1, 2, 3]

        // Removendo um número da lista
        numbers.remove(1); // Remove o número no índice 1 (valor 2)
        System.out.println("Após remoção: " + numbers); // Imprime: [1, 3]

        // Adicionando mais números
        numbers.add(4);
        numbers.add(5);
        System.out.println("Após adições: " + numbers); // Imprime: [1, 3, 4, 5]
    }
}
