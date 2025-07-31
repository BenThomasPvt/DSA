class pattern15{
    public static void main(String[] args){
        int n = 5;
        pattern(n);
    }

    public static void pattern(int n){
        for(int i = 1; i <=n; i++){
            char c = 'A';
            for (int j = 1; j<=n-i+1; j ++, c++){
                System.out.print(c+" ");
            }
            System.out.println();
        }
    }
}