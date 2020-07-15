import com.bridgelabz.quantitymeasurement.exception.QuantityMeasurementException;
import com.bridgelabz.quantitymeasurement.services.QuantityMeasurement;
import com.bridgelabz.quantitymeasurement.utility.UnitType;
import org.junit.Assert;
import org.junit.Test;

public class QuantityMeasurementTest {

    // Negative Value Check
    @Test
    public void givenNegativeValue_ShouldThrowException() {
        try {
            QuantityMeasurement inch = new QuantityMeasurement(UnitType.INCH, -12.0);
            QuantityMeasurement feet = new QuantityMeasurement(UnitType.FEET, 1.0);
            boolean compare = inch.equals(feet);
            Assert.assertTrue(compare);
        } catch (QuantityMeasurementException e) {
            Assert.assertEquals(e.type, QuantityMeasurementException.ExceptionType.NEGATIVE_VALUE);
            System.out.println(e.getMessage());
        }
    }

    //1.1
    @Test
    public void given0FeetAnd0Feet_ShouldReturnEqual() throws QuantityMeasurementException {
        QuantityMeasurement feet1 = new QuantityMeasurement(UnitType.FEET, 0.0);
        QuantityMeasurement feet2 = new QuantityMeasurement(UnitType.FEET, 0.0);
        boolean compare = feet1.equals(feet2);
        Assert.assertTrue(compare);
    }

    //1.2
    @Test
    public void givenNullValue_ShouldThrowException() {
        try {
            QuantityMeasurement feet1 = new QuantityMeasurement(UnitType.FEET, 0.0);
            QuantityMeasurement feet2 = new QuantityMeasurement(UnitType.FEET, null);
            Assert.assertNotEquals(feet1, feet2);
        } catch (QuantityMeasurementException e) {
            e.printStackTrace();
        }
    }

    //1.3
    @Test
    public void givenReferenceType_IfEqual_ShouldReturnTrue() throws QuantityMeasurementException {
        QuantityMeasurement feet = new QuantityMeasurement(UnitType.FEET, 1.0);
        QuantityMeasurement inch = new QuantityMeasurement();
        boolean equals = feet.equals(inch);
        Assert.assertFalse(equals);
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
            QuantityMeasurement inch = new QuantityMeasurement(UnitType.INCH, 12.0);
            QuantityMeasurement feet = new QuantityMeasurement(UnitType.FEET, 1.0);
            boolean compare = inch.equals(feet);
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
        QuantityMeasurement inch1 = new QuantityMeasurement(UnitType.INCH, 0.0);
        QuantityMeasurement inch2 = new QuantityMeasurement();
        boolean equals = inch1.equals(inch2);
        Assert.assertTrue(equals);
    }

    //1.10
    @Test
    public void givenSameType_IfNotProper_ShouldReturnFalse() throws QuantityMeasurementException {
        QuantityMeasurement inch = new QuantityMeasurement(UnitType.INCH, 0.0);
        boolean equals = inch.equals(UnitType.INCH);
        Assert.assertFalse(equals);
    }

    //1.11
    @Test
    public void givenInchValueAndFeetValue_IfProper_ShouldReturnTrue() {
        try {
            QuantityMeasurement feet = new QuantityMeasurement(UnitType.FEET, 2.0);
            QuantityMeasurement inch = new QuantityMeasurement(UnitType.INCH, 24.0);
            boolean equals = feet.equals(inch);
            Assert.assertTrue(equals);
        } catch (QuantityMeasurementException e) {
            Assert.assertEquals(e.type, QuantityMeasurementException.ExceptionType.NEGATIVE_VALUE);
        }
    }

    //2.1 **** Yard comparison *****
    @Test
    public void given3FeetAnd1YardValue_IfProper_ShouldReturnTrue() throws QuantityMeasurementException {
        QuantityMeasurement feet = new QuantityMeasurement(UnitType.FEET, 3.0);
        QuantityMeasurement yard = new QuantityMeasurement(UnitType.YARD, 1.0);
        boolean equals = feet.equals(yard);
        Assert.assertTrue(equals);
    }

