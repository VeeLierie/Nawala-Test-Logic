package Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Soal4 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int n = s.nextInt();
		
		int counter = 1000;
		boolean batas = true;
		int ncounter = 0;
		
		while(batas==true) {
			if(isLucky(counter)) {
				System.out.println(counter+" is lucky Nine? Number");
				ncounter++;
			}
			if(ncounter==n)
				break;
			
			counter++;
		}
	}

	static boolean isLucky (int i) {
		int sumOfPow = 0;
		for (int j = 0; j < digits(i).size(); j++) {
			sumOfPow+=Math.pow(digits(i).get(j), 2);
		}
		if(sumOfPow==9) {
			return true;
		}
		else if (sumOfPow<9) {
			return false;
		}else {
			return isLucky (sumOfPow) == true? true:false;
		}
	}
	
	static List<Integer> digits(int i) {
	    List<Integer> digits = new ArrayList<Integer>();
	    while(i > 0) {
	        digits.add(i % 10);
	        i /= 10;
	    }
	    return digits;
	}
}
