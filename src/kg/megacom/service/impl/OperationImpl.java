package kg.megacom.service.impl;

import kg.megacom.Employee;
import kg.megacom.service.Operation;

import java.util.ArrayList;
import java.util.Collections;

public class OperationImpl implements Operation {

    Employee kairat = new Employee("Kairat", 24);
    Employee jibek = new Employee("Jibek", 35);
    Employee askar = new Employee("Askar", 37);
    Employee marat = new Employee("Marat", 30);
    Employee aigul = new Employee("Aigul", 18);
    ArrayList<Employee> employees = new ArrayList<>();


    @Override
    public void addEmployee() {

        employees.add(kairat);
        employees.add(jibek);
        employees.add(askar);
        employees.add(marat);
        employees.add(aigul);

        System.out.println("Добавление в список: " + employees);

    }

    @Override
    public void removeEmployee(int index) {
        employees.remove(1);
        System.out.println("Список после удаления: " + employees);
    }

    @Override
    public void sortEmployees() {
        employees.sort(Employee::compareTo);
        System.out.println("Список после сортировки: " + employees);
    }

    @Override
    public void shoffleEmployees() {
        Collections.shuffle(employees);
        System.out.println("Перемещали список: " + employees);

    }
}
