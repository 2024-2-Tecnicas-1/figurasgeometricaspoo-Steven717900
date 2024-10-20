/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.figurasgeometricas;

/**
 *
 * @author Steven xd
 */
public class Triangulo extends FiguraGeometrica {

    private double lado;

    // Complejidad: O(1)
    public Triangulo(String nombre, String color, double lado) {
        super(nombre, color);
        this.lado = lado;
    }

    // Complejidad: O(1)
    @Override
    public double obtenerArea() {
        return 0.433 * lado * lado;
    }

    // Complejidad: O(1)
    @Override
    public double obtenerPerimetro() {
        return 3 * lado;
    }

    // Complejidad: O(1)
    public double getLado() {
        return lado;
    }

    // Complejidad: O(1)
    public void setLado(double lado) {
        this.lado = lado;
    }
}
