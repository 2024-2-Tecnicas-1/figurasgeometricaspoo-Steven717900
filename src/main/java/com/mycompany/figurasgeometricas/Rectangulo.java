/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.figurasgeometricas;

/**
 *
 * @author Steven xd
 */
public class Rectangulo extends FiguraGeometrica {
    private double ladoAncho;
    private double ladoLongitud;
    public Rectangulo(String nombre, String color, double ladoAncho, double ladoLongitud) {
        super(nombre, color);
        this.ladoAncho = ladoAncho;
        this.ladoLongitud = ladoLongitud;
    }
    @Override
    public double obtenerArea() {
        return ladoAncho * ladoLongitud; 
    }
    @Override
    public double obtenerPerimetro() {
        return 2 * (ladoAncho + ladoLongitud);
    }
    public double getLadoAncho() {
        return ladoAncho;
    }
    public void setLadoAncho(double ladoAncho) {
        this.ladoAncho = ladoAncho;
    }
    public double getLadoLongitud() {
        return ladoLongitud;
    }
    public void setLadoLongitud(double ladoLongitud) {
        this.ladoLongitud = ladoLongitud;
    }
}
