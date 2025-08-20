package OOPtest;

public class User {
    private String name;
    private int age;
    private boolean isStudent;

    public User(String name, int age, boolean isStudent){
        this.name = name;
        this.age = age;
        this.isStudent = isStudent;
    }

    @Override
    public String toString() {
        return "User { " +
                "name='" + name + '\'' +
                ", age=" + age +
                ", isStudent=" + isStudent +
                " }";
    }

    public String getName(){
        return this.name;
    }

    public int getAge(){
        return this.age;
    }

    public boolean isStudent(){
        return this.isStudent;
    }

    public void setName(String newName) {
        this.name = newName;
    }

    public void setAge(int newAge) {
        this.age = newAge;
    }
}
