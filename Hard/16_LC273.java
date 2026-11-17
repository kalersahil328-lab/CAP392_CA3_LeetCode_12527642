// LeetCode: Integer to English Words
// Student: Sahil | Registration No.: 12527642

class Solution {
    private static final String[] BELOW_20 = {
        "", "One", "Two", "Three", "Four", "Five", "Six", "Seven",
        "Eight", "Nine", "Ten", "Eleven", "Twelve", "Thirteen",
        "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"
    };
    private static final String[] TENS = {
        "", "", "Twenty", "Thirty", "Forty", "Fifty", "Sixty",
        "Seventy", "Eighty", "Ninety"
    };
    private static final String[] THOUSANDS = {
        "", "Thousand", "Million", "Billion"
    };

    public String numberToWords(int num) {
        if (num == 0) return "Zero";
        int group = 0;
        StringBuilder result = new StringBuilder();
        while (num > 0) {
            int part = num % 1000;
            if (part != 0) {
                String words = threeDigits(part);
                if (!THOUSANDS[group].isEmpty()) {
                    words += " " + THOUSANDS[group];
                }
                if (result.length() == 0) result.insert(0, words);
                else result.insert(0, words + " ");
            }
            num /= 1000;
            group++;
        }
        return result.toString().trim();
    }

    private String threeDigits(int num) {
        StringBuilder words = new StringBuilder();
        if (num >= 100) {
            words.append(BELOW_20[num / 100]).append(" Hundred");
            num %= 100;
            if (num > 0) words.append(" ");
        }
        if (num >= 20) {
            words.append(TENS[num / 10]);
            num %= 10;
            if (num > 0) words.append(" ").append(BELOW_20[num]);
        } else if (num > 0) {
            words.append(BELOW_20[num]);
        }
        return words.toString();
    }
}
