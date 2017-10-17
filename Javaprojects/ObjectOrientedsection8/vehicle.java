package ObjectOrientedsection8;

public class vehicle {
private String vehiclebrand;												//Actually we are referencing to an other class as a main variable component of this class
private engine theengine;													//The type of the variable is the actual class.
private wheels thewheels;

//Getters,Setters
public String getVehiclebrand() {
	return vehiclebrand;
}

public void setVehiclebrand(String vehiclebrand) {
	this.vehiclebrand = vehiclebrand;
}

public engine getTheengine() {
	return theengine;
}

public void setTheengine(engine theengine) {
	this.theengine = theengine;
}

public wheels getThewheels() {
	return thewheels;
}

public void setThewheels(wheels thewheels) {
	this.thewheels = thewheels;
}

//Constructor
public vehicle(String vehiclebrand, engine theengine, wheels thewheels) {
	super();
	this.vehiclebrand = vehiclebrand;
	this.theengine = theengine;
	this.thewheels = thewheels;
}

public void startsvehicle (){
	this.thewheels.checkwheels();											//We are calling this instance of the vehicle class, then the class of wheels, and it's method of checkwheels.
	this.theengine.statsengine();
}

	
}
