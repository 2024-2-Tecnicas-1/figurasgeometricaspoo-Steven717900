package com.mycompany.figurasgeometricas;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        // TODO: Tu código va aquí
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el nombre de la figura:");
        String nombre = sc.nextLine();

        System.out.println("Ingrese el color de la figura:");
        String color = sc.nextLine();

        System.out.println("Ingrese el tipo de figura (1: Circulo, 2: Rectangulo, 3: Triangulo):");
        int tipo = sc.nextInt();

        FiguraGeometrica figura = null;

        switch (tipo) {
            case 1:
                System.out.println("Ingrese el radio del circulo:");
                double radio = sc.nextDouble();
                figura = new Circulo(nombre, color, radio);
                break;
            case 2:
                System.out.println("Ingrese el ancho del rectangulo:");
                double ladoAncho = sc.nextDouble();
                System.out.println("Ingrese la longitud del rectangulo:");
                double ladoLongitud = sc.nextDouble();
                figura = new Rectangulo(nombre, color, ladoAncho, ladoLongitud);
                break;
            case 3:
                System.out.println("Ingrese el lado del triangulo equilatero:");
                double lado = sc.nextDouble();
                figura = new Triangulo(nombre, color, lado);
                break;
            default:
                System.out.println("Opcion invalida");
                return;
        }

        System.out.println("Area: " + figura.obtenerArea());
        System.out.println("Perimetro: " + figura.obtenerPerimetro());
    }
}
