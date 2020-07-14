package com.bridgelabz.quantitymeasurement.utility;

public enum  UnitType {
    CENTIMETER(1.0/2.5),
    INCH(1.0),
    FEET(12.0),
    YARD(36.0);

    public double unitConversion;

    UnitType(double unitConversion) {
        this.unitConversion = unitConversion;
    }

}
