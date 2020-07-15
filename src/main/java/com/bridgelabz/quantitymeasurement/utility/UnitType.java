package com.bridgelabz.quantitymeasurement.utility;

public enum UnitType {
    CENTIMETER(1.0 / 2.5),
    INCH(1.0), FEET(12.0), YARD(36.0),
    ML(1.0 / 1000.0), LITRE(1.0), GALLON(3.78),
    GRAM(1.0 / 1000.0), KG(1.0), TONNE(1000.0),
    FAHRENHEIT(32.0), CELSIUS(1.0);

    public double unitConversion;

    UnitType(double unitConversion) {
        this.unitConversion = unitConversion;
    }
}
