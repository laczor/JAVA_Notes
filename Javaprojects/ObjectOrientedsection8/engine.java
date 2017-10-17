package ObjectOrientedsection8;

public class engine {
private String bandengine;
private int numofengine;
private int performance;

//Constructors
public engine(String bandengine, int numofengine, int performance) {
	super();
	this.bandengine = bandengine;
	this.numofengine = numofengine;
	this.performance = performance;
}

//Setters;Getters
public String getBandengine() {
	return bandengine;
}
public void setBandengine(String bandengine) {
	this.bandengine = bandengine;
}
public int getNumofengine() {
	return numofengine;
}
public void setNumofengine(int numofengine) {
	this.numofengine = numofengine;
}
public int getPerformance() {
	return performance;
}
public void setPerformance(int performance) {
	this.performance = performance;
}
//Methods

 public void statsengine(){
	 System.out.println("Engine has started");
	 
 }


}
