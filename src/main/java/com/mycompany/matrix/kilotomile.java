package com.mycompany.matrix;

public class kilotomile {
     private double kilometer;
    // private double mile;

    public double getKilometer() {
        return kilometer;
    }

    public void setKilometer(double kilometer) {
        this.kilometer = kilometer;
    }

    public double getMile() {
      double mile=kilometer*0.62;
        return mile;
    }

    @Override
    public String toString() {
        return "kilotomile{" + "kilometer=" + kilometer + '}';
    }

}
