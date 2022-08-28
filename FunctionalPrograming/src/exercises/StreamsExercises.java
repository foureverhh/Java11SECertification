package exercises;

import model.Person;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamsExercises {
    public static void main(String[] args) {
        Stream<Integer> stream1 = Stream.of(1,3,5);
        Stream<Integer> stream2 = Stream.of(2,4,6);
        Stream<Integer> resultStream1 = Stream.concat(stream1, stream2);
        System.out.println(resultStream1.collect(Collectors.toList()));

        Stream<Integer> stream1_1 = Stream.of(1,3,5);
        Stream<Integer> stream1_2 = Stream.of(2,4,6);
        Stream<Integer> stream1_3 = Stream.of(18,15,36);
        Stream<Integer> resultStream2 = Stream.concat(stream1_1,Stream.concat(stream1_2, stream1_3));
        System.out.println(resultStream2.collect(Collectors.toList()));

        Stream<Integer> stream2_1 = Stream.of(1,3,5);
        Stream<Integer> stream2_2 = Stream.of(2,4,6);
        Stream<Integer> stream2_3 = Stream.of(2,2,6);
        Stream<Integer> resultStream3 = Stream.concat(stream2_1,Stream.concat(stream2_2, stream2_3)).distinct();
        System.out.println(resultStream3.collect(Collectors.toList()));

        Person person1 = new Person("1", "Person1");
        Person person2 = new Person("2","Person2");
        Person person3 = new Person("1","Person_1");
        Stream<Person> p1 = Stream.of(person1);
        Stream<Person> p2 = Stream.of(person2);
        Stream<Person> p3 = Stream.of(person3);
        Stream<Person> p1d = Stream.of(person1);
        Stream<Person> p2d = Stream.of(person2);
        Stream<Person> p3d = Stream.of(person3);
        Stream<Person> resultStream4 = Stream.concat(p1,Stream.concat(p2, p3)).distinct();
        Stream<Person> resultStream4Dis = Stream.concat(p1d,Stream.concat(p2d, p3d));
        System.out.println(resultStream4.collect(Collectors.toList()));
        System.out.println(resultStream4Dis.collect(Collectors.toList()));
    }
}
