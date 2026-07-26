class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        if (len(s)!=len(t)):
            return False
        
        sfreq={}
        tfreq={}
        for ch in s:
            if ch in sfreq:
                sfreq[ch]+=1
            else:
                sfreq[ch]=1
        
        for ch in t:
            if ch in tfreq:
                tfreq[ch]+=1
            else:
                tfreq[ch]=1
        
        for k in sfreq:
            if k not in tfreq:
                return False
            if sfreq[k]!=tfreq[k]:
                return False
        return True