/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homework21;

import java.text.DecimalFormat;

/**
 *
 * @author Mike
 */
public class TemperatureConverterService {
   
    public final String ConvertToCelcius(String farenheit) throws IllegalArgumentException {
        if (farenheit.isEmpty() || farenheit.startsWith(" ")){
            throw new IllegalArgumentException("Temperature can not be empty.");
        }
        if (!farenheit.matches("\\d*")){
            throw new IllegalArgumentException("Temperature can only contain numbers.");
        }
        double temp = Double.valueOf(farenheit);
        return String.valueOf(new DecimalFormat("#0.00").format((temp - 32)/ 1.8000));
    }
    
    public final String ConvertToFarenheit(String celcius){
        if (celcius.isEmpty() || celcius.startsWith(" ")){
            throw new IllegalArgumentException("Temperature can not be empty.");
        }
        if (!celcius.matches("\\d*")){
            throw new IllegalArgumentException("Temperature can only contain numbers.");
        }
        double temp = Double.valueOf(celcius);
        return String.valueOf(new DecimalFormat("#0.00").format((temp * 1.8000) + 32));
    }
}
