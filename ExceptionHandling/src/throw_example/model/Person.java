package throw_example.model;

import java.io.IOException;

public class Person {
    int age;

    public void setAge(int age) {
        this.age = age;
    }

    public void setAge1(int age) throws IllegalArgumentException{
        if(age <= 0) {
            // throw
        }
        this.age = age;
    }

    public void setAge2(int age) throws IOException {
        this.age = age;
    }

    public int getAge() {
        return this.age;
    }

    static void increaseAge(Person p, int age) throws IOException {
        p.setAge2(age); //checked exception must be handled
    }
}
