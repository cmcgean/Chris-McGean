/* Temperature Conversion
Christopher McGean
2/8/18  */
import java.util.Scanner;

public class TemperatureConversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scnr = new Scanner(System.in);
		
		double Temp;
		double TempF;
		double TempC;
		
		Temp = 50;
		TempF = ((Temp * 1.8) + 32);
		TempC = (((Temp - 32)*5) / 9);
		
		
		System.out.println("Temp: " + Temp);
		System.out.println(Temp + " C is " + TempF +" F");
		System.out.println(Temp + " F is " + TempC + " C");
	}

}
