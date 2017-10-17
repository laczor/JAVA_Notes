package ObjectOrientedsection8;

public class wheels {
  private int numwheels;
  private String qualitywheels;
  private String brandweels;

//Contructors,
public wheels(int numwheels, String qualitywheels, String brandweels) {
	super();
	this.numwheels = numwheels;
	this.qualitywheels = qualitywheels;
	this.brandweels = brandweels;
}

//Getters,Setters
public int getNumwheels() {
	return numwheels;
}
public void setNumwheels(int numwheels) {
	this.numwheels = numwheels;
}
public String getQualitywheels() {
	return qualitywheels;
}
public void setQualitywheels(String qualitywheels) {
	this.qualitywheels = qualitywheels;
}
public String getBrandweels() {
	return brandweels;
}
public void setBrandweels(String brandweels) {
	this.brandweels = brandweels;
}
  
public void checkwheels(){
	System.out.println("All of the "+ numwheels + "has been checked with the brand of " + brandweels);
}  
  
}
