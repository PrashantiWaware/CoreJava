package EighteenAprilPattern;

import java.util.Scanner;

public class A2 {

	public static void main(String[] args) {
		int arr[]=new int[5];
		Scanner sc=new Scanner(System.in);
		
		
		System.out.println("Enter Array Element>>");
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
			System.out.println(arr[i]);
		}
		System.out.println("Array Elements are>>");
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}

}
