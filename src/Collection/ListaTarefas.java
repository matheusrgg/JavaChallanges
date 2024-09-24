package Collection;
import java.util.ArrayList;

public class ListaTarefas {
    
    public class Tarefa {
        String descrição ; 
    }
   
  
    public void adicionarTarefa(String descricao){
        ArrayList<Tarefa> listaTarefas = new ArrayList<Tarefa>();
        listaTarefas.add(1,"Exemplo Tarefa 1");
    }
}
