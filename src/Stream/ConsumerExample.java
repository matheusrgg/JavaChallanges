package Stream;


import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerExample {
    public static void main(String[] args){
        List<Integer> numeros = Arrays.asList(1,2,3,4);
        
        //Usar consumer com expressão lamba para imprimiri números pares

        Consumer<Integer> imprimirNumeroPar = numero -> {
            if(numero % 2 ==0){
                System.out.print(numero + " ");
            }
        };
        
        numeros.stream().forEach(imprimirNumeroPar);
    
    
    }
}
 