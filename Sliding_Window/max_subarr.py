from cmath import inf


nums = [-2,1,-3,4,-1,2,1,-5,4]
# the output for this case would be 6

def max_subarr(list):
    rp = 0
    lp = 0
    cur_sum = 0
    max_sum = -inf

    for i in list:
	    cur_sum = max(i , cur_sum + i)
	    max_sum = max(cur_sum, max_sum)
    return max_sum

print(max_subarr(nums))
