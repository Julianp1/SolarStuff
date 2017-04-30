
import java.time.*;
import java.util.Scanner;
import java.awt.*;
// Temperature is in Fahrenhiet
public class Power {
	private boolean Cloudy;
	private double Temperature;
	private  final double  sun = 1120 ; // watts per meter sqaured
	

public Power (double temp,boolean b){
	Temperature = temp;
	
	Cloudy = b;
}

public  String toString(){
	return " "+ eff();
	
}

public double eff(){
	double sum = 52;
	double v = (Temperature - 77) / (3.6);
	
	if(Cloudy){sum+=30;}
	if(Temperature > (77)){
		sum+=v;
	}
	
	return(sun- (sun*(sum/100)))*.20;
	
}

public double converter(){
	return eff();
	
}
public int isCloudy(){
	if(Cloudy){
		return 52+30;
	}
	else return 52;
	
}

public static void main(String[] args){
	
	
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Please type in the temperature");
	int temp = sc.nextInt();
	System.out.println("Type in if its cloudy (true or false)");
	boolean cloudy = sc.nextBoolean();
	
	Power pow = new Power(temp,cloudy);
	sc.close();
	System.out.println("only "+(100- pow.isCloudy())+"% of the total solar energy from the sun is hitting the surface of the earth");
	System.out.println("A commerical solar panel at solar noon is converting only "+pow.converter()+" watts of energy");
	
	
	
	
	
}



}
