package lt.codeacademy.person;

public class Execute {
    public static void main(String[] args) {
        Person pers1 = new Person();
        pers1.setName("Vladimir");
        System.out.println("Person name is : " + pers1.getName());
        pers1.setSurname("Bangladesh");
        System.out.println("Person surname is : " + pers1.getSurname());
        pers1.setAge(25);
        System.out.println("Person age is : " + pers1.getAge());

        Person pers2 = new Person();
        pers2.setName("Karol");

        pers2.setSurname("Bangladesh");

        pers2.setAge(25);


        String info = pers2.getInfo();
        System.out.println(info);

        System.out.println(pers2.getInfo());

    }
}
