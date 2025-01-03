class Solution {
    public int findNumbers(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (evenDigits(nums[i])) {
                count += 1;
            }
        }
        return count;
    }

    boolean evenDigits(int num) {
        int digits = 0;
        while (num > 0) {
            num /= 10;
            digits++;
        }
        return digits % 2 == 0;
    }
}