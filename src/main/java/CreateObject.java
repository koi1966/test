import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CreateObject {
    public static void main(String[] args) {

        List<String> strings = Arrays.asList("ab", "c", "def", "gh", "ijk", "l", "mnop");

        List<Person> personList = new ArrayList<>();
        int i = 1;
        for (String string : strings) {
            Person person = new Person();
            person.name = string;
            person.age = i++;
            personList.add(person);
        }
        System.out.println(personList);

    }

    static class Person {
        String name;
        int age;

        @Override
        public String toString() {

            return "name : " + this.name + "  age : " + age;
        }

    }


}
