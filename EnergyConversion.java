import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/**
* This program converts mass (kg) into energy (joules) with user input.
*
* @author  Christina Ngwa
* @version 1.0
* @since   2020-02-18
*/

public class EnergyConversion {
  /**
  * This program converts mass (kg) into energy (joules) with user input.
  */
  public static void main(String[] args) throws IOException {
    // variables and constants
    final long Lightspeed = 2997924582L;
    final double mass;
    final double convertedEnergy;
    
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    // input
    System.out.println("Welcome to the mass-energy equivalence calculator.");
    System.out.print("\nPlease enter the mass of the object in kg: ");
    
    try {
      mass = Double.parseDouble(br.readLine());
      
      if (mass < 0) {
        System.out.println("Invalid input. Please try again.");
        
      } else {
        // process
        convertedEnergy = mass * Math.pow(Lightspeed, 2);
        System.out.print("\nIf the object is " + mass + "kg, it will produce " 
                           + convertedEnergy + "J of energy.");
      }
    } catch (NumberFormatException nfe) {
      System.err.println("Invalid input. Please try again.");
    }
  }
}