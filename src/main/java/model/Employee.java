package model;

public class Employee {

    // Declaración Atributos
    String FirstName;
    String LastName1;
    String LastName2;
    String Id;
    double Salary;

    // Contructores
    public Employee(String FirstName, String LastName1, String LastName2, String id, int salary) {

        if (FirstName == null) {
            throw new IllegalArgumentException("FirstName is null");
        }

        if (LastName1 == null) {
            throw new IllegalArgumentException("LastName1 is null");
        }

        if (LastName2 == null) {
            throw new IllegalArgumentException("LastName2 is null");
        }

        this.FirstName = FirstName;
        this.LastName1 = LastName1;
        this.LastName2 = LastName2;
        this.Id = id;
        this.Salary = salary;
    }

}
