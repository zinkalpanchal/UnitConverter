package com.example.unitConverter;

import android.app.Activity;
import android.app.Fragment;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

/**
 * 
 **/
public class MainActivity extends Activity implements OnItemSelectedListener
{
	/**
	 * 
	 **/
	Calculations calcSource = new Calculations();
	
	EditText unitTextBox1;
	EditText unitTextBox2;
	EditText unitTextBox3;
	EditText unitTextBox4;
	EditText unitTextBox5;
	
	Spinner metricselector;
	
	TextView unit1TextView;
	TextView unit2TextView;
	TextView unit3TextView;
	TextView unit4TextView;
	TextView unit5TextView;
	
	/*
	 * 
	 */
    @Override
    protected void onCreate(Bundle savedInstanceState) 
    {
    	super.onCreate(savedInstanceState);  
        setContentView(R.layout.activity_main);
        // findViewById = Finds a view that was identified by the id attribute  
        // from the XML that was processed in onCreate(Bundle).  
        // (EditText) = typecast  
        
        try
        {
        	//Resources spinnerOptions = getResources();
        	//String[] options = spinnerOptions.getStringArray(R.array.metric_type);
        	
        	unitTextBox1 = (EditText) findViewById(R.id.unitTextBox1);
        	unitTextBox2 = (EditText) findViewById(R.id.unitTextBox2);
        	unitTextBox3 = (EditText) findViewById(R.id.unitTextBox3);
        	unitTextBox4 = (EditText) findViewById(R.id.unitTextBox4);
        	unitTextBox5 = (EditText) findViewById(R.id.unitTextBox5);
        }
        catch(Exception es)
        {
        	return;
        }
        
        /*
    	 * 
    	 */
     	Spinner metricselector = (Spinner) findViewById(R.id.mertricselector);
     	
     	//Create an ArrayAdapter using the string array and a default spinner layout
		ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.metric_type, android.R.layout.simple_spinner_item);
		
		//Specify the layout to use when the list of choices appears
		adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

		//Apply the adapter to the spinner
		metricselector.setAdapter(adapter);
		metricselector.setOnItemSelectedListener(this);
        
