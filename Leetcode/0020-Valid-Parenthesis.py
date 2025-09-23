class Solution(object):
    def isValid(self, s):
        """
        :type s: str
        :rtype: bool
        """
        stack=[]
        brk={")":"(","}":"{","]":"["}
        for i in s:
            if i in brk:
                top=stack.pop() if  stack else"#"
                if brk[i]!=top:
                    return False
            else:
                stack.append(i)
        return not stack
        