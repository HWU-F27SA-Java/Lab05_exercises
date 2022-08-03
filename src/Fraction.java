/*
 * This class implements simple arithmetic operations on Fractions
 * It implement various fundamental concepts of object programming 
 * including: constructors, private access, getters, setters, encapsulation
 */

/**
 *
 * @author Hadj Batatia
 */
public class Fraction {
	// the private property prevents other classes to read or write attributes
	// directly
	// they need to go through getter and setter methods for each attribute provided
	// public by this class
	// this way of programming enforces the principle of encapsulation which is
	// fundamental to object programming
	private int n; // numerator
	private int d; // denominator

	public Fraction() {
		// setting default fraction to be 0/1
		this(0, 1);
	}

	public Fraction(int n) {
		// considering the degenerate case of fraction simplifying to an integer
		this(n, 1);

	}

	public Fraction(int n, int d) {
		// we do not check if denominator is zero. This will be done later with
		// exceptions
		this.n = n;
		this.d = d;
	}

	public int getD() {
		// return denominator
		return d;
	}

	public void setD(int d) {
		// set the denominator
		this.d = d;
	}

	public int getN() {
		// get numerator
		return n;
	}

	public void setN(int n) {
		// set the denominator
		this.n = n;
	}

	@Override
	public String toString() {
		// return a string representation of the fraction
		return "(" + this.n + "/" + this.d + ")";
	}

	private Fraction minus() {
		// return -f (invert the sign)
		return new Fraction(-this.n, this.d);
	}

	private Fraction invert() {
		// return d/n 
		return new Fraction(this.d, this.n);
	}

	public Fraction add(Fraction f) {
		/*
		 * this method adds the current fraction with the Fraction f //it does this by
		 * calculating the numerator and denominator of the result creates a new
		 * Fraction with the result and returns the reference to the new Fraction
		 */

		// calculate numerator for the addition

		// calculate denominator for the addition

		// create the new Fraction with the result
		Fraction r = null;
		// return the reference to the new Fraction
		return r;
	}

	public Fraction sub(Fraction f) {
		/*
		 * this method subtracts the Fraction f from the current fraction we do this
		 * operation by adding this to the inverse of f
		 */
		Fraction r = null;

		return r;
	}

	public Fraction mul(Fraction f) {
		/*
		 * this method multiplies the Fraction f by the current fraction it does this by
		 * calculating the numerator and denominator of the result creates a new
		 * Fraction with the result and returns the reference to the new Fraction
		 */


		// calculate numerator

		// calculate denominator

		// create fraction with the result
		Fraction r = null;
		// return the reference to the new fraction
		return r;
	}

	public Fraction div(Fraction f) {
		/*
		 * this method divides the current fraction by f before doing the operation if
		 * checks if the numerator of f is zero. In that case it return null as the
		 * division by zero is not possible
		 */

		if (f.getN() == 0) {
			return null;
		}
		//this division is simply the multiplication by the inverted fraction
		Fraction r = null;
		
		return r;
	}

	private static int gcd(int p, int q) {
		/*
		 * finds the GCD of two integers using a recursive algorithm
		 * this method is static because it does not use any of the attributes or methods
		 * of this (current) object
		 */
		if (p == q)
			return p;
		if (q == 0)
			return p;
		return gcd(q, p % q);
	}

	public Fraction simplify() {
		/*
		 * this method simplifies the current fraction 
		 * by dividing numerator and denominator by their GCD
		 */

		Fraction r = null;
		return r;
	}
}
