package model;

public class Employee {

    // Declaración Atributos
    String FirstName;
    String LastName1;
    String LastName2;
    String Id;
    double Salary;

    // Contructores
    public Employee(String firstName, String lastName1, String lastName2, String id, int salary) {

        validateNotNull(firstName, "FirstName");
        validateNotNull(lastName1, "LastName1");
        validateNotNull(lastName2, "LastName2");

        if (firstName.isEmpty() || firstName.trim().isEmpty()) {
            throw new IllegalArgumentException("valor Firstname es vacio o solo espacios");
        }

        if (lastName1.isEmpty() || lastName1.trim().isEmpty()) {
            throw new IllegalArgumentException("valor LastName1 es vacio o solo espacios");
        }

        if (lastName2.isEmpty() || lastName2.trim().isEmpty()) {
            throw new IllegalArgumentException("valor LastName2 es vacio o solo espacios");
        }

        if (id == null || id.length() != 9 )
        {
            throw new IllegalArgumentException("Id inválido");
        }

        for (int i = 0; i <= 7; i++) {
            if (!Character.isDigit(id.charAt(i))) {
                throw new IllegalArgumentException("Id inválido");
            }
        }

        if (!Character.isLetter(id.charAt(8))) {
            throw new IllegalArgumentException("Id inválido");
        }

        if (salary < 600 || salary > 1000)
        {
            throw new IllegalArgumentException("Salary fuera de rango");
        }

        this.FirstName = firstName;
        this.LastName1 = lastName1;
        this.LastName2 = lastName2;
        this.Id = id;
        this.Salary = salary;
    }

    private void validateNotNull(String value, String fieldName) {
        if (value == null) {
            throw new IllegalArgumentException(fieldName + " is null");
        }
    }
}
