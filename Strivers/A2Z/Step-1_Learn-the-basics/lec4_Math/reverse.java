import java.util.Scanner;

class reverse {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print(reversed(n));
        sc.close();

    }
    public static int reversed(int x) {
        int rev = 0;
        while (x != 0) {
            int digit = x % 10;
            if (rev > 214748364 || (rev == 214748364 && digit > 7)) return 0;
            if (rev < -214748364 || (rev == -214748364 && digit < -8)) return 0;
            rev = rev * 10 + digit;
            x = x / 10;
        }
        return rev;
    }
}