
class Solution {
    public static int numberOfSubstrings(String s) {
        if (s == null || s.length() < 3)
            return 0;

        char[] arr = s.toCharArray();

        int result = 0;
        int[] track = new int[3];
        int len = s.length();
        int sub_count = 0;

        int l = 0;
        int r = 0;

        while (r < len) {
            int curr = arr[r] - 'a';
            track[curr]++;
            if (track[curr] == 1)
                sub_count++;

            while (l < r && sub_count == 3) {
                result += (len - r - 1);
                result++;
                track[arr[l] - 'a']--;
                if (track[arr[l] - 'a'] < 1)
                    sub_count--;

                l++;
            }
            r++;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(numberOfSubstrings("abcabc"));
    }
}
