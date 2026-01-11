package model;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

public class TriangleTest {

    @Test
    void Constructor_Falla_Si_LadoA_Es_Cero()
    {
        try {
            Triangle triangulo = new Triangle(0,4,5);
            assertTrue(false);
        } catch (Exception e) {
            assertTrue(e.getMessage().equals("Lado A debe ser mayor que 0"));

        }

    }

    @Test
    void Constructor_Falla_Si_LadoB_Es_Cero()
    {
        try {
            Triangle triangulo = new Triangle(3, 0, 5);
            assertTrue(false);
        } catch (Exception e) {
            assertTrue(e.getMessage().equals("Lado B debe ser mayor que 0"));
        }
    }

    @Test
    void Constructor_Falla_Si_LadoC_Es_Cero()
    {
        try {
            Triangle triangulo = new Triangle(3, 4, 0);
            assertTrue(false);
        } catch (Exception e) {
            assertTrue(e.getMessage().equals("Lado C debe ser mayor que 0"));
        }
    }

    //Comprobar la desigualdad del triangulo

    @Test
    void Constructor_Falla_Si_A_Mas_B_MenorOIgual_C()
    {
        try{
            Triangle triangulo = new  Triangle(2, 3, 5);
            assertTrue(false);
        } catch(Exception e) {
            assertTrue(e.getMessage().equals("No cumple desigualdad del triangulo: a + b <= c"));
        }
        
    }

    @Test
    void Constructor_Falla_Si_A_Mas_C_MenorOIgual_B()
    {
        try{
            Triangle triangulo = new  Triangle(2, 5, 3);
            assertTrue(false);
        } catch(Exception e) {
            assertTrue(e.getMessage().equals("No cumple desigualdad del triangulo: a + c <= b"));
        }
        
    }

    @Test
    void Constructor_Falla_Si_B_Mas_C_MenorOIgual_A()
    {
        try{
            Triangle triangulo = new  Triangle(6, 2, 3);
            assertTrue(false);
        } catch(Exception e) {
            assertTrue(e.getMessage().equals("No cumple desigualdad del triangulo: b + c <= a"));
        }
        
    }

    @Test
    void Constructor_Crea_Triangulo_Valido() {
        Triangle triangulo = new Triangle(3, 4, 5);

        assertEquals(3, triangulo.getA());
        assertEquals(4, triangulo.getB());
        assertEquals(5, triangulo.getC());
    }

    //Clasificación del triangulo


    @Test
    void Classify_Devuelve_Equilatero() {
        Triangle triangle = new Triangle(4, 4, 4);

        Triangle.TriangleType resultado = triangle.classify();

        assertEquals(Triangle.TriangleType.EQUILATERAL, resultado);
    }

    @Test
    void Classify_Devuelve_Rectangulo_AB_C (){
        Triangle triangle = new Triangle(3, 4, 5);

        Triangle.TriangleType resultado = triangle.classify();

        assertEquals(Triangle.TriangleType.RIGHT, resultado);
    }

    @Test
    void Classify_Devuelve_Isosceles (){
        Triangle triangle = new Triangle(5, 5, 3);

        Triangle.TriangleType resultado = triangle.classify();

        assertEquals(Triangle.TriangleType.ISOSCELES, resultado);
    }

    @Test
    void Classify_Devuelve_Escaleno (){
        Triangle triangle = new Triangle(4, 5, 6);

        Triangle.TriangleType resultado = triangle.classify();

        assertEquals(Triangle.TriangleType.SCALENE, resultado);
    }

    
}
