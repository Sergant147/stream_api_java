import java.util.*;
import java.util.stream.Collectors;
class Person {
    String name;
    int age;
    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public int getAge() {
        return age;
    }
    public String getName() {
        return name;
    }
}
public class GroupBy {
    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
                new Person("Alice", 30),
                new Person("Bob", 30),
                new Person("Charlie", 25),
                new Person("David", 25),
                new Person("Eve", 35)
        );
        Map<Integer, List<Person>> groupedByAge = people.stream()
                .collect(Collectors.groupingBy(Person::getAge));
        groupedByAge.forEach((age, persons) -> {
            System.out.println("Age " + age + ":");
            persons.forEach(person -> System.out.println(person.getName()));
        });
    }
}