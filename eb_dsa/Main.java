class Solution {
    public int singleNumber(int[] nums) {
        int o=0;
        int t=0;
        for(int i:nums){
            o^=(i&~t);
            t^=(i&~o);
        }
        return o;
    }
}
