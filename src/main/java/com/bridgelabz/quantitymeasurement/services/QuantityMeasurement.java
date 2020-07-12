package com.bridgelabz.quantitymeasurement.services;

import com.bridgelabz.quantitymeasurement.utility.UnitType;

public class QuantityMeasurement {

    public double calculateUnit(UnitType type, double unit) {
        return unit * type.unitConversion;
    }
}
