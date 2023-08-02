package Week7_TP;

public class ArgumentoForaDosLimitesException extends IllegalArgumentException {

    public ArgumentoForaDosLimitesException() {
        super("Argumento fora dos limites !!!");
    }

    public ArgumentoForaDosLimitesException(String mensagem) {
        super(mensagem);
    }

}
