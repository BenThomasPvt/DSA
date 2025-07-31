import java.util.Scanner;


class countdigits {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print(countDigit(n));
        sc.close();

    }
    public static int countDigit(int n) {
        int c=0;
        while(n>0){
            n = n / 10;
            c++;
        }

        //optimal approach
        //c = (int) (Math.log10(n) + 1);
        return(c);
    }
}