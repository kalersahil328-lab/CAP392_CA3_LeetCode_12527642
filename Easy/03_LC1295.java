// LeetCode: Find Numbers with Even Number of Digits
// Student: Sahil | Registration No.: 12527642

class Solution {
    public int findNumbers(int[] nums) {
        int count = 0;
        for (int num : nums) {
            int digits = String.valueOf(num).length();
            if (digits % 2 == 0) count++;
        }
        return count;
    }
}
