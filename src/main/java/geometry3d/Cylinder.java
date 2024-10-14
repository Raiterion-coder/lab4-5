package geometry3d;

import geometry2d.Figure;

public class Cylinder {
    private Figure base;   // Поле типа Figure для основания
    private double height; // Высота цилиндра

    public Cylinder(Figure base, double height) {
        this.base = base;
        this.height = height;
    }

    public double volume() {
        return base.area() * height; // Вычисление объема
    }

    @Override
    public String toString() {
        return "Cylinder [base=" + base.toString() + ", height=" + height + ", volume=" + volume() + "]";
    }
}