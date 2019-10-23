package com.mainacad.treangle;

import com.mainacad.abs.AbstractShape;
import com.mainacad.abs.Shape;

public class Treangle extends AbstractShape {

    private double base;
    private double heigth;

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getHeigth() {
        return heigth;
    }

    public void setHeigth(double heigth) {
        this.heigth = heigth;
    }

    @Override
    public double getArea() {
        return (base * heigth) / 2;
    }

    public Treangle(double base, double heigth) {
        this.base = base;
        this.heigth = heigth;
    }

    public Treangle(double base) {
        this.base = base;
    }

    public Treangle() {
    }

}
