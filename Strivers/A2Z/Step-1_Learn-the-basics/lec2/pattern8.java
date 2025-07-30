class pattern8 {
    public static void main(String[] args){
        int n = 5;
        pattern(n);
    }

    public static void pattern(int n) {
        // Write your code here
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
}