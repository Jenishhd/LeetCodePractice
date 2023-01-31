'''
Input: prices = [7,1,5,3,6,4]
Output: 5
'''

from cmath import inf
from tkinter import W


#prices = [7,1,5,3,6,4]
prices = [7,6,4,3,1]


def stock(prices):
    l = 0
    r = 0
    max_profit = -100000000000
    while(r < len(prices)):
        
        while(prices[r] < prices[l]):
            l += 1 
    
        max_profit = max(prices[r] - prices[l], max_profit)
        r += 1
    return max_profit

print(stock(prices))