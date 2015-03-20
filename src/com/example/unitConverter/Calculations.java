/**
 * 
 **/
package com.example.unitConverter;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * @author Zinkal Panchal
 **/
public class Calculations 
{
	//public static double round(double value, int places) 
	//{
	//    if (places < 0) 
	//    {
	//    	places = 2;
	//    }

	//    long factor = (long) Math.pow(10, places);
	//    value = value * factor;
	//    long tmp = Math.round(value);
	//    return (double) tmp / factor;
	//}
	
	/**
	 * Length conversion methods.
	 **/
	//This method converts from Inch to Foot
	protected BigDecimal convert_From_Inch_To_Foot(double inputValue) 
    {  
        // convert the Inch value to Foot  
        return BigDecimal.valueOf(inputValue * 0.0833333).setScale(6, RoundingMode.CEILING);  
    }  

	//This method converts from Inch to Meter
	protected BigDecimal convert_From_Inch_To_Meter(double inputValue) 
    {  
        // convert the Inch value to Foot  
        return BigDecimal.valueOf(inputValue * 0.0254).setScale(6, RoundingMode.CEILING);  
    }

	//This method converts from Inch to Meter, and then from meter to kilometers
	protected BigDecimal convert_From_Inch_To_Kilometre(double inputValue) 
    {  
        // convert the Inch value to Foot
		return BigDecimal.valueOf(convert_From_Inch_To_Meter(inputValue).doubleValue() * 0.001).setScale(6, RoundingMode.CEILING);  
    }
	
	//This method converts from Inch to Meter and then meter to miles
	protected BigDecimal convert_From_Inch_To_Mile(double inputValue) 
    {  
        // convert the Inch value to Foot  
        return BigDecimal.valueOf((convert_From_Inch_To_Meter(inputValue).doubleValue() * 0.000621371)).setScale(6, RoundingMode.CEILING);  
    }
	
	/**
	 * 
	 **/
	//This method converts from Foot to Inch
	protected BigDecimal convert_From_Foot_To_Inch(double inputValue) 
    {  
        // convert the Inch value to Foot  
        return BigDecimal.valueOf(inputValue * 12).setScale(6, RoundingMode.CEILING);  
    }  

	//This method converts from Foot to Meter
	protected BigDecimal convert_From_Foot_To_Meter(double inputValue) 
    {  
        // convert the Inch value to Foot  
        return BigDecimal.valueOf(inputValue * 0.3048).setScale(6, RoundingMode.CEILING);  
    }

	//This method converts from Foot to Kilometer
	protected BigDecimal convert_From_Foot_To_Kilometre(double inputValue) 
    {  
        // convert the Inch value to Foot  
        return BigDecimal.valueOf(inputValue * 0.0003048).setScale(6, RoundingMode.CEILING);  
    }
	
	//This method converts from Foot to miles
	protected BigDecimal convert_From_Foot_To_Mile(double inputValue) 
    {  
        // convert the Inch value to Foot  
		return BigDecimal.valueOf(inputValue * 0.000189394).setScale(6, RoundingMode.CEILING);  
    }
	
	/**
	 * 
	 **/
	//This method converts from Foot to Inch
	protected BigDecimal convert_From_Meter_To_Inch(double inputValue) 
    {  
        // convert the Inch value to Foot  
        return BigDecimal.valueOf(inputValue * 39.3701).setScale(6, RoundingMode.CEILING);  
    }  

	//This method converts from Foot to Meter
	protected BigDecimal convert_From_Meter_To_Foot(double inputValue) 
    {  
        // convert the Inch value to Foot  
        return BigDecimal.valueOf(inputValue * 3.28084).setScale(6, RoundingMode.CEILING);  
    }

	//This method converts from Foot to Kilometer
	protected BigDecimal convert_From_Meter_To_Kilometre(double inputValue) 
    {  
        // convert the Inch value to Foot  
        return BigDecimal.valueOf(inputValue * 0.001).setScale(6, RoundingMode.CEILING);  
    }
	
	//This method converts from Foot to miles
	protected BigDecimal convert_From_Meter_To_Mile(double inputValue) 
    {  
        // convert the Inch value to Foot  
		return BigDecimal.valueOf(inputValue * 0.000621371).setScale(6, RoundingMode.CEILING);  
    }
	
