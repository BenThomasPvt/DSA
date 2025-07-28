import java.util.Scanner;

class IfElseif {
    public void studentGrade(int marks) {
        if (marks >= 90){
            System.out.print("Grade A");
        }
        else if (marks >= 70){
            System.out.print("Grade B");
        }
        else if (marks >= 50){
            System.out.print("Grade C");
        }
        else if (marks >= 35){
            System.out.print("Grade D");
        }
        else{
            System.out.print("Fail");
        }

    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        IfElseif sol = new IfElseif();
        int marks = sc.nextInt();
        sol.studentGrade(marks);
        sc.close();
    }
}
