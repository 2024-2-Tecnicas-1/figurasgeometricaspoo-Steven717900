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

    public Triangulo(String nombre, String color, double lado) {
        super(nombre, color);
        this.lado = lado;
    }

    @Override
    public double obtenerArea() {
        return 0.433 * lado * lado;
    }

    @Override
    public double obtenerPerimetro() {
        return 3 * lado;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }
}
