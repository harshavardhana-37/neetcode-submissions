class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        if (len(s)!=len(t)):
            return False
        
        sfreq={}
        
        for ch in s:
            if ch in sfreq:
                sfreq[ch]+=1
            else:
                sfreq[ch]=1
        
        for ch in t:
            if ch not in sfreq:
                return False

            if ch in sfreq:
                sfreq[ch]-=1
            if sfreq[ch]==-1:
                return False
        
       
        return True