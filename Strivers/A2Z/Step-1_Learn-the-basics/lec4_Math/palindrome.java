import java.util.Scanner;

class palindrome {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print(isPalindrome(n));
        sc.close();

    }
    public static boolean isPalindrome(int x) {
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