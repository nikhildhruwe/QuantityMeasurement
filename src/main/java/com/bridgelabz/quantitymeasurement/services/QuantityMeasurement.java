package com.bridgelabz.quantitymeasurement.services;

import com.bridgelabz.quantitymeasurement.exception.QuantityMeasurementException;
import com.bridgelabz.quantitymeasurement.utility.Unit;

import java.util.Objects;


public class QuantityMeasurement implements  IQuantityMeasurement{
    private Unit unit;
    private double value;

    /**
     * Parameterised constructor to initialise unit type and value.
     * @param unit
     * @param value
     * @throws QuantityMeasurementException
     */
    public QuantityMeasurement(Unit unit, Double value) throws QuantityMeasurementException {
        if (value == null)
            throw new QuantityMeasurementException("Entered Null Value",
                    QuantityMeasurementException.ExceptionType.NULL_VALUE);
        if (value < 0)
            throw new QuantityMeasurementException("Entered Negative Value",
                    QuantityMeasurementException.ExceptionType.NEGATIVE_VALUE);
        this.unit = unit;
        if (unit.equals(Unit.FAHRENHEIT))

            this.value = (value - unit.unitConversion) * 5 / 9;
        else
            this.value = value * unit.unitConversion;
    }

    public QuantityMeasurement() {
    }

    /**
     * Method for addition of two quantities
     * @return result in double
     * @throws QuantityMeasurementException
     */
    public double addition(QuantityMeasurement that) throws QuantityMeasurementException {
        if (this.unit.type.equals(that.unit.type))
            return this.value + that.value;
        else
            throw new QuantityMeasurementException("Different measurement types"
                                                        , QuantityMeasurementException.ExceptionType.INVALID_UNIT_TYPE);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        QuantityMeasurement that = (QuantityMeasurement) o;
        return Double.compare(that.value, value) == 0 &&
                unit.type == that.unit.type;
    }
}
