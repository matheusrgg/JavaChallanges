package CollectionExercicios;

import java.util.List;
import java.util.ArrayList;



public class ListaTarefa {
    
    //atributo
    private List<Tarefa> tarefaLista;

    public ListaTarefa(){
        this.tarefaLista = new ArrayList<>();
    }

    public void adicionarTarefa(String descricao){
        tarefaLista.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao ){
        List<Tarefa> removerTarefaArray = new ArrayList<>();
        for(Tarefa t : tarefaLista){
            if(t.getDescricao().equalsIgnoreCase(descricao)){
                removerTarefaArray.add(t);
            }
        }

        tarefaLista.removeAll(removerTarefaArray);

    }

    public int numeroTotalTarefas(){
        return tarefaLista.size();
    }

    public void mostrarListaTarefas(){
        System.out.println(tarefaLista);
    }

    public static void main(String[] args) {
        ListaTarefa listaTarefa = new ListaTarefa();
        System.out.println("Testando numero de tarfas" + listaTarefa.numeroTotalTarefas());
       
        listaTarefa.adicionarTarefa("Primeira Tarefa");
        listaTarefa.adicionarTarefa("Segunda Tarefa");
        System.out.println("Testando numero de tarfas" + listaTarefa.numeroTotalTarefas());

    }
}
