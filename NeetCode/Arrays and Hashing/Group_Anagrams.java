import java.util.*;

public class Group_Anagrams {
    public static List<List<String>> groupAnagrams(String[] strs) {
        // Step 1: Create a HashMap to group anagrams
        Map<String, List<String>> map = new HashMap<>();

        // Step 2: Iterate over each word
        for (String s : strs) {
            // Convert to char array, sort, then make a new key
            char[] arr = s.toCharArray();
            Arrays.sort(arr);
            String key = new String(arr);  // same for all anagrams

            // Step 3: Add the word to the correct group in the map
            if (!map.containsKey(key)) {
                map.put(key, new ArrayList<>());
            }
            map.get(key).add(s);
        }

        // Step 4: Return all grouped lists as List<List<String>>
        return new ArrayList<>(map.values());
    }

    public static void main(String[] args) {
        String[] strs = {"act", "pots", "tops", "cat", "stop", "hat"};
        List<List<String>> result = groupAnagrams(strs);

        // Step 5: Print nicely
        for (List<String> group : result) {
            System.out.println(group);
        }
    }
}
