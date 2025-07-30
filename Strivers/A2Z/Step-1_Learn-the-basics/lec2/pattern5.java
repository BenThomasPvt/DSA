class pattern5{
    public static void main(String[] args){
        int n = 5;
        pattern(n);
    }

    public static void pattern(int n){
        for(int i = n; i>0; i--){
            for (int j = i; j>0; j--){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}