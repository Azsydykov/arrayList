package kg.megacom;

import java.util.ArrayList;
import java.util.List;

public class Employee implements Comparable<Employee> {
    private String name;
    private int age;

    public Employee() {
    }

    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return
                "{name=" + name +
                        ", age=" + age +
                        '}';
    }

    public int compareTo(Employee empl) {
        if (this.age != empl.getAge()) {
            return this.age - empl.getAge();
        }
        return this.name.compareTo(empl.getName());

    }
}
