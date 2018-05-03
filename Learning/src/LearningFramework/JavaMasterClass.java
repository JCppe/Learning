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
		// operators();
		//statementsWhitespaceAndIndenting();
		//codeBlocks();
		methods();

	}

	@SuppressWarnings("unused")
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

	@SuppressWarnings("unused")
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

	@SuppressWarnings("unused")
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

	@SuppressWarnings("unused")
	public static void statementsWhitespaceAndIndenting() {

		int                myVariable 
			= 
			50;
		
		System.out.println("This line is a statement");

		System.out.println("These" + "lines" + "are also" + "a statement");

		int anotherVar = 5; anotherVar++; System.out.println("another one");
		
	}

	public static void codeBlocks() {
		
		boolean gameOver = true;
		int score = 800;
		int levelCompleted = 5;
		int bonus = 100;
		
		if (score == 4000)
			System.out.println("Your score was 5000");
			System.out.println("Not part of if");
			
		if (score < 5000 && score > 1000) {
			System.out.println("First if");
		} else if (score < 1000) { 
			System.out.println("else if");
		}else {
			System.out.println("Else");
		}
		
		if (gameOver == true) { // (gameOver) = (gameOver == true)
			int finalScore = score+ (levelCompleted * bonus);
			System.out.println("Your final score was " + finalScore);
			
		}
		
		// cannot use variable inside code block from outside
		//int savedFinalScore = finalScore;
		
		score = 10000;
		levelCompleted = 8;
		bonus = 200;
		
		if (gameOver) {
			int finalScore = score + (levelCompleted * bonus);
			System.out.println("Your final score was " + finalScore);
		}
		
		
		
		
		
	}

	public static void methods() {
		
		boolean gameOver = true;
		int score = 800;
		int levelCompleted = 5;
		int bonus = 100;
		                          //arguments
		int highScore = calculateScore(gameOver, score, levelCompleted, bonus);
		System.out.println(highScore);
		
		score = 10000;
		levelCompleted = 8;
		bonus = 200;
		
		highScore = calculateScore(gameOver, score, levelCompleted, bonus);
		System.out.println(highScore);
		
		//or
		highScore = calculateScore(true, 800, 5, 100);
		System.out.println(highScore);
		
		//challenge
		highScore = 1000;
		String playerName = "John";
		int position = calculatehighScorePosition(highScore);
		displayHighScorePosition(playerName, highScore, position);
		
	}
	                                                     //parameters
	public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {
		
		if (gameOver) {
			int finalScore = score + (levelCompleted * bonus);
			//System.out.println("Your final score was " + finalScore);
			return finalScore;
		}
		
		// once the first return is executed the method is terminated
		// -1 is the convention for indicating an error or value not found
		return -1;
		
	}
	
	public static void displayHighScorePosition(String playerName, int highScore, int position) {
	
		System.out.println(playerName + "'s high score is: " + highScore + "\nAnd is in position: " + position);
		
	}
	
	public static int calculatehighScorePosition(int highScore) {
		
		if (highScore >= 1000) {
			return 1;
		} else if (highScore >= 500) {
			return 2;
		} else if( highScore >= 100) {
			return 3;
		} else {
			return 4;
		}
		// or you can put last return here instead of in last else
		//return 4;
		
	}
	
	
}
