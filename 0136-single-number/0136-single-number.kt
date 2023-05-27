class Solution {
    fun singleNumber(nums: IntArray): Int {
        val map = HashMap<Int,Int>()
        for(i in nums.indices){
            map[nums[i]] = map.getOrDefault(nums[i],0)+1
        }
        for((key,value) in map){
            if(value==1) return key;
        }
        return 0
    }
}