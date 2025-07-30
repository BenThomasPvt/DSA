class pattern10 {
    public static void main(String[] args){
        int n = 5;
        pattern(n);
    }

    public static void pattern(int n) {
        // Write your code here
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
    }
