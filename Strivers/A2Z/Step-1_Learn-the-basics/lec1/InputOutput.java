import java.util.Scanner;

class InputOutput {
    public void printNumber(Scanner sc) {
        int number = sc.nextInt();
        System.out.print(number);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        InputOutput sol = new InputOutput();
        sol.printNumber(sc);
        sc.close();
    }
}
