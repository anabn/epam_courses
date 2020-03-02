package epam.testingTemperature;

import org.junit.Assert;
import org.junit.Test;

import java.text.DecimalFormat;

public class TemperatureConverterTest {
    private int param = 44;
    private TemperatureConverter temperatureConverter = new TemperatureConverter();
    @Test
    public void convertFtoC() {
        Assert.assertNotEquals(param, temperatureConverter.convertFtoC(34.4));
    }

    @Test
    public void convertCtoF() {
        DecimalFormat df = new DecimalFormat("###.##");
        String expectResult = "93.92";
        Assert.assertEquals("Expected is " + expectResult, expectResult,
                df.format(temperatureConverter.convertCtoF(34.4)));
    }

    @Test
    public void convertCtoK() {
        Assert.assertNotEquals(param, temperatureConverter.convertCtoK(34.4));
    }

    @Test
    public void convertKtoC() {
        Assert.assertNotEquals(param, temperatureConverter.convertKtoC(34.4));
    }

    @Test
    public void convertFtoK() {
        Assert.assertNotEquals(param, temperatureConverter.convertFtoK(34.4));
    }

    @Test
    public void convertKtoF() {
        int number = 15;
        Double tempFtoK = temperatureConverter.convertFtoK(number);
        Assert.assertEquals(number, Math.round(temperatureConverter.convertKtoF(tempFtoK)));
    }
}