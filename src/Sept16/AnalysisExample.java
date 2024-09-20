package Sept16;

/**
 * Example to show growth in various shapes
 */

public class AnalysisExample {

	public static void main(String[] args) {
		AnalysisExample ex = new AnalysisExample();

//		ex.printConstant(10);
//		ex.printConstant(100);
//		ex.printLinear(10);
//		ex.printLinear(100);
//		ex.printQuadratic(10);
//		ex.printQuadratic(100);
//		ex.printCubic(10);
//		ex.printCubic(100);
//		ex.printLog(10);
//		ex.printLog(100);
//		ex.printNLog(10);
//		ex.printNLog(100);
		
		for (int i=3; i<20; i++) {
			System.out.println(ex.fib(i));
		}
		
		for (int i=3; i<20; i++) {
			System.out.println(ex.fibLinear(i));
		}
	}

	/**
	 * Exponential version
	 * @param n
	 * @return
	 */
	public long fib(int n) {
		if (n < 1) {  // The bigger of O(1) or O(1) == O(1)
			return -1;  // maybe instead throw exception...
		} else if (n == 1 || n == 2) {
			return 1;
		} 
			
		return fib(n-1) + fib(n-2);
	}
	
	public long fibLinear(int n) {
		if (n <= 2)
			return -1;
		long[] fibs = new long[n];
		fibs[0] = 1;
		fibs[1] = 1;
		for (int i= 2; i<n; i++) {
			fibs[i] = fibs[i-1] + fibs[i-2];
		}
		return fibs[n-1];
	}
	
	/**
	 * O(n lg n) // aka O(n) * O(lg n)
	 * 
	 * @param n
	 */
	private void printNLog(int n) {
		int count = 0;

		for (int j = 0; j < n; j++) {
			for (int i = n; i > 0; i /= 2) {
				count += 1;
			}
		}

		System.out.println(count);
	}

	/**
	 * O(lg n)
	 * 
	 * @param n
	 */
	private void printLog(int n) {
		int count = 0;

		for (int i = n; i > 0; i /= 2) {
			count += 1;
		}

		System.out.println(count);
	}

	/**
	 * O(n^3) // aka O(n) * O(n) * O(n)
	 * 
	 * @param n
	 */
	private void printCubic(int n) {
		int count = 0;

		for (int i = 0; i < n; i++)
			for (int j = 0; j < n; j++)
				for (int k = 0; k < n; k++)
					count += 1;

		System.out.println(count);
	}

	/**
	 * O(n^2) // aka O(n) * O(n)
	 * 
	 * @param n
	 */
	private void printQuadratic(int n) {
		int count = 0;

		for (int i = 0; i < n; i++)
			for (int j = 0; j < n; j++)
				count += 1;

		System.out.println(count);
	}

	/**
	 * O(1)
	 * 
	 * @param n
	 */
	private void printConstant(int n) {
		int count = 0; // O(1)

		System.out.println(count);
	}

	/**
	 * O(n)
	 * 
	 * @param n
	 */
	private void printLinear(int n) {
		int count = 0; // O(1)

		for (int i = 0; i < n; i++) { // O(n) <-- O(n) * O(1)
			count += 1; // O(1)
		}

		System.out.println(count); // O(1)
	}

}