		/*
		 * 
		 */
        unitTextBox1.addTextChangedListener(new TextWatcher() 
        {
     	   public void afterTextChanged(Editable s) 
     	   {
     		  //milesText.setText("5555");
     	   }

     	   public void beforeTextChanged(CharSequence s, int start, int count, int after) 
     	   {
     		   
     	   }

     	   public void onTextChanged(CharSequence s, int start, int before, int count) 
     	   {
     		  if(unitTextBox1.isFocused())
    		   {
     			  if(unitTextBox1.getText().length() <= 0)
     			  {
     				  //if(unit1TextView.getText().equals(R.string.Area_Acre))
     				  if(unit1TextView.getText().equals("Acre"))
     				  {
     					  unitTextBox2.setText(String.valueOf(calcSource.convert_From_Acre_To_Hectare(0)));
 	 			  		  unitTextBox3.setText(String.valueOf(calcSource.convert_From_Acre_To_Square_KM(0)));
 	 			  		  unitTextBox4.setText(String.valueOf(calcSource.convert_From_Acre_To_Square_Foot(0)));
 	 			  		  unitTextBox5.setText(String.valueOf(calcSource.convert_From_Acre_To_Square_Meter(0)));
     				  }
     				  
     				  else if(unit1TextView.getText().equals("Bit"))
     				  {
     					  unitTextBox2.setText(String.valueOf(calcSource.convert_From_Byte_To_Kilobyte(0)));
 	 			  		  unitTextBox3.setText(String.valueOf(calcSource.convert_From_Byte_To_Megabyte(0)));
 	 			  		  unitTextBox4.setText(String.valueOf(calcSource.convert_From_Byte_To_Gigabyte(0)));
 	 			  		  unitTextBox5.setText(String.valueOf(calcSource.convert_From_Byte_To_Terabyte(0)));
     				  } 
     				  
     				  else if(unit1TextView.getText().equals("Inch"))
    				  {
    					  unitTextBox2.setText(String.valueOf(calcSource.convert_From_Inch_To_Foot(0)));
	 			  		  unitTextBox3.setText(String.valueOf(calcSource.convert_From_Inch_To_Meter(0)));
	 			  		  unitTextBox4.setText(String.valueOf(calcSource.convert_From_Inch_To_Kilometre(0)));
	 			  		  unitTextBox5.setText(String.valueOf(calcSource.convert_From_Inch_To_Mile(0)));
    				  }
     				  
     				 else if(unit1TextView.getText().equals("Celsius"))
     				 {
     					  unitTextBox2.setText(String.valueOf(calcSource.convert_From_Celsius_To_Fahrenheit(0)));
	 			  		  unitTextBox3.setText(String.valueOf(calcSource.convert_From_Celsius_To_Rankine(0)));
	 			  		  unitTextBox4.setText(String.valueOf(calcSource.convert_From_Celsius_To_Reaumur(0)));
	 			  		  unitTextBox5.setText(String.valueOf(calcSource.convert_From_Celsius_To_Kelvin(0)));
			  		 }
     				 
     				 else if(unit1TextView.getText().equals("Millisecond"))
     				 {
     				  	 unitTextBox2.setText(String.valueOf(calcSource.convert_From_Miliseconds_To_Seconds(0)));
	 			  		 unitTextBox3.setText(String.valueOf(calcSource.convert_From_Miliseconds_To_Minutes(0)));
	 			  		 unitTextBox4.setText(String.valueOf(calcSource.convert_From_Miliseconds_To_Hour(0)));
	 			  		 unitTextBox5.setText(String.valueOf(calcSource.convert_From_Miliseconds_To_Day(0)));
     				 }
     				 
     				 else if(unit1TextView.getText().equals("MiliGram"))
    				 {
    				  	 unitTextBox2.setText(String.valueOf(calcSource.convert_From_Milligram_To_Gram(0)));
	 			  		 unitTextBox3.setText(String.valueOf(calcSource.convert_From_Milligram_To_Kilogram(0)));
	 			  		 unitTextBox4.setText(String.valueOf(calcSource.convert_From_Milligram_To_Pound(0)));
	 			  		 unitTextBox5.setText(String.valueOf(calcSource.convert_From_Milligram_To_Tonne(0)));
    				 }
     			  }
     			  else if (unitTextBox1.getText().toString().equalsIgnoreCase("-"))
     			  {
     				  return;
     			  }
     			  else
     			  {
     			  	  double inputValue = Double.parseDouble(unitTextBox1.getText().toString());
     			  	  //if(unit1TextView.getText().equals(R.string.Area_Acre))	
       				  if(unit1TextView.getText().equals("Acre"))
       				  {
       					  unitTextBox2.setText(String.valueOf(calcSource.convert_From_Acre_To_Hectare(inputValue)));
   	 			  		  unitTextBox3.setText(String.valueOf(calcSource.convert_From_Acre_To_Square_KM(inputValue)));
   	 			  		  unitTextBox4.setText(String.valueOf(calcSource.convert_From_Acre_To_Square_Foot(inputValue)));
   	 			  		  unitTextBox5.setText(String.valueOf(calcSource.convert_From_Acre_To_Square_Meter(inputValue)));
       				  }
       				  
       				  else if(unit1TextView.getText().equals("Bit"))
       				  {
       					  unitTextBox2.setText(String.valueOf(calcSource.convert_From_Byte_To_Kilobyte(inputValue)));
   	 			  		  unitTextBox3.setText(String.valueOf(calcSource.convert_From_Byte_To_Megabyte(inputValue)));
   	 			  		  unitTextBox4.setText(String.valueOf(calcSource.convert_From_Byte_To_Gigabyte(inputValue)));
   	 			  		  unitTextBox5.setText(String.valueOf(calcSource.convert_From_Byte_To_Terabyte(inputValue)));
       				  } 
       				  
       				  else if(unit1TextView.getText().equals("Inch"))
      				  {
      					  unitTextBox2.setText(String.valueOf(calcSource.convert_From_Inch_To_Foot(inputValue)));
  	 			  		  unitTextBox3.setText(String.valueOf(calcSource.convert_From_Inch_To_Meter(inputValue)));
  	 			  		  unitTextBox4.setText(String.valueOf(calcSource.convert_From_Inch_To_Kilometre(inputValue)));
  	 			  		  unitTextBox5.setText(String.valueOf(calcSource.convert_From_Inch_To_Mile(inputValue)));
      				  }
       				  
       				 else if(unit1TextView.getText().equals("Celsius"))
       				 {
       					  unitTextBox2.setText(String.valueOf(calcSource.convert_From_Celsius_To_Fahrenheit(inputValue)));
  	 			  		  unitTextBox3.setText(String.valueOf(calcSource.convert_From_Celsius_To_Rankine(inputValue)));
  	 			  		  unitTextBox4.setText(String.valueOf(calcSource.convert_From_Celsius_To_Reaumur(inputValue)));
  	 			  		  unitTextBox5.setText(String.valueOf(calcSource.convert_From_Celsius_To_Kelvin(inputValue)));
  			  		 }
       				 
       				 else if(unit1TextView.getText().equals("Millisecond"))
       				 {
       				  	 unitTextBox2.setText(String.valueOf(calcSource.convert_From_Miliseconds_To_Seconds(inputValue)));
  	 			  		 unitTextBox3.setText(String.valueOf(calcSource.convert_From_Miliseconds_To_Minutes(inputValue)));
  	 			  		 unitTextBox4.setText(String.valueOf(calcSource.convert_From_Miliseconds_To_Hour(inputValue)));
  	 			  		 unitTextBox5.setText(String.valueOf(calcSource.convert_From_Miliseconds_To_Day(inputValue)));
       				 }
       				 
       				 else if(unit1TextView.getText().equals("MiliGram"))
      				 {
      				  	 unitTextBox2.setText(String.valueOf(calcSource.convert_From_Milligram_To_Gram(inputValue)));
  	 			  		 unitTextBox3.setText(String.valueOf(calcSource.convert_From_Milligram_To_Kilogram(inputValue)));
  	 			  		 unitTextBox4.setText(String.valueOf(calcSource.convert_From_Milligram_To_Pound(inputValue)));
  	 			  		 unitTextBox5.setText(String.valueOf(calcSource.convert_From_Milligram_To_Tonne(inputValue)));
      				 }
     			  }
    		   }
     	   	}
     	  });

