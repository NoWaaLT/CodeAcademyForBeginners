package lt.codeacademy.person;

public class Person {
    private String name;
    private String surname;
    private int age;
    public static int counter; // making for calculating all new objects

    Person() {
        counter++;  // making for calculating all new objects
    }


    public void setName(String pName) {
        this.name = pName;
    }

    public String getName() {
        return name;
    }

    public void setSurname(String pSurname) {
        this.surname = pSurname;
    }

    public String getSurname() {
        return surname;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    private void print() {
        System.out.println("I am a man!");
    }

    public String getInfo() {
        print();
        return name + " " + surname + " " + age + " " + counter;
    }


}
