package model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;

public class EmployeeTest {

    @Test
    void Constructor_Crea_Employee_Cuando_Datos_Son_Validos()
    {
        try {
            Employee duvanPerez = new Employee("Duvan", "Perez", "Gomez", "12345678A", 1000);
            assertFalse(false);
        } catch (Exception e) {
            assertFalse(true);
        }
    }

}
