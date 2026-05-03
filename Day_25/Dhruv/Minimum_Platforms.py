#GFG Preoblem: Minimum Platforms

class Solution:    
    def minPlatform(self, arr, dep):
        # code here
        
        arr.sort()
        dep.sort()
        current=0
        max_platforms=0
        i,j=0,0
        while i<len(arr):
            if arr[i]<=dep[j]:
                current+=1
                i+=1
            else:
                current-=1
                j+=1
            max_platforms=max(max_platforms,current)
        return max_platforms
                
        
                