package CollectionExercicios;

public class Livro {
    String titulo;
    String autor;
    int ano;

    public Livro( String titulo, String autor,int ano){
        this.titulo = titulo;
        this.autor = autor;
        this.ano = ano;
    }

    public String getTitulo(){
        return titulo;
    }

}
