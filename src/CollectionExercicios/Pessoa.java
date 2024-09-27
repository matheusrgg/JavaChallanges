package CollectionExercicios;

public class Pessoa {
    private String nome;
    private int idade;
    private double altura;


    public Pessoa(String nome, int idade, double altura){
        this.nome = nome;
        this.idade =idade;
        this.altura = altura;
    }

    public String getNome(String nome){
        return nome;
    }

    public String getIdade(String idade){
        return idade;
    }

    public String getAltura(String altura){
        return altura;
    }

 
    @Override
    public String toString() {
      return "Pessoa{" +
          "nome='" + nome + '\'' +
          ", idade=" + idade +
          ", altura=" + altura +
          '}';
    }
  
}




