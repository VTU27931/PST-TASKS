class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] result = new int[2 * n];

        for (int i = 0; i < n; i++) {
            result[2 * i] = nums[i];       // xᵢ
            result[2 * i + 1] = nums[n + i]; // yᵢ
        }

        return result;
    }
}