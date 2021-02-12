class Solution {
    public int dominantIndex(int[] nums) {
        int firstMax=0;
        int secondMax=0;
        int maxidx=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>firstMax){
                secondMax=firstMax;
                firstMax = nums[i];
                maxidx=i;
                continue;
            }
            if(nums[i]>secondMax){
                secondMax=nums[i];
            }    
        }
        return firstMax>=(2*secondMax)? maxidx: -1;
    }
}
