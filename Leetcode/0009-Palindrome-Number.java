class Solution {
    public boolean isPalindrome(int x) {
        int rev = 0, c=x;
        if (x<0) return false;
        while (x != 0) {
            int digit = x % 10;
            if (rev > 214748364 || (rev == 214748364 && digit > 7)) return false;
            rev = rev * 10 + digit;
            x = x / 10;
        }
        if (rev==c) return true;
        return false;
    }
}