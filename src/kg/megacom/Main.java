package kg.megacom;

import kg.megacom.service.Operation;
import kg.megacom.service.impl.OperationImpl;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Operation operation = new OperationImpl();

        operation.addEmployee();
        operation.removeEmployee(1);
        operation.sortEmployees();
        operation.shoffleEmployees();


    }
}
