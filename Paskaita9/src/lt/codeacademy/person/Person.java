package lt.codeacademy.person;

public class Person {
    private String name;
    private String surname;
    public int age;
    public static int counter;

    Person() {
        age++;
        counter++;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    private void print() {
        System.out.println("Name : " + name);
    }
    public String getInfo() {
        print();
        return name + age;
    }
}
