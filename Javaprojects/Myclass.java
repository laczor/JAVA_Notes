//Class: Everything has to be in class
public class Myclass {
/* static: can be run without generating an instance of the class
 * Void: doesn't return any value
 * main: the name of the method
 */
	public static void main(String[]args){
/*The continue statement causes the loop to skip the remainder of its body and then immediately retest its condition prior to reiterating. In other words, it makes the loop skip to its next iteration.
  In summary, the continue will skip the actual loop, and retest the condition again. The 30 value will be skipped.
*/
		for(int x=10; x<=40; x=x+10) {if(x == 30) {continue;}
										  System.out.println(x);
									 }
	}
       }




/* 1.Simple if condition
public static void main(String[]args){
	int x = 100;							//If conditional statement
	if(x < 42){
			   System.out.println("Hello world");
	}else { 
			   System.out.println("Hello Duuude!");
	}
}
}
<<<<2.Nested If condition>>>>
public static void main(String[]args){
	int x = -1;							//Nested, conditional Statement.
	if(x > 0){
		     if(x>50){System.out.println("Bigger than 50");}
		     else{System.out.println("Bigger than 0 less then 50");}
	         }
	         else {System.out.println("Duude it is less then zero!");}
             }
}
<<<<3.Elseif statement>>>>
public static void main(String[]args){
	int age = 25;

	if(age <= 0) {System.out.println("Error");} 
	else if(age <= 16) {System.out.println("Too Young");}
	else if(age < 100) {System.out.println("Welcome!");}
	else {System.out.println("Really?");}
	//Outputs "Welcome!"
                                      }
}
<<<<4.Switch statement>>>>
public static void main(String[]args){
	int day = 10;

switch(day){case 1: System.out.println("Monday");break;
            case 2: System.out.println("Tuesday");break;
            case 3: case:4 System.out.println("Wednesday");break;				//The code will run until the next break;
            default: System.out.println("Weekday");}
           }
}

<<<<5.While statement>>>>
public static void main(String[]args){
	int day = 10;
	while(day>1){System.out.println("day" + day);day--;}
	System.out.println("day");
           }
}
<<<<6.For Loop>>>>
public static void main(String[]args){
	//for (initialization; condition; increment/decrement) {statement(s)}
	for(int x = 1; x <=5; x++) {
		  System.out.println(x);
		}
           }
}
// It is possible to use a multiplication as incrementor/decrementor
 * for (int i = 2; i < 10; i = i*i) {System.out.println(i);}
 
 <<<<6.For Loop>>>>
public static void main(String[]args){
			int x = 1;
			for(int x=10; x<=40; x=x+10) {if(x == 30) {continue;}
  										  System.out.println(x);
										 }
		}
           }
}
 <<<<6.2For Loop with continue>>>> ( how to skip 1 loop)
 public static void main(String[]args){
   The continue statement causes the loop to skip the remainder of its body and then immediately retest its condition prior to reiterating. In other words, it makes the loop skip to its next iteration.
   In summary, the continue will skip the actual loop, and retest the condition again. The 30 value will be skipped.

		for(int x=10; x<=40; x=x+10) {if(x == 30) {continue;}
										  System.out.println(x);
									 }
	}
       } 
 
 <<<<7.Do While loop>>>>(With break)
  public static void main(String[]args){
	int x = 1;

	while(x > 0) {System.out.println(x);		//Continously increase the x
				 if(x == 4) {break;}x++;		//When x's value will be 4 it will end the loop
				 }	

           }
}

 <<<<7.2 Do While loop>>>>
	  public static void main(String[]args){
			int x = 1;

			do { System.out.println(x);					//It will execute to code at least 1.
				x++;
			   }while(x !=6);							//it will execute the code, while it is not 6. when it will be 6, the while statement will be false, and won't be executed
		 }

 */




/*8<<<<<<Variables>>>>>>>>
 * String name ="David";				Text				Concatenate => string s = "Hello world" + "Hello again";
 * int = 42;							Integer
 * float = 2.1  						Floating Number	-  ( 7 digits)			
 * double = 16.9;						Number		-  ( 16 digits)
 * char group = "Z";					1 charachter	orusing unicodes for characters 	'\u2202'
 * Boolean = true;						True/False
 * 
 * String + unicode = srtring-->   "data" + '\u2202' = data'\u2202'
 * strintg + int = string	-->	   "100" + 10 = 10010  (converting it to string.)
  *
  * 
  8.2 <<<Type Casting>>>>   Assigning a value of one type to a variable of another type is known as Type Casting.
  
  		int a = (int) 3.14;			//Will convert the 3.14 float number to integer
		System.out.println(a);
		//Outputs 3	
  
  * */	

/*9<<<<<<<Operands>>>>>>>
 * int x = x+6;							Addition
 * int x = x-6;						    Subtraction
 * int x = 5*6;							Multiplication
 * int x = 7/6;	     = 1				Division (Int is rounding down the amounts)
 * double x = 7/6; 	 = 1.16				Division 
 * int x 23 % 6;      = 5				Modulo ( Remainder of the divison)
 */
 
/*10<<<<<<<Assigment Operands>>>>>>>
 * int x = x+6;		= int x + = 6;		Addition
 * int x = x-6;		= int x - = 6;	    Subtraction
 * int x = 5*6;		= int x * = 6;		Multiplication
 * int x = 7/6;	    = int x / = 6;				Division (Int is rounding down the amounts)
 * double x = 7/6; 	= 1.16				Division 
 * int x 23 % 6;    = 5	%=			Modulo ( Remainder of the divison)
 */

/*11<<<<<<<Pre/Post Increment-Decrement
 * Will increase the variable's value the run the operand
 * int x = 34;
 * int y = ++x; 		y = 35
 * Will increase the variable's value after the operand
 * int x = 34;
 * int y = x++; 		y = 34
 * */

/*12<<<<<Conditional operators>>>>>
< less than
> greater than
!= not equal to
== equal to 						//Will return, True if the condition is met.
<= less than or equal to
>= greater than or equal to

<<<Semantically Equal>>>Automatically generate hashcodes   (Source->Generate hashCode() and equals()...)
 * */

/*13<<<<<Logical Operators>>>>>
AND -- &&
if (age > 18 && money > 500) {System.out.println("Welcome!");}

OR  -- ||
if (age > 18 || money > 500) {System.out.println("Welcome!");}

EQUAL -- ==
if (age > 18 == money > 500) {System.out.println("Welcome!");}

NOT -- !
if(!(age > 18)) {System.out.println("Too Young");}
else {System.out.println("Welcome");}
 * */

