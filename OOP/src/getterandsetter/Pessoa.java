package getterandsetter;

public class Pessoa {
    private String name;
    private int age;
    private StatusCivil statusCivil;

    //Construtor
    public Pessoa(String name, int age, StatusCivil statusCivil){
        this.name = name;
        this.age = age;
        this.statusCivil = statusCivil;
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
    
    // Getter para o atributo "statusCivil"
    public StatusCivil getStatusCivil() {
        return statusCivil;
    }

    // Setter para o atributo "statusCivil"
    public void setStatusCivil(StatusCivil statusCivil) {
        this.statusCivil = statusCivil;
    }

    public void dataView(){
        System.out.println("Nome: " + name);
        System.out.println("Idade: " + age);
        System.out.println("Status Civil: " + statusCivil);
    }

}

