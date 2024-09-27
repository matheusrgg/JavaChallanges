package CollectionExercicios;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoPessoas {

     //atributo
  private List<Pessoa> pessoaList;

  public OrdenacaoPessoas() {
    this.pessoaList = new ArrayList<>();
  }
    
  public void adicionarPessoa(String nome, int idade, double altura){
    pessoaList.add(new Pessoa(nome, idade, altura));
  }
}
