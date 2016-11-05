/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homework20;

/**
 *
 * @author Mike
 */
public class TemperatureConverterService {
    
    public final String ConvertToCelcius(String farenheit){
        double temp = Double.valueOf(farenheit);
        return String.valueOf((temp - 32)/ 1.8000);
    }
    
    public final String ConvertToFarenheit(String celcius){
        double temp = Double.valueOf(celcius);
        return String.valueOf((temp * 1.8000) + 32);
    }
}
