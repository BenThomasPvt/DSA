class pattern12{
    public static void main(String[] args){
        int n = 5;
        pattern(n);
    }

    public static void pattern(int n){
        for(int i=1; i <=n; i++){
            for(int j = 1; j<=i; j++){
                System.out.print(j+" ");
            }
            //System
            for (int j =1; j<=(2*n-2*i); j++){
                System.out.print("  ");
            }
            for(int j = i; j>0; j--){
                System.out.print(j+" ");
            }

            System.out.println();
        }
    }
}