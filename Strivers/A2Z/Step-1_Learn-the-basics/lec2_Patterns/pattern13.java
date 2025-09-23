class pattern13 {
    public static void main(String[] args){
        int n = 5;
        pattern(n);
    }

    public static void pattern(int n) {
        // Write your code here
        int c = 1;
        for(int i=1; i <=n; i++){
            for(int j = 1; j<=i; j++,c++){
                System.out.print(c+" ");
            }
            System.out.println();
        }
        }
    }
