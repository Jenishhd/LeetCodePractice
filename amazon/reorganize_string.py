# Leetcode 767 Reorganize String
class Solution:
    def reorganizeString(self, s: str) -> str:
        freq = Counter(list(s))

        heap = []

        for k, v in freq.items():
            heapq.heappush(heap, ((-1 * v), k))
        heapq.heapify(heap)

        max_freq = max(freq.values())
        if max_freq > (len(s) + 1) // 2:
            return ""

        print(heap)
        output = []
        while len(heap) >= 2:
            first_freq, first_elm = heapq.heappop(heap)
            second_freq, second_elm = heapq.heappop(heap)

            output.append(first_elm)
            output.append(second_elm)
            first_freq += 1
            second_freq += 1

            if first_freq < 0:
                heapq.heappush(heap, (first_freq, first_elm))
            if second_freq < 0:
                heapq.heappush(heap, (second_freq, second_elm))
            heapq.heapify(heap)
        print(heap)
        if heap:
            last_freq, last_elm = heapq.heappop(heap)
            if last_freq < -1:
                return ""
            if len(output) > 0:
                if last_elm == output[-1]:
                    return ""
            output.append(last_elm)

        return "".join(output)
