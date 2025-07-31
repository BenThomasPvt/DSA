class pattern21{

    public static void main (String[] args){
        int n = 5;
        pattern(n);
    }


    public static void pattern(int n){
        for(int i=1; i <=n; i++){
            for(int j = 1; j<=n; j++){
                if(n-i == n-1 || n-i ==0||j==1 || j== n){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        
    }
}