#42 - Trapping Rain Water

class Solution:
    def trap(self, height: List[int]) -> int:
        l = 0
        r = len(height) - 1
        l_max = 0
        r_max = 0
        trapped = 0

        while l < r:
            l_max = max(l_max, height[l])
            r_max = max(r_max, height[r])

            if l_max < r_max:
                trapped += l_max - height[l]
                l += 1
            else:
                trapped += r_max - height[r]
                r -= 1
        return trappe
