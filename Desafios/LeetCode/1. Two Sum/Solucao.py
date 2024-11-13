class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        HashSoma = {}

        for i in range(len(nums)):
            x = target-nums[i]
            if x in HashSoma:
                return [HashSoma[x],i]

            HashSoma[nums[i]]=i
            
        return []