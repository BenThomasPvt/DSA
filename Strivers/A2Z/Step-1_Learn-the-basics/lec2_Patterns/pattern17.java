class pattern17 {
    public static void main(String[] args){
        int n = 5;
        pattern(n);
    }

    public static void pattern(int n) {
        // Write your code here
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
}