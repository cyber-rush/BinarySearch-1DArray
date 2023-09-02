class Solution {
    public int search(int[] nums, int target) {
        int n=nums.length;
        int high = n-1;
        int low = 0;

        while(low<=high){
            int mid = low+(high-low)/2;

            if(nums[mid]==target){
                return mid;
            }

            // if left part is sorted
            if(nums[low]<=nums[mid]){
                if(target>=nums[low] && target<=nums[mid]){
                    high = mid-1;
                }
                else{
                    low = mid+1;
                }
                
            }

            //if right part is sorted
            else {
                if(target>=nums[mid] && target<=nums[high]){
                    low = mid+1;
                }
                else{
                    high = mid-1;
                }
                
            }
        }
        return -1;
    }
        
        
        
        
}