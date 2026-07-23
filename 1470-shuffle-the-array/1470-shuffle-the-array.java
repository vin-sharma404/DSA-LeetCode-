class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] res= new int[2*n];
        int i=0;
        for(int j=0;j<n;j++){
            res[i++]=nums[j];
            res[i++]=nums[j+n];
        }
        return res;

    }
}