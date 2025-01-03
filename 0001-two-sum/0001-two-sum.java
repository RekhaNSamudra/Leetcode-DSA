class Solution {
    public int[] twoSum(int[] nums, int target) {
        // int arr[] = new int[2];
        // int i, j;
        // for (i = 0; i < nums.length; i++) {
        //     for (j = i+1; j < nums.length; j++) {
        //         if (nums[i] + nums[j] == target) {
        //             arr[0] = i;
        //             arr[1] = j;
        //             return arr;
        //         }
        //     }
        // }
        // return arr;
         // Create a hash map to store the complement and index
        HashMap<Integer, Integer> map = new HashMap<>();

        // Traverse the array
        for (int i = 0; i < nums.length; i++) {
            // Calculate the complement
            int complement = target - nums[i];

            // Check if the complement is already in the map
            if (map.containsKey(complement)) {
                return new int[] {map.get(complement), i};
            }

            // Add the current number and its index to the map
            map.put(nums[i], i);
        }

        // Return an empty array if no solution is found
        return new int[0];
    }
}