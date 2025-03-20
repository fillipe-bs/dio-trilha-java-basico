public class CepFormatador {
    public static void main(String[] args) {
        try {
            String cepFormatado = formatarCep("83320320");
            System.out.println(cepFormatado);
        } catch (CepInvalidoException e) {
            System.out.println(e.getMessage()); // exibindo apenas a mensagem da exceção
        }
    }
    static String formatarCep(String cep) throws CepInvalidoException {
        if (cep.length() != 8)
            throw new CepInvalidoException();

        // simulando um cep formatado
        return cep.substring(0, 2) + "." + cep.substring(2, 5) + "-" + cep.substring(5);
    }
}