    //2.2
    @Test
    public void given1FeetAnd1YardValue_ShouldReturnFalse() throws QuantityMeasurementException {
        QuantityMeasurement feet = new QuantityMeasurement(UnitType.FEET, 1.0);
        QuantityMeasurement yard = new QuantityMeasurement(UnitType.YARD, 1.0);
        boolean equals = feet.equals(yard);
        Assert.assertFalse(equals);
    }

    //2.3
    @Test
    public void given1InchAnd1YardValue_ShouldReturnFalse() throws QuantityMeasurementException {
        QuantityMeasurement inch = new QuantityMeasurement(UnitType.INCH, 1.0);
        QuantityMeasurement yard = new QuantityMeasurement(UnitType.YARD, 1.0);
        boolean equals = inch.equals(yard);
        Assert.assertFalse(equals);
    }

    //2.4
    @Test
    public void given1YardAnd36InchValue_ShouldReturnTrue() throws QuantityMeasurementException {
        QuantityMeasurement yard = new QuantityMeasurement(UnitType.YARD, 1.0);
        QuantityMeasurement inch = new QuantityMeasurement(UnitType.INCH, 36.0);
        boolean equals = yard.equals(inch);
        Assert.assertTrue(equals);
    }

    //2.5
    @Test
    public void given36InchAnd1YardValue_ShouldReturnTrue() throws QuantityMeasurementException {
        QuantityMeasurement inch = new QuantityMeasurement(UnitType.INCH, 36.0);
        QuantityMeasurement yard = new QuantityMeasurement(UnitType.YARD, 1.0);
        boolean equals = inch.equals(yard);
        Assert.assertTrue(equals);
    }

    //2.6
    @Test
    public void given1YardAnd3FeetValue_ShouldReturnTrue() throws QuantityMeasurementException {
        QuantityMeasurement yard = new QuantityMeasurement(UnitType.YARD, 1.0);
        QuantityMeasurement feet = new QuantityMeasurement(UnitType.FEET, 3.0);
        boolean equals = yard.equals(feet);
        Assert.assertTrue(equals);
    }

    //3.1
    @Test
    public void given5CentimeterAnd2InchValue_ShouldReturnTrue() throws QuantityMeasurementException {
        QuantityMeasurement inch = new QuantityMeasurement(UnitType.INCH, 2.0);
        QuantityMeasurement centimeter = new QuantityMeasurement(UnitType.CENTIMETER, 5.0);
        boolean equals = inch.equals(centimeter);
        Assert.assertTrue(equals);
    }

    //3.2
    @Test
    public void given30CentimeterAnd1FeetValue_ShouldReturnTrue() throws QuantityMeasurementException {
        QuantityMeasurement feet = new QuantityMeasurement(UnitType.FEET, 1.0);
        QuantityMeasurement centimeter = new QuantityMeasurement(UnitType.CENTIMETER, 30.0);
        boolean equals = feet.equals(centimeter);
        Assert.assertTrue(equals);
    }

    //3.3
    @Test
    public void given90CentimeterAnd1YardValue_ShouldReturnTrue() throws QuantityMeasurementException {
        QuantityMeasurement yard = new QuantityMeasurement(UnitType.YARD, 1.0);
        QuantityMeasurement centimeter = new QuantityMeasurement(UnitType.CENTIMETER, 90.0);
        boolean equals = yard.equals(centimeter);
        Assert.assertTrue(equals);
    }

    //3.4
    @Test
    public void given1CentimeterAnd1InchValue_ShouldReturnFalse() throws QuantityMeasurementException {
        QuantityMeasurement inch = new QuantityMeasurement(UnitType.INCH, 1.0);
        QuantityMeasurement centimeter = new QuantityMeasurement(UnitType.CENTIMETER, 1.0);
        boolean equals = inch.equals(centimeter);
        Assert.assertFalse(equals);
    }


