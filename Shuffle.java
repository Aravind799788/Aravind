package cloudVandana;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.*;

public class Shuffle {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of the array");
		int size=sc.nextInt();
		Integer[] array=new Integer[size];
		
		for(int i=0;i<array.length;i++) {
			System.out.println("enter the number");
			array[i]=sc.nextInt();
		}

		ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
		Collections.shuffle(list);
		System.out.println("Shuffled array: " + list);
	}

}
