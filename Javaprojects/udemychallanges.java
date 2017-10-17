
public class udemychallanges {
	public static void main (String[]args){
		//Creating new instaces of the BankAccountclass, 
		BankAccounts customer1 = new BankAccounts();
		BankAccounts customer2 = new BankAccounts(20000,0,"Isti2","emailadress");  //with constructor method as well
		BankAccounts customer3 = new BankAccounts();  //with constructor method as well
		
		//Assigning values to the customer1
		customer1.setCustomer_name("Isti1");
		//customer1.setaccount_number(10000);
		customer1.deposit_funds(1000);
		customer1.deposit_funds(100);
		customer1.withdraw_funds(100);
		
		//Assigning values to the customer2
//		customer2.setCustomer_name("Isti2");
//		customer2.setaccount_number(20000);
		customer2.deposit_funds(1000);
		customer2.deposit_funds(1000);
		customer2.withdraw_funds(140);
		
		//Print out the data
		System.out.println("The following Customer   " + customer1.getCustomer_name() + "  has the balance of " + customer1.deposit_funds(0) +"  On the account of " + customer1.getaccount_number());
		System.out.println("The following Customer   " + customer2.getCustomer_name() + "  has the balance of " + customer2.deposit_funds(0) +"  On the account of " + customer2.getaccount_number());
		System.out.println("The following Customer   " + customer3.getCustomer_name() + "  has the balance of " + customer3.deposit_funds(0) +"  On the account of " + customer3.getaccount_number());
	}
}



/*
 * <<<<<1.Enum>>>>>
 enum Rank {SOLDIER,SERGEANT,CAPTAIN}							//Crearing the enumerations, the collectons of sets
	
public class testingclass {
	public static void main(String[ ] args) {				   //Declaring method, without instancing

	Rank a = Rank.SOLDIER;									   // "a" variable type is enum Rank and by Rank.Soldier a value can be assigned
	switch(a) {case SOLDIER:System.out.println("Soldier says hi!");break;
	  case SERGEANT:System.out.println("Sergeant says Hello!");break;
	  case CAPTAIN:System.out.println("Captain says Welcome!");break;
	          }
	System.out.println(a);										//Getting the assigned value of "SOLDIER".
}

}

<<<<Udemy - Lecture 30 Challange Methods with parameters.>>>>

public class testingclass {
	public static void main(String[ ] args) {				   //Declaring method, without instancing
		
	displayHighScorePosition("Pityu1",1500);
	displayHighScorePosition("Pityu2",900);
	displayHighScorePosition("Pityu3",400);
	displayHighScorePosition("Pityu4",50);
		
}
public static void displayHighScorePosition(String player,int score){				//Will call the calculate.. method, and display the results.
	int scorevalue = calculateHighScorePositon(score);
	System.out.println(player + "managed to get into a position  "+ scorevalue + "  on the high score talbe with their "+ score );

}
public static int calculateHighScorePositon(int scorevalue){				//it is a method in the class, which calculates the positon of the player, based in the score parameter
	if (scorevalue >100){
		return 1;
	}else if(scorevalue>500 && scorevalue <1000 ){
		return 2;
	}else if(scorevalue>100 && scorevalue <500){
		return 3;
	}else{
		return 4;
	}
}
}

<<<<Udemy - Lecture 31 Challange Overload methods>>>>
public class testingclass {
	public static void main(String[ ] args) {				   //Declaring a method, which convert feet,inch to centimeters
		double result1;										   //Overload a method by providing possibilities to include different parameters
		double result2;
		
		result1 = calcFeetAndInchesToCentimeters(1,-1);
		result2 = calcFeetAndInchesToCentimeters(-1);
		System.out.println(result1);
		System.out.println(result2);
	}
	
public static double calcFeetAndInchesToCentimeters(double feet,double inch){				//Will call the calculate.. method, and display the results.
		if (feet<0||inch <0 ||inch >12){
			return -1;			
		}
		else{
			return inch*2.54 + feet*12*2.54;
		}	
}
public static double calcFeetAndInchesToCentimeters(int inch){				//Will call the calculate.. method, and display the results.
	if (inch <0 ){
		return -1;			
	}
	else{
		return inch*2.54;
	}	
}
}


<<<<Udemy - Lecture 35 Do While>

	  public static void main(String[]args){
			int startx = 1;
			int endx = 25;
			while(startx <= endx){
				if(IsevenNumber(startx)==false){
					startx++;
					continue;
				}
				System.out.println("This is an Even Number  " + startx);
				    startx++;
			    }
	  }
	 public static boolean  IsevenNumber(int x){							//
		 if (x % 2 == 0){ 
			 return true;
			}else{
			 return false;	
			} 
	 }
	}
 * 
<<<<Udemy - Lecture 37 Class>>>  // It is using the BankAccounts class, ENCAPSULATION,PRIVATE METHODS,VALIDATION

 *public class udemychallanges {
	public static void main (String[]args){
		//Creating new instaces of the BankAccountclass
		BankAccounts customer1 = new BankAccounts();
		BankAccounts customer2 = new BankAccounts();
		
		//Assigning values to the customer1
		customer1.setCustomer_name("Isti1");
		customer1.setaccount_number(10000);
		customer1.deposit_funds(1000);
		customer1.deposit_funds(100);
		customer1.withdraw_funds(100);
		
		//Assigning values to the customer2
		customer2.setCustomer_name("Isti2");
		customer2.setaccount_number(20000);
		customer2.deposit_funds(1000);
		customer2.deposit_funds(1000);
		customer2.withdraw_funds(140);
		
		//Print out the data
		System.out.println("The following Customer   " + customer1.getCustomer_name() + "  has the balance of " + customer1.deposit_funds(0) );
		System.out.println("The following Customer   " + customer2.getCustomer_name() + "  has the balance of " + customer2.deposit_funds(0) );
	}
}
 * 
 */
