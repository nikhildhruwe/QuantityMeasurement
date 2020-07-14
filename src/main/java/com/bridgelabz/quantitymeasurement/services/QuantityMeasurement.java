package com.bridgelabz.quantitymeasurement.services;

import com.bridgelabz.quantitymeasurement.exception.QuantityMeasurementException;
import com.bridgelabz.quantitymeasurement.utility.UnitType;


public class QuantityMeasurement {
    private final UnitType type;
    private final double value;

    public QuantityMeasurement(UnitType type, Double value) throws QuantityMeasurementException {
        if (value == null)
            throw new QuantityMeasurementException("Entered Null Value",
                    QuantityMeasurementException.ExceptionType.NULL_VALUE);
        if (value < 0)
            throw new QuantityMeasurementException("Entered Negative Value",
                    QuantityMeasurementException.ExceptionType.NEGATIVE_VALUE);
        this.type = type;
        this.value = value * type.unitConversion;

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        QuantityMeasurement that = (QuantityMeasurement) o;
        return Double.compare(that.value, value) == 0;
    }
}
