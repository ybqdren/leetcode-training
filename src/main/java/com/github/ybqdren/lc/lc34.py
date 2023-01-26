class Solution:
    def searchRange(self, nums: List[int], target: int) -> List[int]:
        l , r = 0 ,len(nums) - 1
        while l <= r:
            mid = l + (r - l) // 2
            if nums[mid] == target:
                i = j = mid
                while i < len(nums) - 1 and nums[i] == target:
                    i+=1
                while j >= 0 and nums[j] == target:
                    j -= 1
                return  [j + 1 ,i - 1]
            elif nums[mid] > target:
                r = mid - 1
            else:
                l = mid + 1
        return  [-1 , -1]


solution =  Solution()

nums = [5,7,7,8,8,10]
target = 8
solution.searchRange(nums , target)