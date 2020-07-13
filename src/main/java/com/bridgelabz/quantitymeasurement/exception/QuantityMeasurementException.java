package com.bridgelabz.quantitymeasurement.exception;

public class QuantityMeasurementException extends Exception {
    public enum ExceptionType{
        NEGATIVE_VALUE, NULL_VALUE
    }
    public ExceptionType type;

    public QuantityMeasurementException(String message, ExceptionType type) {
        super(message);
        this.type = type;
    }
}
