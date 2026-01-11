package model;

public class Triangle {

    public enum TriangleType {
        INVALID,
        EQUILATERAL,
        RIGHT,
        ISOSCELES,
        SCALENE
    }
    
    //Declaracion atributos
    int a;
    int b;
    int c;

    //Constructor
    public  Triangle(int a,int b,int c){

        if (a <= 0) {
            throw new IllegalArgumentException("Lado A debe ser mayor que 0");
        }

        if (b <= 0) {
            throw new IllegalArgumentException("Lado B debe ser mayor que 0");
        }

        if (c <= 0) {
            throw new IllegalArgumentException("Lado C debe ser mayor que 0");
        }

        //Comprobar Desigualdad


        if (a + b <= c) {
            throw new IllegalArgumentException("No cumple desigualdad del triangulo: a + b <= c");
        }

        if (a + c <= b) {
            throw new IllegalArgumentException("No cumple desigualdad del triangulo: a + c <= b");
        }

        if (b + c <= a) {
            throw new IllegalArgumentException("No cumple desigualdad del triangulo: b + c <= a");
        }

        this.a = a;
        this.b = b;
        this.c = c;

    }

    public TriangleType classify() {

        //Clasificación Equilateral

        if (a == b && b == c) {
           return TriangleType.EQUILATERAL;
        }

        //Clasificación RIGHT

        int a2 = a * a;
        int b2 = b * b;
        int c2 = c * c;

        if (a2 + b2 == c2 || a2 + c2 == b2 || b2 + c2 == a2) {
            return TriangleType.RIGHT;
        }

        //Clasificación ISOCELES

        if (a == b || b == c) {
           return TriangleType.ISOSCELES;
        }

        //cLASIFICACIÓN SCALENO

        return TriangleType.SCALENE; // valor por defecto temporal

    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public int getC() {
        return c;
    }

    
}
