''' 
Input: target = 7, nums = [2,3,1,2,4,3]
Output: 2

'''

import collections
from tkinter import W
def minSubArrayLen(target, nums):
    l = 0
    r = 0
    d = collections.Counter(nums)
    counter = 0 
    ans = 0
    sum = 0
    while r < len(nums):
        while sum <= target:
            sum = sum + nums[r]
            if target - sum in d:
                d[target-sum] -= 1
                if sum == target:
                    counter += 1
            l += 1
        r += 1
        ans = min(ans, counter)
        counter = 0
        sum = 0
        
nums = [2,3,1,2,4,3]
target = 7

minSubArrayLen(target,nums)