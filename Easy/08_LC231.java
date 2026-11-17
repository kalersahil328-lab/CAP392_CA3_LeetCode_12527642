// LeetCode: Power of Two
// Student: Sahil | Registration No.: 12527642

class Solution {
    public boolean isPowerOfTwo(int n) {
        return n > 0 && (n & (n - 1)) == 0;
    }
}
