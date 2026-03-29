#leetcode 826. Most Profit Assigning Work

class Solution(object):
    def maxProfitAssignment(self, difficulty, profit, worker):
        """
        :type difficulty: List[int]
        :type profit: List[int]
        :type worker: List[int]
        :rtype: int
        """
        max_profit=0
        i=0
        j=0
        worker.sort()
        jobs=sorted(zip(difficulty,profit))
        for w in worker:
            while i<len(jobs) and jobs[i][0]<=w:
                j=max(j,jobs[i][1])
                i+=1
            
            max_profit+=j
        return max_profit

        
