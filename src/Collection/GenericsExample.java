package Collection;

public class GenericsExample {
    public static void main(String[] args){

        List listaSemGenerics = new ArrayList();
        listaSemGenerics.add("Elemento 1");
        listaSemGenerics.add(10);


        List<String> listaGenerics = new ArrayList<>();
        listaGenerics.add("Elemento 1");
        listaGenerics.add("Elemento 2");

        //Iterando sobre a lista com Generics
        for(String elemento : listaGenerics){
            System.out.println(elemento);
        }

        //Iterando sobre a lista sem Generics (necessário fazer cast)
        for(Object elemento: listaGenerics){
            String str = (String) elemento;
            System.out.println();
        }



    }
}
