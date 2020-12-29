class Solution {
	
	//optimal solution using O(1) space complexity and O(n) time complexity
    public int missingNumber(int[] nums) {
	//nums =[0,1,3]
        int total=nums.length*(nums.length+1)/2; //total=6
        for(int i: nums){
            total-=i;
        }
        return total;//2
    }
}
