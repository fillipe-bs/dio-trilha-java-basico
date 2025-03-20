public class CepInvalidoException extends Exception{
    public CepInvalidoException(){
        super("CEP inválido! Deve conter exatamente 8 dígitos numéricos."); 
        // "super" chama o construtor da classe Exception e define a mensagem da exceção, permitindo que ela seja acessada com getMessage()
    }
}