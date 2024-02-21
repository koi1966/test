package Lists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Employee {

    int id;
    String name;

    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }
    public String toString()
    {
        return this.id + " " + this.name ;

    }
}
class SortById implements Comparator<Employee> {
    // Used for sorting in ascending order of ID
    public int compare(Employee a, Employee b)
    {
        return a.id - b.id;
    }
}

// Main class
class JavaListSubListExample2 {
    static int i=1;
    public static void main (String[] args) {
        List<Employee> list = new ArrayList<Employee>();
        Employee employee1 = new Employee(15019, "Patanjali");
        Employee employee2 = new Employee(13198, "Geetanjali");
        Employee employee3 = new Employee(12112, "Anjali");
        list.add(employee1);
        list.add(employee2);
        list.add(employee3);
        System.out.println("Unsorted List : ");
        for (Employee val : list) {
            System.out.println(i++ +". "+val);
        }
        Collections.sort(list, new SortById());
        System.out.println();
        System.out.println(" Masiv.Sorted List : ");
        int i=1;
        for (Employee val : list) {
            System.out.println(i++ +". "+val);
        }
    }
}
