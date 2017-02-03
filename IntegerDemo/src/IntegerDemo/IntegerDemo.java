/**
 * 
 */
package IntegerDemo;
import java.util.Scanner;
/**
 * @author RA316282
 *
 */
public class IntegerDemo {
	static int anInt = 1234;
	static int aByte = 12;
	static short aShort = 12345;
	static long along = 12345678987654321L;
	static int anotherInt;
	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		int anInt;
		byte aByte;
		short aShort;
		long along;
		double anotherInt;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Please enter an Integer >>>");
		anInt = input.nextInt();
		
		System.out.print("Please enter a Byte >>>");
		aByte = input.nextByte();
		
		System.out.print("Please enter a Short >>>");
		aShort = input.nextShort();
		
		System.out.print("Please enter a long >>>");
		along = input.nextlong();
		
		System.out.print("Please enter a double >>>");
		anotherInt = intput.nextdouble();
		
		
		System.out.println("The int is " + anInt);
		System.out.println("The byte is " + aByte);
		System.out.println("The short is " + aShort);
		System.out.println("The long is " + along);
		System.out.println("Another int is " + anotherInt);

	}

}
