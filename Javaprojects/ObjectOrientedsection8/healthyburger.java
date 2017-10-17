package ObjectOrientedsection8;

class healthyburger extends burger {
     protected boolean halapeno;
     protected boolean salad;
     protected double countsalad;
     protected double counthalapeno;
          

     //Constructors
    public healthyburger() {
		this.rolltype = "Healthy roll";
		this.meat = "lowfat";
		this.price = 6;
		startingprice = this.price;
 	
 	} 
     
	public healthyburger(String rolltype, String meat) {
		this.rolltype = rolltype;
		this.meat = meat;
	}
	
	//Getters,Setters     
	public boolean isHalapeno() {
		return halapeno;
	}
	public void setHalapeno(boolean halapeno) {
		this.halapeno = halapeno;
		this.counthalapeno = this.counthalapeno + 1;
	}
	public boolean isSalad() {
		return salad;
	}
	public void setSalad(boolean salad) {
		this.salad = salad;
		this.countsalad = this.countsalad + 1;
	}
    
 public void healthylistingbase(){
	 super.listingbase();
	System.out.println("Halapeno = " + this.counthalapeno*0.1);
	System.out.println("Salad = " + this.countsalad*0.1);
 }
 public void paying(){	 
	 healthylistingbase();
	 System.out.println("Total amount to be paid  "  + this.price );
 }
    

}
