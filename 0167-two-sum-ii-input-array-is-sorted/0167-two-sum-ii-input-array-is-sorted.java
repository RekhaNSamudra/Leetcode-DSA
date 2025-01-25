class Solution {
    public int[] twoSum(int[] numbers, int target) {
        // Initialize two pointers
        int left = 0; // Start pointer
        int right = numbers.length - 1; // End pointer

        // Loop until the two pointers meet
        while (left < right) {
            // Calculate the sum of the two numbers at the pointers
            int sum = numbers[left] + numbers[right];
            
            // If the sum matches the target, return the indices (1-based)
            if (sum == target) {
                return new int[]{left + 1, right + 1};
            }
            // If the sum is less than the target, move the left pointer to the right
            else if (sum < target) {
                left++;
            }
            // If the sum is greater than the target, move the right pointer to the left
            else {
                right--;
            }
        }
        // Return a default value (this line will never be executed due to the guarantee of a solution)
        return new int[]{-1, -1};
    }
}