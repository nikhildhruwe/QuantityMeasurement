package com.bridgelabz.quantitymeasurement.services;

import com.bridgelabz.quantitymeasurement.exception.QuantityMeasurementException;

public interface IQuantityMeasurement {
    double addition(QuantityMeasurement that) throws QuantityMeasurementException;
}
