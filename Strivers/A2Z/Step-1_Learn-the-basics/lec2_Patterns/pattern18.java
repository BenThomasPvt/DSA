class pattern18 {
    public static void main(String[] args){
        int n = 5;
        pattern(n);
    }

    public static void pattern(int n) {
        // Write your code here
        char c = (char) ('A' + n - 1);
        for(int i = 1; i <=n; i++){
            char k = c;
            for (int j = 1; j<=i; j ++, k--){
                
                System.out.print(k+" ");
            }
            System.out.println();
        }
    }
}