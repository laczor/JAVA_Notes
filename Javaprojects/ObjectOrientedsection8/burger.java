package ObjectOrientedsection8;

public class burger {
	protected String rolltype;
	protected String meat;
	protected double price;
	protected boolean cheese;
	protected boolean onion;
	protected boolean cucumber;
	protected double cheesecount;
	protected double onioncount;
	protected double cucumbercount;
	protected double startingprice;
	
	
//Constructors	
	public burger(String rolltype, String meat) {
		//super();
		this.rolltype = rolltype;
		this.meat = meat;
		this.price = 5;
		this.cheesecount = 0;
		this.cucumbercount = 0;
		this.onioncount = 0;
		startingprice = price;
		//System.out.println("Base burger of " + price + " has been charged.");
	}
	
	public burger() {

	}
//Constructor for the healthy,deluce burger.
public burger(String rolltype, String meat, double price, boolean cheese, boolean onion, boolean cucumber) {
		super();
		this.rolltype = rolltype;
		this.meat = meat;
		this.price = price;
		this.cheese = cheese;
		this.onion = onion;
		this.cucumber = cucumber;
	}

//Getters,Setters

	public String getRolltype() {
		return rolltype;
	}
	public void setRolltype(String rolltype) {
		this.rolltype = rolltype;
	}
	public String getMeat() {
		return meat;
	}
	public void setMeat(String meat) {
		this.meat = meat;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public boolean isCheese() {
		return cheese;
	}
	public void setCheese(boolean cheese) {
		this.cheese = cheese;
		this.price = this.price + 0.5;
		this.cheesecount = this.cheesecount + 1;
		//System.out.println("Cheese has been added " + 0.5 + "has been charged" );
	}
	public boolean isOnion() {
		return onion;
	}
	public void setOnion(boolean onion) {
		this.onion = onion;
		this.price = this.price + 0.2;
		this.onioncount = this.onioncount + 1;
		//System.out.println("Onion has been added " + 0.2 + "has been charged" );
	}
	public boolean isCucumber() {
		return cucumber;
	}
	public void setCucumber(boolean cucumber) {
		this.cucumber = cucumber;
		this.price = this.price + 0.1;
		this.cucumbercount = this.cucumbercount + 1;
		//System.out.println("Cucumber has been added " + 0.1 + "has been charged");
	}
	
//Methods
	public void paying(){
			listingbase();
		System.out.println("Total amount to be paid  "  + this.price );
		
	}
	public void listingbase(){
		System.out.println("Base price "  + startingprice + " has been charged.");
		System.out.println("Cheese = " + this.cheesecount*0.5);
		System.out.println("Onion = " + this.cheesecount*0.2);
		System.out.println("Cucumber = " + this.cheesecount*0.1);
		
	}
}
