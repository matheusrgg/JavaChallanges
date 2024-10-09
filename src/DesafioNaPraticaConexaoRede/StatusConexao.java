package DesafioNaPraticaConexaoRede;
import java.util.Scanner;
public class StatusConexao {
    public static String verificarQuedaConexao(String[] velocidades) {
        for(int i = 0;i < velocidades.length;i++)
          {   
              if(velocidades[i].equals("0")){
                  return "Queda de Conexao";
              
              } 
          }
        
         return "Sem Quedas";   
    
  }
  
   public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);

      // Solicitando ao usuário a lista de velocidades de conexão registradas a cada hora
      String input = scanner.nextLine();

      // Convertendo a entrada em uma lista de strings
      String[] velocidades = input.split(",");

      // Verificando se houve queda de conexão
      String resultado = verificarQuedaConexao(velocidades);

      // Exibindo o resultado da verificação
      System.out.println(resultado);

      scanner.close();
  }
}