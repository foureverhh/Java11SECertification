package reflection;

import org.w3c.dom.ls.LSOutput;

import java.lang.annotation.ElementType;

public class ClassRetrieving {
    public static void main(String[] args) throws ClassNotFoundException {
        Person person = new Student();
        System.out.println("Person is " + person.name);

        // instance.getClass()
        Class<?> c1 = person.getClass();

        // forName package.class
        Class<?> c2 = Class.forName("reflection.Student");

        System.out.println(c1 == c2);

        Class<?> c3 = Student.class;
        System.out.println(c2 == c3);

        // Primitive package class
        Class<?> c4 = Integer.TYPE;
        System.out.println("Integer package class: " + c4);

        // get super class
        Class<?> baseClz = c1.getSuperclass();
        System.out.println("Base class: -> " + baseClz);

        Class<?> objClz = Object.class;
        Class<?> interfaceClz = Comparable.class;
        Class<?> arrayClz = String[].class;
        Class<?> multiArrayClz = int[][].class;
        Class<?> annotationOverrideClz = Override.class;
        Class<?> annotationElementTypeClz = ElementType.class; // enum
        Class<?> voidClz = Void.class; // Void is also a class
        Class<?> classClz = Class.class; // Class itself is a class
        Class<?> intPackageClz = Integer.class;

        System.out.println(objClz);
        System.out.println(interfaceClz);
        System.out.println(arrayClz);
        System.out.println(multiArrayClz);
        System.out.println(annotationOverrideClz);
        System.out.println(annotationElementTypeClz);
        System.out.println(voidClz);
        System.out.println(classClz);
        System.out.println(intPackageClz);

        int[] a = new int[10];
        int[] b = new int[100];
        Class<?> aClz = a.getClass();
        Class<?> bClz = b.getClass();
        System.out.println("int[] a Class type is " + a.getClass() + ", and " + (aClz==bClz));
    }

}

class Person {
    public String name;

    public Person() {
    }

    public Person(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                '}';
    }
}

class Student extends Person {
    public Student() {
        this.name = "Student";
    }
}


class Teacher extends Person {
    public Teacher() {
        this.name = "Teacher";
    }
}