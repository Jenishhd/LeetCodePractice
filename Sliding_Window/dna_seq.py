exstr = "AAAAACCCCCAAAAACCCCCCAAAAAGGGTTT"
def findRepeatedDnaSequences(s):
    l = 0
    r = 0 
    output_set = set()
    dup_set = set()
    while(r < len(s)-10):
        if s[r:r+10] in dup_set:
            print(s[r:r+10])
            output_set.add(s[r:r+10])
        else:
            dup_set.add(s[r:r+10])
        r += 1
    #print(dup_set)    
    #print(output_set)
    return output_set


print(findRepeatedDnaSequences(exstr))