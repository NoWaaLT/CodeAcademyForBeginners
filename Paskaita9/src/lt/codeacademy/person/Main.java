package lt.codeacademy.person;

public class Main {
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.setName("Marius");
        System.out.println(person1.getName());

        String info = person1.getInfo();
        System.out.println(info);

        System.out.println(person1.age);
        System.out.println(person1.counter);

        Person person2 = new Person();

        System.out.println(person2.age);
        System.out.println(person2.counter);

        Person person3 = new Person();

        System.out.println(person3.age);
        System.out.println(Person.counter);

    }
}