        /**
    	 * 
    	 **/
        unitTextBox2.addTextChangedListener(new TextWatcher() 
        {
     	   public void afterTextChanged(Editable s) 
     	   {
     		  //kiloMeterText.setText("8888");
     	   }

     	   public void beforeTextChanged(CharSequence s, int start, int count, int after) 
     	   {
     		   
     	   }

     	   public void onTextChanged(CharSequence s, int start, int before, int count) 
     	   {
     		   if(unitTextBox2.isFocused())
     		   {
     			   if(unitTextBox2.getText().length() <= 0)
     			   {
     				  if(unit2TextView.getText().equals("Hectare"))
     				  {
     					  unitTextBox1.setText(String.valueOf(calcSource.convert_From_Acre_To_Hectare(0)));
 	 			  		  unitTextBox3.setText(String.valueOf(calcSource.convert_From_Acre_To_Square_KM(0)));
 	 			  		  unitTextBox4.setText(String.valueOf(calcSource.convert_From_Acre_To_Square_Foot(0)));
 	 			  		  unitTextBox5.setText(String.valueOf(calcSource.convert_From_Acre_To_Square_Meter(0)));
     				  }
     				  
     				  else if(unit2TextView.getText().equals("Kilobyte"))
     				  {
     					  unitTextBox1.setText(String.valueOf(calcSource.convert_From_Byte_To_Kilobyte(0)));
 	 			  		  unitTextBox3.setText(String.valueOf(calcSource.convert_From_Byte_To_Megabyte(0)));
 	 			  		  unitTextBox4.setText(String.valueOf(calcSource.convert_From_Byte_To_Gigabyte(0)));
 	 			  		  unitTextBox5.setText(String.valueOf(calcSource.convert_From_Byte_To_Terabyte(0)));
     				  } 
     				  
     				  else if(unit2TextView.getText().equals("Foot"))
    				  {
    					  unitTextBox1.setText(String.valueOf(calcSource.convert_From_Inch_To_Foot(0)));
	 			  		  unitTextBox3.setText(String.valueOf(calcSource.convert_From_Inch_To_Meter(0)));
	 			  		  unitTextBox4.setText(String.valueOf(calcSource.convert_From_Inch_To_Kilometre(0)));
	 			  		  unitTextBox5.setText(String.valueOf(calcSource.convert_From_Inch_To_Mile(0)));
    				  }
     				  
     				 else if(unit2TextView.getText().equals("Fahrenheit"))
     				 {
     					  unitTextBox1.setText(String.valueOf(calcSource.convert_From_Celsius_To_Fahrenheit(0)));
	 			  		  unitTextBox3.setText(String.valueOf(calcSource.convert_From_Celsius_To_Rankine(0)));
	 			  		  unitTextBox4.setText(String.valueOf(calcSource.convert_From_Celsius_To_Reaumur(0)));
	 			  		  unitTextBox5.setText(String.valueOf(calcSource.convert_From_Celsius_To_Kelvin(0)));
			  		 }
     				 
     				 else if(unit2TextView.getText().equals("Second"))
     				 {
     				  	 unitTextBox1.setText(String.valueOf(calcSource.convert_From_Miliseconds_To_Seconds(0)));
	 			  		 unitTextBox3.setText(String.valueOf(calcSource.convert_From_Miliseconds_To_Minutes(0)));
	 			  		 unitTextBox4.setText(String.valueOf(calcSource.convert_From_Miliseconds_To_Hour(0)));
	 			  		 unitTextBox5.setText(String.valueOf(calcSource.convert_From_Miliseconds_To_Day(0)));
     				 }
     				 
     				 else if(unit2TextView.getText().equals("Gram"))
    				 {
    				  	 unitTextBox1.setText(String.valueOf(calcSource.convert_From_Milligram_To_Gram(0)));
	 			  		 unitTextBox3.setText(String.valueOf(calcSource.convert_From_Milligram_To_Kilogram(0)));
	 			  		 unitTextBox4.setText(String.valueOf(calcSource.convert_From_Milligram_To_Pound(0)));
	 			  		 unitTextBox5.setText(String.valueOf(calcSource.convert_From_Milligram_To_Tonne(0)));
    				 }
     			   }
     			   else if (unitTextBox2.getText().toString().equalsIgnoreCase("-"))
     			   {
     				   return;
     			   }
     			   else
     			   {
     				    double inputValue = Double.parseDouble(unitTextBox2.getText().toString());
						
       				  if(unit2TextView.getText().equals("Hectare"))
       				  {
       					  unitTextBox1.setText(String.valueOf(calcSource.convert_From_Hectare_To_Acre(inputValue)));
   	 			  		  unitTextBox3.setText(String.valueOf(calcSource.convert_From_Hectare_To_Square_KM(inputValue)));
   	 			  		  unitTextBox4.setText(String.valueOf(calcSource.convert_From_Hectare_To_Square_Foot(inputValue)));
   	 			  		  unitTextBox5.setText(String.valueOf(calcSource.convert_From_Hectare_To_Square_Meter(inputValue)));
       				  }
       				  
       				  else if(unit2TextView.getText().equals("Kilobyte"))
       				  {
       					  unitTextBox1.setText(String.valueOf(calcSource.convert_From_Kilobyte_To_Byte(inputValue)));
   	 			  		  unitTextBox3.setText(String.valueOf(calcSource.convert_From_Kilobyte_To_Megabyte(inputValue)));
   	 			  		  unitTextBox4.setText(String.valueOf(calcSource.convert_From_Kilobyte_To_Gigabyte(inputValue)));
   	 			  		  unitTextBox5.setText(String.valueOf(calcSource.convert_From_Kilobyte_To_Terabyte(inputValue)));
       				  } 
       				  
       				  else if(unit2TextView.getText().equals("Foot"))
      				  {
      					  unitTextBox1.setText(String.valueOf(calcSource.convert_From_Foot_To_Inch(inputValue)));
  	 			  		  unitTextBox3.setText(String.valueOf(calcSource.convert_From_Foot_To_Meter(inputValue)));
  	 			  		  unitTextBox4.setText(String.valueOf(calcSource.convert_From_Foot_To_Kilometre(inputValue)));
  	 			  		  unitTextBox5.setText(String.valueOf(calcSource.convert_From_Foot_To_Mile(inputValue)));
      				  }
       				  
       				 else if(unit2TextView.getText().equals("Fahrenheit"))
       				 {
       					  unitTextBox1.setText(String.valueOf(calcSource.convert_From_Fahrenheit_To_Celsius(inputValue)));
  	 			  		  unitTextBox3.setText(String.valueOf(calcSource.convert_From_Fahrenheit_To_Rankine(inputValue)));
  	 			  		  unitTextBox4.setText(String.valueOf(calcSource.convert_From_Fahrenheit_To_Reaumur(inputValue)));
  	 			  		  unitTextBox5.setText(String.valueOf(calcSource.convert_From_Fahrenheit_To_Kelvin(inputValue)));
  			  		 }
       				 
       				 else if(unit2TextView.getText().equals("Second"))
       				 {
       				  	 unitTextBox1.setText(String.valueOf(calcSource.convert_From_Seconds_To_Milliseconds(inputValue)));
  	 			  		 unitTextBox3.setText(String.valueOf(calcSource.convert_From_Seconds_To_Minutes(inputValue)));
  	 			  		 unitTextBox4.setText(String.valueOf(calcSource.convert_From_Seconds_To_Hour(inputValue)));
  	 			  		 unitTextBox5.setText(String.valueOf(calcSource.convert_From_Seconds_To_Day(inputValue)));
       				 }
       				 
       				 else if(unit2TextView.getText().equals("Gram"))
      				 {
      				  	 unitTextBox1.setText(String.valueOf(calcSource.convert_From_Gram_To_Milligram(inputValue)));
  	 			  		 unitTextBox3.setText(String.valueOf(calcSource.convert_From_Gram_To_Kilogram(inputValue)));
  	 			  		 unitTextBox4.setText(String.valueOf(calcSource.convert_From_Gram_To_Pound(inputValue)));
  	 			  		 unitTextBox5.setText(String.valueOf(calcSource.convert_From_Gram_To_Tonne(inputValue)));
      				 }
     			   }
     		   }
     	   	}
     	  });
        
