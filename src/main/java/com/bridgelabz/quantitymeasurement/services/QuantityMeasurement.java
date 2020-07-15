package com.bridgelabz.quantitymeasurement.services;

import com.bridgelabz.quantitymeasurement.exception.QuantityMeasurementException;
import com.bridgelabz.quantitymeasurement.utility.UnitType;


public class QuantityMeasurement {
    private double value;

    public QuantityMeasurement(UnitType type, Double value) throws QuantityMeasurementException {
        if (value == null)
            throw new QuantityMeasurementException("Entered Null Value",
                    QuantityMeasurementException.ExceptionType.NULL_VALUE);
        if (value < 0)
            throw new QuantityMeasurementException("Entered Negative Value",
                    QuantityMeasurementException.ExceptionType.NEGATIVE_VALUE);
        if ( type.equals(UnitType.FAHRENHEIT))
            this.value = (value - type.unitConversion) * 5/9;
        else
            this.value = value * type.unitConversion;
    }

    public QuantityMeasurement() {
    }

    public double addition(QuantityMeasurement that) {
        return this.value + that.value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        QuantityMeasurement that = (QuantityMeasurement) o;
        return Double.compare(that.value, value) == 0;
    }
}
