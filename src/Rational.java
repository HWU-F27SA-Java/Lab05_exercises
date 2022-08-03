import java.util.Random;
import java.util.Scanner;

public class Rational {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("How many Fractions you want to work with? ");
		int number = input.nextInt();

		//ask user for the desired operation, create fractions and evaluate operation
		
		//close Scanner
		input.close();

	}

	public static Fraction randomFraction(int numMax, int denMax) {
		//create a random Fraction where numero is between 0 and numMax and 
		// denominator between 2 and denMax+1
		Random r = new Random();
		int p = r.nextInt(numMax);
		int q = 2 + r.nextInt(denMax);
		return new Fraction(p, q);
	}

	public static void display(Fraction f1, Character op, Fraction f2, Fraction res) {
		//print fractions, operation and result
		//note the in-boxing of the char to become Character
		
		System.out.println(f1 + op.toString() + f2 + " = " + (res==null?"Infinity":res));
	}

}