    //3.5
    @Test
    public void given1CentimeterAnd1FeetValue_ShouldReturnFalse() throws QuantityMeasurementException {
        QuantityMeasurement feet = new QuantityMeasurement(UnitType.FEET, 1.0);
        QuantityMeasurement centimeter = new QuantityMeasurement(UnitType.CENTIMETER, 1.0);
        boolean equals = feet.equals(centimeter);
        Assert.assertFalse(equals);
    }

    //3.6
    @Test
    public void given1CentimeterAnd1YardValue_ShouldReturnFalse() throws QuantityMeasurementException {
        QuantityMeasurement yard = new QuantityMeasurement(UnitType.YARD, 1.0);
        QuantityMeasurement centimeter = new QuantityMeasurement(UnitType.CENTIMETER, 1.0);
        boolean equals = yard.equals(centimeter);
        Assert.assertFalse(equals);
    }

    //4.1
    @Test
    public void given2InchAnd2Inch_WhenAdded_ShouldGiveCorrectResult() throws QuantityMeasurementException {
        QuantityMeasurement inch1 = new QuantityMeasurement(UnitType.INCH, 2.0);
        QuantityMeasurement inch2 = new QuantityMeasurement(UnitType.INCH, 2.0);
        double addition = inch1.addition(inch2);
        Assert.assertEquals(4, addition, 0.0);
    }

    //4.2
    @Test
    public void given1FeetAnd2Inch_WhenAdded_ShouldGiveCorrectResult() throws QuantityMeasurementException {
        QuantityMeasurement feet = new QuantityMeasurement(UnitType.FEET, 1.0);
        QuantityMeasurement inch = new QuantityMeasurement(UnitType.INCH, 2.0);
        double addition = feet.addition(inch);
        Assert.assertEquals(14, addition, 0.0);
    }

    //4.3
    @Test
    public void given1FeetAnd1Feet_WhenAdded_ShouldGiveCorrectResult() throws QuantityMeasurementException {
        QuantityMeasurement feet1 = new QuantityMeasurement(UnitType.FEET, 1.0);
        QuantityMeasurement feet2 = new QuantityMeasurement(UnitType.FEET, 1.0);
        double addition = feet1.addition(feet2);
        Assert.assertEquals(24, addition, 0.0);
    }

    //4.4
    @Test
    public void givenValuesInInchAnd2Centimeter_WhenAdded_ShouldGiveCorrectResult() throws QuantityMeasurementException {
        QuantityMeasurement inch = new QuantityMeasurement(UnitType.INCH, 2.0);
        QuantityMeasurement centimeter = new QuantityMeasurement(UnitType.CENTIMETER, 2.5);
        double addition = inch.addition(centimeter);
        Assert.assertEquals(3, addition, 0.0);
    }

    //5.1
    @Test
    public void givenGallonAndLitresVolume_WhenProper_ShouldBeEqual() throws QuantityMeasurementException {
        QuantityMeasurement gallon = new QuantityMeasurement(UnitType.GALLON, 1.0);
        QuantityMeasurement litre = new QuantityMeasurement(UnitType.LITRE, 3.78);
        Assert.assertEquals(gallon, litre);
    }

    //5.2
    @Test
    public void givenVolumesInLitresAndMillilitre_WhenProper_ShouldBeEqual() throws QuantityMeasurementException {
        QuantityMeasurement litre = new QuantityMeasurement(UnitType.LITRE, 1.0);
        QuantityMeasurement ml = new QuantityMeasurement(UnitType.ML, 1000.0);
        Assert.assertEquals(litre, ml);
    }

    //6.1
    @Test
    public void givenVolumesInGallonsAndLitres_WhenAdded_ShouldGiveCorrectResult() throws QuantityMeasurementException {
        QuantityMeasurement gallon = new QuantityMeasurement(UnitType.GALLON, 1.0);
        QuantityMeasurement litre = new QuantityMeasurement(UnitType.LITRE, 3.78);
        double result = gallon.addition(litre);
        Assert.assertEquals(7.56, result, 0.0);
    }

}
