class Solution {
    public int maximumWealth(int[][] accounts) {
        int mW = 0;
        for(int[] customer : accounts){
            int w = 0;
            for(int money : customer){
                w += money;
            }
            mW = Math.max(mW, w);
        }
        return mW;
    }
}