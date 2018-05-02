package LearningFramework;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class JavaMasterClass {

	public static void main(String[] args) {

		// variables();
		// floatAndDouble();
		// randOne();
		// charAndBoolean();
		// string();
		operators();

	}

	public static void variables() {

		// int has a width of 32
		int myMinValue = -2_147_482_648;
		int myMaxValue = 2_147_482_648;
		// byte has a width of 8
		byte myByteValue = -128;
		byte myNewByteValue = (byte) (myByteValue / 2);
		System.out.println(myNewByteValue);
		// short has width of 16
		short myShortValue = 32767;
		// long has a width of 64
		long myLongvalue = 999999999999999999L;

		byte b1 = 10;
		short s1 = 100;
		int i1 = 2;
		long l1 = 50000L + 10L * (b1 + s1 + i1);
		short s2 = (short) (1000 + 10 * (b1 + s1 + i1));
		System.out.println(l1 + "   " + s2);
	}

	public static void floatAndDouble() {
		// width of int = 32 (4 bytes)
		int i1 = 5 / 3;
		// width of float = 32 (4 bytes)
		float f1 = 5f / 3f;
		// width of double = 64 (8 bytes)
		double d1 = 5d / 3d;

		System.out.println("int: " + i1);
		System.out.println("float: " + f1);
		System.out.println("double: " + d1);

		double pounds = 10;
		double poundstokilos = 0.45359237;
		double kilos;

		kilos = pounds * poundstokilos;
		System.out.println("Kilos: " + kilos);

		double pi = 3.141_592_7;
	}

	public static void randOne() {

		double n = 0;

		for (int i = 0; i <= 10; i++) {

			n = (Math.random() * 100);
			System.out.println("Loop #" + i + " value is: " + round(n, 2));

			if (i == 10) {

				System.out.println("Finished loop #" + i);
			}
		}
	}

	public static double round(double value, int places) {

		if (places < 0)
			throw new IllegalArgumentException();

		BigDecimal bd = new BigDecimal(value);
		bd = bd.setScale(places, RoundingMode.HALF_UP);
		return bd.doubleValue();

	}

	public static void charAndBoolean() {

		char c1 = 'A';
		// unicode
		char c2 = '\u00A9';
		System.out.println(c2);

		boolean b1 = true;

		char c3 = '\u00AE';
		System.out.println(c3);

	}

	public static void string() {

		String s1 = "stuff";

		String s2 = "More \u00A9 " + s1;
		System.out.println(s2);

		String s3 = "10";
		int i1 = 100;
		System.out.println(s3 + i1);
	}

	public static void operators() {

		int result = 1 + 2;
		result = result - 1; // 2
		result = result * 10; // 20
		result = result / 5; // 4
		result = result % 3; // 1 (% = divide and return remainder)
		result++; // 2
		result--; // 1
		result += 2; // 3 (add by #)
		result -= 1; // 2 (subtract by #)
		result *= 2; // 4 (multiply by #)
		result /= 2; // 2 (divide by #)

		System.out.println(result);

		// == != <= >= < > &&
		boolean b1 = false;
		if (b1 == false) // == equals ('=' is an assignment)
			System.out.println("It is false");

		int i1 = 99;
		if (i1 != 100)
			System.out.println("not 100");

		int i2 = 60; // && ('and' operator)
		if (i1 > i2 && i2 < 100)
			System.out.println("Greater than i2 and less then 100");

		if (i1 < 90 || i2 < 90) // || ('or' operator)
			System.out.println("One is true");

		boolean i3 = false;
		if (i3 = true) // assigning i3 to true (should use ==)
			System.out.println("this prints because");
		if (i3)
			System.out.println("If its true you will see");
		boolean i4 = i3 ? true : false;
		System.out.println(i4);

		double d1 = 20;
		double d2 = 80;
		double remainder = ((d1 + d2) * 25) % 40;
		System.out.println("Remainder is: " + remainder);
		if (remainder <= 20)
			System.out.println("Total over the limit");

	}

}
