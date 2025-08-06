package ValidarIdade;

public class Pessoa {
    private String name;
    private int age;

    public Pessoa (String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void setName(String newName) {
        this.name = newName;
    }

    public void setAge(int newAge) {
        if (newAge < 0) {
            System.out.println("Não é permitido número negativo");
        } else {
            this.age = newAge;
        }
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

}
