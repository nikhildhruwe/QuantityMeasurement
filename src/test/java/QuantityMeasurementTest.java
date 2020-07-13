import com.bridgelabz.quantitymeasurement.services.QuantityMeasurement;
import com.bridgelabz.quantitymeasurement.utility.UnitType;
import org.junit.Assert;
import org.junit.Test;

public class QuantityMeasurementTest {

    @Test
    public void given12InchAnd1Feet_IfEqual_ShouldReturnTrue() {
        QuantityMeasurement quantityMeasurement = new QuantityMeasurement();
        double result1 = quantityMeasurement.calculateUnit(UnitType.INCH, 12.0);
        double result2 = quantityMeasurement.calculateUnit(UnitType.FEET, 1.0);
        Assert.assertEquals(result1, result2, 0.0);
    }

    @Test
    public void given24InchAnd1Feet_IfNotEqual_ShouldReturnFalse() {
        QuantityMeasurement quantityMeasurement = new QuantityMeasurement();
        double result1 = quantityMeasurement.calculateUnit(UnitType.INCH, 12.0);
        double result2 = quantityMeasurement.calculateUnit(UnitType.FEET, 1.0);
        Assert.assertNotEquals(result1, result2, 0.0);

    }

    //1.1
    @Test
    public void given0FeetAnd0Feet_ShouldReturnEqual() {
        QuantityMeasurement quantityMeasurement = new QuantityMeasurement();
        double result1 = quantityMeasurement.calculateUnit(UnitType.FEET, 0.0);
        double result2 = quantityMeasurement.calculateUnit(UnitType.FEET, 0.0);
        boolean compare = quantityMeasurement.compare(result1,result2);
        Assert.assertTrue(compare);
    }

    //1.2
    @Test
    public void givenNullValue_ShouldThrowException() {
        QuantityMeasurement quantityMeasurement = new QuantityMeasurement();
        double result1 = quantityMeasurement.calculateUnit(UnitType.FEET, null);
        double result2 = quantityMeasurement.calculateUnit(UnitType.FEET, null);
        boolean compare = quantityMeasurement.compare(result1, result2);
        Assert.assertTrue(compare);
    }
}