        /**
    	 * 
    	 **/
        unitTextBox3.addTextChangedListener(new TextWatcher() 
        {
     	   public void afterTextChanged(Editable s) 
     	   {
     		  //kiloMeterText.setText("8888");
     	   }

     	   public void beforeTextChanged(CharSequence s, int start, int count, int after) 
     	   {
     		   
     	   }

     	   public void onTextChanged(CharSequence s, int start, int before, int count) 
     	   {
     		   if(unitTextBox3.isFocused())
     		   {
     			  if(unitTextBox3.getText().length() <= 0)
    			   {
     				 if(unit3TextView.getText().equals("Square Kilometres"))
     				  {
     					  unitTextBox1.setText(String.valueOf(calcSource.convert_From_Square_KM_To_Acre(0)));
 	 			  		  unitTextBox2.setText(String.valueOf(calcSource.convert_From_Square_KM_To_Hectare(0)));
 	 			  		  unitTextBox4.setText(String.valueOf(calcSource.convert_From_Square_KM_To_Square_Foot(0)));
 	 			  		  unitTextBox5.setText(String.valueOf(calcSource.convert_From_Square_KM_To_Square_Meter(0)));
     				  }
     				  
     				  else if(unit3TextView.getText().equals("Megabyte"))
     				  {
     					  unitTextBox1.setText(String.valueOf(calcSource.convert_From_Megabyte_To_Byte(0)));
 	 			  		  unitTextBox2.setText(String.valueOf(calcSource.convert_From_Megabyte_To_Kilobyte(0)));
 	 			  		  unitTextBox4.setText(String.valueOf(calcSource.convert_From_Megabyte_To_Gigabyte(0)));
 	 			  		  unitTextBox5.setText(String.valueOf(calcSource.convert_From_Megabyte_To_Terabyte(0)));
     				  } 
     				  
     				  else if(unit3TextView.getText().equals("Meter"))
    				  {
    					  unitTextBox1.setText(String.valueOf(calcSource.convert_From_Meter_To_Inch(0)));
	 			  		  unitTextBox2.setText(String.valueOf(calcSource.convert_From_Meter_To_Foot(0)));
	 			  		  unitTextBox4.setText(String.valueOf(calcSource.convert_From_Meter_To_Kilometre(0)));
	 			  		  unitTextBox5.setText(String.valueOf(calcSource.convert_From_Meter_To_Mile(0)));
    				  }
     				  
     				 else if(unit3TextView.getText().equals("Rankine"))
     				 {
     					  unitTextBox1.setText(String.valueOf(calcSource.convert_From_Rankine_To_Celsius(0)));
	 			  		  unitTextBox2.setText(String.valueOf(calcSource.convert_From_Rankine_To_Fahrenheit(0)));
	 			  		  unitTextBox4.setText(String.valueOf(calcSource.convert_From_Rankine_To_Reaumur(0)));
	 			  		  unitTextBox5.setText(String.valueOf(calcSource.convert_From_Rankine_To_Kelvin(0)));
			  		 }
     				 
     				 else if(unit3TextView.getText().equals("Minute"))
     				 {
     				  	 unitTextBox1.setText(String.valueOf(calcSource.convert_From_Minute_To_Milliseconds(0)));
	 			  		 unitTextBox2.setText(String.valueOf(calcSource.convert_From_Minute_To_Seconds(0)));
	 			  		 unitTextBox4.setText(String.valueOf(calcSource.convert_From_Minute_To_Hour(0)));
	 			  		 unitTextBox5.setText(String.valueOf(calcSource.convert_From_Minute_To_Day(0)));
     				 }
     				 
     				 else if(unit3TextView.getText().equals("Kilogram"))
    				 {
    				  	 unitTextBox1.setText(String.valueOf(calcSource.convert_From_Kilogram_To_Milligram(0)));
	 			  		 unitTextBox2.setText(String.valueOf(calcSource.convert_From_Kilogram_To_Gram(0)));
	 			  		 unitTextBox4.setText(String.valueOf(calcSource.convert_From_Kilogram_To_Pound(0)));
	 			  		 unitTextBox5.setText(String.valueOf(calcSource.convert_From_Kilogram_To_Tonne(0)));
    				 }
    			   }
 			  	   else if (unitTextBox3.getText().toString().equalsIgnoreCase("-"))
    			   {
    				   return;
    			   }
    			   else
    			   {
    				   double inputValue = Double.parseDouble(unitTextBox3.getText().toString());
						
      				  if(unit3TextView.getText().equals("Square Kilometres"))
      				  {
      					  unitTextBox1.setText(String.valueOf(calcSource.convert_From_Square_KM_To_Acre(inputValue)));
  	 			  		  unitTextBox2.setText(String.valueOf(calcSource.convert_From_Square_KM_To_Hectare(inputValue)));
  	 			  		  unitTextBox4.setText(String.valueOf(calcSource.convert_From_Square_KM_To_Square_Foot(inputValue)));
  	 			  		  unitTextBox5.setText(String.valueOf(calcSource.convert_From_Square_KM_To_Square_Meter(inputValue)));
      				  }
      				  
      				  else if(unit3TextView.getText().equals("Megabyte"))
      				  {
      					  unitTextBox1.setText(String.valueOf(calcSource.convert_From_Megabyte_To_Byte(inputValue)));
  	 			  		  unitTextBox2.setText(String.valueOf(calcSource.convert_From_Megabyte_To_Kilobyte(inputValue)));
  	 			  		  unitTextBox4.setText(String.valueOf(calcSource.convert_From_Megabyte_To_Gigabyte(inputValue)));
  	 			  		  unitTextBox5.setText(String.valueOf(calcSource.convert_From_Megabyte_To_Terabyte(inputValue)));
      				  } 
      				  
      				  else if(unit3TextView.getText().equals("Meter"))
     				  {
     					  unitTextBox1.setText(String.valueOf(calcSource.convert_From_Meter_To_Inch(inputValue)));
 	 			  		  unitTextBox2.setText(String.valueOf(calcSource.convert_From_Meter_To_Foot(inputValue)));
 	 			  		  unitTextBox4.setText(String.valueOf(calcSource.convert_From_Meter_To_Kilometre(inputValue)));
 	 			  		  unitTextBox5.setText(String.valueOf(calcSource.convert_From_Meter_To_Mile(inputValue)));
     				  }
      				  
      				 else if(unit3TextView.getText().equals("Rankine"))
      				 {
      					  unitTextBox1.setText(String.valueOf(calcSource.convert_From_Rankine_To_Celsius(inputValue)));
 	 			  		  unitTextBox2.setText(String.valueOf(calcSource.convert_From_Rankine_To_Fahrenheit(inputValue)));
 	 			  		  unitTextBox4.setText(String.valueOf(calcSource.convert_From_Rankine_To_Reaumur(inputValue)));
 	 			  		  unitTextBox5.setText(String.valueOf(calcSource.convert_From_Rankine_To_Kelvin(inputValue)));
 			  		 }
      				 
      				 else if(unit3TextView.getText().equals("Minute"))
      				 {
      				  	 unitTextBox1.setText(String.valueOf(calcSource.convert_From_Minute_To_Milliseconds(inputValue)));
 	 			  		 unitTextBox2.setText(String.valueOf(calcSource.convert_From_Minute_To_Seconds(inputValue)));
 	 			  		 unitTextBox4.setText(String.valueOf(calcSource.convert_From_Minute_To_Hour(inputValue)));
 	 			  		 unitTextBox5.setText(String.valueOf(calcSource.convert_From_Minute_To_Day(inputValue)));
      				 }
      				 
      				 else if(unit3TextView.getText().equals("Kilogram"))
     				 {
     				  	 unitTextBox1.setText(String.valueOf(calcSource.convert_From_Kilogram_To_Milligram(inputValue)));
 	 			  		 unitTextBox2.setText(String.valueOf(calcSource.convert_From_Kilogram_To_Gram(inputValue)));
 	 			  		 unitTextBox4.setText(String.valueOf(calcSource.convert_From_Kilogram_To_Pound(inputValue)));
 	 			  		 unitTextBox5.setText(String.valueOf(calcSource.convert_From_Kilogram_To_Tonne(inputValue)));
     				 }
    			   }
     		   }
     	   }
     	  });
        
