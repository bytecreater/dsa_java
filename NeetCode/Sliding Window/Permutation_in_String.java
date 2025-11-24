public class Permutation_in_String {
    public static boolean checkInclusion(String s1, String s2) {
        int n1 = s1.length();
        int n2 = s2.length();

        if (n1 > n2) return false;

        int[] freq1 = new int[26];
        int[] freq2 = new int[26];

        // count freq for s1 and first window in s2
        for (int i = 0; i < n1; i++) {
            freq1[s1.charAt(i) - 'a']++;
            freq2[s2.charAt(i) - 'a']++;
        }

        // if first window is already a permutation
        if (matches(freq1, freq2)) return true;

        // slide the window over s2
        for (int i = n1; i < n2; i++) {
            // add new char (right side)
            freq2[s2.charAt(i) - 'a']++;

            // remove old char (left side)
            freq2[s2.charAt(i - n1) - 'a']--;

            if (matches(freq1, freq2)) return true;
        }

        return false;
    }

    private static boolean matches(int[] a, int[] b) {
        for (int i = 0; i < 26; i++) {
            if (a[i] != b[i]) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        String s1 = "abc";
        String s2 = "lecabee";
        System.out.println(checkInclusion(s1, s2));
    }
}
