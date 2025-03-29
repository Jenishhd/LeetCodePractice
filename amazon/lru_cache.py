# Leetcode 146 LRU Cache

"""
leet

"""
class Node:
    def __init__(self, key, val):
        self.key = key
        self.val = val
        self.prev = None
        self.next = None

class LRUCache:

"""
 {
    key : val

 }
"""
    def __init__(self, capacity: int):
        self.capacity = capacity
        self.cdict = {}
        self.head = Node(-1, -1)
        self.tail = Node(-1, -1)

        self.lru.next = self.mra
        self.mra.prev = self.lru

    def insert(self, node):
        prev = self.tail.prev
        prev.next = node

        node.next = self.tail
        node.prev = prev

    def remove(self, node):
        node.prev.next = node.next
        node.next.prev = node.prev

    def get(self, key: int) -> int:
        if key in self.cdict:
            node = self.cdict[key]
            self.remove(node)
            self.insert(node)
            return node.val
        else
            return -1


    def put(self, key: int, value: int) -> None:
        new_node = Node(key, value)
        if key in cdict:
            remove(cdict[key])
            cdict[key] = new_node
            insert(new_node)
        else:
            if capacity > len(cdict):
                lru = cdict.pop(self.head.next.key)
                remove(lru)
                insert(new_node)
            else:
                insert(new_node)



