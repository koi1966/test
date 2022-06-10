import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CreateObject {
    public static void main(String[] args) {

        List<String> stringS = Arrays.asList("ab", "c", "def", "gh", "ijk", "l", "mnop");

        List<PersonA> personList = new ArrayList<>();
        int i = 1;
        for (String strObject : stringS) {
            PersonA person = new PersonA();
            person.name = strObject;
            person.age = i++;
            personList.add(person);
        }
        System.out.println(personList);
    }

    static class PersonA {
        String name;
        int age;

        @Override
        public String toString() {
            return "name : " + this.name + "  age : " + age;
        }
    }

}
