/*
 * File: BlankClass.java
 * ---------------------
 * This class is a blank one that you can change at will. Remember, if you change
 * the class name, you'll need to change the filename so that it matches.
 * Then you can extend GraphicsProgram, ConsoleProgram, or DialogProgram as you like.
 */


import acm.program.*;



public class Fibonacci extends ConsoleProgram {
	private static final int MaxResult = 10000;
	public void run() {
		/* You fill this in */
		boolean check = false;
		int fibPlace = 1;
		int fibPlace2=0;
		println("Hello please insert an integer");

		do {
		int start = readInt();

			
			if(start > MaxResult) {
				println("Please use a number less than "+MaxResult);
			}

			
			else {
				check = true;
				while(start<MaxResult) {
					println(start);
					fibPlace2 =start;
					fibPlace = fibPlace + fibPlace2;
					start = fibPlace;
					fibPlace = fibPlace2;
					
					
				}
			}
		}


		while(check == false);
	}
}

