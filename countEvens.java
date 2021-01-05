public int countEvens(int[] nums) {
  int total = 0;
  for(int i = 0; i < nums.length; i++) {
    if(nums[i] % 2 == 0) {
      total++;
  }
  }
  return total;
}
