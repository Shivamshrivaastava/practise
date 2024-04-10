import java.util.HashMap;
import java.util.Map;

 class DragRace {

    public static Map<Integer, Integer> findFrequencies(int[] array) {
        Map<Integer, Integer> frequencyMap = new HashMap<>();

        // Count frequencies
        for (int num : array) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        return frequencyMap;
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 1, 2, 3, 4, 1, 2, 3};
        Map<Integer, Integer> frequencies = findFrequencies(array);

        // Display frequencies
        System.out.println("Element : Frequency");
        for (Map.Entry<Integer, Integer> entry : frequencies.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}
