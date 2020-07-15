package com.bridgelabz.quantitymeasurement.services;

import com.bridgelabz.quantitymeasurement.exception.QuantityMeasurementException;
import com.bridgelabz.quantitymeasurement.utility.Unit;


public class QuantityMeasurement {
    private double value;

    public QuantityMeasurement(Unit unit, Double value) throws QuantityMeasurementException {
        if (value == null)
            throw new QuantityMeasurementException("Entered Null Value",
                    QuantityMeasurementException.ExceptionType.NULL_VALUE);
        if (value < 0)
            throw new QuantityMeasurementException("Entered Negative Value",
                    QuantityMeasurementException.ExceptionType.NEGATIVE_VALUE);
        if (unit.equals(Unit.FAHRENHEIT))
            this.value = (value - unit.unitConversion) * 5 / 9;
        else
            this.value = value * unit.unitConversion;
    }

//    public boolean compare(double value1, double value2) {
//        return Double.compare(value1, value2) == 0;
//    }
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
