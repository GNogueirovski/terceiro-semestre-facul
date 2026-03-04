package advanced.br.com.fiap.model;

public class SaldoInsuficienteException extends RuntimeException {
    public SaldoInsuficienteException (String message){
        super(message);
    }
}