	/**
	 * Convert from Kilometer to other
	 **/
    protected BigDecimal convert_From_Kilometre_To_Inch(double inputValue)
    {
    	//Convert from Kilometer to Inch
        return BigDecimal.valueOf(inputValue * 39370.1).setScale(6, RoundingMode.CEILING);
    }
    
    protected BigDecimal convert_From_Kilometre_To_Foot(double inputValue)
    {
    	//Convert from Kilometer to Foot
        return BigDecimal.valueOf(inputValue * 3280.84).setScale(6, RoundingMode.CEILING);
    }
    
    protected BigDecimal convert_From_Kilometre_To_Metre(double inputValue)
    {
    	//Convert from Kilometer to Meter
        return BigDecimal.valueOf(inputValue * 1000).setScale(6, RoundingMode.CEILING);
    }
    
	//This method converts the kilometers into Miles.
    protected BigDecimal convert_From_Kilometre_To_Mile(double inputValue) 
    {  
        //Convert from Kilometer to Mile
        return BigDecimal.valueOf(inputValue * 0.621371).setScale(6, RoundingMode.CEILING);  
    }  
 
    /**
     * Methods to convert from Miles to other units.
     **/
    protected BigDecimal convert_From_Miles_To_Inch(double inputValue)
    {
    	//Convert from Mile to Inch
    	return BigDecimal.valueOf(inputValue * 63360).setScale(6, RoundingMode.CEILING);
    }
    protected BigDecimal convert_From_Miles_To_Foot(double inputValue)
    {
    	//Convert from Mile to Foot
    	return BigDecimal.valueOf(inputValue * 5280).setScale(6, RoundingMode.CEILING);
    }
    protected BigDecimal convert_From_Miles_To_Metre(double inputValue)
    {
    	//Convert from Mile to Metre
    	return BigDecimal.valueOf(inputValue * 1609.34).setScale(6, RoundingMode.CEILING);
    }
    protected BigDecimal convert_From_Miles_To_Kilometre(double inputValue)
    {
    	//Convert from Mile to Kilometer
    	return BigDecimal.valueOf(inputValue * 1.60934).setScale(6, RoundingMode.CEILING);
    }
    
    /**
     * Weight conversion.
     **/
    protected BigDecimal convert_From_Milligram_To_Gram(double inputValue)
    {
    	//Convert from Milligram to Gram
    	return BigDecimal.valueOf(inputValue * 0.001).setScale(6, RoundingMode.CEILING);
    }
    
    protected BigDecimal convert_From_Milligram_To_Kilogram(double inputValue)
    {
    	//Convert from Milligram to Kilogram
    	return BigDecimal.valueOf((convert_From_Milligram_To_Gram(inputValue).doubleValue() * 0.001)).setScale(6, RoundingMode.CEILING);
    }
    
    protected BigDecimal convert_From_Milligram_To_Pound(double inputValue)
    {
    	//Convert from Milligram to Pound
    	return BigDecimal.valueOf((convert_From_Milligram_To_Gram(inputValue).doubleValue() * 0.00220462)).setScale(6, RoundingMode.CEILING);
    }
    
    protected BigDecimal convert_From_Milligram_To_Tonne(double inputValue)
    {
    	//Convert from Milligram to Tonne
    	return BigDecimal.valueOf((convert_From_Milligram_To_Kilogram(inputValue).doubleValue() * 0.001)).setScale(6, RoundingMode.CEILING);
    }
    
    protected BigDecimal convert_From_Gram_To_Milligram(double inputValue)
    {
    	//Convert Gram to Milligram
    	return BigDecimal.valueOf(inputValue * 1000).setScale(6, RoundingMode.CEILING);
    }
    
    protected BigDecimal convert_From_Gram_To_Kilogram(double inputValue)
    {
    	//Convert Gram to Kilogram
    	return BigDecimal.valueOf(inputValue * 0.001).setScale(6, RoundingMode.CEILING);
    }
    
    protected BigDecimal convert_From_Gram_To_Pound(double inputValue)
    {
    	// convert miles to km/h
    	return BigDecimal.valueOf(inputValue * 0.00220462).setScale(6, RoundingMode.CEILING);
    }
    
