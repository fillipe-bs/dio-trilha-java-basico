package conceitos;

public class Pessoa {
    private String name;
    private int age;

    //Construtor
    public Pessoa(String name, int age){
        this.name = name;
        this.age = age;
    }

    // Getter para o atributo "name"
    public String getName() {
        return name;
    }

    // Setter para o atributo "name"
    public void setName(String name) {
        this.name = name;
    }

    // Getter para o atributo "age"
    public int getAge() {
        return age;
    }

    // Setter para o atributo "age"
    public void setAge(int age) {
        this.age = age;
    }

    public void dataView(){
        System.out.println("Nome: " + name);
        System.out.println("Idade: " + age);
    }
}

