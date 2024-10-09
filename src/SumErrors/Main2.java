package SumErrors;
import java.util.Arrays;
import java.util.List;
import java.util.*; 
import java.util.stream.*; 

public class Main2 {

        
public static void calcularVelocidadeMedia(String[] velocidades) {
        int total = 0;
        int[] velocidadesInteger = new int[velocidades.length];

        for(int i = 0;i < velocidades.length;i++)
            {
            System.out.println("Marcha"+ velocidades[i]);
            velocidadesInteger[i] = Integer.parseInt(velocidades[i]);
        
            }

        //  int sum = velocidadesInteger.stream(velocidadesInteger).sum();
        int sum = IntStream.of(velocidadesInteger).sum();    
        
        total = sum / velocidades.length;
        
        System.out.println("Marcha"+ total);   
    }

  
    public static void main(String[] args) {
        String[] suit = { "133", "133", "133", "222" };
        calcularVelocidadeMedia(suit);
    }
}
