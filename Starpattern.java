package gani.assignments;

import java.util.Scanner;

public class Starpattern {

	public static void main(String[] args) {
		// print star pattern 
		int n;
		System.out.print("enter height of the pattern :");
		Scanner sc=new Scanner (System.in);
		n=sc.nextInt();
		for (int i=0;i<n;i++) {
			for (int j=0;j<=i;j++) {
				System.out.print("* ");
			}System.out.println();
		}
		sc.close();

	}

}
