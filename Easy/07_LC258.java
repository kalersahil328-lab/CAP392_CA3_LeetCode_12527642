// LeetCode: Add Digits
// Student: Sahil | Registration No.: 12527642

class Solution {
    public int addDigits(int num) {
        return num == 0 ? 0 : 1 + (num - 1) % 9;
    }
}
