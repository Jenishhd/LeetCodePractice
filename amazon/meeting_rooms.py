# 920 Meeting Rooms
"""
Definition of Interval:
class Interval(object):
    def __init__(self, start, end):
        self.start = start
        self.end = end
"""

class Solution:
    def canAttendMeetings(self, intervals: List[Interval]) -> bool:
        sort = sorted(intervals, key=lambda i : i.start)
        
        for i in range(len(sort) - 1):
            if sort[i+1].start < sort[i].end:
                return False
        return True
