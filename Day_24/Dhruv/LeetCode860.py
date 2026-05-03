#LeetCode 860. Lemonade Change

class Solution(object):
    def lemonadeChange(self, bills):
        """
        :type bills: List[int]
        :rtype: bool
        """
        five=0
        ten=0
        for bill in bills:
            if bill==5:
                five+=1
            elif bill==10:
                if five>=1:
                    ten+=1
                    five-=1
                else:
                    return False
            elif bill==20:
                if five>=1 and ten>=1:
                    five-=1
                    ten-=1
                elif ten==0 and five>=3:
                    five-=3
                elif ten>=2:
                    ten-=2
                else:
                    return False
            
            return True