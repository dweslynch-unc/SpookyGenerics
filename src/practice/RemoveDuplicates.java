package practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicates {
	public static void main(String[] args) {
		// You can hit run at the top to test your code using the checker!
		Checker();
	}

	public static ArrayList<Integer> removeDuplicates(ArrayList<Integer> removeDups) {
		Set<Integer> set = new HashSet<>();
		
		for (int i : removeDups)
		{
		    set.add(i);
		}
		
		ArrayList<Integer> lst = new ArrayList<>();
		
		for (int i : set)
		{
		    lst.add(i);
		}

		return lst;
	}

	public static void Checker() {
		ArrayList<Integer> test1 = new ArrayList<Integer>(Arrays.asList(1, 1, 2));
		ArrayList<Integer> output1 = new ArrayList<Integer>(Arrays.asList(1, 2));

		if (deepCheck(output1, removeDuplicates(test1))) {
			System.out.println("Expected output matched actual output!");
		} else {
			System.out.println("Expected output not the same as actual output");
		}

		test1 = new ArrayList<Integer>(Arrays.asList(1, 1, 2, 3, 4, 5, 4, 2, 4, 3, 2, 3));
		output1 = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5));

		if (deepCheck(output1, removeDuplicates(test1))) {
			System.out.println("Expected output matched actual output!");
		} else {
			System.out.println("Expected output not the same as actual output");
		}

		test1 = new ArrayList<Integer>(Arrays.asList(2, 3, 5, 7, 8, 9, 9, 0, 9, 0));
		output1 = new ArrayList<Integer>(Arrays.asList(0, 2, 3, 5, 7, 8, 9));

		if (deepCheck(output1, removeDuplicates(test1))) {
			System.out.println("Expected output matched actual output!");
		} else {
			System.out.println("Expected output not the same as actual output");
		}
	}

	public static boolean deepCheck(ArrayList<Integer> a, ArrayList<Integer> b) {
		if (a.size() != b.size()) {
			return false;
		} else {
			for (int i = 0; i < a.size(); i++) {
				if (a.get(i) != b.get(i)) {
					return false;
				}
			}
		}
		return true;
	}
}