    protected BigDecimal convert_From_Gram_To_Tonne(double inputValue)
    {
    	// convert miles to km/h
    	return BigDecimal.valueOf((convert_From_Gram_To_Kilogram(inputValue).doubleValue() * 0.001)).setScale(6, RoundingMode.CEILING);
    }
    
    protected BigDecimal convert_From_Kilogram_To_Milligram(double inputValue)
    {
    	//Convert from Kilogram to Milligram
    	return BigDecimal.valueOf(inputValue * 1000000).setScale(6, RoundingMode.CEILING);
	}
    
    protected BigDecimal convert_From_Kilogram_To_Gram(double inputValue)
    {
    	//Convert from Kilogram to Gram
    	return BigDecimal.valueOf(inputValue * 1000).setScale(6, RoundingMode.CEILING);
    }
    
    protected BigDecimal convert_From_Kilogram_To_Pound(double inputValue)
    {
    	//Convert from Kilogram to Pound
    	return BigDecimal.valueOf(inputValue * 2.20462).setScale(6, RoundingMode.CEILING);
    }
    
    protected BigDecimal convert_From_Kilogram_To_Tonne(double inputValue)
    {
    	//Convert from Kilogram to Tonne
    	return BigDecimal.valueOf(inputValue * 0.001).setScale(6, RoundingMode.CEILING);
    }
    
    protected BigDecimal convert_From_Pound_To_Milligram(double inputValue)
    {
    	//Convert Pound to Milligram
    	return BigDecimal.valueOf(inputValue * 453592).setScale(6, RoundingMode.CEILING);
    }
    
    protected BigDecimal convert_From_Pound_To_Gram(double inputValue)
    {
    	//Convert Pound to Gram
    	return BigDecimal.valueOf(inputValue * 453.592).setScale(6, RoundingMode.CEILING);
    }
    
    protected BigDecimal convert_From_Pound_To_Kilogram(double inputValue)
    {
    	//Convert Pound to Kilogram
    	return BigDecimal.valueOf(inputValue * 0.453592).setScale(6, RoundingMode.CEILING);
    }
    
    protected BigDecimal convert_From_Pound_To_Tonne(double inputValue)
    {
    	//Convert Pound to Tonne
    	return BigDecimal.valueOf(inputValue * 0.000453592).setScale(6, RoundingMode.CEILING);
    }
    
    protected BigDecimal convert_From_Tonne_To_Milligram(double inputValue)
    {
    	// convert miles to km/h
    	return BigDecimal.valueOf(inputValue * 1000000000).setScale(6, RoundingMode.CEILING);
    }
    
    protected BigDecimal convert_From_Tonne_To_Gram(double inputValue)
    {
    	// convert miles to km/h
    	return BigDecimal.valueOf(inputValue * 1000000).setScale(6, RoundingMode.CEILING);
    }
    
    protected BigDecimal convert_From_Tonne_To_Kilogram(double inputValue)
    {
    	// convert miles to km/h
    	return BigDecimal.valueOf(inputValue * 1000).setScale(6, RoundingMode.CEILING);
    }
    
    protected BigDecimal convert_From_Tonne_To_Pound(double inputValue)
    {
    	// convert miles to km/h
    	return BigDecimal.valueOf(inputValue * 2204.62).setScale(6, RoundingMode.CEILING);
    }
    
    /**
     * Temperature conversion 
     **/
    protected BigDecimal convert_From_Celsius_To_Fahrenheit(double inputValue)
    {
    	//Convert Celsius to Fahrenheit
    	//return round(((9 * inputValue/5) + 32).setScale(6, RoundingMode.CEILING);
    	return BigDecimal.valueOf((1.8 * inputValue) + 32).setScale(6, RoundingMode.CEILING);
    }
    
    protected BigDecimal convert_From_Celsius_To_Rankine(double inputValue)
    {
    	//Convert Celsius to Rankine
    	return BigDecimal.valueOf(((inputValue * 1.8) + 32 + 459.67)).setScale(6, RoundingMode.CEILING);
    }
    
    protected BigDecimal convert_From_Celsius_To_Reaumur(double inputValue)
    {
    	//Convert from Celsius to Reaumur
    	return BigDecimal.valueOf(inputValue * 0.8).setScale(6, RoundingMode.CEILING);
    }
    
