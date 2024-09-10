import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
    public static void main(String[] args) {
      selecaoCandidatos();;
    }

    static void selecaoCandidatos(){
        String [] candidatos = { "Beatriz","Nik","Teka","Lucia","Gregory","Felipe","Maria","Ana"};
        int candidatosSelecionados=0;
        int candidatosAtual=0;
        double salarioBase = 2000.0;
        while(candidatosSelecionados < 5){
            String candidato = candidatos[candidatosAtual];
            double salarioPretendido = valorPretendido();

            System.out.println("o candidato" + candidato + "Solicitou esse salario"+ salarioPretendido);
            if(salarioBase >= salarioPretendido){
                System.out.println("O candidato"+ candidato+"foi selecionado");
                candidatosSelecionados++;
            }
            candidatosAtual++;
        }
    
    
    }

    static double valorPretendido(){
        return ThreadLocalRandom.current().nextDouble(1800,2200);
    }

    static void analisarCandidato(double salarioPretendido){
        double salarioBase = 2000.0;
        if(salarioBase > salarioPretendido){
            if(salarioBase > salarioPretendido){
                System.out.println("LIGAR PARA O CANDIDATO");
            }else if(salarioBase == salarioPretendido){
                System.out.println("Ligar demais candidatos");
            }else{
                System.out.println("Aguardando demais candidatos"); 
            }
        }
    }

}
