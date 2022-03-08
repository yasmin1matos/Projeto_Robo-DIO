package subsistema2;
import one.digitalinnovation.singleton.SingletonEager;

public class CepApi {
    private static CepApi  instancia = new CepApi();

    private CepApi() {
        super();
    }
    public static CepApi getInstancia() {
        return instancia;
    }

    public String recuperarCidade(String cep) {
        return "Mogi das Cruzes";

    }
    public String recuperarEstado(String cep) {
        return "SP";
    }
}
