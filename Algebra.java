// Implements algebraic operations and the square root function without using 
// the Java operations a + b, a - b, a * b, a / b, a % b, and without calling 
// Math.sqrt. All the functions in this class operate on int values and
// return int values.

public class Algebra {
	public static void main(String args[]) {
	    // Tests some of the operations
	    System.out.println(plus(2,3));   // 2 + 3
	    System.out.println(minus(7,2));  // 7 - 2
   		System.out.println(minus(2,7));  // 2 - 7
 		System.out.println(times(3,4));  // 3 * 4
   		System.out.println(plus(2,times(4,2)));  // 2 + 4 * 2
   		System.out.println(pow(5,3));      // 5^3
   		System.out.println(pow(3,5));      // 3^5
   		System.out.println(div(12,3));   // 12 / 3    
   		System.out.println(div(5,5));    // 5 / 5  
   		System.out.println(div(25,7));   // 25 / 7
   		System.out.println(mod(25,7));   // 25 % 7
   		System.out.println(mod(120,6));  // 120 % 6    
   		System.out.println(sqrt(36));
		System.out.println(sqrt(263169));
   		System.out.println(sqrt(76123));
	}  

	// Returns x1 + x2
	public static int plus(int x1, int x2) {
		// Replace the following statement with your code
		int result = x1;
		int counter = x2;
		 while (counter != 0) {
				 if (counter > 0) {
		     	result ++;
		    	 counter --;
				 }
				  else {
		  	   result --;
		  	   counter ++;
				 }
		 }



		return result;

	}
	
	// Returns x1 - x2
	public static int minus(int x1, int x2) {
		// Replace the following statement with your code
		int result = x1;
		int counter = x2;
		 while (counter != 0) {
				 if (counter > 0) {
		     	result --;
		    	 counter --;
				 }
				  else {
		  	   result ++;
		  	   counter ++;
				 }
		 }



		return result;
	}

	// Returns x1 * x2
	public static int times(int x1, int x2) {
		// Replace the following statement with your code
		int result = 0;
		int counter = x2;
		 while (counter != 0) {
				 if (counter > 0) {
		     	result = plus(result, x1);
		    	 counter --;
				 }
				  else {
		  	   result = minus(result, x1);
		  	   counter ++;
				 }
		 }





		return result;
	}

	// Returns x^n (for n >= 0)
	public static int pow(int x, int n) {
		// Replace the following statement with your code
		int result = 1;
		int counter = n;

			if (counter == 0) {
				return 1;
			}
			if (counter < 0) {
				return 0;
			}

		 while (counter > 0) {
		     	result = times(result, x);
		    	 counter --;
		 }
				 
		 




		return result;
	}

	// Returns the integer part of x1 / x2 
	public static int div(int x1, int x2) {
		// Replace the following statement with your code

		if (x1 == 0) {
			return 0; 
			}
		if (x2 == 0) {
			return 0; 
			}

		boolean isNegative = (x1 < 0) != (x2 < 0);

		int remainder = x1;
		int divisor = x2;
		int counter = 0;

		if (remainder < 0) {
        remainder = minus(0, remainder);
		}
		if (divisor < 0) {
         divisor = minus(0, divisor);
		}



		 while ( remainder >= divisor ) {
		  	   remainder = minus(remainder, divisor);
		  	   counter ++;
				 }

			if (isNegative) { return minus(0, counter);
			}

			return counter;


		 }





		
	

	// Returns x1 % x2
	public static int mod(int x1, int x2) {
		// Replace the following statement with your code

		int q = div(x1, x2);
		int p = times(q, x2);
		int r = minus(x1, p);



		return r;
	}	

	// Returns the integer part of sqrt(x) 
	public static int sqrt(int x) {
		// Replace the following statement with your code
		if (x < 0) {
			return 0; 
			}

		int i = 0;
		while (times(i, i) <= x) {
			i++;
			
		}




		return minus(i, 1);
	}	  	  

}
