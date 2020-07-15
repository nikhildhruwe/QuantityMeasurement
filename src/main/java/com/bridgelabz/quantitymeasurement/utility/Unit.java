package com.bridgelabz.quantitymeasurement.utility;

public enum Unit {
    CENTIMETER(1.0 / 2.5, Type.LENGTH), INCH(1.0, Type.LENGTH),
    FEET(12.0, Type.LENGTH), YARD(36.0, Type.LENGTH),
    ML(1.0 / 1000.0, Type.VOLUME), LITRE(1.0, Type.VOLUME), GALLON(3.78, Type.VOLUME),
    GRAM(1.0 / 1000.0, Type.WEIGHT), KG(1.0, Type.WEIGHT), TONNE(1000.0, Type.WEIGHT),
    FAHRENHEIT(32.0, Type.TEMPERATURE), CELSIUS(1.0, Type.TEMPERATURE);

    public Type type;
    public double unitConversion;

    Unit(double unitConversion, Type type) {
        this.unitConversion = unitConversion;
        this.type = type;
    }
}
