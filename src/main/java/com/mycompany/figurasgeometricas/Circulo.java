/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.figurasgeometricas;

/**
 *
 * @author Steven xd
 */
public class Circulo extends FiguraGeometrica {

    private double radio;

    public Circulo(String nombre, String color) {
        super(nombre, color);
        this.radio = radio;
    }

    @Override
    public double obtenerArea() {
        return 2 * 3.1456 * radio * radio;
    }

    @Override
    public double obtenerPerimetro() {
        return 2 * 3.1456 * radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;

    }
}
