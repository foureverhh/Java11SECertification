package throw_example;

import throw_example.model.Person;

import java.io.IOException;

public class ThrowingExceptions {
    public static void main(String[] args) {
        Person p = new Person();
        p.setAge(20);
        System.out.println(p.getAge());

        p.setAge1(30);
        System.out.println(p.getAge());

        try {
            p.setAge2(40); //checked exception must be handled
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(p.getAge());
    }

}
