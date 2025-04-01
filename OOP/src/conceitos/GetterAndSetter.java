package conceitos;

public class GetterAndSetter {
    public static void main(String[] args) {
        // Criando um objeto e usando os métodos
        Pessoa pessoa = new Pessoa("Fill", 31);
        pessoa.dataView();

        // Alterando os valores com os setters
        pessoa.setName("Fillipe");
        pessoa.setAge(32);
        pessoa.dataView();

    }

}