        /**
    	 * 
    	 **/
        unitTextBox4.addTextChangedListener(new TextWatcher() 
        {
     	   public void afterTextChanged(Editable s) 
     	   {
     		  //kiloMeterText.setText("8888");
     	   }

     	   public void beforeTextChanged(CharSequence s, int start, int count, int after) 
     	   {
     		   
     	   }

     	   public void onTextChanged(CharSequence s, int start, int before, int count) 
     	   {
     		   if(unitTextBox4.isFocused())
     		   {
     			  if(unitTextBox4.getText().length() <= 0)
     			  {
    				 if(unit4TextView.getText().equals("Square Foot"))
    				  {
    					  unitTextBox1.setText(String.valueOf(calcSource.convert_From_Square_Foot_To_Acre(0)));
	 			  		  unitTextBox2.setText(String.valueOf(calcSource.convert_From_Square_Foot_To_Hectare(0)));
	 			  		  unitTextBox3.setText(String.valueOf(calcSource.convert_From_Square_Foot_To_Square_KM(0)));
	 			  		  unitTextBox5.setText(String.valueOf(calcSource.convert_From_Square_Foot_To_Square_Meter(0)));
    				  }
    				  
    				  else if(unit4TextView.getText().equals("Gigabyte"))
    				  {
    					  unitTextBox1.setText(String.valueOf(calcSource.convert_From_Gigabyte_To_Byte(0)));
	 			  		  unitTextBox2.setText(String.valueOf(calcSource.convert_From_Gigabyte_To_Kilobyte(0)));
	 			  		  unitTextBox3.setText(String.valueOf(calcSource.convert_From_Gigabyte_To_Megabyte(0)));
	 			  		  unitTextBox5.setText(String.valueOf(calcSource.convert_From_Gigabyte_To_Terabyte(0)));
    				  } 
    				  
    				  else if(unit4TextView.getText().equals("Kilometre"))
    				  {
    					  unitTextBox1.setText(String.valueOf(calcSource.convert_From_Kilometre_To_Inch(0)));
	 			  		  unitTextBox2.setText(String.valueOf(calcSource.convert_From_Kilometre_To_Foot(0)));
	 			  		  unitTextBox3.setText(String.valueOf(calcSource.convert_From_Kilometre_To_Metre(0)));
	 			  		  unitTextBox5.setText(String.valueOf(calcSource.convert_From_Kilometre_To_Mile(0)));
    				  }
    				  
    				 else if(unit4TextView.getText().equals("Reaumur"))
    				 {
    					  unitTextBox1.setText(String.valueOf(calcSource.convert_From_Reaumur_To_Celsius(0)));
	 			  		  unitTextBox2.setText(String.valueOf(calcSource.convert_From_Reaumur_To_Fahrenheit(0)));
	 			  		  unitTextBox3.setText(String.valueOf(calcSource.convert_From_Reaumur_To_Rankine(0)));
	 			  		  unitTextBox5.setText(String.valueOf(calcSource.convert_From_Reaumur_To_Kelvin(0)));
			  		 }
    				 
    				 else if(unit4TextView.getText().equals("Hour"))
    				 {
    				  	 unitTextBox1.setText(String.valueOf(calcSource.convert_From_Hour_To_Milliseconds(0)));
	 			  		 unitTextBox2.setText(String.valueOf(calcSource.convert_From_Hour_To_Seconds(0)));
	 			  		 unitTextBox3.setText(String.valueOf(calcSource.convert_From_Hour_To_Minute(0)));
	 			  		 unitTextBox5.setText(String.valueOf(calcSource.convert_From_Hour_To_Day(0)));
    				 }
    				 
    				 else if(unit4TextView.getText().equals("Pound"))
    				 {
			  	 		 unitTextBox1.setText(String.valueOf(calcSource.convert_From_Pound_To_Milligram(0)));
	 			  		 unitTextBox2.setText(String.valueOf(calcSource.convert_From_Pound_To_Gram(0)));
	 			  		 unitTextBox3.setText(String.valueOf(calcSource.convert_From_Pound_To_Kilogram(0)));
	 			  		 unitTextBox5.setText(String.valueOf(calcSource.convert_From_Pound_To_Tonne(0)));
    				 }
     			  }
			  	  else if (unitTextBox4.getText().toString().equalsIgnoreCase("-"))
			  	  {
			  		  return;
			  	  }
			  	  else
			  	  {
			  		double inputValue = Double.parseDouble(unitTextBox4.getText().toString());
						
   				    if(unit4TextView.getText().equals("Square Foot"))
  				 	{
  					 	unitTextBox1.setText(String.valueOf(calcSource.convert_From_Square_Foot_To_Acre(inputValue)));
			  		  	unitTextBox2.setText(String.valueOf(calcSource.convert_From_Square_Foot_To_Hectare(inputValue)));
			  		  	unitTextBox3.setText(String.valueOf(calcSource.convert_From_Square_Foot_To_Square_KM(inputValue)));
			  		  	unitTextBox5.setText(String.valueOf(calcSource.convert_From_Square_Foot_To_Square_Meter(inputValue)));
				  	}
				  
  				 	else if(unit4TextView.getText().equals("Gigabyte"))
				  	{
					  	unitTextBox1.setText(String.valueOf(calcSource.convert_From_Gigabyte_To_Byte(inputValue)));
					  	unitTextBox2.setText(String.valueOf(calcSource.convert_From_Gigabyte_To_Kilobyte(inputValue)));
			  		  	unitTextBox3.setText(String.valueOf(calcSource.convert_From_Gigabyte_To_Megabyte(inputValue)));
			  		  	unitTextBox5.setText(String.valueOf(calcSource.convert_From_Gigabyte_To_Terabyte(inputValue)));
				  	} 
				  
				  	else if(unit4TextView.getText().equals("Kilometre"))
				  	{
					  	unitTextBox1.setText(String.valueOf(calcSource.convert_From_Kilometre_To_Inch(inputValue)));
			  		  	unitTextBox2.setText(String.valueOf(calcSource.convert_From_Kilometre_To_Foot(inputValue)));
			  		  	unitTextBox3.setText(String.valueOf(calcSource.convert_From_Kilometre_To_Metre(inputValue)));
			  		  	unitTextBox5.setText(String.valueOf(calcSource.convert_From_Kilometre_To_Mile(inputValue)));
				  	}
				  
				  	else if(unit4TextView.getText().equals("Reaumur"))
				 	{
					  	unitTextBox1.setText(String.valueOf(calcSource.convert_From_Reaumur_To_Celsius(inputValue)));
			  		  	unitTextBox2.setText(String.valueOf(calcSource.convert_From_Reaumur_To_Fahrenheit(inputValue)));
			  		  	unitTextBox3.setText(String.valueOf(calcSource.convert_From_Reaumur_To_Rankine(inputValue)));
			  		  	unitTextBox5.setText(String.valueOf(calcSource.convert_From_Reaumur_To_Kelvin(inputValue)));
		  		 	}
				 
					else if(unit4TextView.getText().equals("Hour"))
					{
					  	unitTextBox1.setText(String.valueOf(calcSource.convert_From_Hour_To_Milliseconds(inputValue)));
				  		unitTextBox2.setText(String.valueOf(calcSource.convert_From_Hour_To_Seconds(inputValue)));
				  		unitTextBox3.setText(String.valueOf(calcSource.convert_From_Hour_To_Minute(inputValue)));
				  		unitTextBox5.setText(String.valueOf(calcSource.convert_From_Hour_To_Day(inputValue)));
					}
				 
				 	else if(unit4TextView.getText().equals("Pound"))
				 	{
				 		unitTextBox1.setText(String.valueOf(calcSource.convert_From_Pound_To_Milligram(inputValue)));
				 		unitTextBox2.setText(String.valueOf(calcSource.convert_From_Pound_To_Gram(inputValue)));
				 		unitTextBox3.setText(String.valueOf(calcSource.convert_From_Pound_To_Kilogram(inputValue)));
				 		unitTextBox5.setText(String.valueOf(calcSource.convert_From_Pound_To_Tonne(inputValue)));
				 	}
			  	  }
     		   }
     	   	}
     	  });
        
