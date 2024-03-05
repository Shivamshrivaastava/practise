import java.util.HashSet;
import java.util.Set;

class FindDuplicates {

    public static void findDuplicates(int[] arr) {
        Set<Integer> seen = new HashSet<>();
        Set<Integer> duplicates = new HashSet<>();

        for (int num : arr) {
            if (!seen.add(num)) { // If the element is already in the set, it's a duplicate
                duplicates.add(num);
            }
        }

        // Print duplicates
        if (!duplicates.isEmpty()) {
            System.out.println("Duplicates found: " + duplicates);
        } else {
            System.out.println("No duplicates found");
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 2, 3, 6, 7, 8, 1, 8, 2, 3,};
        findDuplicates(arr);
    }
}
