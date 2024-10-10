package DesafioNaPraticaConexaoRede;
import java.util.Arrays;
import java.util.List;

public class Main {

   /*
Welcome to JDoodle!

You can execute code here in 88 languages. Right now you’re in the Java IDE.

  1. Click the orange Execute button ▶ to execute the sample code below and see how it works.

  2. Want help writing or debugging code? Type a query into JDroid on the right hand side ---------------->

  3.Try the menu buttons on the left. Save your file, share code with friends and open saved projects.

Want to change languages? Try the search bar up the top.
*/

import java.util.Arrays;
import java.util.List;


public class Main {
    
  //-----------------Teste 0.1
  public static void main(String args[]) {
    
       List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5,15);
        Integer sum = integers.stream()
        .reduce(0, Integer::sum);
        
        Integer divide = sum / 6;

    System.out.println("A média é " + divide);
  }
      

  

}
