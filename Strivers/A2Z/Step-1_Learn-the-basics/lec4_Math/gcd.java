import java.util.Scanner;

class gcd {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        System.out.print(GCD(n1, n2));
        sc.close();

    }
    public static int GCD(int n1, int n2) {
        for(int i =Math.min(n1,n2);i>0; i--){
            if(n1%i==0 && n2%i==0) return i ;
        }
        return 1;
    }
}