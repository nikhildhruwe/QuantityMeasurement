package com.bridgelabz.quantitymeasurement.services;

import com.bridgelabz.quantitymeasurement.utility.UnitType;

public class QuantityMeasurement {
    private double value;

    public double calculateUnit(UnitType type, Double unit) {
        return unit * type.unitConversion;
    }

    public boolean compare(double value1, double value2) {
        return value1 == value2;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        QuantityMeasurement that = (QuantityMeasurement) o;
        return Double.compare(that.value, value) == 0;
    }

}