    protected BigDecimal convert_From_Celsius_To_Kelvin(double inputValue)
    {
    	//Convert from Celsius to Kelvin
    	return BigDecimal.valueOf(inputValue + 273.15).setScale(6, RoundingMode.CEILING);
    }
    
    protected BigDecimal convert_From_Fahrenheit_To_Celsius(double inputValue)
    {
    	//Convert Fahrenheit to Celsius
    	return BigDecimal.valueOf(((inputValue - 32) / 1.8)).setScale(6, RoundingMode.CEILING);
    }
    
    protected BigDecimal convert_From_Fahrenheit_To_Rankine(double inputValue)
    {
    	//Convert Fahrenheit to Rankine
    	return BigDecimal.valueOf(inputValue + 459.67).setScale(6, RoundingMode.CEILING);
    }
    
    protected BigDecimal convert_From_Fahrenheit_To_Reaumur(double inputValue)
    {
    	//Convert Fahrenheit to Reaumur
    	return BigDecimal.valueOf((inputValue - 32) / 2.25).setScale(6, RoundingMode.CEILING);
    }
    
    protected BigDecimal convert_From_Fahrenheit_To_Kelvin(double inputValue)
    {
    	//Convert Fahrenheit to Kelvin
    	return BigDecimal.valueOf((inputValue + 459.67) / 1.8).setScale(6, RoundingMode.CEILING);
    }
    
    protected BigDecimal convert_From_Rankine_To_Celsius(double inputValue)
    {
    	//Convert from Rankine to Celsius
    	return BigDecimal.valueOf(((inputValue - 32) - 459.67) / 1.8).setScale(6, RoundingMode.CEILING);
    }
    
    protected BigDecimal convert_From_Rankine_To_Fahrenheit(double inputValue)
    {
    	//Convert from Rankine to Fahrenheit
    	return BigDecimal.valueOf(inputValue - 459.67).setScale(6, RoundingMode.CEILING);
    }
    
    protected BigDecimal convert_From_Rankine_To_Reaumur(double inputValue)
    {
    	//Convert from Rankine to Reaumur
    	return BigDecimal.valueOf(((inputValue - 32) - 459.67) / 2.25).setScale(6, RoundingMode.CEILING);
    }
    
    protected BigDecimal convert_From_Rankine_To_Kelvin(double inputValue)
    {
    	//Convert from Rankine to Kelvin
    	return BigDecimal.valueOf(inputValue / 1.8).setScale(6, RoundingMode.CEILING);
    }
    
    protected BigDecimal convert_From_Reaumur_To_Celsius(double inputValue)
    {
    	//Convert from Reaumur to Celsius
    	return BigDecimal.valueOf(inputValue * 1.25).setScale(6, RoundingMode.CEILING);
    }
    
    protected BigDecimal convert_From_Reaumur_To_Fahrenheit(double inputValue)
    {
    	//Convert from Reaumur to Fahrenheit
    	return BigDecimal.valueOf((inputValue * 2.25) + 32).setScale(6, RoundingMode.CEILING);
    }
    
    protected BigDecimal convert_From_Reaumur_To_Rankine(double inputValue)
    {
    	//Convert Reaumur to Rankine
    	return BigDecimal.valueOf(((inputValue * 2.25) + 32) + 459.67).setScale(6, RoundingMode.CEILING);
    }
    
    protected BigDecimal convert_From_Reaumur_To_Kelvin(double inputValue)
    {
    	//Convert Reaumur to Kelvin
    	return BigDecimal.valueOf((inputValue * 1.25) + 273.15).setScale(6, RoundingMode.CEILING);
    }
    
    protected BigDecimal convert_From_Kelvin_To_Celsius(double inputValue)
    {
    	//Convert from Kelvin to Celsius
    	return BigDecimal.valueOf(inputValue - 273.15).setScale(6, RoundingMode.CEILING);
    }
    
    protected BigDecimal convert_From_Kelvin_To_Fahrenheit(double inputValue)
    {
    	//Convert Kelvin to Fahrenheit
    	return BigDecimal.valueOf((inputValue * 1.8) - 459.67).setScale(6, RoundingMode.CEILING);
    }
    
