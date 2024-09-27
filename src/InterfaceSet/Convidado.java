package InterfaceSet;

import java.util.Objects;

public class Convidado {
    //atributos
    private String nome;
    private int codigoConvidado;
    
    public Convidado(String nome, int codigoConvidado) {
        this.nome = nome;
        this.codigoConvidado = codigoConvidado;
    }

    public String getNome() {
        return nome;
    }

    public int getCodigoConvite() {
        return codigoConvidado;
    }

    @Override
    public boolean equals(Object o) {
      if (this == o) return true;
      if (!(o instanceof Convidado convidado)) return false;
      return getCodigoConvite() == convidado.getCodigoConvite();
    }
  
    @Override
    public int hashCode() {
      return Objects.hash(getCodigoConvite());
    }

    @Override
    public String toString() {
        return "Convidado [nome=" + nome + ", codigoConvidado=" + codigoConvidado + "]";
    }

    
}
