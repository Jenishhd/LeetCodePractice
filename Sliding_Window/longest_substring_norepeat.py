#s = "abcabcbb"
from os import dup, remove

# SET [p, w, ]
s = "pwwkew" 
# the output shoyld be 3 : abc

def longest_substring(s):
    rp = 0
    lp = 0
    dup_set = set()
    max_sub = 0
    while (rp < len(s)):
        while s[rp] in dup_set:
            dup_set.remove(s[lp])
            lp = lp + 1 
        dup_set.add(s[rp])
        max_sub = max(rp - lp + 1, max_sub)
        rp = rp + 1
    return max_sub
print(longest_substring(s))