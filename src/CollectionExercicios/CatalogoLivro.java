package CollectionExercicios;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CatalogoLivro {

    //esse tá errado só criar o atributo
    // List<Livro> catalogoLivros = new ArrayList();

    List<Livro> catalogoLivros;


    //nossa confunde criar com o mesmo nome que a class
    //sé loco
    public CatalogoLivro(){
        this.catalogoLivros = new ArrayList<>();
    }

    public void adicionarLivro(String titulo, String autor,int ano){
        catalogoLivros.add(new Livro(titulo, autor, ano));
    }



    // Pesquisa livros por autor e retorna uma lista com os livros encontrados.
    public void pesquisarPorAutor(String autor){
        CatalogoLivro catalogoLivro = new CatalogoLivro();
        //function que pede pro usuário digitar o nome pra pesquisar

        Scanner livroObj = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter username");
    
        String livro = livroObj.nextLine();  // Read user input
        System.out.println("Username is: " + livro);  // Output user input

        for(Livro t : catalogoLivros){
            // System.out.println("Imprimindo Livros Pq não aparece" + t.autor );
            if(t.autor.equals(livro)){
                System.out.println("Aparece Nome do Livro" + t.titulo );
                break;
            }else{
                System.out.println("Não tem nenhum autor com esse nome" ); 
            }
                 
        }
    }

    public static void main(String[] args) {
        CatalogoLivro catalogoLivro = new CatalogoLivro();
        catalogoLivro.adicionarLivro("Livro 1 ", "Autor 2", 1990);
        catalogoLivro.adicionarLivro("Livro 2 ", "Autor 3", 1992);
        catalogoLivro.pesquisarPorAutor("Teste-----");
    }
    
}
