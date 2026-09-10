class Solution {
    public int[] getSumAbsoluteDifferences(int[] nums) {
        int n = nums.length;
        int[] a=new int[n];
        int ts = 0;
        for(int num:nums){
            ts += num;
        }
        int ls= 0;
            for(int i=0;i<n;i++){
            int rs = ts - ls - nums[i];
            int l= nums[i]*i - ls;
            int r = rs - nums[i]*(n-i-1);
            a[i] = l + r;
            ls += nums[i]; 
            }
        return a; 
    }
}