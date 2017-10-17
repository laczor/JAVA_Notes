	
public class BankAccounts {				//Bank account numbers
	private int account_number;
	private int balance;
	private String Customer_name;
	private String email;
	
	//Constructor with parameters, Overload method
	public BankAccounts(){											//Automatic values, constructors.
		this(0000000,0,"default","default@email");					//It copies the parameters of the below method wit 4 parameters,				
		/*this.account_number = 000000000;							//we can assign the seperately, or with this();
		*this.balance = balance;
		*/
	}
	
	public BankAccounts(int account_number, int balance, String Customer_name,String email){
		this.account_number = account_number;						//This is actually an automatic method, when a class is called.
		this.balance = balance;
		this.Customer_name = Customer_name;
		this.email = email;
	}
	//Customer Name
	public void setCustomer_name(String Cname) {
		this.Customer_name = Cname;}

	public String getCustomer_name() {
		return Customer_name;}
	
	//Customer Name Account number
	public void setaccount_number(int accnum) {
		this.account_number = accnum;}

	public double getaccount_number() {
		return account_number;}
	//Deposit
	public int deposit_funds(int depfund){
		this.balance = this.balance + depfund;
		//System.out.println("Balance after deposit "+this.balance);
		return this.balance;
	}
	//Withdraw
	public int withdraw_funds(int depfund){
		if(this.balance >= depfund){
			this.balance = this.balance - depfund;			
		}	
		//System.out.println("Balance after Withdrawal  "+this.balance);
		return this.balance;
	}
	
	}
