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
}
