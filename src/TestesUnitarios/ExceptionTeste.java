import org.example.Conta;
import org.example.TransferenciaEntreContas;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class ExceptionTeste {

    @Test
    public void validarCenarioDeExcecapNaTransferencia(){
        Conta contaOrigem = new Conta("12345", 0);
        Conta contaDestino = new Conta("98765", 100);

        TransferenciaEntreContas transferenciaEntreContas = new TransferenciaEntreContas();

        Assertions.assertThrows(IllegalArgumentException.class, ()->
                    transferenciaEntreContas.transfere(contaOrigem, contaDestino, -1));



    }

}
