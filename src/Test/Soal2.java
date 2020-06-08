package Test;

import java.util.Scanner;

public class Soal2 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int n = s.nextInt();
		String [] arr = {"This", "is", "the", "words"};   
		
		for (int j = 0; j < n; j++) {
		  String a = arr[0];
		  int i;
			
		for (i = 0; i < arr.length - 1; i++)
			arr[i] = arr[i + 1];
			arr[i] = a;
		}
		
		for(int i = 0; i< arr.length; i++){
		System.out.print(arr[i] + " "); 
		}
	}
}

