package com.bridgelabz.quantitymeasurement.utility;

public enum  UnitType {
   INCH(1.0),  FEET(12.0);

    public double unitConversion;

    UnitType(double unitConversion) {
        this.unitConversion = unitConversion;
    }
}
