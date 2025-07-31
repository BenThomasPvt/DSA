class pattern16{
    public static void main(String[] args){
        int n = 5;
        pattern(n);
    }

    public static void pattern(int n){
        char c = 'A';
        for(int i = 1; i <=n; i++,c++){
            for (int j = 1; j<=i; j ++){
                System.out.print(c+" ");
            }
            System.out.println();
        }
    }
}