import java.util.HashMap;

public class CountSetsWithDivision {

    public static int countSets(int[] arr, int sum) {
        HashMap<String, Integer> memo = new HashMap<>();
        return countSetsHelper(arr, 0, sum, memo);
    }

    private static int countSetsHelper(int[] arr, int index, int sum, HashMap<String, Integer> memo) {
        if (sum == 0) {
            return 1;
        }
        if (index >= arr.length || sum < 0) {
            return 0;
        }
        String key = index + "," + sum;
        if (memo.containsKey(key)) {
            return memo.get(key);
        }

        int include = countSetsHelper(arr, index + 1, sum / arr[index], memo);
        int exclude = countSetsHelper(arr, index + 1, sum, memo);

        int total = include + exclude;
        memo.put(key, total);
        return total;
    }

    public static void main(String[] args) {
        int[] arr = {2, 4, 6};
        int sum = 12;
        System.out.println("Number of sets with division equal to " + sum + ": " + countSets(arr, sum));
    }
}
