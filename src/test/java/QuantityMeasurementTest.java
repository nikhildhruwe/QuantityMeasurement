import com.bridgelabz.quantitymeasurement.exception.QuantityMeasurementException;
import com.bridgelabz.quantitymeasurement.services.QuantityMeasurement;
import com.bridgelabz.quantitymeasurement.utility.UnitType;
import org.junit.Assert;
import org.junit.Test;

public class QuantityMeasurementTest {

    //1.1
    @Test
    public void given0FeetAnd0Feet_ShouldReturnEqual() throws QuantityMeasurementException {
        QuantityMeasurement inch1 = new QuantityMeasurement(UnitType.FEET, 0.0);
        QuantityMeasurement inch2 = new QuantityMeasurement(UnitType.FEET, 0.0);
        boolean compare = inch1.equals(inch2);
        Assert.assertTrue(compare);
    }

    //1.2
    @Test
    public void givenNullValue_ShouldThrowException() {
        try {
            QuantityMeasurement inch1 = new QuantityMeasurement(UnitType.FEET, 0.0);
            QuantityMeasurement inch2 = new QuantityMeasurement(UnitType.FEET, 0.0);
            Assert.assertNotEquals(inch1, inch2);
        } catch (QuantityMeasurementException e) {
            e.printStackTrace();
        }
    }

    //1.3
    @Test
    public void givenQuantityMeasurementReference_IfProper_ShouldReturnTrue() throws QuantityMeasurementException {
        QuantityMeasurement inch1 = new QuantityMeasurement(UnitType.FEET, 0.0);
        QuantityMeasurement inch2 = new QuantityMeasurement(UnitType.INCH, 0.0);
        boolean equals = inch1.equals(inch2);
        Assert.assertTrue(equals);
    }

    //1.4
    @Test
    public void givenDifferentType_ShouldReturnFalse() throws QuantityMeasurementException {
        QuantityMeasurement inch1 = new QuantityMeasurement(UnitType.FEET, 0.0);
        boolean equals = inch1.equals(UnitType.FEET);
        Assert.assertFalse(equals);
    }

    //1.5
    @Test
    public void given0Feet_IfEqual_ShouldReturnTrue() throws QuantityMeasurementException {
        try {
            QuantityMeasurement inch1 = new QuantityMeasurement(UnitType.INCH, 12.0);
            QuantityMeasurement inch2 = new QuantityMeasurement(UnitType.FEET, 1.0);
            boolean compare = inch1.equals(inch2);
            Assert.assertTrue(compare);
        } catch (QuantityMeasurementException e) {
            Assert.assertEquals(e.type, QuantityMeasurementException.ExceptionType.NEGATIVE_VALUE);
        }
    }

    //1.7 ***** INCH *****
    @Test
    public void given0InchAnd0Inch_IfProper_ShouldReturnTrue() throws QuantityMeasurementException {
        QuantityMeasurement inch1 = new QuantityMeasurement(UnitType.INCH, 0.0);
        QuantityMeasurement inch2 = new QuantityMeasurement(UnitType.INCH, 0.0);
        boolean equals = inch1.equals(inch2);
        Assert.assertTrue(equals);
    }

    //1.8
    @Test
    public void givenNullForInch_ShouldThrowException() {
        try {
            QuantityMeasurement inch1 = new QuantityMeasurement(UnitType.INCH, 0.0);
            QuantityMeasurement inch2 = new QuantityMeasurement(UnitType.INCH, null);
            inch1.equals(inch2);
        } catch (QuantityMeasurementException e) {
            Assert.assertEquals(e.type, QuantityMeasurementException.ExceptionType.NULL_VALUE);
            System.out.println(e.getMessage());
        }
    }

    //1.9
    @Test
    public void givenReferenceType_IfProper_ShouldReturnTrue() throws QuantityMeasurementException {
        QuantityMeasurement inch1 = new QuantityMeasurement(UnitType.FEET, 0.0);
        QuantityMeasurement inch2 = new QuantityMeasurement(UnitType.INCH, 0.0);
        boolean equals = inch1.equals(inch2);
        Assert.assertTrue(equals);
    }

    //1.10
    @Test
    public void givenSameType_IfNotProper_ShouldReturnFalse() throws QuantityMeasurementException {
        QuantityMeasurement inch1 = new QuantityMeasurement(UnitType.INCH, 0.0);
        boolean equals = inch1.equals(UnitType.INCH);
        Assert.assertFalse(equals);
    }

    //1.11
    @Test
    public void givenInchValueAndFeetValue_IfProper_ShouldReturnTrue() {
        try {
            QuantityMeasurement inch1 = new QuantityMeasurement(UnitType.FEET, 2.0);
            QuantityMeasurement inch2 = new QuantityMeasurement(UnitType.INCH, 24.0);
            boolean equals = inch1.equals(inch2);
            Assert.assertTrue(equals);
        } catch (QuantityMeasurementException e) {
            Assert.assertEquals(e.type, QuantityMeasurementException.ExceptionType.NEGATIVE_VALUE);
        }
    }

    //2.1 **** Yard comparison *****
    @Test
    public void given3FeetAnd1YardValue_IfProper_ShouldReturnTrue() throws QuantityMeasurementException {
            QuantityMeasurement inch1 = new QuantityMeasurement(UnitType.FEET, 3.0);
            QuantityMeasurement inch2 = new QuantityMeasurement(UnitType.YARD, 1.0);
            boolean equals = inch1.equals(inch2);
            Assert.assertTrue(equals);
        }

    @Test
    public void given1FeetAnd1YardValue_ShouldReturnFalse() throws QuantityMeasurementException {
        QuantityMeasurement inch1 = new QuantityMeasurement(UnitType.FEET, 1.0);
        QuantityMeasurement inch2 = new QuantityMeasurement(UnitType.YARD, 1.0);
        boolean equals = inch1.equals(inch2);
        Assert.assertFalse(equals);
    }

}