        /*
    	 * 
    	 */
        unitTextBox5.addTextChangedListener(new TextWatcher() 
        {
     	   public void afterTextChanged(Editable s) 
     	   {
     		
     	   }

     	   public void beforeTextChanged(CharSequence s, int start, int count, int after) 
     	   {
     		   
     	   }

     	   public void onTextChanged(CharSequence s, int start, int before, int count) 
     	   {
     		   if(unitTextBox5.isFocused())
     		   {
      			  if(unitTextBox5.getText().length() <= 0)
      			  {
     				 if(unit5TextView.getText().equals("Square Metres"))
     				  {
     					  unitTextBox1.setText(String.valueOf(calcSource.convert_From_Square_Meter_To_Acre(0)));
 	 			  		  unitTextBox2.setText(String.valueOf(calcSource.convert_From_Square_Meter_To_Hectare(0)));
 	 			  		  unitTextBox3.setText(String.valueOf(calcSource.convert_From_Square_Meter_To_Square_KM(0)));
 	 			  		  unitTextBox4.setText(String.valueOf(calcSource.convert_From_Square_Meter_To_Square_Foot(0)));
     				  }
     				  
     				  else if(unit5TextView.getText().equals("Terabyte"))
     				  {
     					  unitTextBox1.setText(String.valueOf(calcSource.convert_From_Terabyte_To_Byte(0)));
 	 			  		  unitTextBox2.setText(String.valueOf(calcSource.convert_From_Terabyte_To_Kilobyte(0)));
 	 			  		  unitTextBox3.setText(String.valueOf(calcSource.convert_From_Terabyte_To_Megabyte(0)));
 	 			  		  unitTextBox4.setText(String.valueOf(calcSource.convert_From_Terabyte_To_Gigabyte(0)));
     				  } 
     				  
     				  else if(unit5TextView.getText().equals("Mile"))
     				  {
     					  unitTextBox1.setText(String.valueOf(calcSource.convert_From_Miles_To_Inch(0)));
 	 			  		  unitTextBox2.setText(String.valueOf(calcSource.convert_From_Miles_To_Foot(0)));
 	 			  		  unitTextBox3.setText(String.valueOf(calcSource.convert_From_Miles_To_Metre(0)));
 	 			  		  unitTextBox4.setText(String.valueOf(calcSource.convert_From_Miles_To_Kilometre(0)));
     				  }
     				  
     				 else if(unit5TextView.getText().equals("Kelvin"))
     				 {
     					  unitTextBox1.setText(String.valueOf(calcSource.convert_From_Kelvin_To_Celsius(0)));
 	 			  		  unitTextBox2.setText(String.valueOf(calcSource.convert_From_Kelvin_To_Fahrenheit(0)));
 	 			  		  unitTextBox3.setText(String.valueOf(calcSource.convert_From_Kelvin_To_Rankine(0)));
 	 			  		  unitTextBox4.setText(String.valueOf(calcSource.convert_From_Kelvin_To_Reaumur(0)));
 			  		 }
     				 
     				 else if(unit5TextView.getText().equals("Day"))
     				 {
     				  	 unitTextBox1.setText(String.valueOf(calcSource.convert_From_Day_To_Milliseconds(0)));
 	 			  		 unitTextBox2.setText(String.valueOf(calcSource.convert_From_Day_To_Seconds(0)));
 	 			  		 unitTextBox3.setText(String.valueOf(calcSource.convert_From_Day_To_Minute(0)));
 	 			  		 unitTextBox4.setText(String.valueOf(calcSource.convert_From_Day_To_Hour(0)));
     				 }
     				 
     				 else if(unit5TextView.getText().equals("Tonne"))
     				 {
 			  	 		 unitTextBox1.setText(String.valueOf(calcSource.convert_From_Tonne_To_Milligram(0)));
 	 			  		 unitTextBox2.setText(String.valueOf(calcSource.convert_From_Tonne_To_Gram(0)));
 	 			  		 unitTextBox3.setText(String.valueOf(calcSource.convert_From_Tonne_To_Kilogram(0)));
 	 			  		 unitTextBox4.setText(String.valueOf(calcSource.convert_From_Tonne_To_Pound(0)));
     				 }
      			  }
 			  	  else if (unitTextBox5.getText().toString().equalsIgnoreCase("-"))
 			  	  {
 			  		  return;
 			  	  }
 			  	  else
 			  	  {
 			  		  double inputValue = Double.parseDouble(unitTextBox5.getText().toString());
 						
     				  if(unit5TextView.getText().equals("Square Metres"))
    				  {
    					  unitTextBox1.setText(String.valueOf(calcSource.convert_From_Square_Meter_To_Acre(inputValue)));
	 			  		  unitTextBox2.setText(String.valueOf(calcSource.convert_From_Square_Meter_To_Hectare(inputValue)));
	 			  		  unitTextBox3.setText(String.valueOf(calcSource.convert_From_Square_Meter_To_Square_KM(inputValue)));
	 			  		  unitTextBox4.setText(String.valueOf(calcSource.convert_From_Square_Meter_To_Square_Foot(inputValue)));
    				  }
    				  
    				  else if(unit5TextView.getText().equals("Terabyte"))
    				  {
    					  unitTextBox1.setText(String.valueOf(calcSource.convert_From_Terabyte_To_Byte(inputValue)));
	 			  		  unitTextBox2.setText(String.valueOf(calcSource.convert_From_Terabyte_To_Kilobyte(inputValue)));
	 			  		  unitTextBox3.setText(String.valueOf(calcSource.convert_From_Terabyte_To_Megabyte(inputValue)));
	 			  		  unitTextBox4.setText(String.valueOf(calcSource.convert_From_Terabyte_To_Gigabyte(inputValue)));
    				  } 
    				  
    				  else if(unit5TextView.getText().equals("Mile"))
    				  {
    					  unitTextBox1.setText(String.valueOf(calcSource.convert_From_Miles_To_Inch(inputValue)));
	 			  		  unitTextBox2.setText(String.valueOf(calcSource.convert_From_Miles_To_Foot(inputValue)));
	 			  		  unitTextBox3.setText(String.valueOf(calcSource.convert_From_Miles_To_Metre(inputValue)));
	 			  		  unitTextBox4.setText(String.valueOf(calcSource.convert_From_Miles_To_Kilometre(inputValue)));
    				  }
    				  
    				 else if(unit5TextView.getText().equals("Kelvin"))
    				 {
    					  unitTextBox1.setText(String.valueOf(calcSource.convert_From_Kelvin_To_Celsius(inputValue)));
	 			  		  unitTextBox2.setText(String.valueOf(calcSource.convert_From_Kelvin_To_Fahrenheit(inputValue)));
	 			  		  unitTextBox3.setText(String.valueOf(calcSource.convert_From_Kelvin_To_Rankine(inputValue)));
	 			  		  unitTextBox4.setText(String.valueOf(calcSource.convert_From_Kelvin_To_Reaumur(inputValue)));
			  		 }
    				 
    				 else if(unit5TextView.getText().equals("Day"))
    				 {
    				  	 unitTextBox1.setText(String.valueOf(calcSource.convert_From_Day_To_Milliseconds(inputValue)));
	 			  		 unitTextBox2.setText(String.valueOf(calcSource.convert_From_Day_To_Seconds(inputValue)));
	 			  		 unitTextBox3.setText(String.valueOf(calcSource.convert_From_Day_To_Minute(inputValue)));
	 			  		 unitTextBox4.setText(String.valueOf(calcSource.convert_From_Day_To_Hour(inputValue)));
    				 }
    				 
    				 else if(unit5TextView.getText().equals("Tonne"))
    				 {
			  	 		 unitTextBox1.setText(String.valueOf(calcSource.convert_From_Tonne_To_Milligram(inputValue)));
	 			  		 unitTextBox2.setText(String.valueOf(calcSource.convert_From_Tonne_To_Gram(inputValue)));
	 			  		 unitTextBox3.setText(String.valueOf(calcSource.convert_From_Tonne_To_Kilogram(inputValue)));
	 			  		 unitTextBox4.setText(String.valueOf(calcSource.convert_From_Tonne_To_Pound(inputValue)));
    				 }
 			  	  }
     		   }
     	   	}
     	  });        
    }
    
    /**
	 * 
	 **/
    @Override
    public boolean onCreateOptionsMenu(Menu menu) 
    {    
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
    /**
     * This method will get executed when clicking on the Calculate button.
     **/
    
    @Override
    public boolean onOptionsItemSelected(MenuItem item) 
    {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) 
        {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
   
    /**
	 * 
	 **/
    public void onItemSelected(AdapterView<?> parent, View view, int pos, long id) 
    {
    	try
        {
    		unit1TextView = (TextView) findViewById(R.id.unit1TextView);
    		unit2TextView = (TextView) findViewById(R.id.unit2TextView);
    		unit3TextView = (TextView) findViewById(R.id.unit3TextView);
    		unit4TextView = (TextView) findViewById(R.id.unit4TextView);
    		unit5TextView = (TextView) findViewById(R.id.unit5TextView);
    		metricselector = (Spinner) parent;
        }
        catch(Exception es)
        {
        	return;
        }
        
    	 //Toast.makeText(parent.getContext(), "OnItemSelectedListener : " + parent.getItemAtPosition(pos).toString(), Toast.LENGTH_SHORT).show();
    	 
    	//An item was selected. You can retrieve the selected item using
    	//String strAge = parent.getItemAtPosition(pos).toString();
    	
    	if(parent.getItemAtPosition(pos).toString().equalsIgnoreCase("Area"))
    	{
    		unit1TextView.setText(R.string.Area_Acre);
    		unit2TextView.setText(R.string.Area_Hectare);
    		unit3TextView.setText(R.string.Area_Square_Kilometres);
    		unit4TextView.setText(R.string.Area_Square_Foot);
    		unit5TextView.setText(R.string.Area_Square_Metres);
    	}
    	else if(parent.getItemAtPosition(pos).toString().equalsIgnoreCase("DigitalStorage"))
    	{
    		unit1TextView.setText(R.string.DigitalStorage_Bits);
    		unit2TextView.setText(R.string.DigitalStorage_Kilobytes);
    		unit3TextView.setText(R.string.DigitalStorage_Megabytes);
    		unit4TextView.setText(R.string.DigitalStorage_Gigabytes);
    		unit5TextView.setText(R.string.DigitalStorage_Terabytes);
    	}
    	else if(parent.getItemAtPosition(pos).toString().equalsIgnoreCase("Length"))
    	{
    		unit1TextView.setText(R.string.Length_Inches);
    		unit2TextView.setText(R.string.Length_Foots);
    		unit3TextView.setText(R.string.Length_Meters);
    		unit4TextView.setText(R.string.Length_Kilometres);
    		unit5TextView.setText(R.string.Length_Miles);
    	}
    	else if(parent.getItemAtPosition(pos).toString().equalsIgnoreCase("Temprature"))
    	{
    		unit1TextView.setText(R.string.Temperature_Celsius);
    		unit2TextView.setText(R.string.Temperature_Fahrenheit);
    		unit3TextView.setText(R.string.Temperature_Rankine);
    		unit4TextView.setText(R.string.Temperature_Reaumur);
    		unit5TextView.setText(R.string.Temperature_Kelvin);
    	}
    	else if(parent.getItemAtPosition(pos).toString().equalsIgnoreCase("Time"))
    	{
    		unit1TextView.setText(R.string.Time_Milliseconds);
    		unit2TextView.setText(R.string.Time_Seconds);
    		unit3TextView.setText(R.string.Time_Minutes);
    		unit4TextView.setText(R.string.Time_Hours);
    		unit5TextView.setText(R.string.Time_Days);
    	}
    	else if(parent.getItemAtPosition(pos).toString().equalsIgnoreCase("Weight"))
    	{
    		unit1TextView.setText(R.string.Weight_Milligrams);
    		unit2TextView.setText(R.string.Weight_Grams);
    		unit3TextView.setText(R.string.Weight_KGs);
    		unit4TextView.setText(R.string.Weight_Pounds);
    		unit5TextView.setText(R.string.Weight_Tonnes);
    	}
    }
    
    /*
	 * 
	 */
    public void onNothingSelected(AdapterView<?> parent) 
    {
        //Another interface callback
    }
    
    /**
     * A placeholder fragment containing a simple view.
     **/
    public static class PlaceholderFragment extends Fragment 
    {
        public PlaceholderFragment() 
        {
        }

        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                Bundle savedInstanceState) 
        {
            View rootView = inflater.inflate(R.layout.fragment_main, container, false);
            return rootView;
        }
    }
}