    protected BigDecimal convert_From_Kelvin_To_Rankine(double inputValue)
    {
    	//Convert Kelvin to Rankine
    	return BigDecimal.valueOf(inputValue * 1.8).setScale(6, RoundingMode.CEILING);
    }
    
    protected BigDecimal convert_From_Kelvin_To_Reaumur(double inputValue)
    {
    	//Convert Kelvin to Reaumur
    	return BigDecimal.valueOf((inputValue - 273.15) * 0.8).setScale(6, RoundingMode.CEILING);
    }
    
    /**
     * Area conversion 
     **/
    protected BigDecimal convert_From_Acre_To_Hectare(double inputValue)
    {
    	//Convert from Acre to Hectare
        return BigDecimal.valueOf(inputValue * 0.404686).setScale(6, RoundingMode.CEILING);
    }

    protected BigDecimal convert_From_Acre_To_Square_KM(double inputValue)
    {
    	//Convert from Acre to Square KM
        return BigDecimal.valueOf(inputValue * 0.00404686).setScale(6, RoundingMode.CEILING);
    }

    protected BigDecimal convert_From_Acre_To_Square_Foot(double inputValue)
    {
    	//Convert from Acre to Square Foot
        return BigDecimal.valueOf(inputValue * 43560).setScale(6, RoundingMode.CEILING);
    }

    protected BigDecimal convert_From_Acre_To_Square_Meter(double inputValue)
    {
    	//Convert from Acre to Square Meter
        return BigDecimal.valueOf(inputValue * 4046.86).setScale(6, RoundingMode.CEILING);
    }

    protected BigDecimal convert_From_Hectare_To_Acre(double inputValue)
    {
    	//Convert Hectare to Acre
        return BigDecimal.valueOf(inputValue * 2.47105).setScale(6, RoundingMode.CEILING);
    }

    protected BigDecimal convert_From_Hectare_To_Square_KM(double inputValue)
    {
    	//Convert from Hectare to Square KM
        return BigDecimal.valueOf(inputValue * 0.01).setScale(6, RoundingMode.CEILING);
    }

    protected BigDecimal convert_From_Hectare_To_Square_Foot(double inputValue)
    {
    	//Convert from Hectare to Square Meter
        return BigDecimal.valueOf(inputValue * 107639).setScale(6, RoundingMode.CEILING);
    }

    protected BigDecimal convert_From_Hectare_To_Square_Meter(double inputValue)
    {
    	//Convert from Hectare to Square Meter
        return BigDecimal.valueOf(inputValue * 10000).setScale(6, RoundingMode.CEILING);
    }


    protected BigDecimal convert_From_Square_KM_To_Acre(double inputValue)
    {
    	//Convert from Square KM to Acre
        return BigDecimal.valueOf(inputValue * 247.105381).setScale(6, RoundingMode.CEILING);
    }

    protected BigDecimal convert_From_Square_KM_To_Hectare(double inputValue)
    {
    	//Convert from Square KM to Hectare
        return BigDecimal.valueOf(inputValue * 100).setScale(6, RoundingMode.CEILING);
    }

    protected BigDecimal convert_From_Square_KM_To_Square_Foot(double inputValue)
    {
    	//Convert from Square KM to Square Foot
        //return BigDecimal.valueOf((inputValue * 10763910.4).setScale(6, RoundingMode.CEILING);
        return BigDecimal.valueOf(inputValue * 10763910.4).setScale(6, RoundingMode.CEILING);
    }
    
    protected BigDecimal convert_1_From_Square_KM_To_Square_Foot(float inputValue)
    {
    	//Convert from Square KM to Square Foot
        //return BigDecimal.valueOf((inputValue * 10763910.4).setScale(6, RoundingMode.CEILING);
        return BigDecimal.valueOf(inputValue * 10763910.4).setScale(6, RoundingMode.CEILING);
    }

    protected BigDecimal convert_From_Square_KM_To_Square_Meter(double inputValue)
    {
    	//Convert Square KM to Square Meter
        return BigDecimal.valueOf(inputValue * 1000000).setScale(6, RoundingMode.CEILING);
    }


    protected BigDecimal convert_From_Square_Foot_To_Acre(double inputValue)
    {
    	//Convert Square Foot to Acre
        return BigDecimal.valueOf(convert_From_Square_Foot_To_Square_Meter(inputValue).doubleValue() * 0.000247105381).setScale(6, RoundingMode.CEILING);
    }

