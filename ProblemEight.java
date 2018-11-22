package HackerRank;

import java.util.TreeSet;

public class ProblemEight {

	public static void main(String[] args) {
		int [] A = new int[]{2, -4, 0, -3, 9};
		TreeSet<Integer> ts = new TreeSet<Integer>();
		for (int i = 0; i < A.length; i++) {
			int sum = A[i];
			ts.add(Math.abs(sum));
			for (int j = i + 1 ; j < A.length; j++) {			
				sum += A[j];
				System.out.println(sum);
				ts.add(Math.abs(sum));
				System.out.println(ts);
			}
		}
		System.out.println(ts.first());
	}
}


