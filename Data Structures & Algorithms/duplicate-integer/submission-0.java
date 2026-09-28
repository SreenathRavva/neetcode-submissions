class Solution {
    public boolean hasDuplicate(int[] nums) {

        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();

        for(int i=0;i<nums.length;i++)
        {
            int count =0;
            if(map.containsKey(nums[i]))
            {
                map.put(nums[i], map.get(nums[i]) + 1);
                return true;
            }
            else
            {
                map.put(nums[i],count++);
            }
        }

        return false;
        
    }
}