    protected BigDecimal convert_From_Square_Foot_To_Hectare(double inputValue)
    {
    	//Convert from Square Foot to Hectare
        return BigDecimal.valueOf(convert_From_Square_Foot_To_Acre(inputValue).doubleValue() * 0.404685642).setScale(6, RoundingMode.CEILING);
    }

    protected BigDecimal convert_From_Square_Foot_To_Square_KM(double inputValue)
    {
    	//Convert from Square Foot to Square KM
        return BigDecimal.valueOf(convert_From_Square_Foot_To_Acre(inputValue).doubleValue() * 0.00404685642).setScale(6, RoundingMode.CEILING);
    }

    protected BigDecimal convert_From_Square_Foot_To_Square_Meter(double inputValue)
    {
    	//Convert Square Foot to Square Meter
        return BigDecimal.valueOf(inputValue * 0.09290304).setScale(6, RoundingMode.CEILING);
    }
    
    protected BigDecimal convert_From_Square_Meter_To_Acre(double inputValue)
    {
    // convert miles to km/h
        	return BigDecimal.valueOf(inputValue * 0.000247105381).setScale(6, RoundingMode.CEILING);
    }

    protected BigDecimal convert_From_Square_Meter_To_Hectare(double inputValue)
    {
    // convert miles to km/h
        	return BigDecimal.valueOf(inputValue * 0.0001).setScale(6, RoundingMode.CEILING);
    }

    protected BigDecimal convert_From_Square_Meter_To_Square_KM(double inputValue)
    {
    	//Convert Square Meter to Square Foot
        return BigDecimal.valueOf(convert_From_Square_Meter_To_Hectare(inputValue).doubleValue() * 0.01).setScale(6, RoundingMode.CEILING);
    }

    protected BigDecimal convert_From_Square_Meter_To_Square_Foot(double inputValue)
    {
    	//Convert Square Meter to Square Foot
        return BigDecimal.valueOf(inputValue * 10.7639104).setScale(6, RoundingMode.CEILING);
    }

    /*
     * Time conversion 
     */
    protected BigDecimal convert_From_Miliseconds_To_Seconds(double inputValue)
    {
    	//Convert Milliseconds to Seconds
        return BigDecimal.valueOf(inputValue * 0.001).setScale(6, RoundingMode.CEILING);
    }

    protected BigDecimal convert_From_Miliseconds_To_Minutes(double inputValue)
    {
    	//Convert Milliseconds to Minutes
        return BigDecimal.valueOf(convert_From_Miliseconds_To_Seconds(inputValue).doubleValue() * 0.0166667).setScale(6, RoundingMode.CEILING);
    }

    protected BigDecimal convert_From_Miliseconds_To_Hour(double inputValue)
    {
    	//Convert Milliseconds to Hours
        return BigDecimal.valueOf(convert_From_Miliseconds_To_Minutes(inputValue).doubleValue() * 0.0166667).setScale(6, RoundingMode.CEILING);
    }

    protected BigDecimal convert_From_Miliseconds_To_Day(double inputValue)
    {
    	//Convert Milliseconds to Day
        return BigDecimal.valueOf(convert_From_Miliseconds_To_Hour(inputValue).doubleValue() * 0.0416667).setScale(6, RoundingMode.CEILING);
    }

    protected BigDecimal convert_From_Seconds_To_Milliseconds(double inputValue)
    {
    	//Convert Seconds to Milliseconds
        return BigDecimal.valueOf(inputValue * 1000).setScale(6, RoundingMode.CEILING);
    }

    protected BigDecimal convert_From_Seconds_To_Minutes(double inputValue)
    {
    	//Convert Seconds to Minutes
        return BigDecimal.valueOf(inputValue * 0.0166667).setScale(6, RoundingMode.CEILING);
    }

    protected BigDecimal convert_From_Seconds_To_Hour(double inputValue)
    {
    	//Convert Seconds to Hours
        return BigDecimal.valueOf(inputValue * 0.000277778).setScale(6, RoundingMode.CEILING);
    }

    protected BigDecimal convert_From_Seconds_To_Day(double inputValue)
    {
    	//Convert Seconds to Days
        return BigDecimal.valueOf(convert_From_Seconds_To_Hour(inputValue).doubleValue() * 0.0416667).setScale(6, RoundingMode.CEILING);
    }


