package Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Soal1 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int n = s.nextInt();
		List<Integer> listGenap = new ArrayList<>();
		List<Integer> listGanjil = new ArrayList<>();
		
		for (int i = 100; i > (100-n); i--) {
			if(isGenap(i))
				listGenap.add(i);
			else
				listGanjil.add(i);
		}
		
		for (int i = 0; i < listGenap.size(); i++) {
			System.out.print(listGenap.get(i)+" ");
		}
		
		System.out.println();
		
		for (int i = 0; i < listGanjil.size(); i++) {
			System.out.print(listGanjil.get(i)+" ");
		}
	}

	public static boolean isGenap(int n) {
		if (n % 2 == 0) {
			return true;
		} else {
			return false;
		}
	}

}
