class Solution {
    public int[] twoSum(int[] nums, int target) {
        int size = nums.length,k=0;
        int[] arr = new int[2];
        for(int i=0;i<size;i++){
            for(int j=i+1;j<size;j++){
                int res= nums[i] + nums[j];
                if(res==target){
                    arr[k] = i;
                    arr[k+1] = j;
                }
            }
        }
        return arr;
    }
}