    protected BigDecimal convert_From_Minute_To_Milliseconds(double inputValue)
    {
    	//Convert Minute to Milliseconds
        return BigDecimal.valueOf(inputValue * 60000).setScale(6, RoundingMode.CEILING);
    }

    protected BigDecimal convert_From_Minute_To_Seconds(double inputValue)
    {
    	//Convert Minute to Seconds
        return BigDecimal.valueOf(inputValue * 60).setScale(6, RoundingMode.CEILING);
    }

    protected BigDecimal convert_From_Minute_To_Hour(double inputValue)
    {
    	//Convert Minute to Hour
        return BigDecimal.valueOf(inputValue * 0.0166667).setScale(6, RoundingMode.CEILING);
    }

    protected BigDecimal convert_From_Minute_To_Day(double inputValue)
    {
    	//Convert Minute to Days
        return BigDecimal.valueOf(inputValue * 0.000694444).setScale(6, RoundingMode.CEILING);
    }


    protected BigDecimal convert_From_Hour_To_Milliseconds(double inputValue)
    {
    	//Convert Hours to Milliseconds
        return BigDecimal.valueOf(inputValue * 3600000).setScale(6, RoundingMode.CEILING);
    }

    protected BigDecimal convert_From_Hour_To_Seconds(double inputValue)
    {
    	//Convert Hours to Seconds
        return BigDecimal.valueOf(inputValue * 3600).setScale(6, RoundingMode.CEILING);
    }

    protected BigDecimal convert_From_Hour_To_Minute(double inputValue)
    {
    	//Convert Hours to Minutes
        return BigDecimal.valueOf(inputValue * 60).setScale(6, RoundingMode.CEILING);
    }

    protected BigDecimal convert_From_Hour_To_Day(double inputValue)
    {
    	//Convert Hours to Days
        return BigDecimal.valueOf(inputValue * 0.0416667).setScale(6, RoundingMode.UP).setScale(6, RoundingMode.CEILING);
    }


    protected BigDecimal convert_From_Day_To_Milliseconds(double inputValue)
    {
    	//Convert Days to Milliseconds
        return BigDecimal.valueOf(inputValue * 86400000).setScale(6, RoundingMode.CEILING);
    }

    protected BigDecimal convert_From_Day_To_Seconds(double inputValue)
    {
    	//Convert Days to Minutes
        return BigDecimal.valueOf(inputValue * 86400).setScale(6, RoundingMode.CEILING);
    }

    protected BigDecimal convert_From_Day_To_Minute(double inputValue)
    {
    	//Convert Days to Minutes
        return BigDecimal.valueOf(inputValue * 1440).setScale(6, RoundingMode.CEILING);
    }

    protected BigDecimal convert_From_Day_To_Hour(double inputValue)
    {
    	//Convert Days to Hours
        return BigDecimal.valueOf(inputValue * 24).setScale(6, RoundingMode.CEILING);
    }

    /*
     * DigitalStorage conversion 
     */
    protected BigDecimal convert_From_Byte_To_Kilobyte(double inputValue)
    {
    	//Convert Bytes to KB
        return BigDecimal.valueOf(inputValue * 0.000976562).setScale(6, RoundingMode.CEILING);
    }

    protected BigDecimal convert_From_Byte_To_Megabyte(double inputValue)
    {
    	//Convert Bytes to MB
        return BigDecimal.valueOf(convert_From_Byte_To_Kilobyte(inputValue).doubleValue() * 0.000976562).setScale(6, RoundingMode.CEILING);
    }

    protected BigDecimal convert_From_Byte_To_Gigabyte(double inputValue)
    {
    	//Convert Bytes to GB
        return BigDecimal.valueOf(convert_From_Byte_To_Megabyte(inputValue).doubleValue() * 0.000976562).setScale(6, RoundingMode.CEILING);
    }

    protected BigDecimal convert_From_Byte_To_Terabyte(double inputValue)
    {
    	//Convert Bytes to TB
        return BigDecimal.valueOf(convert_From_Byte_To_Gigabyte(inputValue).doubleValue() * 0.000976562).setScale(6, RoundingMode.CEILING);
    }


