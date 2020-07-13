import com.bridgelabz.quantitymeasurement.exception.QuantityMeasurementException;
import com.bridgelabz.quantitymeasurement.services.QuantityMeasurement;
import com.bridgelabz.quantitymeasurement.utility.UnitType;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class QuantityMeasurementTest {

    @Test
    public void given24InchAnd1Feet_IfNotEqual_ShouldReturnFalse() throws QuantityMeasurementException {
        QuantityMeasurement quantityMeasurement = new QuantityMeasurement();
        double result1 = quantityMeasurement.calculateUnit(UnitType.INCH, 12.0);
        double result2 = quantityMeasurement.calculateUnit(UnitType.FEET, 1.0);
        Assert.assertNotEquals(result1, result2, 0.0);
    }

    //1.1
    @Test
    public void given0FeetAnd0Feet_ShouldReturnEqual() throws QuantityMeasurementException {
        QuantityMeasurement quantityMeasurement = new QuantityMeasurement();
        double result1 = quantityMeasurement.calculateUnit(UnitType.FEET, 0.0);
        double result2 = quantityMeasurement.calculateUnit(UnitType.FEET, 0.0);
        boolean compare = quantityMeasurement.compare(result1, result2);
        Assert.assertTrue(compare);
    }

    //1.2
    @Test
    public void givenNullValue_ShouldThrowException() {
        try {
            QuantityMeasurement quantityMeasurement = new QuantityMeasurement();
            quantityMeasurement.calculateUnit(UnitType.FEET, null);
            quantityMeasurement.calculateUnit(UnitType.FEET, null);
            ExpectedException exceptionRule = ExpectedException.none();
            exceptionRule.expect(QuantityMeasurementException.class);
        } catch (QuantityMeasurementException e) {
            Assert.assertEquals(e.type, QuantityMeasurementException.ExceptionType.NULL_VALUE);
        }
    }

    //1.3
    @Test
    public void givenQuantityMeasurementReference_IfProper_ShouldReturnTrue() {
        QuantityMeasurement quantityMeasurement = new QuantityMeasurement();
        boolean equals = quantityMeasurement.equals(quantityMeasurement);
        Assert.assertTrue(equals);
    }

    //1.4
//    @Test
//    public void givenQuantityMeasurementType_IfProper_ShouldReturnTrue() {
//        QuantityMeasurement quantityMeasurement = new QuantityMeasurement();
//        QuantityMeasurement quantityMeasurement1 = new QuantityMeasurement();
//        boolean equals = quantityMeasurement.equals(quantityMeasurement1);
//        Assert.assertTrue(equals);
//    }

    //1.4
    @Test
    public void givenQuantityMeasurementType_IfNotProper_ShouldReturnFalse() {
        QuantityMeasurement quantityMeasurement = new QuantityMeasurement();
        boolean equals = quantityMeasurement.equals(new QuantityMeasurementException("NULL",
                QuantityMeasurementException.ExceptionType.NULL_VALUE));
        Assert.assertFalse(equals);
    }

    //1.5
    @Test
    public void given12InchAnd1Feet_IfEqual_ShouldReturnTrue() throws QuantityMeasurementException {
        try {
            QuantityMeasurement quantityMeasurement = new QuantityMeasurement();
            double result1 = quantityMeasurement.calculateUnit(UnitType.INCH, 1.0);
            double result2 = quantityMeasurement.calculateUnit(UnitType.FEET, 1.0);
            Assert.assertEquals(result1, result2, 0.0);
        } catch (QuantityMeasurementException e) {
            Assert.assertEquals(e.type, QuantityMeasurementException.ExceptionType.NEGATIVE_VALUE);
        }
    }

    //1.7 ***** INCH *****
    @Test
    public void givenNullForInch_ShouldThrowException() {
        try {
            QuantityMeasurement quantityMeasurement = new QuantityMeasurement();
            quantityMeasurement.calculateUnit(UnitType.INCH, null);
            quantityMeasurement.calculateUnit(UnitType.INCH, null);
            ExpectedException exceptionRule = ExpectedException.none();
            exceptionRule.expect(QuantityMeasurementException.class);
        } catch (QuantityMeasurementException e) {
            Assert.assertEquals(e.type, QuantityMeasurementException.ExceptionType.NULL_VALUE);
        }
    }
    //1.8
    @Test
    public void givenSameReference_IfProper_ShouldReturnTrue() {
        QuantityMeasurement quantityMeasurement = new QuantityMeasurement();
        boolean equals = quantityMeasurement.equals(quantityMeasurement);
        Assert.assertTrue(equals);
    }

    //1.9
    @Test
    public void givenSameType_IfNotProper_ShouldReturnFalse() {
        QuantityMeasurement quantityMeasurement = new QuantityMeasurement();
        boolean equals = quantityMeasurement.equals(new QuantityMeasurementException("NULL",
                QuantityMeasurementException.ExceptionType.NULL_VALUE));
        Assert.assertFalse(equals);
    }

    //1.10
    @Test
    public void givenInchAndFeetValue_IfProper_ShouldReturnTrue() {
        try {
            QuantityMeasurement quantityMeasurement = new QuantityMeasurement();
            double result1 = quantityMeasurement.calculateUnit(UnitType.INCH, 2.0);
            double result2 = quantityMeasurement.calculateUnit(UnitType.INCH, 2.0);
            Assert.assertEquals(result1, result2, 0.0);
        }catch (QuantityMeasurementException e){
            Assert.assertEquals(e.type, QuantityMeasurementException.ExceptionType.NEGATIVE_VALUE);
        }
    }

    //2.1 **** Yard comparison *****
    @Test
    public void givenFeetAndYardValue_IfProper_ShouldReturnTrue() {
        try {
            QuantityMeasurement quantityMeasurement = new QuantityMeasurement();
            double result1 = quantityMeasurement.calculateUnit(UnitType.FEET, 3.0);
            double result2 = quantityMeasurement.calculateUnit(UnitType.YARD, 1.0);
            Assert.assertEquals(result1, result2, 0.0);
        }catch (QuantityMeasurementException e){
            Assert.assertEquals(e.type, QuantityMeasurementException.ExceptionType.NEGATIVE_VALUE);
        }
    }

    //2.2
    @Test
    public void given1FeetAnd1Yard_ShouldReturnFalse() {
        try {
            QuantityMeasurement quantityMeasurement = new QuantityMeasurement();
            double result1 = quantityMeasurement.calculateUnit(UnitType.FEET, 1.0);
            double result2 = quantityMeasurement.calculateUnit(UnitType.YARD, 1.0);
            Assert.assertNotEquals(result1, result2, 0.0);
        }catch (QuantityMeasurementException e){
            Assert.assertEquals(e.type, QuantityMeasurementException.ExceptionType.NEGATIVE_VALUE);
        }
    }

    //2.3
    @Test
    public void given1InchAnd1Yard_ShouldReturnFalse() {
        try {
            QuantityMeasurement quantityMeasurement = new QuantityMeasurement();
            double result1 = quantityMeasurement.calculateUnit(UnitType.INCH, 1.0);
            double result2 = quantityMeasurement.calculateUnit(UnitType.YARD, 1.0);
            Assert.assertNotEquals(result1, result2, 0.0);
        }catch (QuantityMeasurementException e){
            Assert.assertEquals(e.type, QuantityMeasurementException.ExceptionType.NEGATIVE_VALUE);
        }
    }

}
