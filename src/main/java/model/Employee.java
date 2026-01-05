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
            throw new NullPointerException("FirstName is null");
        }

        if (LastName1 == null) {
            throw new NullPointerException("LastName1 is null");
        }

        if (LastName2 == null) {
            throw new NullPointerException("LastName1 is null");
        }

        this.FirstName = FirstName;
        this.LastName1 = LastName1;
        this.LastName2 = LastName2;
        this.Id = id;
        this.Salary = salary;
    }

}
