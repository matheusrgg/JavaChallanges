package InterfaceSet;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {



    private Set<Convidado> convidadosSet;

    public ConjuntoConvidados(){
        this.convidadosSet = new HashSet<>();
    }

    public void adicionarConvidados(String nome, int codigoConvidado){
        convidadosSet.add(new Convidado(nome, codigoConvidado));
    }

    public void removerConvidadoPorCodigoConvite(int codigoConvite){
        Convidado  convidadoRemover = null;
        for(Convidado c : convidadosSet){
            if(c.getCodigoConvite() == codigoConvite){
                convidadoRemover = c;
                break;
            }
        }
        convidadosSet.remove(convidadoRemover);
    }

    public int contarConvidados(){
        return convidadosSet.size();
    }

    public void exibirConvidados(){
        System.out.println(convidadosSet);
    }

    
}
