class Solution {
    public boolean search(int[] nums, int target) {
        int n = nums.length;
        int low = 0;
        int high = n-1;

        while(low<=high){
            int mid = (high-low)/2 + low;

            
            if(nums[mid]==target){
                return true;
            }
            else if(nums[low]==nums[mid] && nums[mid]==nums[high]){
                high = high-1;
                low = low+1;
                continue;
            }

            else if(nums[low]<=nums[mid]){
                if(nums[low]<=target && target<=nums[mid]){
                    high = mid-1;
                }
                else{
                    low = mid+1;
                }
            }

            else{
                if(nums[mid]<=target && target<=nums[high]){
                    low = mid+1;
                }
                else{
                    high = mid-1;
                }
            }
        }
        return false;
    }
}