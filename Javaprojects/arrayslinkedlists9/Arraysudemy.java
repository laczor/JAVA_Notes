package arrayslinkedlists9;
import java.util.Scanner;    										//Input, scanner package has to be called/imported.


///Udemy challange 54.
public class Arraysudemy {
	 
	private static Scanner scanner = new Scanner(System.in);		//New instance of the built in inputmethod has to be called.
    
 //Main sub
	public static void main(String[]args){
		int[] array1 = getingeters(5);
		sortingarray(array1);
		printarray(array1);
		
}
///Get the inputintegers.
/*
 So we are making the array + 1 bigger, so we can use the last array position as a variable.
 */
	public static int[] getingeters(int number){					//Result of the method will be an array
		System.out.println("Please enter " + number +" of integers.");
		int[] numarray = new int[number+1];							//instancing the new array
		for (int i=0; i<numarray.length-1; i++){						//For + using array.lenght 
			numarray[i] = scanner.nextInt ();						//this is where the data has been inputted.
		}
		return numarray;
	}
//Print out the inputarray.	

/*
 Important to length -1 since the last element of the array is a switching variable.
 */
	public static void printarray(int[]inputarray){
		System.out.println("Please find below the input integers in descending order.");
		for(int i=0;i<inputarray.length-1;i++ ){
		 System.out.println(inputarray[i]);	
		}
	}
//Sort the original array, using bubble sort.	
/*
 i looping is the outer looping, determine the biggest value, then the
 y is the second loop. if array[y-1] is smaller than the array[y], then they swtich places using the last element of the array lenght-1 as a temporary variable. 
 */
	public static int[] sortingarray(int[]sortarray){
		
	for(int i=0; i<sortarray.length-1;i++){					//Since arraynumbering start from 0. we have to -1 from the total length of the array.
		//System.out.println( "i = "+ i);
		for(int y=1; y<=sortarray.length-i-1;y++){			//length -1 -i = -1 since the numbering starts from 0./ i= 
		//System.out.println("y = "+ y);
			if(sortarray[y]>sortarray[y-1]){				//sortarray[sortarray.length-1] is my temporary variable to store the values.
				sortarray[sortarray.length-1] = sortarray[y-1];
				sortarray[y-1] = sortarray[y];
				sortarray[y] = sortarray[sortarray.length-1];
			}
		}
	}
	return sortarray;	
	}
		
}
	
	
