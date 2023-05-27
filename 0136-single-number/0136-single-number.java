class Solution {
    public int singleNumber(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0; i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        
        for(Integer tx : map.keySet()){
            if(map.get(tx)==1) return tx;
        }
        return 0;
    }
}