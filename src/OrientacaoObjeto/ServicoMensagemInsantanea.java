package OrientacaoObjeto;

public  abstract class ServicoMensagemInsantanea {
 
   
	public abstract void enviarMensagem();
	public abstract void receberMensagem();

    protected void validarConectadoInternet(){
        System.out.println("Validando se está conectado a internet");
    }
}
