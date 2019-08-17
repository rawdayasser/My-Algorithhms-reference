package sorting;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	private static Scanner input = new Scanner(System.in);
	private static Sorting sortAlgorithm;
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		int selection, siz;
		System.out.println("Please Enter the size of the List to be Sorted...");
		siz = input.nextInt();
		System.out.println("Now, Please Enter the List");
		for (int i = 0; i < siz; i++) {
			int num = input.nextInt();
			list.add(num);
		}
		do {
			displayMenu();
			selection  = input.nextInt();
			if (selection == 1) {
				sortAlgorithm = new InsertionSort(list);
				sortAlgorithm.sort();
				displaySortingInfo(list);
			}
		} while(selection != -1);
		System.out.println("Thank You for using the app :-)");
		
	}
	public static void displayMenu() {
		System.out.println("Please choose a Sorting Algorithms:\n"
				+ "1- Insertion Sort"
				+ "press -1 to quit");
	}
	public static void displaySortingInfo(List<Integer> list) {
		System.out.println("Sorted Array :");
		for (Integer n : list) {
			System.out.print(n + " ");
		}
		System.out.println("Execution Time : " + sortAlgorithm.getExecTimeInMillis() + " ms\n"
				+ sortAlgorithm.getExecTimeInMillis() / 1000 + " seconds");
	}

}
