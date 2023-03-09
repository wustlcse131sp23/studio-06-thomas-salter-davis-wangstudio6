package studio6;

import edu.princeton.cs.introcs.StdDraw;

public class RecursiveMethods {

	/**
	 * Computes the geometric sum for the first n terms in the series
	 * 
	 * @param n the number of terms to include in the sum
	 * @return the sum of the first n terms of the geometric series (1/2 + 1/4 + 1/8
	 *         ...)
	 */
	public static double geometricSum(int n) {
		
		double sum = 0.0;
		if (n == 0) {
			return 0;
		}
		else if(n == 1) {
			return 0.5;
		}
		else {
			return geometricSum(n - 1) + Math.pow(0.5, n);
			
		}
		
	}

	/**
	 * This method uses recursion to compute the greatest common divisor
	 * for the two input values
	 * 
	 * @param p first operand
	 * @param q second operand
	 * @return greatest common divisor of p and q
	 */
	public static int gcd(int p, int q) {
		
			if (p%q == 0) {
				return q;
			}
			else {
				int newP = q;
				int newQ = p%q;
				return gcd(newP, newQ);
			}
		
	}


	/**
	 * This method uses recursion to create a reverse of the given array
	 * 
	 * @param array the array to create a reverse of, not to be mutated
	 * @return an array with the same data as the input but it reverse order
	 */
	public static int[] toReversed(int[] array) {
		
		int [] reversedArray = new int [array.length];
		if (array.length == 0) {
			return new int [0];
		}
		else {
				
			return helper(0, array, reversedArray);
			}
		
	}
	public static int [] helper (int index, int [] array, int [] reversedArray) {
		if (index == array.length)
			return reversedArray;
		else {
			int mirroredIndex = (array.length - 1) - index;
		reversedArray[index] = array[mirroredIndex];
		return helper (index++, array, reversedArray);
	}
	}
	/**
	 * @param xCenter                       x-coordinate of the center of the circle
	 *                                      at the current depth
	 * @param yCenter                       y-coordinate of the center of the circle
	 *                                      at the current depth
	 * @param radius                        radius of the circle at the current
	 *                                      depth
	 * @param radiusMinimumDrawingThreshold radius above which drawing should occur
	 */
	public static void circlesUponCircles(double xCenter, double yCenter, double radius,
			double radiusMinimumDrawingThreshold) {
		
		// FIXME
	}

}
