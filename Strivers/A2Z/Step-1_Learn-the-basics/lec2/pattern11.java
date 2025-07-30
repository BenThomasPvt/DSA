class pattern11 {
    public static void main(String[] args){
        int n = 5;
        pattern(n);
    }

    public static void pattern(int n) {
        // Write your code here
        for(int i=1; i <=n; i++){
            int c = i%2;
            for(int j = 1; j<=i; j++){
                System.out.print(c+" ");
                c = 1 - c;
            }
            System.out.println();
        }
        }
    }
