class PivotIndex {
    public int pivotIndex(int[] nums) {
        int sumleft=0;
        int sumright=0;
        for(int i=0;i<nums.length;++i){
            sumright+=nums[i];
        }
        
        //Dynamic programming approach, we have to subract "i" which is index of element itself
        for(int i=0;i<nums.length;++i){
            sumright-=nums[i];
            if(sumleft==sumright) return i;
            sumleft+=nums[i];
        }
        return -1;
    }
}
