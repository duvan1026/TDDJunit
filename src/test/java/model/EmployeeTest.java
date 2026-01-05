package model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

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

    @Test
    void Constructor_Falla_Si_Firstname_Es_Nulo()
    {
        try {
            Employee duvanPerez = new Employee(null, "Perez", "Gomez", "12345678A", 1000);
            assertTrue(false);
        } catch (IllegalArgumentException  e) {
            assertTrue(e.getMessage().equals("FirstName is null"));
        }
    }
}
