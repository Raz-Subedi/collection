package org.example.lamda;

public class Main {
    public static void main(String[] args) {

//        Employee employee = new SoftwareEngineer();
//        System.out.println(employee.getName());

        Employee se = () -> "Software Engineer";
        System.out.println(se.getName());

        // Interface reference can be used to hold lambda expression.
        // Using lambda expression we don't need to use any separate implementation class.

        Employee ed = () -> "Editor";
        System.out.println(ed.getName());
    }
}
