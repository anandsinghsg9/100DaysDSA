#Leetcode problem 345. Reverse Vowels of a String

class Solution(object):
    def reverseVowels(self, s):
        """
        :type s: str
        :rtype: str
        """
        s=list(s)
        left=0
        right=len(s)-1
        vowels=set('aeiouAEIOU')
        while left<right:
            if s[left] in vowels and s[right] in vowels:
                temp=s[left]
                s[left]=s[right]
                s[right]=temp
                left+=1
                right-=1
            elif s[right] not in vowels:
                right-=1
            elif s[left] not in vowels:
                left+=1
        return "".join(s)

