package model;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class EmployeeTest {

    @Test
    void Constructor_Crea_Employee_Cuando_Datos_Son_Validos()
    {
        try {
            Employee duvanPerez = new Employee("Duvan", "Perez", "Gomez", "12345678A", 1000);
            //duvanPerez.FirstName == "Duvan"
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

    @Test
    void Constructor_Falla_Si_LastName1_Es_Nulo()
    {
        try {
            Employee duvanPerez = new Employee("Duvan", null, "Gomez", "12345678A", 1000);
            assertTrue(false);
        } catch (IllegalArgumentException  e) {
            assertTrue(e.getMessage().equals("LastName1 is null"));
        }
    }

    @Test
    void Constructor_Falla_Si_LastName2_Es_Nulo()
    {
        try {
            Employee duvanPerez = new Employee("Duvan", "Perez", null, "12345678A", 1000);
            assertTrue(false);
        } catch (IllegalArgumentException  e) {
            assertTrue(e.getMessage().equals("LastName2 is null"));
        }
    }

    @Test
    void Constructor_Falla_Si_Firstname_Es_Vacio()
    {
        try {
            Employee duvanPerez = new Employee("", "Perez", "Gomez", "12345678A", 1000);
            assertTrue(false);
        } catch (IllegalArgumentException  e) {
            assertTrue(e.getMessage().equals("valor Firstname es vacio o solo espacios"));
        }
    }

    @Test
    void Constructor_Falla_Si_LastName1_Es_Vacio()
    {
        try {
            Employee duvanPerez = new Employee("Duvan", "", "Gomez", "12345678A", 1000);
            assertTrue(false);
        } catch (IllegalArgumentException  e) {
            assertTrue(e.getMessage().equals("valor LastName1 es vacio o solo espacios"));
        }
    }

    @Test
    void Constructor_Falla_Si_LastName2_Es_Vacio()
    {
        try {
            Employee duvanPerez = new Employee("Duvan", "Perez", "", "12345678A", 1000);
            assertTrue(false);
        } catch (IllegalArgumentException  e) {
            assertTrue(e.getMessage().equals("valor LastName2 es vacio o solo espacios"));
        }
    }

    @Test
    void Constructor_Falla_Si_Id_No_Tiene_9_Caracteres()
    {
        try {
            Employee duvanPerez = new Employee("Duvan", "Perez", "Gomez", "1234A", 1000);
            assertTrue(false);
        } catch (IllegalArgumentException  e) {
            assertTrue(e.getMessage().equals("Id inválido"));
        }
    }

    @Test
    void Constructor_Falla_Si_Id_Primeros_8_No_Son_Digitos()
    {
        try {
            Employee duvanPerez = new Employee("Duvan", "Perez", "Gomez", "1234AB78C", 1000);
            assertTrue(false);
        } catch (IllegalArgumentException  e) {
            assertTrue(e.getMessage().equals("Id inválido"));
        }
    }

    @Test
    void Constructor_Falla_Si_Id_Ultimo_Caracter_No_Es_Letra()
    {
        try {
            Employee duvanPerez = new Employee("Duvan", "Perez", "Gomez", "123456789", 1000);
            assertTrue(false);
        } catch (IllegalArgumentException  e) {
            assertTrue(e.getMessage().equals("Id inválido"));
        }
    }

    @Test
    void Constructor_Falla_Si_Salary_Es_Menor_Que_600()
    {
        try {
            Employee duvanPerez = new Employee("juan", "Perez", "Gomez", "12345678A", 500);
            assertTrue(false);
        } catch (IllegalArgumentException  e) {
            assertTrue(e.getMessage().equals("Salary fuera de rango"));
        }
    }

    @Test
    void Constructor_Falla_Si_Salary_Es_Mayor_Que_10000()
    {
        try {
            Employee duvanPerez = new Employee("juan", "Perez", "Gomez", "12345678A", 15000);
            assertTrue(false);
        } catch (IllegalArgumentException  e) {
            assertTrue(e.getMessage().equals("Salary fuera de rango"));
        }
    }

    @Test
    void Constructor_Crea_Employee_Si_Salary_Es_600_O_10000()
    {
        try {
            Employee duvanPerez = new Employee("juan", "Perez", "Gomez", "12345678A", 600);
            assertTrue(true);
        } catch (IllegalArgumentException  e) {
            assertTrue(false);
        }
    }

    @Test
    void RaiseSalary_Falla_Si_Percentage_Es_Negativo()
    {
        try {
            Employee duvanPerez = new Employee("Juan", "Perez", "Gomez", "12345678A", 1000);
            duvanPerez.raiseSalary(-10);
            assertTrue(false);
        } catch (IllegalArgumentException  e) {
            assertTrue(e.getMessage().equals("Percentage negativo no permitido"));
        }
    }

    @Test
    void RaiseSalary_No_Cambia_Si_Percentage_Es_Cero()
    {
        try {
            Employee duvanPerez = new Employee("Juan", "Perez", "Gomez", "12345678A", 1000);
            duvanPerez.raiseSalary(0);
            assertTrue(true);
        } catch (IllegalArgumentException  e) {
            assertTrue(false);
        }
    }

    @Test
    void RaiseSalary_Aumenta_Si_Percentage_Es_Positivo()
    {
        try {
            Employee duvanPerez = new Employee("Juan", "Perez", "Gomez", "12345678A", 1000);
            duvanPerez.raiseSalary(10);
            assertTrue(true);
        } catch (IllegalArgumentException  e) {
            assertTrue(false);
        }
    }

    @Test
    void IsEqualTo_Falla_Si_OtherEmployee_Es_Nulo()
    {
        try {
            Employee duvanPerez = new Employee("Juan", "Perez", "Gomez", "12345678A", 1000);
            duvanPerez.isEqualTo(null);
            assertTrue(false);
        } catch (IllegalArgumentException  e) {
            assertTrue(e.getMessage().equals("Employee nulo"));
        }
    }

    @Test
    void IsEqualTo_Devuelve_Verdadero_Si_Id_Son_Iguales()
    {
        try {
            Employee employee1 = new Employee("Juan", "Perez", "Gomez", "12345678A", 1000);
            Employee employee2 = new Employee("Maria", "Lopez", "Diaz", "12345678A", 1000);

            boolean result = employee1.isEqualTo(employee2);
            if(result){
                assertTrue(true);
                return;
            }
            assertTrue(false);
        } catch (IllegalArgumentException  e) {
            assertTrue(false);
        }
    }

    @Test
    void IsEqualTo_Devuelve_Falso_Si_Id_Son_Distintos()
    {
        try {
            Employee employee1 = new Employee("Juan", "Perez", "Gomez", "12345678A", 1000);
            Employee employee2 = new Employee("Maria", "Lopez", "Diaz", "12345679A", 1000);

            boolean result = employee1.isEqualTo(employee2);
            if(!result){
                assertTrue(true);
                return;
            }
            assertTrue(false);
        } catch (IllegalArgumentException  e) {
            assertTrue(false);
        }
    }


}
