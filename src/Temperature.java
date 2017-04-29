import java.sql.Time;
import java.time.*;
// Temperature is in Celcius 
public class Temperature {
	private double Temperature;
	private Time x;
	
public Temperature(int temp){
	Temperature = temp;
}
public Temperature (int temp, Time y){
	Temperature = temp;
	x =y;
}
public Time getTime( ) {
	 
	return x;
}
public double getTemp(){
	return Temperature;
}

public double VoltageDecrease(){
	
	double v = (Temperature - (25*(9/5) +32)) % (2*(9/5)+32);
	if(Temperature >25){
	 return v;
	}
	else return .01;
	
}








}
