package Test;

import java.util.Scanner;

public class Soal3 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int n = s.nextInt();
		int counter = 0;
		for (int i = 10000; i > args.length; i--) {
			if(isPrime(i) && isPrime(reverse(i))) {
				System.out.println(i +" & " +reverse(i) +" is Match!");
				counter++;
			}
			if(counter == n) {
				break;
			}
			
		}
	}

	public static boolean isPrime(int n) {
		if (n <= 1) {
			return false;
		}
		for (int i = 2; i < n; i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}
	
	public static int reverse(int num) {
		int reversenum = 0;
		while (num != 0) {
			reversenum = reversenum * 10;
			reversenum = reversenum + num % 10;
			num = num / 10;
		}
		return reversenum;
	}

}
