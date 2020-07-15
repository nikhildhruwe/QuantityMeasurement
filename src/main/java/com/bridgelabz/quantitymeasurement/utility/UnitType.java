package com.bridgelabz.quantitymeasurement.utility;

public enum UnitType {
    CENTIMETER(1.0 / 2.5),
    INCH(1.0), FEET(12.0), YARD(36.0),
    ML(1000.0), LITRE(1.0), GALLON(3.78);

    public double unitConversion;

    UnitType(double unitConversion) {
        this.unitConversion = unitConversion;
    }
}
