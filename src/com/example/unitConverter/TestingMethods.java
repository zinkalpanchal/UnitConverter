package com.example.unitConverter;

import junit.framework.TestCase;

import org.junit.Test;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class TestingMethods extends TestCase 
{
	Calculations calcMethods = new Calculations();
	/**
	 * Unit tests for the Weight conversion
	 **/
	
	@Test
	public void testMilligram_To_Gram() 
	{
		 BigDecimal expectedValue = BigDecimal.valueOf(0.01).setScale(6, RoundingMode.CEILING),
				 	actualValue = calcMethods.convert_From_Milligram_To_Gram(10);
		
		String message = "Expected: " + expectedValue + ". Actual: " + actualValue;
		assertEquals(message, expectedValue, actualValue);
	}

	@Test
	public void testMilligram_To_Kilogram()
	{
		 BigDecimal expectedValue = BigDecimal.valueOf(0.000584).setScale(6, RoundingMode.CEILING),
				 	actualValue = calcMethods.convert_From_Milligram_To_Kilogram(584);
		
		String message = "Expected: " + expectedValue + ". Actual: " + actualValue;
		assertEquals(message, expectedValue, actualValue);
	}

	@Test
	public void testMilligram_To_Pound()
	{
		 BigDecimal expectedValue = BigDecimal.valueOf(0.01289043).setScale(6, RoundingMode.CEILING),
				 	actualValue = calcMethods.convert_From_Milligram_To_Pound(5847);
		
		String message = "Expected: " + expectedValue + ". Actual: " + actualValue;
		assertEquals(message, expectedValue, actualValue);
	}

	@Test
	public void testMilligram_To_Tonne()
	{
		 BigDecimal expectedValue = BigDecimal.valueOf(0.009554441).setScale(6, RoundingMode.CEILING),
				 	actualValue = calcMethods.convert_From_Milligram_To_Tonne(9554441);
		
		String message = "Expected: " + expectedValue + ". Actual: " + actualValue;
		assertEquals(message, expectedValue, actualValue);
	}

	@Test
	public void testGram_To_Milligram()
	{
		 BigDecimal expectedValue = BigDecimal.valueOf(58000).setScale(6, RoundingMode.CEILING),
				 	actualValue = calcMethods.convert_From_Gram_To_Milligram(58);
		
		String message = "Expected: " + expectedValue + ". Actual: " + actualValue;
		assertEquals(message, expectedValue, actualValue);
	}

	@Test
	public void testGram_To_Kilogram()
	{
		 BigDecimal expectedValue = BigDecimal.valueOf(0.558).setScale(6, RoundingMode.CEILING),
				 	actualValue = calcMethods.convert_From_Gram_To_Kilogram(558);
		
		String message = "Expected: " + expectedValue + ". Actual: " + actualValue;
		assertEquals(message, expectedValue, actualValue);
	}

	@Test
	public void testGram_To_Pound()
	{
		 BigDecimal expectedValue = BigDecimal.valueOf(1.23018).setScale(6, RoundingMode.CEILING),
				 	actualValue = calcMethods.convert_From_Gram_To_Pound(558);
		
		String message = "Expected: " + expectedValue + ". Actual: " + actualValue;
		assertEquals(message, expectedValue, actualValue);
	}
	
	//Need to change the actual and expected values.
	@Test
	public void testGram_To_Tonne()
	{
		 BigDecimal expectedValue = BigDecimal.valueOf(0.009571).setScale(6, RoundingMode.CEILING),
				 	actualValue = calcMethods.convert_From_Gram_To_Tonne(9571);
		
		String message = "Expected: " + expectedValue + ". Actual: " + actualValue;
		assertEquals(message, expectedValue, actualValue);
	}

	@Test
	public void testKilogram_To_Milligram()
	{
		BigDecimal expectedValue = BigDecimal.valueOf(950000).setScale(6, RoundingMode.CEILING),
			 	actualValue = calcMethods.convert_From_Kilogram_To_Milligram(0.95);
	
		String message = "Expected: " + expectedValue + ". Actual: " + actualValue;
		assertEquals(message, expectedValue, actualValue);
	}

	@Test
	public void testKilogram_To_Gram()
	{
		BigDecimal expectedValue = BigDecimal.valueOf(950).setScale(6, RoundingMode.CEILING),
			 	actualValue = calcMethods.convert_From_Kilogram_To_Gram(0.95);
	
		String message = "Expected: " + expectedValue + ". Actual: " + actualValue;
		assertEquals(message, expectedValue, actualValue);
	}

	@Test
	public void testKilogram_To_Pound()
	{
		BigDecimal expectedValue = BigDecimal.valueOf(2.094391).setScale(6, RoundingMode.CEILING),
			 	actualValue = calcMethods.convert_From_Kilogram_To_Pound(0.95);
	
		String message = "Expected: " + expectedValue + ". Actual: " + actualValue;
		assertEquals(message, expectedValue, actualValue);
	}

	@Test
	public void testKilogram_To_Tonne()
	{
		BigDecimal expectedValue = BigDecimal.valueOf(0.09195).setScale(6, RoundingMode.CEILING),
			 	actualValue = calcMethods.convert_From_Kilogram_To_Tonne(91.95);
	
		String message = "Expected: " + expectedValue + ". Actual: " + actualValue;
		assertEquals(message, expectedValue, actualValue);
	}

	@Test
	public void testPound_To_Milligram()
	{
		BigDecimal expectedValue = BigDecimal.valueOf(41707818).setScale(6, RoundingMode.CEILING),
			 	actualValue = calcMethods.convert_From_Pound_To_Milligram(91.95);
	
		String message = "Expected: " + expectedValue + ". Actual: " + actualValue;
		assertEquals(message, expectedValue, actualValue);
	}

	@Test
	public void testPound_To_Gram()
	{
		BigDecimal expectedValue = BigDecimal.valueOf(41707.818).setScale(6, RoundingMode.CEILING),
			 	actualValue = calcMethods.convert_From_Pound_To_Gram(91.95);
	
		String message = "Expected: " + expectedValue + ". Actual: " + actualValue;
		assertEquals(message, expectedValue, actualValue);
	}

	@Test
	public void testPound_To_Kilogram()
	{
		BigDecimal expectedValue = BigDecimal.valueOf(41.707818).setScale(6, RoundingMode.CEILING),
			 	actualValue = calcMethods.convert_From_Pound_To_Kilogram(91.95);
	
		String message = "Expected: " + expectedValue + ". Actual: " + actualValue;
		assertEquals(message, expectedValue, actualValue);
	}

	@Test
	public void testPound_To_Tonne()
	{
		BigDecimal expectedValue = BigDecimal.valueOf(0.041707818).setScale(6, RoundingMode.CEILING),
			 	actualValue = calcMethods.convert_From_Pound_To_Tonne(91.95);
	
		String message = "Expected: " + expectedValue + ". Actual: " + actualValue;
		assertEquals(message, expectedValue, actualValue);
	}

	@Test
	public void testTonne_To_Milligram()
	{
		BigDecimal expectedValue = BigDecimal.valueOf(95000000).setScale(6, RoundingMode.CEILING),
			 	actualValue = calcMethods.convert_From_Tonne_To_Milligram(0.095);
	
		String message = "Expected: " + expectedValue + ". Actual: " + actualValue;
		assertEquals(message, expectedValue, actualValue);
	}

	@Test
	public void testTonne_To_Gram()
	{
		BigDecimal expectedValue = BigDecimal.valueOf(950000).setScale(6, RoundingMode.CEILING),
			 	actualValue = calcMethods.convert_From_Tonne_To_Gram(0.95);
	
		String message = "Expected: " + expectedValue + ". Actual: " + actualValue;
		assertEquals(message, expectedValue, actualValue);
	}

	@Test
	public void testTonne_To_Kilogram()
	{
		BigDecimal expectedValue = BigDecimal.valueOf(9950).setScale(6, RoundingMode.CEILING),
			 	actualValue = calcMethods.convert_From_Tonne_To_Kilogram(9.95);
	
		String message = "Expected: " + expectedValue + ". Actual: " + actualValue;
		assertEquals(message, expectedValue, actualValue);
	}

	@Test
	public void testTonne_To_Pound()
	{
		BigDecimal expectedValue = BigDecimal.valueOf(21935.969000).setScale(6, RoundingMode.CEILING),
			 	actualValue = calcMethods.convert_From_Tonne_To_Pound(9.95);
	
		String message = "Expected: " + expectedValue + ". Actual: " + actualValue;
		assertEquals(message, expectedValue, actualValue);
	}
	
	
	/**
	 * Area unit tests
	 **/
	
	@Test
	public void testAcre_To_Hectare()
	{
		BigDecimal expectedValue = BigDecimal.valueOf(20.2343).setScale(6, RoundingMode.CEILING),
				   actualValue = calcMethods.convert_From_Acre_To_Hectare(50);
		
		String message = "Expected: " + expectedValue + ". Actual: " + actualValue;
		assertEquals(message, expectedValue, actualValue);
	}

	@Test
	public void testAcre_To_Square_KM()
	{
		BigDecimal expectedValue = BigDecimal.valueOf(0.202344).setScale(6, RoundingMode.CEILING),
				   actualValue = calcMethods.convert_From_Acre_To_Square_KM(50);
		
		String message = "Expected: " + expectedValue + ". Actual: " + actualValue;
		assertEquals(message, expectedValue, actualValue);
	}

	@Test
	public void testAcre_To_Square_Foot()
	{
		BigDecimal expectedValue = BigDecimal.valueOf(217800).setScale(6, RoundingMode.CEILING),
				   actualValue = calcMethods.convert_From_Acre_To_Square_Foot(5);
		
		String message = "Expected: " + expectedValue + ". Actual: " + actualValue;
		assertEquals(message, expectedValue, actualValue);
	}

	@Test
	public void testAcre_To_Square_Meter()
	{
		BigDecimal expectedValue = BigDecimal.valueOf(48562.32).setScale(6, RoundingMode.CEILING),
				   actualValue = calcMethods.convert_From_Acre_To_Square_Meter(12);
		
		String message = "Expected: " + expectedValue + ". Actual: " + actualValue;
		assertEquals(message, expectedValue, actualValue);
	}

	@Test
	public void testHectare_To_Acre()
	{
		BigDecimal expectedValue = BigDecimal.valueOf(29.6526).setScale(6, RoundingMode.CEILING),
				   actualValue = calcMethods.convert_From_Hectare_To_Acre(12);
		
		String message = "Expected: " + expectedValue + ". Actual: " + actualValue;
		assertEquals(message, expectedValue, actualValue);
	}

	@Test
	public void testHectare_To_Square_KM()
	{
		BigDecimal expectedValue = BigDecimal.valueOf(0.12).setScale(6, RoundingMode.CEILING),
				   actualValue = calcMethods.convert_From_Hectare_To_Square_KM(12);
		
		String message = "Expected: " + expectedValue + ". Actual: " + actualValue;
		assertEquals(message, expectedValue, actualValue);
	}

	@Test
	public void testHectare_To_Square_Foot()
	{
		BigDecimal expectedValue = BigDecimal.valueOf(161459).setScale(6, RoundingMode.CEILING),
				   actualValue = calcMethods.convert_From_Hectare_To_Square_KM(1.5);
		
		String message = "Expected: " + expectedValue + ". Actual: " + actualValue;
		assertEquals(message, expectedValue, actualValue);
	}

	@Test
	public void testHectare_To_Square_Meter()
	{
		BigDecimal expectedValue = BigDecimal.valueOf(15000).setScale(6, RoundingMode.CEILING),
				   actualValue = calcMethods.convert_From_Hectare_To_Square_Meter(1.5);
		
		String message = "Expected: " + expectedValue + ". Actual: " + actualValue;
		assertEquals(message, expectedValue, actualValue);
	}

	@Test
	public void testSquare_KM_To_Acre()
	{
		BigDecimal expectedValue = BigDecimal.valueOf(370.658).setScale(6, RoundingMode.CEILING),
				   actualValue = calcMethods.convert_From_Square_KM_To_Acre(1.5);
		
		String message = "Expected: " + expectedValue + ". Actual: " + actualValue;
		assertEquals(message, expectedValue, actualValue);
	}

	@Test
	public void testSquare_KM_To_Hectare()
	{
		BigDecimal expectedValue = BigDecimal.valueOf(150).setScale(6, RoundingMode.CEILING),
				   actualValue = calcMethods.convert_From_Square_KM_To_Hectare(1.5);
		
		String message = "Expected: " + expectedValue + ". Actual: " + actualValue;
		assertEquals(message, expectedValue, actualValue);
	}

	@Test
	public void testSquare_KM_To_Square_Meter()
	{
		BigDecimal expectedValue = BigDecimal.valueOf(545000).setScale(6, RoundingMode.CEILING),
				   actualValue = calcMethods.convert_From_Square_KM_To_Square_Meter(0.545);
		
		String message = "Expected: " + expectedValue + ". Actual: " + actualValue;
		assertEquals(message, expectedValue, actualValue);

	}

	@Test
	public void testSquare_KM_To_Square_Foot()
	{
		 BigDecimal expectedValue = BigDecimal.valueOf(10763910.4).setScale(6, RoundingMode.CEILING),
				 	actualValue = calcMethods.convert_From_Square_KM_To_Square_Foot(1);
		
		String message = "Expected: " + expectedValue + ". Actual: " + actualValue;
		assertEquals(message, expectedValue, actualValue);
	}

	
	@Test
	public void testSquare_Foot_To_Acre()
	{
		 BigDecimal expectedValue = BigDecimal.valueOf(2.2852388).setScale(6, RoundingMode.CEILING),
				 	actualValue = calcMethods.convert_From_Square_Foot_To_Acre(99545);
		
		String message = "Expected: " + expectedValue + ". Actual: " + actualValue;
		assertEquals(message, expectedValue, actualValue);
	}

	@Test
	public void testSquare_Foot_To_Hectare()
	{
		 BigDecimal expectedValue = BigDecimal.valueOf(0.92480331).setScale(6, RoundingMode.CEILING),
				 	actualValue = calcMethods.convert_From_Square_Foot_To_Hectare(99545);
		
		String message = "Expected: " + expectedValue + ". Actual: " + actualValue;
		assertEquals(message, expectedValue, actualValue);
	}

	@Test
	public void testSquare_Foot_To_Square_KM()
	{
		 BigDecimal expectedValue = BigDecimal.valueOf(9.2902617291).setScale(6, RoundingMode.CEILING),
				 	actualValue = calcMethods.convert_From_Square_Foot_To_Square_KM(99999545);
		
		String message = "Expected: " + expectedValue + ". Actual: " + actualValue;
		assertEquals(message, expectedValue, actualValue);
	}

	@Test
	public void testSquare_Foot_To_Square_Meter()
	{
		 BigDecimal expectedValue = BigDecimal.valueOf(9248.0331).setScale(6, RoundingMode.CEILING),
				 	actualValue = calcMethods.convert_From_Square_Foot_To_Square_Meter(99545);
		
		String message = "Expected: " + expectedValue + ". Actual: " + actualValue;
		assertEquals(message, expectedValue, actualValue);
	}

	@Test
	public void testSquare_Meter_To_Acre()
	{
		 BigDecimal expectedValue = BigDecimal.valueOf(24.598106).setScale(6, RoundingMode.CEILING),
				 	actualValue = calcMethods.convert_From_Square_Meter_To_Acre(99545);
		
		String message = "Expected: " + expectedValue + ". Actual: " + actualValue;
		assertEquals(message, expectedValue, actualValue);
	}

	@Test
	public void testSquare_Meter_To_Hectare()
	{
		 BigDecimal expectedValue = BigDecimal.valueOf(9.954501).setScale(6, RoundingMode.CEILING),
				 	actualValue = calcMethods.convert_From_Square_Meter_To_Hectare(99545);
		
		String message = "Expected: " + expectedValue + ". Actual: " + actualValue;
		assertEquals(message, expectedValue, actualValue);
	}

	@Test
	public void testSquare_Meter_To_Square_KM()
	{
		 BigDecimal expectedValue = BigDecimal.valueOf(0.999546).setScale(6, RoundingMode.CEILING),
				 	actualValue = calcMethods.convert_From_Square_Meter_To_Square_KM(999545);
		
		String message = "Expected: " + expectedValue + ". Actual: " + actualValue;
		assertEquals(message, expectedValue, actualValue);
	}

	@Test
	public void testSquare_Meter_To_Square_Foot()
	{
		 BigDecimal expectedValue = BigDecimal.valueOf(1071493.460768).setScale(6, RoundingMode.CEILING),
				 	actualValue = calcMethods.convert_From_Square_Meter_To_Square_Foot(99545);
		
		String message = "Expected: " + expectedValue + ". Actual: " + actualValue;
		assertEquals(message, expectedValue, actualValue);
	}
	
	/**
	 * Temperature unit tests
	 **/
	@Test
	public void testCelsius_To_Fahrenheit()
	{
		BigDecimal expectedValue = BigDecimal.valueOf(23).setScale(6, RoundingMode.CEILING),
				   actualValue = calcMethods.convert_From_Celsius_To_Fahrenheit(-5);
		
		String message = "Expected: " + expectedValue + ". Actual: " + actualValue;
		assertEquals(message, expectedValue, actualValue);
	}
	
	@Test
	public void testCelsius_To_Kelvin()
	{
		BigDecimal expectedValue = BigDecimal.valueOf(268.15).setScale(6, RoundingMode.CEILING),
				   actualValue = calcMethods.convert_From_Celsius_To_Kelvin(-5);
		
		String message = "Expected: " + expectedValue + ". Actual: " + actualValue;
		assertEquals(message, expectedValue, actualValue);
	}
	
	@Test
	public void testFahrenheit_To_Celsius()
	{
		BigDecimal expectedValue = BigDecimal.valueOf(-20.555556).setScale(6, RoundingMode.CEILING),
				   actualValue = calcMethods.convert_From_Fahrenheit_To_Celsius(-5);
		
		String message = "Expected Celsius: " + expectedValue + ". Actual Celsius: " + actualValue;
		
		assertEquals(message, expectedValue, actualValue);
	}
	
	/**
	 * Time unit tests
	 **/
	@Test
	public void testDay_To_Millisecond()
	{
		BigDecimal expectedValue = BigDecimal.valueOf(86400000).setScale(6, RoundingMode.CEILING),
				   actualValue = calcMethods.convert_From_Day_To_Milliseconds(1);
		
		String message = "Expected: " + expectedValue + ". Actual: " + actualValue;
		assertEquals(message, expectedValue, actualValue);
	}
	
	/**
	 * Time unit tests
	 **/
}