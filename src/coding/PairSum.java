package coding;

import java.util.HashSet;
import java.util.Set;

public class PairSum {
	public static void main(String[] args) {
        int[] arr = {2, 4, 3, 7, 5, 1};
        int target = 8;

        Set<Integer> seen = new HashSet<>();

        for (int num : arr) {
            int complement = target - num;

            if (seen.contains(complement)) {
                System.out.println("Pair: (" + complement + ", " + num + ")");
            }
            seen.add(num); // Mark this number as seen
        }
    }
}
