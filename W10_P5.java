import java.util.Scanner;
class TemperatureException extends Exception {
    public TemperatureException(String message) {
        super(message);
    }
}

class TemperatureConverter {
    //Code to create two function for temperature conversion (celsiusToFahrenheit and fahrenheitToCelsius).
public static double celsiusToFahrenheit(double celsius ) throws TemperatureException {
  double result=0;
  
  if(celsius<-273)
      	throw new TemperatureException("Error: Invalid Celsius temperature (below absolute zero)");
  else{
   result= (celsius * 9 / 5) + 32;
      
  return result;
  }
  
  
  }

public static double fahrenheitToCelsius(double fehr){
  return 2.0
}
}


public class W10_P5{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            //System.out.print("Enter temperature in Celsius: ");
            double celsius = scanner.nextDouble();
            double fahrenheit = TemperatureConverter.celsiusToFahrenheit(celsius);
            System.out.println("Temperature in Fahrenheit: " + fahrenheit);

          //  System.out.print("Enter temperature in Fahrenheit: ");
            double fahrenheitInput = scanner.nextDouble();
            double celsiusOutput = TemperatureConverter.fahrenheitToCelsius(fahrenheitInput);
            System.out.println("Temperature in Celsius: " + celsiusOutput);
        } catch (TemperatureException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Error: Invalid input");
        } finally {
            scanner.close();
        }
    }
}