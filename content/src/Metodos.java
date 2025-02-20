public class Metodos {
    
    // Método com return
    public double somar(int num1, int num2){
        // Finalidade do método
        double soma = num1 + num2;
        return soma; // Retorna o resultado da soma
    }
    
    // Método sem return (void)
    public void imprimir(String texto){
        // Exibe o texto fornecido no console
        // Não há necessidade de retorno, pois o método apenas imprime o conteúdo
    }
    
    // Método com throws Exception (exceção possível)
    public double dividir(int dividendo, int divisor) throws Exception {
        // Verifica se o divisor é zero
        if (divisor == 0) {
            // Lança uma exceção se o divisor for zero
            throw new Exception("Divisão por zero não é permitida.");
        }
        // Realiza a divisão e retorna o resultado como um número decimal
        return (double) dividendo / divisor;
    }
    
    // Método com try-catch para testar a divisão
    public void testarDivisao(int dividendo, int divisor) {
        // Tenta realizar a divisão
        try {
            double resultado = dividir(dividendo, divisor);
            System.out.println("Resultado: " + resultado); // Exibe o resultado da divisão
        } catch (Exception e) {
            // Captura qualquer exceção e exibe a mensagem de erro
            System.out.println("Erro: " + e.getMessage());
        }
    }
    
    // Método privado (private)
    private void metodoPrivado(){
        // Este método não pode ser acessado de fora da classe
        // Sua implementação está oculta para outras classes
    }
    
    // Falhas conceituais e como resolve-las abaixo: 

    // Método para validação sem return
    public void validar(){
        // Este método deveria retornar um valor booleano para indicar sucesso ou falha
        // Por exemplo: return true; ou return false;
    }
    
    // Método com responsabilidade mal definida
    public void calcularEnviar(){
        // Este método deve ser separado em dois métodos distintos
        // Um para calcular e outro para enviar os dados
    }
    
    // Método para gravar informações de cliente
    public void gravarCliente(String nome, String cpf, Integer telefone){
        // Este método grava as informações de um cliente
        // Uma abordagem melhor seria criar uma classe Cliente e passar o objeto como parâmetro
        // Exemplo: public void gravarCliente(Cliente cliente){ }
        // Ou: public void gravar(Cliente cliente){ }
    }
}
