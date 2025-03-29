# 49 - Group Anagrams

class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        ana_dict = collections.defaultdict(list)

        for i in range(len(strs)):
            sorted_word = "".join(sorted(strs[i]))

            if sorted_word in ana_dict:
                ana_dict[sorted_word].append(strs[i])
            else:
                ana_dict[sorted_word] = [strs[i]]

        output = []
        for value in ana_dict.values():
            output.append(value)

        return output
