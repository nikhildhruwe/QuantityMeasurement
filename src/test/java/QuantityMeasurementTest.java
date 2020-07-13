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
        boolean compare = quantityMeasurement.compare(result1,result2);
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
       }catch (QuantityMeasurementException e){
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

    @Test
    public void givenQuantityMeasurementType_IfNotProper_ShouldReturnFalse() {
        QuantityMeasurement quantityMeasurement = new QuantityMeasurement();
        boolean equals = quantityMeasurement.equals(new QuantityMeasurementException("NULL",
                                                            QuantityMeasurementException.ExceptionType.NULL_VALUE));
        Assert.assertFalse(equals);
    }
}
