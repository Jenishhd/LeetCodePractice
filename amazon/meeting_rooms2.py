# 253 Meeting Rooms 2

"""
Definition of Interval:
class Interval(object):
    def __init__(self, start, end):
        self.start = start
        self.end = end
"""

class Solution:
    def minMeetingRooms(self, intervals: List[Interval]) -> int:
        schedule = collections.defaultdict(int)
        for i in intervals:
            schedule[i.start] += 1
            schedule[i.end] -= 1
        
        meetings = 0
        total = 0
        for i in sorted(schedule.keys()):
            meetings += schedule[i]
            total = max(total, meetings)
        
        return tota


# 2 POINTERS APPROACH

"""
Definition of Interval:
class Interval(object):
    def __init__(self, start, end):
        self.start = start
        self.end = end
"""

class Solution:
    def minMeetingRooms(self, intervals: List[Interval]) -> int:
        sorted_start = [i.start for i in sorted(intervals, key = lambda k: k.start)]
        sorted_end = [i.end for i in sorted(intervals, key = lambda k: k.end)]

        meeting_count = 0
        max_meetings = 0

        s = 0
        e = 0

        while s < len(sorted_start):
            if sorted_start[s] < sorted_end[e]:
                meeting_count += 1
                s += 1
            else:
                meeting_count -= 1
                e += 1
            max_meetings = max(max_meetings, meeting_count)
        return max_meetings





