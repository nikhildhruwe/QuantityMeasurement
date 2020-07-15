package com.bridgelabz.quantitymeasurement.exception;

public class QuantityMeasurementException extends Exception {
    public enum ExceptionType {
        NEGATIVE_VALUE, NULL_VALUE ,INVALID_UNIT_TYPE;
    }

    public ExceptionType type;

    public QuantityMeasurementException(String message, ExceptionType type) {
        super(message);
        this.type = type;
    }
}
