public int[] productExceptSelf(int[] nums) {
    int n = nums.length;
    int[] ans = new int[n];
    ans[0] = 1;
    int accumulator = 1;
    // left side
    for(int i = 0; i < n; i++) {
        ans[i] = accumulator;
        accumulator *= nums[i];
    }
    // right side
    accumulator = 1;
    for(int i = n-1; i >=0; i--) {
        ans[i] *= accumulator;
        accumulator *= nums[i];
    }
    return ans;
}
