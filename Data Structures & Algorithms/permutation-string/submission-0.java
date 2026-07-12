class Solution {
    public boolean checkInclusion(String s1, String s2) {
        //Step 1:length check
        if(s1.length() > s2.length()){
            return false;
        }

        //step2:Empty array to count freq of ele
        int s1count[] = new int[26]; // a = 0 , b=1 , c=2 , ... etc z=26
        int s2count[] = new int[26];

        //step3: Build ele freq in array
        for(int i=0;i<s1.length();i++){
            s1count[s1.charAt(i) - 'a']++;
            s2count[s2.charAt(i) - 'a']++;
        }

        //step4:To check now both arrays are equals
        if(Arrays.equals(s1count , s2count)){
            return true;
        }

        //step5:Remaining substring have to check now
        for(int right=s1.length();right<s2.length();right++){
            s2count[s2.charAt(right) - 'a']++; // "lecabee" now a is added

            int left = right - s1.length(); // 3-3=0;that means 0th ele index got for remove bcz

            s2count[s2.charAt(left) - 'a']--; // so we delete l and add right ele i.e a so now string is "eca"

            if(Arrays.equals(s1count , s2count)){
                return true;
            }
        }
        return false;
    }
}
