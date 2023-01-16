import java.util.Scanner;

// 3. Design method to print factors of given number,
// ( Enter no = 6 then factors should be displayed like 1,2,3,6.



public class Question3 {
	
	
	public static void factors(int num) // create the static method for factors
	{
		int n = 1; // initialize the variable n 
		
		while (n<=num) // use the while loop till the condition remains the true
		{
			if (num % n == 0) // check the input number is divide by n or not for finding the factors
				
			{
				System.out.println(n); // printing the value of factor in each itiration
			}
			n++;
		}
		
	}
	
	

	public static void main(String[] args) {
		
		Scanner sd = new Scanner(System.in); // creating the object of scanner class
		
		System.out.println("Enter the Number you want to Factor : "); // printing statement
		
		
		int num = sd.nextInt();  // storing the value of user in result variable
		
		
		System.out.println("the Factors of Number : "+ num);
		
		factors(num); // calling the method 

	}

}
