package OrientacaoObjeto;

public class ComputadorPedrinho {
    public static void main(String[] args){
        //abrindo MSN messenger
       ServicoMensagemInsantanea smi = null;

       String appEscolhido = "msn";
        if(appEscolhido.equals("msn"))
            smi = new MSNMessenger();
        else if(appEscolhido.equals("fbm"))
            smi = new FacebookMessenger();
        else if(appEscolhido.equals("tlg"))
            smi = new TelegramMessenger();
      
       smi.enviarMensagem();
       smi.receberMensagem();
    }
}
