/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.figurasgeometricas;

/**
 *
 * @author Steven xd
 */
public class FiguraGeometrica {

    private String nombre;
    private String color;

    // Complejidad: O(1)
    public FiguraGeometrica(String nombre, String color) {
        this.nombre = nombre;
        this.color = color;
    }

    // Complejidad: O(1)
    public double obtenerArea() {
        return 0;
    }

    // Complejidad: O(1)
    public double obtenerPerimetro() {
        return 0;
    }

    // Complejidad: O(1)
    public String getNombre() {
        return nombre;
    }

    // Complejidad: O(1)
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // Complejidad: O(1)
    public void setColor(String color) {
        this.color = color;
    }
}
