class Solution {
    public int characterReplacement(String s, int k) {
        int[] count = new int[26];

        int left = 0;
        int maxFrequency = 0;
        int answer = 0;

        for (int right = 0; right < s.length(); right++) {

            // Add the character at right into our window
            int index = s.charAt(right) - 'A';
            count[index]++;

            // Find the highest frequency character in the current window
            maxFrequency = Math.max(maxFrequency, count[index]);

            // If too many replacements are needed,
            // shrink the window from the left.
            while ((right - left + 1) - maxFrequency > k) {
                int leftIndex = s.charAt(left) - 'A';
                count[leftIndex]--;
                left++;
            }

            // Current window is valid, so save its length if it is the largest.
            answer = Math.max(answer, right - left + 1);
        }

        return answer;
    }
}