import java.util.Scanner;

public class allpatterns {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter pattern number (1-22): ");
        int patternNum = sc.nextInt();

        System.out.print("Enter n: ");
        int n = sc.nextInt();

        switch (patternNum) {
            case 1: pattern1(n); break;
            case 2: pattern2(n); break;
            case 3: pattern3(n); break;
            case 4: pattern4(n); break;
            case 5: pattern5(n); break;
            case 6: pattern6(n); break;
            case 7: pattern7(n); break;
            case 8: pattern8(n); break;
            case 9: pattern9(n); break;
            case 10: pattern10(n); break;
            case 11: pattern11(n); break;
            case 12: pattern12(n); break;
            case 13: pattern13(n); break;
            case 14: pattern14(n); break;
            case 15: pattern15(n); break;
            case 16: pattern16(n); break;
            case 17: pattern17(n); break;
            case 18: pattern18(n); break;
            case 19: pattern19(n); break;
            case 20: pattern20(n); break;
            case 21: pattern21(n); break;
            case 22: pattern22(n); break;
            default: System.out.println("Invalid pattern number.");
        }
        sc.close();
    }


    static void pattern1(int n){
        for(int i=0; i <=n; i++){
            for(int j = 0; j<=n; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern2(int n){
        for(int i=0; i <n; i++){
            for(int j = 0; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern3(int n){
        for(int i=1; i <=n; i++){
            for(int j = 1; j<=i; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }

    static void pattern4(int n){
        for(int i=1; i <=n; i++){
            for(int j = 1; j<=i; j++){
                System.out.print(i);
            }
            System.out.println();
        }
    }

    static void pattern5(int n){
        for(int i = n; i>0; i--){
            for (int j = i; j>0; j--){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern6(int n){
        for(int i = n; i>0; i--){
            for (int j = i; j>0; j--){
                System.out.print((i-j)+1+" ");
            }
            System.out.println();
        }
    }

    static void pattern7(int n){
        for(int i = n; i >0; i--){
            for (int j = i-1; j > 0; j--){
                System.out.print(" ");
            }
            for (int j = 1; j <= 2*(n-i)+1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void pattern8(int n){
        for(int i = n; i >0; i--){
            for (int j = n-i; j > 0; j--){
                System.out.print(" ");
            }
            for (int j = 1; j <= 2*i-1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void pattern9(int n){
        for(int i = n; i >0; i--){
            for (int j = i-1; j > 0; j--){
                System.out.print(" ");
            }
            for (int j = 1; j <= 2*(n-i)+1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i = n; i >0; i--){
            for (int j = n-i; j > 0; j--){
                System.out.print(" ");
            }
            for (int j = 1; j <= 2*i-1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void pattern10(int n){
        for (int i = 1; i <=n; i++){
            for (int j = 1; j <=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = n-1; i >0; i--){
            for (int j = i; j > 0; j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void pattern11(int n){
        for(int i=1; i <=n; i++){
            int c = i%2;
            for(int j = 1; j<=i; j++){
                System.out.print(c+" ");
                c = 1 - c;
            }
            System.out.println();
        }
    }

    static void pattern12(int n){
        for(int i=1; i <=n; i++){
            for(int j = 1; j<=i; j++){
                System.out.print(j+" ");
            }
            for (int j =1; j<=(2*n-2*i); j++){
                System.out.print("  ");
            }
            for(int j = i; j>0; j--){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }

    static void pattern13(int n){
        int c = 1;
        for(int i=1; i <=n; i++){
            for(int j = 1; j<=i; j++,c++){
                System.out.print(c+" ");
            }
            System.out.println();
        }
    }

    static void pattern14(int n){
        for(int i=1; i <=n; i++){
            char c = 'A';
            for(int j = 1; j<=i; j++,c++){
                System.out.print(c+" ");
            }
            System.out.println();
        }
    }

    static void pattern15(int n){
        for(int i = 1; i <=n; i++){
            char c = 'A';
            for (int j = 1; j<=n-i+1; j ++, c++){
                System.out.print(c+" ");
            }
            System.out.println();
        }
    }

    static void pattern16(int n){
        char c = 'A';
        for(int i = 1; i <=n; i++,c++){
            for (int j = 1; j<=i; j ++){
                System.out.print(c+" ");
            }
            System.out.println();
        }
    }

    static void pattern17(int n){
        for(int i = n; i >0; i--){
            char c = 'A';
            for (int j = i-1; j > 0; j--){
                System.out.print(" ");
            }
            for (int j = 1; j <= 2*(n-i)+1;j++){
                System.out.print(c+" ");
                if(j > n-i){
                    c--;
                }
                else{
                    c++;
                }
            }
            System.out.println();
        }
    }

    static void pattern18(int n){
        char c = (char) ('A' + n - 1);
        for(int i = 1; i <=n; i++){
            char k = c;
            for (int j = 1; j<=i; j ++, k--){
                System.out.print(k+" ");
            }
            System.out.println();
        }
    }

    static void pattern19(int n){
        for(int i=n; i >0; i--){
            for(int j = 1; j<=i; j++){
                System.out.print("* ");
            }
            for (int j =1; j<=(2*n-2*i); j++){
                System.out.print("  ");
            }
            for(int j = i; j>0; j--){
                System.out.print("* ");
            }
            System.out.println();
        }

        for(int i=1; i <=n; i++){
            for(int j = 1; j<=i; j++){
                System.out.print("* ");
            }
            for (int j =1; j<=(2*n-2*i); j++){
                System.out.print("  ");
            }
            for(int j = i; j>0; j--){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern20(int n){
        for(int i=1; i <=n; i++){
            for(int j = 1; j<=i; j++){
                System.out.print("* ");
            }
            for (int j =1; j<=(2*n-2*i); j++){
                System.out.print("  ");
            }
            for(int j = i; j>0; j--){
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int i=n-1; i >0; i--){
            for(int j = 1; j<=i; j++){
                System.out.print("* ");
            }
            for (int j =1; j<=(2*n-2*i); j++){
                System.out.print("  ");
            }
            for(int j = i; j>0; j--){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern21(int n){
        for(int i=1; i <=n; i++){
            for(int j = 1; j<=n; j++){
                if(n-i == n-1 || n-i ==0||j==1 || j== n){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    static void pattern22(int n){
        int l = n;
        n = 2*n-1;
        for(int i=1; i <=n; i++){
            for(int j = 1; j<=n; j++){
                System.out.print((l-Math.min(Math.min(i-1,j-1), Math.min(n-i,n-j)))+" ");
            }
            System.out.println();
        }
    }
}
