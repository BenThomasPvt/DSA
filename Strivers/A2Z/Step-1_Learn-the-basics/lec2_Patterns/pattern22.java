class pattern22{

    public static void main (String[] args){
        int n = 5;
        pattern(n);
    }


    public static void pattern(int n){
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