    protected BigDecimal convert_From_Kilobyte_To_Byte(double inputValue)
    {
    	//Convert KB to Bytes
        return BigDecimal.valueOf(inputValue * 1024).setScale(6, RoundingMode.CEILING);
    }

    protected BigDecimal convert_From_Kilobyte_To_Megabyte(double inputValue)
    {
    	//Convert KB to MB
        return BigDecimal.valueOf(inputValue * 0.000976562).setScale(6, RoundingMode.CEILING);
    }

    protected BigDecimal convert_From_Kilobyte_To_Gigabyte(double inputValue)
    {
    	//Convert KB to GB
        return BigDecimal.valueOf(convert_From_Kilobyte_To_Megabyte(inputValue).doubleValue() * 0.000976562).setScale(6, RoundingMode.CEILING);
    }

    protected BigDecimal convert_From_Kilobyte_To_Terabyte(double inputValue)
    {
    	//Convert KB to TB
        return BigDecimal.valueOf(convert_From_Kilobyte_To_Gigabyte(inputValue).doubleValue() * 0.000976562).setScale(6, RoundingMode.CEILING);
    }
    
    protected BigDecimal convert_From_Megabyte_To_Byte(double inputValue)
    {
    	//Convert MB to Bytes
        return BigDecimal.valueOf(inputValue * 1048576).setScale(6, RoundingMode.CEILING);
    }

    protected BigDecimal convert_From_Megabyte_To_Kilobyte(double inputValue)
    {
    	//Convert MB to KB
        return BigDecimal.valueOf(inputValue * 1024).setScale(6, RoundingMode.CEILING);
    }

    protected BigDecimal convert_From_Megabyte_To_Gigabyte(double inputValue)
    {
    	//Convert MB to GB
        return BigDecimal.valueOf(inputValue * 0.000976562).setScale(6, RoundingMode.CEILING);
    }

    protected BigDecimal convert_From_Megabyte_To_Terabyte(double inputValue)
    {
    	//Convert MB to TB
        return BigDecimal.valueOf(convert_From_Megabyte_To_Gigabyte(inputValue).doubleValue() * 0.000976562).setScale(6, RoundingMode.CEILING);
    }

    protected BigDecimal convert_From_Gigabyte_To_Byte(double inputValue)
    {
    	//Convert from GB to Bytes
        return BigDecimal.valueOf(inputValue * 1073741824).setScale(6, RoundingMode.CEILING);
    }

    protected BigDecimal convert_From_Gigabyte_To_Kilobyte(double inputValue)
    {
    	//Convert GB to KB
        return BigDecimal.valueOf(inputValue * 1048576).setScale(6, RoundingMode.CEILING);
    }
    
    protected BigDecimal convert_From_Gigabyte_To_Megabyte(double inputValue)
    {
    	//Convert from GB to MB
        return BigDecimal.valueOf(inputValue * 1024).setScale(6, RoundingMode.CEILING);
    }

    protected BigDecimal convert_From_Gigabyte_To_Terabyte(double inputValue)
    {
    	//Convert from GB to TB
    	return BigDecimal.valueOf(inputValue * 0.000976562).setScale(6, RoundingMode.CEILING);
    }

    protected BigDecimal convert_From_Terabyte_To_Byte(double inputValue)
    {
    	//Convert From TB to Byte
        return BigDecimal.valueOf(convert_From_Terabyte_To_Megabyte(inputValue).doubleValue() * 1048576).setScale(6, RoundingMode.CEILING);
    }

    protected BigDecimal convert_From_Terabyte_To_Kilobyte(double inputValue)
    {
    	//Convert From TB to KB
        return BigDecimal.valueOf(inputValue * 1073741824).setScale(6, RoundingMode.CEILING);
    }

    protected BigDecimal convert_From_Terabyte_To_Megabyte(double inputValue)
    {
    	//Convert From TB to MB
        return BigDecimal.valueOf(inputValue * 1048576).setScale(6, RoundingMode.CEILING);
    }

    protected BigDecimal convert_From_Terabyte_To_Gigabyte(double inputValue)
    {
    	//Convert From TB to GB
        return BigDecimal.valueOf(inputValue * 1024).setScale(6, RoundingMode.CEILING);
    }
}