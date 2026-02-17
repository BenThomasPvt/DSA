class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        if len(s) != len(t):
            return False
        
        f_s, f_t = {},{}

        for i in range(len(s)):
            f_s[s[i]] = 1 + f_s.get(s[i], 0)
            f_t[t[i]] = 1 + f_t.get(t[i], 0)

        return f_s==f_t